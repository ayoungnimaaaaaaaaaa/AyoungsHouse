package place.vo;

public class Review {

	private int review_no;
	private int user_no;
	private int place_no;
	private String title;
	private String review_date;
	private String content;
	private boolean open;
	
	public Review() {
		// TODO Auto-generated constructor stub
	}
	public Review(int review_no, int user_no, int place_no, String title, String review_date, String content,
			boolean open) {
		super();
		this.review_no = review_no;
		this.user_no = user_no;
		this.place_no = place_no;
		this.title = title;
		this.review_date = review_date;
		this.content = content;
		this.open = open;
	}
	
	
	
	public Review(String title, String review_date, String content, boolean open) {
		super();
		this.title = title;
		this.review_date = review_date;
		this.content = content;
		this.open = open;
	}



	public int getReview_no() {
		return review_no;
	}
	public void setReview_no(int review_no) {
		this.review_no = review_no;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReview_date() {
		return review_date;
	}
	public void setReview_date(String review_date) {
		this.review_date = review_date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	
	
	
}
