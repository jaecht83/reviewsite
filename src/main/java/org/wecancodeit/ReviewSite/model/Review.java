package org.wecancodeit.ReviewSite.model;

public class Review {

	private Long id;
	private String title;
	private String imageurl;
	private String content;
	private String bodyCategory;
	private String bodyType;

	public Review(Long id, String title, String imageurl, String content, String bodyCategory, String bodyType) {
		this.id = id;
		this.title = title;
		this.imageurl = imageurl;
		this.content = content;
		this.bodyCategory = bodyCategory;
		this.bodyType = bodyType;
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
		return bodyCategory;
	}

	public String getBodyType() {
		return bodyType;
	}
}
