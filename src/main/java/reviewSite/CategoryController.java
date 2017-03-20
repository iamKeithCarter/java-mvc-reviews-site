package reviewSite;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CategoryController {

	@Resource
	public CategoryRepository repositoryOfCategories;

	@RequestMapping("/categories")
	public String categories(Model model) {
		model.addAttribute("repositoryOfCategories", repositoryOfCategories.findAll());

		return "categories";
	}

	@RequestMapping("/category")
	public String category(@RequestParam("id") Long id, Model model) {
		model.addAttribute("repositoryOfCategories", repositoryOfCategories.findOne(id));

		return "category";
	}

}
