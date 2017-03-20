package reviewSite;

import java.util.Collection;
import java.util.Collections;

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
	private String title;

	@OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
	protected Collection<Review> reviews;

	protected Category() {

	}

	public Category(String title) {
		this(title, Collections.emptyList());
	}

	public Category(String title, Collection<Review> reviews) {

		this.title = title;
		this.reviews = reviews;
	}

	public Collection<Review> getReviews() {

		return reviews;

	}

	public String getTitle() {

		return title;
	}

	public Long getId() {
		return id;
	}

}
