package reviewSite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {
	Map<Long, Review> reviewMap = new HashMap<Long, Review>();

	
	
	Review reviews = new Review(24L,"hey", "image", "catgory", "description", "Synopsis");
	
	
	public ReviewRepository(){
	
	
	reviewMap.put(24L, reviews);
	reviews = new Review(14L,"hey", "image", "catgory", "description", "Synopsis");
	reviewMap.put(14L, reviews);
	reviews = new Review(12L,"hey", "image", "cars", "some good cars", "all albout the good cars");
	reviewMap.put(12L, reviews);
	reviews = new Review(22L,"hey", "image", "cars", "some good cars", "all albout the good cars");
	reviewMap.put(22L, reviews);
	reviews = new Review(32L,"hey", "image", "cars", "some good cars", "all albout the good cars");
	reviewMap.put(32L, reviews);
	reviews = new Review(42L,"hey", "image", "cars", "some good cars", "all albout the good cars");
	reviewMap.put(42L, reviews);
	}

	public Collection<Review> getAll(){
		Collection<Review> allReviews = reviewMap.values();
		return allReviews;
	}
	
	public Review getOne(long id){
		Review oneReview = reviewMap.get(id);
		return oneReview;
				
	}
}

