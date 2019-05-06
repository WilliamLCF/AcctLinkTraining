package com.esun.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class MerchantDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Object> findMerchant() {
		return null;
	}
}
