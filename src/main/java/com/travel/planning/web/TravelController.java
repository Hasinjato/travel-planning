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
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

import com.travel.planning.model.Destination;
import com.travel.planning.model.Transport;
import com.travel.planning.model.Travel;
import com.travel.planning.repository.DestinationRepository;
import com.travel.planning.repository.TransportRepository;
//import com.travel.planning.repository.TravelRepository;
import com.travel.planning.service.TravelService;
import com.travel.planning.service.TravelServiceImpl;

@Controller
public class TravelController {
	
	private TravelServiceImpl travelService;
	
	@Autowired
	private TransportRepository transportrepository;
	private DestinationRepository destinationrepository;
	
	
	public TravelController(TravelServiceImpl travelService, TransportRepository transportrepository,
			DestinationRepository destinationrepository) {
		super();
		this.travelService = travelService;
		this.transportrepository = transportrepository;
		this.destinationrepository = destinationrepository;
	}

	@GetMapping("/travels")
	public String viewAllTravels(Model model)
	{
		model.addAttribute("listEmployees", travelService.getAllTravels());
		return "Travel/travel-list";
	}
	
	@GetMapping("/travels/create")
	public String showCreateForm(Model model)
	{
		List<Transport> transports = transportrepository.findAll();
		model.addAttribute("transports", transports);
		List<Destination> destinations = destinationrepository.findAll();
		model.addAttribute("destinations", destinations);
		Travel travel = new Travel();
		model.addAttribute("travel", travel);
		return "Travel/travel-create";
	}
	
	
	@PostMapping("/travels/save")
	public String saveTravel(@ModelAttribute("travel") Travel travel)
	{
		travelService.saveTravel(travel);
		return "redirect:/travels";
	}

	@GetMapping("/travel/edit/{id}")
	public String showEditForm(@PathVariable(value="id") Long id, Model model)
	{
		List<Transport> transports = transportrepository.findAll();
		model.addAttribute("transports", transports);
		Travel travel = travelService.getTravelById(id);
		model.addAttribute("travel", travel);
		return "Travel/update-travel";
	}
	
	@GetMapping("/travel/detail/{id}")
	public String showDetail(@PathVariable(value="id") Long id, Model model)
	{
		List<Transport> transports = transportrepository.findAll();
		model.addAttribute("transports", transports);
		Travel travel = travelService.getTravelById(id);
		model.addAttribute("travel", travel);
		return "Travel/travel-detail";
	}
	
	@GetMapping("/travel/delete/{id}")
	public String showDeleteConf(@PathVariable(value="id") Long id, Model model)
	{
		this.travelService.deleteTravelById(id);
		return "redirect:/travels";
	}
}






