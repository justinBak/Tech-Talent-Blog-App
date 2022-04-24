package com.techtalentsouth.techtalentblog.blogposts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BlogPost {
//	ID LABELS THE NEXT VARIABLE AS BEING OUR PRIMARY KEY WHEN STORED TO THE DATABASE
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	private String title;
	private String author;
	private String blogEntry;
	
	
	public BlogPost() {
		
	}
	
	public BlogPost(String title, String author, String blogEntry) {
		this.title = title;
		this.author = author;
		this.blogEntry = blogEntry;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBlogEntry() {
		return blogEntry;
	}

	public void setBlogEntry(String blogEntry) {
		this.blogEntry = blogEntry;
	}

	public Long getId() {
		return Id;
	}

	@Override
	public String toString() {
		return "BlogPost [Id=" + Id + ", title=" + title + ", author=" + author + ", blogEntry=" + blogEntry + "]";
	}
	
	
}
