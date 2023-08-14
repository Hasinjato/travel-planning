package com.travel.planning.web;

import java.util.List;

//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.travel.planning.model.Destination;
import com.travel.planning.model.Transport;
import com.travel.planning.repository.DestinationRepository;
import com.travel.planning.service.DestinationServiceImpl;

@Controller
public class DestinationController {
	
	private DestinationServiceImpl destinationService;
	
	@Autowired
	private DestinationRepository Destinationrepository;
	
	

	public DestinationController(DestinationRepository Destinationrepository) {
		super();
		this.Destinationrepository = Destinationrepository;
	}

	@Autowired
	public DestinationController(DestinationServiceImpl destinationService) {
		super();
		this.destinationService = destinationService;
	}

	@GetMapping("/destinations")
	public String viewAllTravels(Model model)
	{
		model.addAttribute("destinations", destinationService.getAllDestinations());
		return "Destination/destination-list";
	}
	
	@GetMapping("/destination/create")
	public String showCreateForm(Model model)
	{
		List<Destination> Destinations = Destinationrepository.findAll();
		model.addAttribute("Destinations", Destinations);
		Destination destination = new Destination();
		model.addAttribute("destination", destination);
		return "Destination/destination-create";
	}
	
	
	@PostMapping("/destination/save")
	public String saveTravel(@ModelAttribute("destination") Destination destination)
	{
		destinationService.saveDestination(destination);
		return "redirect:/destinations";
	}
	
	@GetMapping("/destination/edit/{id}")
	public String showEditForm(@PathVariable(value="id") Long id, Model model)
	{
		List<Destination> Destinations = Destinationrepository.findAll();
		model.addAttribute("Destinations", Destinations);
		Destination destination = destinationService.getDestinationById(id);
		model.addAttribute("destination", destination);
		return "Destination/update-destination";
	}
	
	@PostMapping("/destination/saveedit")
	public String saveUpdateTransport(@ModelAttribute("destination") Destination destination)
	{
		destinationService.updateDestination(destination);
		return "redirect:/destinations";
	}
	
	@GetMapping("/destination/delete/{id}")
	public String showDeleteConf(@PathVariable(value="id") Long id, Model model)
	{
		this.destinationService.deleteDestinationById(id);
		return "redirect:/destinations";
	}
}






