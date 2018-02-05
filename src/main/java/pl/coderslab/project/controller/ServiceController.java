package pl.coderslab.project.controller;

import java.io.UnsupportedEncodingException;
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

import pl.coderslab.project.entity.Service;
import pl.coderslab.project.repository.ServiceRepository;

@Controller
@RequestMapping("/service")
public class ServiceController {

	@Autowired
	private ServiceRepository serviceRepo;

	@GetMapping("/addform")
	public String addform(Model m) {
		m.addAttribute("service", new Service());
		return "service/addService";
	}

	@PostMapping("/addform")
	public String addform(@Valid @ModelAttribute Service service, BindingResult bindingResult)
			throws UnsupportedEncodingException {
		if (bindingResult.hasErrors()) {
			return "service/addService";
		}
		this.serviceRepo.save(service);
		return "redirect:/service/list";
	}

	@GetMapping("/list")
	public String list() {
		return "/service/list";
	}

	@ModelAttribute("availableService")
	public List<Service> getHairdressers() {
		return this.serviceRepo.findAll();
	}

	@GetMapping("{id}/del")
	public String del(@PathVariable long id) {
		this.serviceRepo.delete(id);
		return "redirect:/service/list";
	}

}
