package pl.coderslab.project.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

	//TODO - add validation and binding result
	@PostMapping("/addform")
	public String addform(@ Valid @ModelAttribute Hairdresser hairdresser, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "hairdresser/addHairdresser";
		}
		this.hairdresserRepo.save(hairdresser);
		return "redirect:/hairdresser/list";
	}
	
	@GetMapping("/list")
	public String list() {
		return "/hairdresser/list";
	}

	@ModelAttribute("availableHairdresser")
	public List<Hairdresser> getHairdressers() {
		return this.hairdresserRepo.findAll();
	}
	
	@GetMapping("{id}/del")
	public String del(@PathVariable long id) {
		this.hairdresserRepo.delete(id);
		return "redirect:/hairdresser/list";
	}
	

}
