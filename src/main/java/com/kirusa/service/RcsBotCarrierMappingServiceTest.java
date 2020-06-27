
package com.kirusa.service;

import com.kirusa.domain.RcsBotCarrierMapping;

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
public class RcsBotCarrierMappingServiceTest {

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
	protected RcsBotCarrierMappingService service;

	/**
	 * Instantiates a new RcsBotCarrierMappingServiceTest.
	 *
	 */
	public RcsBotCarrierMappingServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Return all RcsBotCarrierMapping entity
	* 
	 */
	@Test
	public void findAllRcsBotCarrierMappings() {
		// TODO: JUnit - Populate test inputs for operation: findAllRcsBotCarrierMappings 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<RcsBotCarrierMapping> response = null;
		response = service.findAllRcsBotCarrierMappings(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRcsBotCarrierMappings
	}

	/**
	 * Operation Unit Test
	* Return a count of all RcsBotCarrierMapping entity
	* 
	 */
	@Test
	public void countRcsBotCarrierMappings() {
		Integer response = null;
		response = service.countRcsBotCarrierMappings();
		// TODO: JUnit - Add assertions to test outputs of operation: countRcsBotCarrierMappings
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotCarrierMapping entity
	* 
	 */
	@Test
	public void saveRcsBotCarrierMapping() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotCarrierMapping 
		RcsBotCarrierMapping rcsbotcarriermapping = new com.kirusa.domain.RcsBotCarrierMapping();
		service.saveRcsBotCarrierMapping(rcsbotcarriermapping);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRcsBotCarrierMappingByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRcsBotCarrierMappingByPrimaryKey 
		Integer id = 0;
		RcsBotCarrierMapping response = null;
		response = service.findRcsBotCarrierMappingByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findRcsBotCarrierMappingByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Load an existing RcsBotCarrierMapping entity
	* 
	 */
	@Test
	public void loadRcsBotCarrierMappings() {
		Set<RcsBotCarrierMapping> response = null;
		response = service.loadRcsBotCarrierMappings();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRcsBotCarrierMappings
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotCarrierMapping entity
	* 
	 */
	@Test
	public void deleteRcsBotCarrierMapping() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotCarrierMapping 
		RcsBotCarrierMapping rcsbotcarriermapping_1 = new com.kirusa.domain.RcsBotCarrierMapping();
		service.deleteRcsBotCarrierMapping(rcsbotcarriermapping_1);
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
