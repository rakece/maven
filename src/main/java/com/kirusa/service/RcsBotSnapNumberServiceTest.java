
package com.kirusa.service;

import com.kirusa.domain.RcsBotSnapNumber;

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
public class RcsBotSnapNumberServiceTest {

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
	protected RcsBotSnapNumberService service;

	/**
	 * Instantiates a new RcsBotSnapNumberServiceTest.
	 *
	 */
	public RcsBotSnapNumberServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Load an existing RcsBotSnapNumber entity
	* 
	 */
	@Test
	public void loadRcsBotSnapNumbers() {
		Set<RcsBotSnapNumber> response = null;
		response = service.loadRcsBotSnapNumbers();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRcsBotSnapNumbers
	}

	/**
	 * Operation Unit Test
	* Return all RcsBotSnapNumber entity
	* 
	 */
	@Test
	public void findAllRcsBotSnapNumbers() {
		// TODO: JUnit - Populate test inputs for operation: findAllRcsBotSnapNumbers 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<RcsBotSnapNumber> response = null;
		response = service.findAllRcsBotSnapNumbers(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRcsBotSnapNumbers
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotSnapNumber entity
	* 
	 */
	@Test
	public void saveRcsBotSnapNumber() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotSnapNumber 
		RcsBotSnapNumber rcsbotsnapnumber = new com.kirusa.domain.RcsBotSnapNumber();
		service.saveRcsBotSnapNumber(rcsbotsnapnumber);
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotSnapNumber entity
	* 
	 */
	@Test
	public void deleteRcsBotSnapNumber() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotSnapNumber 
		RcsBotSnapNumber rcsbotsnapnumber_1 = new com.kirusa.domain.RcsBotSnapNumber();
		service.deleteRcsBotSnapNumber(rcsbotsnapnumber_1);
	}

	/**
	 * Operation Unit Test
	* Return a count of all RcsBotSnapNumber entity
	* 
	 */
	@Test
	public void countRcsBotSnapNumbers() {
		Integer response = null;
		response = service.countRcsBotSnapNumbers();
		// TODO: JUnit - Add assertions to test outputs of operation: countRcsBotSnapNumbers
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRcsBotSnapNumberByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRcsBotSnapNumberByPrimaryKey 
		Integer id = 0;
		RcsBotSnapNumber response = null;
		response = service.findRcsBotSnapNumberByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findRcsBotSnapNumberByPrimaryKey
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
