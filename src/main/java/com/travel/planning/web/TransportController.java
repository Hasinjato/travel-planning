package com.travel.planning.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.travel.planning.model.Transport;
import com.travel.planning.service.TransportServiceImpl;

@Controller
public class TransportController {

	private TransportServiceImpl transportService;
	
	public TransportController(TransportServiceImpl transportService) {
		super();
		this.transportService = transportService;
	}


	@GetMapping("/transports")
	public String getTransports(Model model)
	{
		model.addAttribute("transports", transportService.getAllTransports());
		return "Transport/transport-list";
	}
	
	
	@GetMapping("/transport/create")
	public String showCreateForm(Model model)
	{
		Transport transport = new Transport();
		model.addAttribute("transport", transport);
		return "Transport/transport-create";
	}
	
	
	@PostMapping("/transport/save")
	public String saveTransport(@ModelAttribute("transport") Transport transport)
	{
		transportService.saveTransport(transport);
		return "redirect:/transports";
	}
	
	@GetMapping("/transport/edit/{id}")
	public String showEditForm(@PathVariable(value="id") Long id, Model model)
	{
		Transport transport = transportService.getTransportById(id);
		model.addAttribute("transport", transport);
		return "Transport/update-transport";
	}

	@PostMapping("/transport/saveedit")
	public String saveUpdateTransport(@ModelAttribute("transport") Transport transport)
	{
		transportService.updateTransport(transport);
		return "redirect:/transports";
	}
	
	
	@GetMapping("/transport/delete/{id}")
	public String showDeleteConf(@PathVariable(value="id") Long id, Model model)
	{
		this.transportService.deleteTransportById(id);
		return "redirect:/transports";
	}
}
