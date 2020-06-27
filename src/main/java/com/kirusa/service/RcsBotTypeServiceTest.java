
package com.kirusa.service;

import com.kirusa.domain.RcsBotType;

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
public class RcsBotTypeServiceTest {

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
	protected RcsBotTypeService service;

	/**
	 * Instantiates a new RcsBotTypeServiceTest.
	 *
	 */
	public RcsBotTypeServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Return a count of all RcsBotType entity
	* 
	 */
	@Test
	public void countRcsBotTypes() {
		Integer response = null;
		response = service.countRcsBotTypes();
		// TODO: JUnit - Add assertions to test outputs of operation: countRcsBotTypes
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotType entity
	* 
	 */
	@Test
	public void saveRcsBotType() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotType 
		RcsBotType rcsbottype = new com.kirusa.domain.RcsBotType();
		service.saveRcsBotType(rcsbottype);
	}

	/**
	 * Operation Unit Test
	* Return all RcsBotType entity
	* 
	 */
	@Test
	public void findAllRcsBotTypes() {
		// TODO: JUnit - Populate test inputs for operation: findAllRcsBotTypes 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<RcsBotType> response = null;
		response = service.findAllRcsBotTypes(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRcsBotTypes
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRcsBotTypeByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRcsBotTypeByPrimaryKey 
		Integer id = 0;
		RcsBotType response = null;
		response = service.findRcsBotTypeByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findRcsBotTypeByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Load an existing RcsBotType entity
	* 
	 */
	@Test
	public void loadRcsBotTypes() {
		Set<RcsBotType> response = null;
		response = service.loadRcsBotTypes();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRcsBotTypes
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotType entity
	* 
	 */
	@Test
	public void deleteRcsBotType() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotType 
		RcsBotType rcsbottype_1 = new com.kirusa.domain.RcsBotType();
		service.deleteRcsBotType(rcsbottype_1);
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
