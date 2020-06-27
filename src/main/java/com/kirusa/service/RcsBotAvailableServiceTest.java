
package com.kirusa.service;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotAvailable;
import com.kirusa.domain.RcsCountryList;

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
public class RcsBotAvailableServiceTest {

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
	protected RcsBotAvailableService service;

	/**
	 * Instantiates a new RcsBotAvailableServiceTest.
	 *
	 */
	public RcsBotAvailableServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsCountryList entity
	* 
	 */
	@Test
	public void deleteRcsBotAvailableRcsCountryList() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotAvailableRcsCountryList 
		Integer rcsbotavailable_id = 0;
		Integer related_rcscountrylist_id = 0;
		RcsBotAvailable response = null;
		response = service.deleteRcsBotAvailableRcsCountryList(rcsbotavailable_id, related_rcscountrylist_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotAvailableRcsCountryList
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsCountryList entity
	* 
	 */
	@Test
	public void saveRcsBotAvailableRcsCountryList() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotAvailableRcsCountryList 
		Integer id = 0;
		RcsCountryList related_rcscountrylist = new com.kirusa.domain.RcsCountryList();
		RcsBotAvailable response = null;
		response = service.saveRcsBotAvailableRcsCountryList(id, related_rcscountrylist);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotAvailableRcsCountryList
	}

	/**
	 * Operation Unit Test
	* Return all RcsBotAvailable entity
	* 
	 */
	@Test
	public void findAllRcsBotAvailables() {
		// TODO: JUnit - Populate test inputs for operation: findAllRcsBotAvailables 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<RcsBotAvailable> response = null;
		response = service.findAllRcsBotAvailables(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRcsBotAvailables
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotAvailable entity
	* 
	 */
	@Test
	public void saveRcsBotAvailable() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotAvailable 
		RcsBotAvailable rcsbotavailable = new com.kirusa.domain.RcsBotAvailable();
		service.saveRcsBotAvailable(rcsbotavailable);
	}

	/**
	 * Operation Unit Test
	* Return a count of all RcsBotAvailable entity
	* 
	 */
	@Test
	public void countRcsBotAvailables() {
		Integer response = null;
		response = service.countRcsBotAvailables();
		// TODO: JUnit - Add assertions to test outputs of operation: countRcsBotAvailables
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRcsBotAvailableByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRcsBotAvailableByPrimaryKey 
		Integer id_1 = 0;
		RcsBotAvailable response = null;
		response = service.findRcsBotAvailableByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findRcsBotAvailableByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Load an existing RcsBotAvailable entity
	* 
	 */
	@Test
	public void loadRcsBotAvailables() {
		Set<RcsBotAvailable> response = null;
		response = service.loadRcsBotAvailables();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRcsBotAvailables
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBot entity
	* 
	 */
	@Test
	public void deleteRcsBotAvailableRcsBot() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotAvailableRcsBot 
		Integer rcsbotavailable_id_1 = 0;
		Integer related_rcsbot_id = 0;
		RcsBotAvailable response = null;
		response = service.deleteRcsBotAvailableRcsBot(rcsbotavailable_id_1, related_rcsbot_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotAvailableRcsBot
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBot entity
	* 
	 */
	@Test
	public void saveRcsBotAvailableRcsBot() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotAvailableRcsBot 
		Integer id_2 = 0;
		RcsBot related_rcsbot = new com.kirusa.domain.RcsBot();
		RcsBotAvailable response = null;
		response = service.saveRcsBotAvailableRcsBot(id_2, related_rcsbot);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotAvailableRcsBot
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotAvailable entity
	* 
	 */
	@Test
	public void deleteRcsBotAvailable() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotAvailable 
		RcsBotAvailable rcsbotavailable_1 = new com.kirusa.domain.RcsBotAvailable();
		service.deleteRcsBotAvailable(rcsbotavailable_1);
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
