package reviewSite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ReviewRepository extends CrudRepository<Review,Long>{
//	Map<Long, Review> reviewMap = new HashMap<Long, Review>();

}
	
//
//	public Collection<Review> findAll() {
//		Collection<Review> allReviews = reviewMap.values();
//		return allReviews;
//	}
//
//	public Review findOne(long id) {
//		Review oneReview = reviewMap.get(id);
//		return oneReview;
//
//	}
//
