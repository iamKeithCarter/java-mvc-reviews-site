package reviewSite;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ReviewController {

	
	@Resource
	public ReviewRepository repositoryOfReviews;

	@RequestMapping("/reviews")
	public String reviews(Model model) {
		model.addAttribute("repositoryOfReviews", repositoryOfReviews.findAll());
		return "reviews";
	}

	@RequestMapping("/review")
	public String review(@RequestParam("id") Long id, Model model) {
		model.addAttribute("repositoryOfReviews", repositoryOfReviews.findOne(id));
	
		return "review";
	}

}
