//清单1
<beans>
    <bean id="sqlMapTransactionManager"
        class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
        <property name="dataSource" ref="dataSource"/>
    </bean>
    <bean id="sqlMapTransactionTemplate"
        class="org.springframework.transaction.support.TransactionTemplate">
        <property name="transactionManager" ref="sqlMapTransactionManager"/>
    </bean>
    <!--sql map -->
    <bean id="sqlMapClient"
        class="org.springframework.orm.ibatis.SqlMapClientFactoryBean">
        <property name="configLocation" value="com/mydomain/data/SqlMapConfig.xml"/>
        <property name="dataSource" ref="dataSource"/>
    </bean>
    <bean id="dataSource" name="dataSource"
        class="org.apache.commons.dbcp.BasicDataSource" destroy-method="close">
        <property name="driverClassName" value="oracle.jdbc.driver.OracleDriver"/>
        <property name="url" value="jdbc:oracle:thin:@10.1.5.11:1521:XE"/>
        <property name="username" value="junshan"/>
        <property name="password" value="junshan"/>
        <property name="maxActive" value="20"/>
    </bean>
    <bean id="accountDAO" class="com.mydomain.AccountDAO">
        <property name="sqlMapClient" ref="sqlMapClient"/>
        <property name="sqlMapTransactionTemplate" ref="sqlMapTransactionTemplate"/>
    </bean>
</beans>

//清单2
<select id="selectAccount" parameterClass="Account" resultClass="Account">
    select
      ACC_ID,
      ACC_FIRST_NAME as firstName,
      ACC_LAST_NAME as lastName,
      ACC_EMAIL as emailAddress,
      ACC_DATE
    from ACCOUNT
    where ACC_ID = #id:INTEGER# and ACC_FIRST_NAME = #firstName#
</select>
//清单3
package mytest;
public class SimpleTest {
    public static void main(String[] args) {
        ApplicationContext factory =
        new ClassPathXmlApplicationContext("/com/mydomain/data/applicationContext.xml");
        final AccountDAO accountDAO = (AccountDAO) factory.getBean("accountDAO");
        final Account account = new Account();
        account.setId(1);
        account.setFirstName("tao");
        account.setLastName("bao");
        account.setEmailAddress("junshan@taobao.com");
        account.setDate(new Date());
        try {
            accountDAO.getSqlMapTransactionTemplate().execute(new TransactionCallback(){
                    public Object doInTransaction(TransactionStatus status){
                        try{
                            accountDAO.deleteAccount(account.getId());
                            accountDAO.insertAccount(account);
                            //account.setLastName("bobo");
                            //accountDAO.updateAccount(account);
                            Account result = accountDAO.selectAccount(account);
                            System.out.println(result);
                            return null;
                        } catch (Exception e) {
                            status.setRollbackOnly();
                            return false;
                        }
                    }
                });
            //accountDAO.getSqlMapClient().commitTransaction();
         } catch (Exception e) {
             e.printStackTrace();
         }
     }
}
//清单4
accountDAO.selectAccountById(account)
//清单 5
select
ACC_ID,
ACC_FIRST_NAME as firstName,
ACC_LAST_NAME as lastName,
ACC_EMAIL as emailAddress,
ACC_DATE
from ACCOUNT
where ACC_ID = ? and ACC_FIRST_NAME = ?
//清单6
Account{id=0, firstName='tao', lastName='bobo', emailAddress='junshan@taobao.com'}
//清单7
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn= DriverManager.getConnection(url,user,password);
java.sql.PreparedStatement  st = conn.prepareStatement(sql);
st.setInt(0,1);
st.execute();
java.sql.ResultSet rs =  st.getResultSet();
while(rs.next()){
    String result = rs.getString(colname);
}