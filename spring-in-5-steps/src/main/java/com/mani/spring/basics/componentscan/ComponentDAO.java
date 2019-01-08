package com.mani.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class ComponentDAO {
	
	@Autowired
	ComponentJdbcConnection jdbcconnection ;

	public ComponentJdbcConnection getJdbcconnection() {
		return jdbcconnection;
	}

	public void setJdbcconnection(ComponentJdbcConnection jdbcconnection) {
		this.jdbcconnection = jdbcconnection;
	}
	
	
		

}
