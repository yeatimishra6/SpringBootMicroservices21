package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handel the /Start Endpoint
 * @return
 */

@Controller
public class PlantPlacesController {

	@RequestMapping("/start")
	public String start() 
	{
		
		return "start";
	}
	/**
	 * Handle the / Endpoint
	 * @return
	 */

	@RequestMapping("/start")
	public String index() 
	{
		
		return "start";
	}
	
}
