package JDBCproject.ObjectTable;

public class ObjTablea {
	private int id;
	private String name;
	private String address;
	private String mail;

	public void Tablea() {

	}

	public void Tablea(int id) {
		this.Tablea();
		this.id = id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public Integer getId() {
		return this.id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return this.address;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getMail() {
		return this.mail;
	}
}