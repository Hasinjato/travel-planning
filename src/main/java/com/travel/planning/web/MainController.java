package com.travel.planning.web;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.travel.planning.model.User;
import com.travel.planning.repository.UserRepository;
import com.travel.planning.service.DestinationServiceImpl;
import com.travel.planning.service.TransportServiceImpl;
import com.travel.planning.service.TravelServiceImpl;
import com.travel.planning.service.UserService;

import jakarta.servlet.http.HttpSession;
@Controller
public class MainController {

	private TravelServiceImpl travelService;
	private TransportServiceImpl transportService;
	private DestinationServiceImpl destinationService;
	
	@GetMapping("/loginn")
	   public String login() {
	      return "login";
    }
	private UserRepository userRepository;
	private UserService userService;
	
		
	public MainController(TravelServiceImpl travelService, TransportServiceImpl transportServiceImpl,
			DestinationServiceImpl destinationServiceImpl, UserRepository userRepository, UserService userService) {
		super();
		this.travelService = travelService;
		this.transportService = transportServiceImpl;
		this.destinationService = destinationServiceImpl;
		this.userRepository = userRepository;
		this.userService = userService;
	}

	@PostMapping("/loginn")
	 public String processLogin(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session) {
		UserDetails user = userService.loadUserByUsername(username);
		
//		userRepository.findByUsername(username);
//		session.setAttribute(username, username);
		if(user != null) {
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			if (passwordEncoder.matches(password, user.getPassword())) {
				return "redirect:/home";
			}
		}
		return "redirect:/loginn?error";
	}
	
	private int visitorCount = 0;
	
	@GetMapping("/home")
   public String showHomePage(Model model) {
		visitorCount++;
		long nbTransport = transportService.getNbTransport();
		long nbTravel = travelService.getNbTravel();
		long nbUser = userService.getNbUser();
		long nbDest = destinationService.getNbDest();
		model.addAttribute("nbTransport", nbTransport);
		model.addAttribute("nbTravel", nbTravel);
		model.addAttribute("nbUser", nbUser);
		model.addAttribute("nbDest", nbDest);
		model.addAttribute("visitorCount", visitorCount);
		model.addAttribute("listEmployees", travelService.getAllTravels());
		return "home";
	}

	@GetMapping("/")
	public String welcome()
	{
		return "redirect:/loginn";
	}
	
}
