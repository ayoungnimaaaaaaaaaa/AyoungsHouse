package place.vo;

public class Recommend_info {
	
	private int info_no;
	private int user_no;
	private int place_no;
	private int click;
	private double score;
	
	
	
	public Recommend_info(int place_no, double score) {
		super();
		this.place_no = place_no;
		this.score = score;
	}
	public Recommend_info(int info_no, int user_no, int place_no, int click, double score) {
		super();
		this.info_no = info_no;
		this.user_no = user_no;
		this.place_no = place_no;
		this.click = click;
		this.score = score;
	}
	public int getInfo_no() {
		return info_no;
	}
	public void setInfo_no(int info_no) {
		this.info_no = info_no;
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
	public int getClick() {
		return click;
	}
	public void setClick(int click) {
		this.click = click;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	
	

}
