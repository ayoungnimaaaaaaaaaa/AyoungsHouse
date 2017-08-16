package place.vo;

public class Comment {

	private int comment_no;
	private int place_no;
	private int user_no;
	private String content;
	public Comment() {
		// TODO Auto-generated constructor stub
	}
	public Comment(int comment_no, int place_no, int user_no, String content) {
		super();
		this.comment_no = comment_no;
		this.place_no = place_no;
		this.user_no = user_no;
		this.content = content;
	}
	
	public int getComment_no() {
		return comment_no;
	}
	public void setComment_no(int comment_no) {
		this.comment_no = comment_no;
	}
	public int getPlace_no() {
		return place_no;
	}
	public void setPlace_no(int place_no) {
		this.place_no = place_no;
	}
	public int getUser_no() {
		return user_no;
	}
	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
