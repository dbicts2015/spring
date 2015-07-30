package org.betavzw.spring;

import java.util.List;

/**
 * Een interface PlantDAO. Zo kan men verschillende implementaties maken
 * van de DAO afhangend van de SQL implementatie die ze gebruiken.
 * 
 * @author user104
 *
 */
public interface PlantDAO {

	public abstract List<Plant> selectAll();
	public abstract Plant select(String id);
	public abstract void insert(Plant plant);
	public abstract void update(Plant plant);
	public abstract void delete(Plant plant);

}