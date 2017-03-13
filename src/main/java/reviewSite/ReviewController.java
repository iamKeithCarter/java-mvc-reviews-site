package reviewSite;




import javax.annotation.Resource;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;





			



import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Controller
public class ReviewController {


	
	

	@Resource
	public ReviewRepository repository;

	@RequestMapping("/reviews")
	public String reviews(Model model){
	
		model.addAttribute("repository", repository.getAll());
		return "reviews";
	}
	//interate throuh them to display
	

	
	@RequestMapping("/review")
	 public String review(@RequestParam("id") Long id, Model model) {
       model.addAttribute("repository", repository.getOne(id));
       return "review";
   }
	

}


