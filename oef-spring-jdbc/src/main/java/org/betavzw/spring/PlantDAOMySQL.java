package org.betavzw.spring;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository("PlantDAOMySQL")
public class PlantDAOMySQL implements PlantDAO {
	
	private static final String SQL_SELECT = "SELECT * FROM planten";
	
	/**
	 * De elementen in de string die beginnen met een ':' (bv :id) zijn waarden die je kan vervangen met een waarde.
	 * Zo is het gemakkelijk om SQL statements in te vullen
	 * 
	 * Kijk bv bij de insert methode.
	 */
	private static final String SQL_SELECT_BY_ID = "SELECT * FROM planten WHERE art_code=:id";
	private static final String SQL_INSERT = "INSERT INTO planten (art_code, plantennaam, soort, prijs) VALUES (:id,:name,:soort,:prijs)";
	private static final String SQL_UPDATE = "UPDATE planten SET plantennaam = :name WHERE art_code = :id";
	private static final String SQL_DELETE = "DELETE FROM planten WHERE art_code = :id";

	/**
	 * Het hulp object voor de SQL operaties
	 */
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public List<Plant> selectAll() {
		return jdbcTemplate.query(SQL_SELECT, new BeanPropertyRowMapper<Plant>(Plant.class));
	}

	@Override
	public Plant select(String id) {
		SqlParameterSource param = new MapSqlParameterSource("id", id);
		return jdbcTemplate.queryForObject(SQL_SELECT_BY_ID, param, new BeanPropertyRowMapper<Plant>(Plant.class));
	}

	@Override
	public void insert(Plant plant) {
		Map<String, Object> params = new HashMap<>();
		params.put("id", plant.getArt_Code());
		params.put("name", plant.getPlantenNaam());
		params.put("soort", plant.getSoort());
		params.put("prijs", plant.getPrijs());
		params.put("hoogte", plant.getHoogte());
		jdbcTemplate.update(SQL_INSERT, params);
	}

	@Override
	public void update(Plant plant) {
		Map<String, Object> params = new HashMap<>();
		params.put("id", plant.getArt_Code());
		params.put("name", plant.getPlantenNaam());
		jdbcTemplate.update(SQL_UPDATE, params);
	}

	@Override
	public void delete(Plant plant) {
		SqlParameterSource param = new MapSqlParameterSource("id",plant.getArt_Code());
		jdbcTemplate.update(SQL_DELETE, param);
	}

}