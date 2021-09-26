package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;

/**
 * CRUD operations for specimen
 * @author Administrator
 *
 */
public interface ISpecimenService {
	
	/**
	 * Get Specimen from persistence layer
	 * @param id a unique lookup
	 *@return a specimen with a matching id
	 */

	SpecimenDTO fetchby(int id);
	
	/**
	 * Persist the given DTO
	 * @param specimenDTO
	 *
	 */

	void save(SpecimenDTO specimenDTO);

}