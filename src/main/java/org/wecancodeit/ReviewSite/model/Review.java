package org.wecancodeit.ReviewSite.model;

public class Review {

	private Long id;
	private String title;
	private String imageurl;
	private String content;
	private String bodycategory;
	private String bodytype;

	public Review(Long id, String title, String imageurl, String content, String bodycategory, String bodytype) {
		this.id = id;
		this.title = title;
		this.imageurl = imageurl;
		this.content = content;
		this.bodycategory = bodycategory;
		this.bodytype = bodytype;
	}

	public String getTitle() {
		return title;
	}

	public String getImageurl() {
		return imageurl;
	}

	public String getContent() {
		return content;
	}

	public Long getId() {
		return id;
	}

	public String getBodyCategory() {
		return bodycategory;
	}

	public String getBodyType() {
		return bodytype;
	}
}
