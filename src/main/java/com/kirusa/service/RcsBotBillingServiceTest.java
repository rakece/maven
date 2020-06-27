
package com.kirusa.service;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotBilling;
import com.kirusa.domain.RcsBotUser;

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
public class RcsBotBillingServiceTest {

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
	protected RcsBotBillingService service;

	/**
	 * Instantiates a new RcsBotBillingServiceTest.
	 *
	 */
	public RcsBotBillingServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotUser entity
	* 
	 */
	@Test
	public void deleteRcsBotBillingRcsBotUser() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotBillingRcsBotUser 
		Integer rcsbotbilling_id = 0;
		Integer related_rcsbotuser_id = 0;
		RcsBotBilling response = null;
		response = service.deleteRcsBotBillingRcsBotUser(rcsbotbilling_id, related_rcsbotuser_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotBillingRcsBotUser
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBot entity
	* 
	 */
	@Test
	public void deleteRcsBotBillingRcsBot() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotBillingRcsBot 
		Integer rcsbotbilling_id_1 = 0;
		Integer related_rcsbot_id = 0;
		RcsBotBilling response = null;
		response = service.deleteRcsBotBillingRcsBot(rcsbotbilling_id_1, related_rcsbot_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotBillingRcsBot
	}

	/**
	 * Operation Unit Test
	* Return a count of all RcsBotBilling entity
	* 
	 */
	@Test
	public void countRcsBotBillings() {
		Integer response = null;
		response = service.countRcsBotBillings();
		// TODO: JUnit - Add assertions to test outputs of operation: countRcsBotBillings
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotBilling entity
	* 
	 */
	@Test
	public void deleteRcsBotBilling() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotBilling 
		RcsBotBilling rcsbotbilling = new com.kirusa.domain.RcsBotBilling();
		service.deleteRcsBotBilling(rcsbotbilling);
	}

	/**
	 * Operation Unit Test
	* Return all RcsBotBilling entity
	* 
	 */
	@Test
	public void findAllRcsBotBillings() {
		// TODO: JUnit - Populate test inputs for operation: findAllRcsBotBillings 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<RcsBotBilling> response = null;
		response = service.findAllRcsBotBillings(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRcsBotBillings
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBot entity
	* 
	 */
	@Test
	public void saveRcsBotBillingRcsBot() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotBillingRcsBot 
		Integer id = 0;
		RcsBot related_rcsbot = new com.kirusa.domain.RcsBot();
		RcsBotBilling response = null;
		response = service.saveRcsBotBillingRcsBot(id, related_rcsbot);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotBillingRcsBot
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotUser entity
	* 
	 */
	@Test
	public void saveRcsBotBillingRcsBotUser() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotBillingRcsBotUser 
		Integer id_1 = 0;
		RcsBotUser related_rcsbotuser = new com.kirusa.domain.RcsBotUser();
		RcsBotBilling response = null;
		response = service.saveRcsBotBillingRcsBotUser(id_1, related_rcsbotuser);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotBillingRcsBotUser
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotBilling entity
	* 
	 */
	@Test
	public void saveRcsBotBilling() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotBilling 
		RcsBotBilling rcsbotbilling_1 = new com.kirusa.domain.RcsBotBilling();
		service.saveRcsBotBilling(rcsbotbilling_1);
	}

	/**
	 * Operation Unit Test
	* Load an existing RcsBotBilling entity
	* 
	 */
	@Test
	public void loadRcsBotBillings() {
		Set<RcsBotBilling> response = null;
		response = service.loadRcsBotBillings();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRcsBotBillings
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRcsBotBillingByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRcsBotBillingByPrimaryKey 
		Integer id_2 = 0;
		RcsBotBilling response = null;
		response = service.findRcsBotBillingByPrimaryKey(id_2);
		// TODO: JUnit - Add assertions to test outputs of operation: findRcsBotBillingByPrimaryKey
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
