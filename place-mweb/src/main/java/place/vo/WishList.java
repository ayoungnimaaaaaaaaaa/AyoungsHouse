package place.vo;

public class WishList {

	private int wishlist_no;
	private int user_no;
	private int place_no;
	
	public WishList() {
		// TODO Auto-generated constructor stub
	}
	public WishList(int wishlist_no, int user_no, int place_no) {
		super();
		this.wishlist_no = wishlist_no;
		this.user_no = user_no;
		this.place_no = place_no;
	}
	public int getWishlist_no() {
		return wishlist_no;
	}
	public void setWishlist_no(int wishlist_no) {
		this.wishlist_no = wishlist_no;
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