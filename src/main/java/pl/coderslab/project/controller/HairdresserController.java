package pl.coderslab.project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.coderslab.project.entity.Hairdresser;
import pl.coderslab.project.repository.HairdresserRepository;

@Controller
@RequestMapping("/hairdresser")
public class HairdresserController {
	
	@Autowired
	private HairdresserRepository hairdresserRepo;
	
	@GetMapping("/addform")
	public String addform(Model m) {
		m.addAttribute("hairdresser", new Hairdresser());
		return "hairdresser/addHairdresser";
	}
	
	@PostMapping("/addform")
	@ResponseBody
	public String addform(@ModelAttribute Hairdresser hairdresser) {
		this.hairdresserRepo.save(hairdresser);
		return "dodano fryzjera!";
	}
	
//	@GetMapping("/addform")
//	public String addform(Model m) {
//		m.addAttribute("author", new Author());
//		return "author/addAuthor";
//	}
//	
//	@PostMapping("/addform")
//	public String addform(@Valid @ModelAttribute Author author, BindingResult bindingResult) {
//		if (bindingResult.hasErrors()) {
//			return "author/addAuthor";
//		}
//		this.authorDao.saveAuthor(author);
//		return "redirect:/author/list";
//	}

}
