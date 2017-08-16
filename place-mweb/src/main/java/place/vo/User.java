package place.vo;

public class User {

	private int user_no;
	private String id;
	private String pw;
	private String name;
	private String phone;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int user_no, String id, String pw, String name, String phone) {
		super();
		this.user_no = user_no;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	}
	
	
	
	public User(String id, String pw, String name, String phone) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	}



	public int getUser_no() {
		return user_no;
	}
	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
