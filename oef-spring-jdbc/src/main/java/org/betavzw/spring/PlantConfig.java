package org.betavzw.spring;



import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration public class PlantConfig {

	/**
	 * Deze methode maakt een nieuwe DataSource aan voor een connectie met de
	 * database. Door de @Bean notatie wordt deze methode gebruikt iedere keer
	 * als Spring een DataSource moet invullen
	 * 
	 * @return
	 */
	@Bean public DataSource getDataSource(){
	    DriverManagerDataSource ds = new DriverManagerDataSource();
	    ds.setUsername("root");
	    ds.setPassword("root");
	    ds.setUrl("jdbc:mysql://localhost:3306/deschop");
	    return ds;

	}
}
