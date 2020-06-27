
package com.kirusa.service;

import com.kirusa.domain.RcsBotAvailable;
import com.kirusa.domain.RcsBotUser;
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
public class RcsCountryListServiceTest {

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
	protected RcsCountryListService service;

	/**
	 * Instantiates a new RcsCountryListServiceTest.
	 *
	 */
	public RcsCountryListServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Load an existing RcsCountryList entity
	* 
	 */
	@Test
	public void loadRcsCountryLists() {
		Set<RcsCountryList> response = null;
		response = service.loadRcsCountryLists();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRcsCountryLists
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsCountryList entity
	* 
	 */
	@Test
	public void saveRcsCountryList() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsCountryList 
		RcsCountryList rcscountrylist = new com.kirusa.domain.RcsCountryList();
		service.saveRcsCountryList(rcscountrylist);
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotAvailable entity
	* 
	 */
	@Test
	public void deleteRcsCountryListRcsBotAvailables() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsCountryListRcsBotAvailables 
		Integer rcscountrylist_id = 0;
		Integer related_rcsbotavailables_id = 0;
		RcsCountryList response = null;
		response = service.deleteRcsCountryListRcsBotAvailables(rcscountrylist_id, related_rcsbotavailables_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsCountryListRcsBotAvailables
	}

	/**
	 * Operation Unit Test
	* Return a count of all RcsCountryList entity
	* 
	 */
	@Test
	public void countRcsCountryLists() {
		Integer response = null;
		response = service.countRcsCountryLists();
		// TODO: JUnit - Add assertions to test outputs of operation: countRcsCountryLists
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotUser entity
	* 
	 */
	@Test
	public void saveRcsCountryListRcsBotUsers() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsCountryListRcsBotUsers 
		Integer id = 0;
		RcsBotUser related_rcsbotusers = new com.kirusa.domain.RcsBotUser();
		RcsCountryList response = null;
		response = service.saveRcsCountryListRcsBotUsers(id, related_rcsbotusers);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsCountryListRcsBotUsers
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsCountryList entity
	* 
	 */
	@Test
	public void deleteRcsCountryList() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsCountryList 
		RcsCountryList rcscountrylist_1 = new com.kirusa.domain.RcsCountryList();
		service.deleteRcsCountryList(rcscountrylist_1);
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotUser entity
	* 
	 */
	@Test
	public void deleteRcsCountryListRcsBotUsers() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsCountryListRcsBotUsers 
		Integer rcscountrylist_id_1 = 0;
		Integer related_rcsbotusers_id = 0;
		RcsCountryList response = null;
		response = service.deleteRcsCountryListRcsBotUsers(rcscountrylist_id_1, related_rcsbotusers_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsCountryListRcsBotUsers
	}

	/**
	 * Operation Unit Test
	* Return all RcsCountryList entity
	* 
	 */
	@Test
	public void findAllRcsCountryLists() {
		// TODO: JUnit - Populate test inputs for operation: findAllRcsCountryLists 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<RcsCountryList> response = null;
		response = service.findAllRcsCountryLists(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRcsCountryLists
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRcsCountryListByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRcsCountryListByPrimaryKey 
		Integer id_1 = 0;
		RcsCountryList response = null;
		response = service.findRcsCountryListByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findRcsCountryListByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotAvailable entity
	* 
	 */
	@Test
	public void saveRcsCountryListRcsBotAvailables() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsCountryListRcsBotAvailables 
		Integer id_2 = 0;
		RcsBotAvailable related_rcsbotavailables = new com.kirusa.domain.RcsBotAvailable();
		RcsCountryList response = null;
		response = service.saveRcsCountryListRcsBotAvailables(id_2, related_rcsbotavailables);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsCountryListRcsBotAvailables
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
