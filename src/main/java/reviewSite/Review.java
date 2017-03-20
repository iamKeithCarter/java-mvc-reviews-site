package reviewSite;

import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;  



@Entity
public class Review {

	@Id
	@GeneratedValue
	private long id;
	private String title;
	private String imgURL;
	//public  String category; // is this line replaced by mant to one category
	private String synopsis;
	private String description;
	private String categoryTitle;
	
	@ManyToOne
	private Category category;
	
	private Review(){
		
	}
	
	public Review(String title, String imgURL, String description, String synopsis) {
//removed category from Review constructor and added a private Category with manytoone
		
		this.title = title;
		this.imgURL = imgURL;
		//this.category= category;
		this.description = description;
		this.synopsis = synopsis;

	}
// id is not part of constructor and so does not need a get Id
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
	public String getCategoryTitle(){
		categoryTitle= category.getTitle();
		return categoryTitle;
	}
	public String getSynopsis() {

		return synopsis;

	}

	public String getDescription() {

		return description;

	}
}

