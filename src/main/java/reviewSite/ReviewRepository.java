package reviewSite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {
	Map<Long, Review> reviewMap = new HashMap<Long, Review>();

	Review reviews;
	
	
	
	
	public ReviewRepository(){
	
	reviews = new Review(14L,"Window", "images/window.jpg", "negative-space", "a single light source with limit throw", "Fusce ultricies non lacus a imperdiet. Sed convallis lectus ac odio sodales tristique. Integer non eros at sapien lacinia rutrum. In bibendum risus in erat interdum efficitur. Ut faucibus id velit vitae eleifend. Praesent ut purus tincidunt, mattis purus ut, efficitur lacus. Nulla ut efficitur dolor. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nulla bibendum velit mauris, euismod fringilla arcu tristique id. Quisque aliquet tortor ut libero fringilla porta.");
	reviewMap.put(14L, reviews);
	reviews = new Review(12L,"The Boat", "images/boat.jpg", "negative-space", "an overcast day allow this boat to stand stark against the water", "Fusce ultricies non lacus a imperdiet. Sed convallis lectus ac odio sodales tristique. Integer non eros at sapien lacinia rutrum. In bibendum risus in erat interdum efficitur. Ut faucibus id velit vitae eleifend. Praesent ut purus tincidunt, mattis purus ut, efficitur lacus. Nulla ut efficitur dolor. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nulla bibendum velit mauris, euismod fringilla arcu tristique id. Quisque aliquet tortor ut libero fringilla porta.");
	reviewMap.put(12L, reviews);
	reviews = new Review(22L,"Balkan Amemone", "images/balkan-anemone-sm.jpg", "negative-space", "gentle bathed in light this flower seems to perice the darkness while remaining intact", "Fusce ultricies non lacus a imperdiet. Sed convallis lectus ac odio sodales tristique. Integer non eros at sapien lacinia rutrum. In bibendum risus in erat interdum efficitur. Ut faucibus id velit vitae eleifend. Praesent ut purus tincidunt, mattis purus ut, efficitur lacus. Nulla ut efficitur dolor. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nulla bibendum velit mauris, euismod fringilla arcu tristique id. Quisque aliquet tortor ut libero fringilla porta.");
	reviewMap.put(22L, reviews);
	reviews = new Review(32L,"Alone on a Plane", "images/dark-alone-plane.jpg", "negative-space", "we can only see light that is moving toward us.", "Fusce ultricies non lacus a imperdiet. Sed convallis lectus ac odio sodales tristique. Integer non eros at sapien lacinia rutrum. In bibendum risus in erat interdum efficitur. Ut faucibus id velit vitae eleifend. Praesent ut purus tincidunt, mattis purus ut, efficitur lacus. Nulla ut efficitur dolor. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nulla bibendum velit mauris, euismod fringilla arcu tristique id. Quisque aliquet tortor ut libero fringilla porta.");
	reviewMap.put(32L, reviews);
	reviews = new Review(42L,"Men Reflecting", "images/dark-men.jpg", "negative-space", "two men of style reflect on each other", "Fusce ultricies non lacus a imperdiet. Sed convallis lectus ac odio sodales tristique. Integer non eros at sapien lacinia rutrum. In bibendum risus in erat interdum efficitur. Ut faucibus id velit vitae eleifend. Praesent ut purus tincidunt, mattis purus ut, efficitur lacus. Nulla ut efficitur dolor. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nulla bibendum velit mauris, euismod fringilla arcu tristique id. Quisque aliquet tortor ut libero fringilla porta.");
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

