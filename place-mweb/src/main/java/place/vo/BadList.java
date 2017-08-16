package place.vo;

public class BadList {

	private int badlist_no;
	private int user_no;
	private int place_no;
	
	public BadList() {
		// TODO Auto-generated constructor stub
	}
	public BadList(int badlist_no, int user_no, int place_no) {
		super();
		this.badlist_no = badlist_no;
		this.user_no = user_no;
		this.place_no = place_no;
	}
	
	public BadList(int user_no, int place_no) {
		super();
		this.user_no = user_no;
		this.place_no = place_no;
	}



	public int getBadlist_no() {
		return badlist_no;
	}
	public void setBadlist_no(int badlist_no) {
		this.badlist_no = badlist_no;
	}
	public int getUser_no() {
		return user_no;
	}
	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}
	public int getPlace_no() {
		return place_no;
	}
	public void setPlace_no(int place_no) {
		this.place_no = place_no;
	}
	
	
}
