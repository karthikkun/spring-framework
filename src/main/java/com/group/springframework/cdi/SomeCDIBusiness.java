package com.group.springframework.cdi;

import javax.inject.Inject;
import javax.inject.Named;


/*
 * CDI is 
 * JAVA EE standard
 * 
 */

@Named
public class SomeCDIBusiness {

	@Inject
	private SomeCDIDao someCDIDao;

	public SomeCDIDao getSomeCDIDao() {
		return someCDIDao;
	}
}
