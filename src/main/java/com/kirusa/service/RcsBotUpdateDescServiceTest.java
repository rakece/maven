
package com.kirusa.service;


import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotUpdateDesc;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
@Transactional
public class RcsBotUpdateDescServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected RcsBotUpdateDescService service;

	/**
	 * Instantiates a new RcsBotUpdateDescServiceTest.
	 *
	 */
	public RcsBotUpdateDescServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotUpdate entity
	* 
	 */
	@Test
	public void deleteRcsBotUpdateDescRcsBotUpdate() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotUpdateDescRcsBotUpdate 
		Integer rcsbotupdatedesc_id = 0;
		Integer related_rcsbotupdate_id = 0;
		RcsBotUpdateDesc response = null;
		response = service.deleteRcsBotUpdateDescRcsBotUpdate(rcsbotupdatedesc_id, related_rcsbotupdate_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotUpdateDescRcsBotUpdate
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotUpdateDesc entity
	* 
	 */
	@Test
	public void saveRcsBotUpdateDesc() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotUpdateDesc 
		RcsBotUpdateDesc rcsbotupdatedesc = new com.kirusa.domain.RcsBotUpdateDesc();
		service.saveRcsBotUpdateDesc(rcsbotupdatedesc);
	}

	/**
	 * Operation Unit Test
	* Return all RcsBotUpdateDesc entity
	* 
	 */
	@Test
	public void findAllRcsBotUpdateDescs() {
		// TODO: JUnit - Populate test inputs for operation: findAllRcsBotUpdateDescs 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<RcsBotUpdateDesc> response = null;
		response = service.findAllRcsBotUpdateDescs(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRcsBotUpdateDescs
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotUpdateDesc entity
	* 
	 */
	@Test
	public void deleteRcsBotUpdateDesc() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotUpdateDesc 
		RcsBotUpdateDesc rcsbotupdatedesc_1 = new com.kirusa.domain.RcsBotUpdateDesc();
		service.deleteRcsBotUpdateDesc(rcsbotupdatedesc_1);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRcsBotUpdateDescByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRcsBotUpdateDescByPrimaryKey 
		Integer id = 0;
		RcsBotUpdateDesc response = null;
		response = service.findRcsBotUpdateDescByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findRcsBotUpdateDescByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Load an existing RcsBotUpdateDesc entity
	* 
	 */
	@Test
	public void loadRcsBotUpdateDescs() {
		Set<RcsBotUpdateDesc> response = null;
		response = service.loadRcsBotUpdateDescs();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRcsBotUpdateDescs
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotUpdate entity
	* 
	 */
	@Test
	public void saveRcsBotUpdateDescRcsBotUpdate() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotUpdateDescRcsBotUpdate 
		Integer id_1 = 0;
		RcsBot related_rcsbotupdate = new com.kirusa.domain.RcsBot();
		RcsBotUpdateDesc response = null;
		response = service.saveRcsBotUpdateDescRcsBot(id_1, related_rcsbotupdate);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotUpdateDescRcsBotUpdate
	}

	/**
	 * Operation Unit Test
	* Return a count of all RcsBotUpdateDesc entity
	* 
	 */
	@Test
	public void countRcsBotUpdateDescs() {
		Integer response = null;
		response = service.countRcsBotUpdateDescs();
		// TODO: JUnit - Add assertions to test outputs of operation: countRcsBotUpdateDescs
	}

	/**
	 * Autowired to set the Spring application context.
	 *
	 */
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("session", new SessionScope());
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("request", new RequestScope());
	}

	/**
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
