
package com.kirusa.service;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotDesc;

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
public class RcsBotDescServiceTest {

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
	protected RcsBotDescService service;

	/**
	 * Instantiates a new RcsBotDescServiceTest.
	 *
	 */
	public RcsBotDescServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotDesc entity
	* 
	 */
	@Test
	public void saveRcsBotDesc() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotDesc 
		RcsBotDesc rcsbotdesc = new com.kirusa.domain.RcsBotDesc();
		service.saveRcsBotDesc(rcsbotdesc);
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBot entity
	* 
	 */
	@Test
	public void saveRcsBotDescRcsBot() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotDescRcsBot 
		Integer id = 0;
		RcsBot related_rcsbot = new com.kirusa.domain.RcsBot();
		RcsBotDesc response = null;
		response = service.saveRcsBotDescRcsBot(id, related_rcsbot);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotDescRcsBot
	}

	/**
	 * Operation Unit Test
	* Return all RcsBotDesc entity
	* 
	 */
	@Test
	public void findAllRcsBotDescs() {
		// TODO: JUnit - Populate test inputs for operation: findAllRcsBotDescs 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<RcsBotDesc> response = null;
		response = service.findAllRcsBotDescs(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRcsBotDescs
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotDesc entity
	* 
	 */
	@Test
	public void deleteRcsBotDesc() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotDesc 
		RcsBotDesc rcsbotdesc_1 = new com.kirusa.domain.RcsBotDesc();
		service.deleteRcsBotDesc(rcsbotdesc_1);
	}

	/**
	 * Operation Unit Test
	* Load an existing RcsBotDesc entity
	* 
	 */
	@Test
	public void loadRcsBotDescs() {
		Set<RcsBotDesc> response = null;
		response = service.loadRcsBotDescs();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRcsBotDescs
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRcsBotDescByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRcsBotDescByPrimaryKey 
		Integer id_1 = 0;
		RcsBotDesc response = null;
		response = service.findRcsBotDescByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findRcsBotDescByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBot entity
	* 
	 */
	@Test
	public void deleteRcsBotDescRcsBot() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotDescRcsBot 
		Integer rcsbotdesc_id = 0;
		Integer related_rcsbot_id = 0;
		RcsBotDesc response = null;
		response = service.deleteRcsBotDescRcsBot(rcsbotdesc_id, related_rcsbot_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotDescRcsBot
	}

	/**
	 * Operation Unit Test
	* Return a count of all RcsBotDesc entity
	* 
	 */
	@Test
	public void countRcsBotDescs() {
		Integer response = null;
		response = service.countRcsBotDescs();
		// TODO: JUnit - Add assertions to test outputs of operation: countRcsBotDescs
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
