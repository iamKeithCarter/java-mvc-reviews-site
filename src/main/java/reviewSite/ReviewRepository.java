package reviewSite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {
	Map<Long, Review> reviewMap = new HashMap<Long, Review>();

	Review reviews;

	public ReviewRepository() {

		reviewMap.put(14L, new Review(14L, "Window", "images/window.jpg", "Negative-Space",
				"A single light source with limit throw",
				"When we explore the nature of light we inexplicably speak of glory, the idea being... imperdiet. Sed convallis lectus ac odio sodales tristique. Integer non eros at sapien lacinia rutrum. In bibendum risus in erat interdum efficitur. Ut faucibus id velit vitae eleifend. Praesent ut purus tincidunt, mattis purus ut, efficitur lacus. Nulla ut efficitur dolor. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nulla bibendum velit mauris, euismod fringilla arcu tristique id. Quisque aliquet tortor ut libero fringilla porta."));

		reviewMap.put(12L, new Review(12L, "The Boat", "images/boat.jpg", "Negative-Space",
				"An overcast day allow this boat to stand stark against the water",
				"A haunting image, signifed by both its ....usce ultricies non lacus a imperdiet. Sed convallis lectus ac odio sodales tristique. Integer non eros at sapien lacinia rutrum. In bibendum risus in erat interdum efficitur. Ut faucibus id velit vitae eleifend. Praesent ut purus tincidunt, mattis purus ut, efficitur lacus. Nulla ut efficitur dolor. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nulla bibendum velit mauris, euismod fringilla arcu tristique id. Quisque aliquet tortor ut libero fringilla porta."));

		reviewMap.put(22L, new Review(22L, "Balkan Amemone", "images/balkan-anemone-sm.jpg", "Negative-Space",
				"Gently bathed in light this flower seems to perice the darkness while remaining intact",
				"Blue vibrates at the wavelength of... ultricies non lacus a imperdiet. Sed convallis lectus ac odio sodales tristique. Integer non eros at sapien lacinia rutrum. In bibendum risus in erat interdum efficitur. Ut faucibus id velit vitae eleifend. Praesent ut purus tincidunt, mattis purus ut, efficitur lacus. Nulla ut efficitur dolor. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nulla bibendum velit mauris, euismod fringilla arcu tristique id. Quisque aliquet tortor ut libero fringilla porta."));

		reviewMap.put(32L, new Review(32L, "Alone on a Plane", "images/dark-alone-plane.jpg", "Negative-Space",
				"We can only see light that is moving toward us.",
				"Here the artist uses material reflectance and time of day to speak volumns with his..usce ultricies non lacus a imperdiet. Sed convallis lectus ac odio sodales tristique. Integer non eros at sapien lacinia rutrum. In bibendum risus in erat interdum efficitur. Ut faucibus id velit vitae eleifend. Praesent ut purus tincidunt, mattis purus ut, efficitur lacus. Nulla ut efficitur dolor. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nulla bibendum velit mauris, euismod fringilla arcu tristique id. Quisque aliquet tortor ut libero fringilla porta."));

		reviewMap.put(42L, new Review(42L, "Men Reflecting", "images/dark-men.jpg", "Negative-Space",
				"Two men of style reflect on one another other",
				"A subtile use of humor is employed here to...icies non lacus a imperdiet. Sed convallis lectus ac odio sodales tristique. Integer non eros at sapien lacinia rutrum. In bibendum risus in erat interdum efficitur. Ut faucibus id velit vitae eleifend. Praesent ut purus tincidunt, mattis purus ut, efficitur lacus. Nulla ut efficitur dolor. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nulla bibendum velit mauris, euismod fringilla arcu tristique id. Quisque aliquet tortor ut libero fringilla porta."));

	}

	public Collection<Review> getAll() {
		Collection<Review> allReviews = reviewMap.values();
		return allReviews;
	}

	public Review getOne(long id) {
		Review oneReview = reviewMap.get(id);
		return oneReview;

	}
}
