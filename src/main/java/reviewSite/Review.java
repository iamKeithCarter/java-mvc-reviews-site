package reviewSite;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {

	@Id
	@GeneratedValue
	private long id;
	private String title;
	private String imgURL;

	private String synopsis;
	private String description;
	//private String categoryTitle;

	@ManyToOne
	private Category category;

	private Review() {

	}

	public Review(String title, String imgURL, String description, String synopsis) {

		this.title = title;
		this.imgURL = imgURL;

		this.description = description;
		this.synopsis = synopsis;

	}

	public Long getId() {

		return id;

	}

	public String getTitle() {

		return title;

	}

	public String getImgURL() {

		return imgURL;
	}

	public Category getCategory() {

		return category;

	}

//	public String getCategoryTitle() {
//		categoryTitle = category.getTitle();
//		return categoryTitle;
//	}

	public String getSynopsis() {

		return synopsis;

	}

	public String getDescription() {

		return description;

	}
}
