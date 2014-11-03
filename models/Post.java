package models;

import java.awt.Image;

public class Post {
	
	private String url;
	private String title;
	private String author;
	private Image icon;
	
	public Post() {
		
	}
	
	public Post(String u, String t, String a, Image i) {
		this.url = u;
		this.title = t;
		this.author = a;
		this.icon = i;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the icon
	 */
	public Image getIcon() {
		return icon;
	}

	/**
	 * @param icon the icon to set
	 */
	public void setIcon(Image icon) {
		this.icon = icon;
	}
}
