package org.betavzw.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MainApp.class, args);
		
		PlantDAO dao = context.getBean("PlantDAOMySQL", PlantDAO.class);
		
		/*
		 * Selecteer en print alle planten
		 */
		dao.selectAll().forEach(System.out::println);
		
		/*
		 * Select enkele plant
		 */
		System.out.println(dao.select("300"));
		
		/*
		 * Insert een nieuwe plant
		 */
		Plant plant = new Plant();
		plant.setArt_Code("999");
		plant.setSoort("BOOM");
		plant.setPlantenNaam("Ganjaman");
		plant.setPrijs(4.20);
		plant.setHoogte(42.0);
		dao.insert(plant);
		
		/*
		 * update
		 */
		plant = new Plant();
		plant.setArt_Code("420");
		plant.setPlantenNaam("De ganjaplant");
		dao.update(plant);
		
		/*
		 * delete
		 */
		plant = new Plant();
		plant.setArt_Code("999");
		dao.delete(plant);
	}

}