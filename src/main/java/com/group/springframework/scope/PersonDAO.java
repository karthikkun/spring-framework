package com.group.springframework.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDAO {

	@Autowired
	private JDBCConnection jdbcConnection;

	public JDBCConnection getJdbcConnection() {
		return jdbcConnection;
	}
 
	public void setJdbcConnection(JDBCConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

}
