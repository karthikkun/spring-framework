package com.group.springframework.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ComponentDAO {

	@Autowired
	private ComponentJDBCConnection jdbcConnection;

	public ComponentJDBCConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(ComponentJDBCConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

}
