package com.plantplaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.plantplaces.dto.SpecimenDTO;
import com.plantplaces.service.ISpecimenService;

/**
 * Handel the /Start Endpoint
 * @return
 */

@Controller
public class PlantPlacesController {
	@Autowired
	private ISpecimenService specimenServiceStub;

	@RequestMapping(value = "/start", method = RequestMethod.GET)
	public String read(Model model) 
	{
		SpecimenDTO specimenDTO = specimenServiceStub.fetchby(43);
		model.addAttribute("specimenDTO", specimenDTO);
		return "start";
	}
	
	@RequestMapping(value = "/start", method = RequestMethod.GET, params= {"loyalty=silver"})
	public ModelAndView readSilver() 
	{
		SpecimenDTO specimenDTO = specimenServiceStub.fetchby(43);
		specimenDTO.setSpecimenId(87);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("Start");
		modelAndView.addObject("specimenDTO", specimenDTO);
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/start", method = RequestMethod.GET, params={"loyalty=blue"})
	public String readBlue() 
	{
		
		return "start";
	}
	
	@RequestMapping(value = "/start", method = RequestMethod.GET, headers= {"content-type=text/json"})
	public String readJson() 
	{
		
		return "start";
	}
	/**
	 * Handle the / Endpoint
	 * @return
	 */

	@RequestMapping("/start")
	public String create() 
	{
		
		return "start";
	}
	
	@RequestMapping ("/")
	public String index() 
	{
		
		return "start";
	}
	
}
