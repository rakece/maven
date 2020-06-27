
package com.kirusa.service;

import com.kirusa.domain.RcsBotUser;
import com.kirusa.domain.RcsBotUserrole;

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
public class RcsBotUserroleServiceTest {

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
	protected RcsBotUserroleService service;

	/**
	 * Instantiates a new RcsBotUserroleServiceTest.
	 *
	 */
	public RcsBotUserroleServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotUser entity
	* 
	 */
	@Test
	public void deleteRcsBotUserroleRcsBotUser() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotUserroleRcsBotUser 
		Integer rcsbotuserrole_id = 0;
		Integer related_rcsbotuser_id = 0;
		RcsBotUserrole response = null;
		response = service.deleteRcsBotUserroleRcsBotUser(rcsbotuserrole_id, related_rcsbotuser_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotUserroleRcsBotUser
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotUser entity
	* 
	 */
	@Test
	public void saveRcsBotUserroleRcsBotUser() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotUserroleRcsBotUser 
		Integer id = 0;
		RcsBotUser related_rcsbotuser = new com.kirusa.domain.RcsBotUser();
		RcsBotUserrole response = null;
		response = service.saveRcsBotUserroleRcsBotUser(id, related_rcsbotuser);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotUserroleRcsBotUser
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotUserrole entity
	* 
	 */
	@Test
	public void saveRcsBotUserrole() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotUserrole 
		RcsBotUserrole rcsbotuserrole = new com.kirusa.domain.RcsBotUserrole();
		service.saveRcsBotUserrole(rcsbotuserrole);
	}

	/**
	 * Operation Unit Test
	* Load an existing RcsBotUserrole entity
	* 
	 */
	@Test
	public void loadRcsBotUserroles() {
		Set<RcsBotUserrole> response = null;
		response = service.loadRcsBotUserroles();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRcsBotUserroles
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRcsBotUserroleByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRcsBotUserroleByPrimaryKey 
		Integer id_1 = 0;
		RcsBotUserrole response = null;
		response = service.findRcsBotUserroleByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findRcsBotUserroleByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Return a count of all RcsBotUserrole entity
	* 
	 */
	@Test
	public void countRcsBotUserroles() {
		Integer response = null;
		response = service.countRcsBotUserroles();
		// TODO: JUnit - Add assertions to test outputs of operation: countRcsBotUserroles
	}

	/**
	 * Operation Unit Test
	* Return all RcsBotUserrole entity
	* 
	 */
	@Test
	public void findAllRcsBotUserroles() {
		// TODO: JUnit - Populate test inputs for operation: findAllRcsBotUserroles 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<RcsBotUserrole> response = null;
		response = service.findAllRcsBotUserroles(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRcsBotUserroles
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotUserrole entity
	* 
	 */
	@Test
	public void deleteRcsBotUserrole() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotUserrole 
		RcsBotUserrole rcsbotuserrole_1 = new com.kirusa.domain.RcsBotUserrole();
		service.deleteRcsBotUserrole(rcsbotuserrole_1);
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
