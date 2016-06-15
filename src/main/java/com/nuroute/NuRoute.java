package com.nuroute;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
/**
 * Implementation of InitializingBean & DisposableBean
 * @author Shekhar
 *
 */
public class NuRoute implements InitializingBean, DisposableBean {
	
	public void welcome() {
		System.out.println("Welcome to Spring FrameWork");
	}

	/**
	 * Should run before welcome() method
	 */
	public void afterPropertiesSet() throws Exception {
		System.out.println("Welcome User from 2" );
		
	}

	/**
	 * Should run after welcome() method
	 */
	public void destroy() throws Exception {
		System.out.println("Bye Bye User");
		
	}
}
