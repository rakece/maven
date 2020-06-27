
package com.kirusa.service;

import com.kirusa.domain.RcsBotCarrier;

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
public class RcsBotCarrierServiceTest {

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
	protected RcsBotCarrierService service;

	/**
	 * Instantiates a new RcsBotCarrierServiceTest.
	 *
	 */
	public RcsBotCarrierServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Load an existing RcsBotCarrier entity
	* 
	 */
	@Test
	public void loadRcsBotCarriers() {
		Set<RcsBotCarrier> response = null;
		response = service.loadRcsBotCarriers();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRcsBotCarriers
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRcsBotCarrierByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRcsBotCarrierByPrimaryKey 
		Integer id = 0;
		RcsBotCarrier response = null;
		response = service.findRcsBotCarrierByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findRcsBotCarrierByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Return a count of all RcsBotCarrier entity
	* 
	 */
	@Test
	public void countRcsBotCarriers() {
		Integer response = null;
		response = service.countRcsBotCarriers();
		// TODO: JUnit - Add assertions to test outputs of operation: countRcsBotCarriers
	}

	/**
	 * Operation Unit Test
	* Return all RcsBotCarrier entity
	* 
	 */
	@Test
	public void findAllRcsBotCarriers() {
		// TODO: JUnit - Populate test inputs for operation: findAllRcsBotCarriers 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<RcsBotCarrier> response = null;
		response = service.findAllRcsBotCarriers(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRcsBotCarriers
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotCarrier entity
	* 
	 */
	@Test
	public void saveRcsBotCarrier() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotCarrier 
		RcsBotCarrier rcsbotcarrier = new com.kirusa.domain.RcsBotCarrier();
		service.saveRcsBotCarrier(rcsbotcarrier);
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotCarrier entity
	* 
	 */
	@Test
	public void deleteRcsBotCarrier() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotCarrier 
		RcsBotCarrier rcsbotcarrier_1 = new com.kirusa.domain.RcsBotCarrier();
		service.deleteRcsBotCarrier(rcsbotcarrier_1);
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
