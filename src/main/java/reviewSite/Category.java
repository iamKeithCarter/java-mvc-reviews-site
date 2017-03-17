package reviewSite;




import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Category {
	
	@Id
	@GeneratedValue
	public long id;
	public String title;
	
	
	@OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
	private Collection<Review> reviews;

	private Category(){
		
	}
	
	public Category(String title, Collection<Review> reviews){
		
		this.title = title;
		this.reviews = reviews;
	}
	
	public Collection<Review> getReview() {

		return reviews;

	}

	public String getTitle() {

		return title;

	}
	public Long getId(){
		return id;
	}
	
}
