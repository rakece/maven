
package com.kirusa.service;

import com.kirusa.domain.RcsBotPublisher;

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
public class RcsBotPublisherServiceTest {

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
	protected RcsBotPublisherService service;

	/**
	 * Instantiates a new RcsBotPublisherServiceTest.
	 *
	 */
	public RcsBotPublisherServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Return all RcsBotPublisher entity
	* 
	 */
	@Test
	public void findAllRcsBotPublishers() {
		// TODO: JUnit - Populate test inputs for operation: findAllRcsBotPublishers 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<RcsBotPublisher> response = null;
		response = service.findAllRcsBotPublishers(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRcsBotPublishers
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRcsBotPublisherByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRcsBotPublisherByPrimaryKey 
		Integer id = 0;
		RcsBotPublisher response = null;
		response = service.findRcsBotPublisherByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findRcsBotPublisherByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Load an existing RcsBotPublisher entity
	* 
	 */
	@Test
	public void loadRcsBotPublishers() {
		Set<RcsBotPublisher> response = null;
		response = service.loadRcsBotPublishers();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRcsBotPublishers
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotPublisher entity
	* 
	 */
	@Test
	public void saveRcsBotPublisher() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotPublisher 
		RcsBotPublisher rcsbotpublisher = new com.kirusa.domain.RcsBotPublisher();
		service.saveRcsBotPublisher(rcsbotpublisher);
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotPublisher entity
	* 
	 */
	@Test
	public void deleteRcsBotPublisher() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotPublisher 
		RcsBotPublisher rcsbotpublisher_1 = new com.kirusa.domain.RcsBotPublisher();
		service.deleteRcsBotPublisher(rcsbotpublisher_1);
	}

	/**
	 * Operation Unit Test
	* Return a count of all RcsBotPublisher entity
	* 
	 */
	@Test
	public void countRcsBotPublishers() {
		Integer response = null;
		response = service.countRcsBotPublishers();
		// TODO: JUnit - Add assertions to test outputs of operation: countRcsBotPublishers
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
