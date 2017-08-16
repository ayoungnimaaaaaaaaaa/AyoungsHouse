package place.vo;

public class Place {

	private int place_no;
	private String address;
	private String place_name;
	
	public Place() {
		// TODO Auto-generated constructor stub
	}
	public Place(int place_no, String address, String place_name) {
		super();
		this.place_no = place_no;
		this.address = address;
		this.place_name = place_name;
	}
	
	public Place(String address, String place_name) {
		super();
		this.address = address;
		this.place_name = place_name;
	}

	public int getPlace_no() {
		return place_no;
	}
	public void setPlace_no(int place_no) {
		this.place_no = place_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPlace_name() {
		return place_name;
	}
	public void setPlace_name(String place_name) {
		this.place_name = place_name;
	}
	
}
