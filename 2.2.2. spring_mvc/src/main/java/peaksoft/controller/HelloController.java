package peaksoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import peaksoft.models.Car;
import peaksoft.sercive.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@Autowired
	private CarService carService;

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("/cars?count=tolko ishteit");
		model.addAttribute("messages", messages);
		return "index";
	}

	@GetMapping("/cars")
	public String carShow(@RequestParam(value = "count", required = false) int count, Model model) {
		List<Car> getAllCars = carService.getCar(count);
		model.addAttribute("allCars", getAllCars);
		return "cars";
	}

}