package com.group.springframework.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
/*
 * Proxy gets autowired in the dependent class 
 * and provides prototype functionality
 * 
 */
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JDBCConnection {

	public void jdbcConnection() {
		System.out.println("JDBC conn");
	}
}
 