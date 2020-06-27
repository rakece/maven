
package com.kirusa.service;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotComment;

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
public class RcsBotCommentServiceTest {

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
	protected RcsBotCommentService service;

	/**
	 * Instantiates a new RcsBotCommentServiceTest.
	 *
	 */
	public RcsBotCommentServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotComment entity
	* 
	 */
	@Test
	public void deleteRcsBotComment() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotComment 
		RcsBotComment rcsbotcomment = new com.kirusa.domain.RcsBotComment();
		service.deleteRcsBotComment(rcsbotcomment);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRcsBotCommentByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRcsBotCommentByPrimaryKey 
		Integer id = 0;
		RcsBotComment response = null;
		response = service.findRcsBotCommentByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findRcsBotCommentByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Load an existing RcsBotComment entity
	* 
	 */
	@Test
	public void loadRcsBotComments() {
		Set<RcsBotComment> response = null;
		response = service.loadRcsBotComments();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRcsBotComments
	}

	/**
	 * Operation Unit Test
	* Return a count of all RcsBotComment entity
	* 
	 */
	@Test
	public void countRcsBotComments() {
		Integer response = null;
		response = service.countRcsBotComments();
		// TODO: JUnit - Add assertions to test outputs of operation: countRcsBotComments
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBot entity
	* 
	 */
	@Test
	public void saveRcsBotCommentRcsBot() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotCommentRcsBot 
		Integer id_1 = 0;
		RcsBot related_rcsbot = new com.kirusa.domain.RcsBot();
		RcsBotComment response = null;
		response = service.saveRcsBotCommentRcsBot(id_1, related_rcsbot);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotCommentRcsBot
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotComment entity
	* 
	 */
	@Test
	public void saveRcsBotComment() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotComment 
		RcsBotComment rcsbotcomment_1 = new com.kirusa.domain.RcsBotComment();
		service.saveRcsBotComment(rcsbotcomment_1);
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBot entity
	* 
	 */
	@Test
	public void deleteRcsBotCommentRcsBot() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotCommentRcsBot 
		Integer rcsbotcomment_id = 0;
		Integer related_rcsbot_id = 0;
		RcsBotComment response = null;
		response = service.deleteRcsBotCommentRcsBot(rcsbotcomment_id, related_rcsbot_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotCommentRcsBot
	}

	/**
	 * Operation Unit Test
	* Return all RcsBotComment entity
	* 
	 */
	@Test
	public void findAllRcsBotComments() {
		// TODO: JUnit - Populate test inputs for operation: findAllRcsBotComments 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<RcsBotComment> response = null;
		response = service.findAllRcsBotComments(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRcsBotComments
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
