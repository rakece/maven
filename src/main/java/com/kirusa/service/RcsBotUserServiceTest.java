
package com.kirusa.service;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotBilling;
import com.kirusa.domain.RcsBotUser;
import com.kirusa.domain.RcsBotUserrole;
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
public class RcsBotUserServiceTest {

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
	protected RcsBotUserService service;

	/**
	 * Instantiates a new RcsBotUserServiceTest.
	 *
	 */
	public RcsBotUserServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsCountryList entity
	* 
	 */
	@Test
	public void deleteRcsBotUserRcsCountryList() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotUserRcsCountryList 
		Integer rcsbotuser_id = 0;
		Integer related_rcscountrylist_id = 0;
		RcsBotUser response = null;
		response = service.deleteRcsBotUserRcsCountryList(rcsbotuser_id, related_rcscountrylist_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotUserRcsCountryList
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotUserrole entity
	* 
	 */
	@Test
	public void saveRcsBotUserRcsBotUserroles() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotUserRcsBotUserroles 
		Integer id = 0;
		RcsBotUserrole related_rcsbotuserroles = new com.kirusa.domain.RcsBotUserrole();
		RcsBotUser response = null;
		response = service.saveRcsBotUserRcsBotUserroles(id, related_rcsbotuserroles);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotUserRcsBotUserroles
	}

	/**
	 * Operation Unit Test
	* Load an existing RcsBotUser entity
	* 
	 */
	@Test
	public void loadRcsBotUsers() {
		Set<RcsBotUser> response = null;
		response = service.loadRcsBotUsers();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRcsBotUsers
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRcsBotUserByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRcsBotUserByPrimaryKey 
		Integer id_1 = 0;
		RcsBotUser response = null;
		response = service.findRcsBotUserByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findRcsBotUserByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotBilling entity
	* 
	 */
	@Test
	public void deleteRcsBotUserRcsBotBillings() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotUserRcsBotBillings 
		Integer rcsbotuser_id_1 = 0;
		Integer related_rcsbotbillings_id = 0;
		RcsBotUser response = null;
		response = service.deleteRcsBotUserRcsBotBillings(rcsbotuser_id_1, related_rcsbotbillings_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotUserRcsBotBillings
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBot entity
	* 
	 */
	@Test
	public void deleteRcsBotUserRcsBots() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotUserRcsBots 
		Integer rcsbotuser_id_2 = 0;
		Integer related_rcsbots_id = 0;
		RcsBotUser response = null;
		response = service.deleteRcsBotUserRcsBots(rcsbotuser_id_2, related_rcsbots_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotUserRcsBots
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotUser entity
	* 
	 */
	@Test
	public void deleteRcsBotUser() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotUser 
		RcsBotUser rcsbotuser = new com.kirusa.domain.RcsBotUser();
		service.deleteRcsBotUser(rcsbotuser);
	}

	/**
	 * Operation Unit Test
	* Return a count of all RcsBotUser entity
	* 
	 */
	@Test
	public void countRcsBotUsers() {
		Integer response = null;
		response = service.countRcsBotUsers();
		// TODO: JUnit - Add assertions to test outputs of operation: countRcsBotUsers
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBot entity
	* 
	 */
	@Test
	public void saveRcsBotUserRcsBots() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotUserRcsBots 
		Integer id_2 = 0;
		RcsBot related_rcsbots = new com.kirusa.domain.RcsBot();
		RcsBotUser response = null;
		response = service.saveRcsBotUserRcsBots(id_2, related_rcsbots);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotUserRcsBots
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotUser entity
	* 
	 */
	@Test
	public void saveRcsBotUser() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotUser 
		RcsBotUser rcsbotuser_1 = new com.kirusa.domain.RcsBotUser();
		service.saveRcsBotUser(rcsbotuser_1);
	}

	/**
	 * Operation Unit Test
	* Return all RcsBotUser entity
	* 
	 */
	@Test
	public void findAllRcsBotUsers() {
		// TODO: JUnit - Populate test inputs for operation: findAllRcsBotUsers 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<RcsBotUser> response = null;
		response = service.findAllRcsBotUsers(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRcsBotUsers
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsCountryList entity
	* 
	 */
	@Test
	public void saveRcsBotUserRcsCountryList() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotUserRcsCountryList 
		Integer id_3 = 0;
		RcsCountryList related_rcscountrylist = new com.kirusa.domain.RcsCountryList();
		RcsBotUser response = null;
		response = service.saveRcsBotUserRcsCountryList(id_3, related_rcscountrylist);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotUserRcsCountryList
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotUserrole entity
	* 
	 */
	@Test
	public void deleteRcsBotUserRcsBotUserroles() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotUserRcsBotUserroles 
		Integer rcsbotuser_id_3 = 0;
		Integer related_rcsbotuserroles_id = 0;
		RcsBotUser response = null;
		response = service.deleteRcsBotUserRcsBotUserroles(rcsbotuser_id_3, related_rcsbotuserroles_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotUserRcsBotUserroles
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotBilling entity
	* 
	 */
	@Test
	public void saveRcsBotUserRcsBotBillings() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotUserRcsBotBillings 
		Integer id_4 = 0;
		RcsBotBilling related_rcsbotbillings = new com.kirusa.domain.RcsBotBilling();
		RcsBotUser response = null;
		response = service.saveRcsBotUserRcsBotBillings(id_4, related_rcsbotbillings);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotUserRcsBotBillings
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
