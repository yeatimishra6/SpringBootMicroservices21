package com.plantplaces.service;

import org.springframework.stereotype.Component;

import com.plantplaces.dto.SpecimenDTO;

// import com.plantplace.service


@Component
public class SpecimenServiceStub implements ISpecimenService {

	
	@Override
	public SpecimenDTO fetchby(int id) 
	{
		SpecimenDTO specimentDTO;
		specimentDTO = new SpecimenDTO();
		specimentDTO.setSpecimenId(43);
		specimentDTO.setLatitude("40.72");
		specimentDTO.setLongitude("-679.343");
		specimentDTO.setDescribtion("A Beautiful Eastern Redbud");
		return specimentDTO;
		
	}
	
	@Override
	public void save(SpecimenDTO specimenDTO) 
	{
		
		
	}
}
