package reviewSite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;  



@Entity
public class Review {

	@Id
	@GeneratedValue
	private long id;
	private String title;
	private String imgURL;
	private String category;
	private String synopsis;
	private String description;
	
	@ManyToOne
	private Review review;
	
	private Review(){}
	
	public Review(String title, String imgURL, String category, String description, String synopsis) {

		
		this.title = title;
		this.imgURL = imgURL;
		this.category = category;
		this.description = description;
		this.synopsis = synopsis;

	}

	public long getId() {

		return id;

	}

	public String getTitle() {

		return title;

	}

	public String getImgURL() {

		return imgURL;
	}

	public String getCategory() {

		return category;

	}

	public String getSynopsis() {

		return synopsis;

	}

	public String getDescription() {

		return description;

	}
}

