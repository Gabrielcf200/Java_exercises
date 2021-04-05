package exercises_complete.PostComment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private Date moment;
	private String title;
	private String content;
	private Integer like;
	private List <Comment> comments = new ArrayList<>(); 
	
	
	public Post() {	
	}
	
	public Post(Date moment, String title, String content, Integer like) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.like = like;
	}
	
	
	
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getLike() {
		return like;
	}
	public void setLike(Integer like) {
		this.like = like;
	}
	
	public String getComments(int x){
				
		return comments.get(x).getTexto();
	}
	
	public void addComment(Comment x) {
		comments.add(x);
	}
	public void removeComment(Comment x) {
		comments.remove(x);
	}
	
	public String toString() {
		return (getTitle()+"%n" + getLike() + " Like - " + getMoment() + "%n"
				+ getContent() + "%n" + "Comments: %n" + getComments(0) + "%n" + 
				getComments(1) + "%n%n");
	}
	
}

