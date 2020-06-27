
package com.kirusa.service;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotCategory;
import com.kirusa.domain.RcsBotTags;

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
public class RcsBotTagsServiceTest {

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
	protected RcsBotTagsService service;

	/**
	 * Instantiates a new RcsBotTagsServiceTest.
	 *
	 */
	public RcsBotTagsServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotTags entity
	* 
	 */
	@Test
	public void saveRcsBotTags() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotTags 
		RcsBotTags rcsbottags = new com.kirusa.domain.RcsBotTags();
		service.saveRcsBotTags(rcsbottags);
	}

	/**
	 * Operation Unit Test
	* Load an existing RcsBotTags entity
	* 
	 */
	@Test
	public void loadRcsBotTagss() {
		Set<RcsBotTags> response = null;
		response = service.loadRcsBotTagss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRcsBotTagss
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBot entity
	* 
	 */
	@Test
	public void deleteRcsBotTagsRcsBot() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotTagsRcsBot 
		Integer rcsbottags_id = 0;
		Integer related_rcsbot_id = 0;
		RcsBotTags response = null;
		response = service.deleteRcsBotTagsRcsBot(rcsbottags_id, related_rcsbot_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotTagsRcsBot
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotCategory entity
	* 
	 */
	@Test
	public void saveRcsBotTagsRcsBotCategory() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotTagsRcsBotCategory 
		Integer id = 0;
		RcsBotCategory related_rcsbotcategory = new com.kirusa.domain.RcsBotCategory();
		RcsBotTags response = null;
		response = service.saveRcsBotTagsRcsBotCategory(id, related_rcsbotcategory);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotTagsRcsBotCategory
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRcsBotTagsByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRcsBotTagsByPrimaryKey 
		Integer id_1 = 0;
		RcsBotTags response = null;
		response = service.findRcsBotTagsByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findRcsBotTagsByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Return a count of all RcsBotTags entity
	* 
	 */
	@Test
	public void countRcsBotTagss() {
		Integer response = null;
		response = service.countRcsBotTagss();
		// TODO: JUnit - Add assertions to test outputs of operation: countRcsBotTagss
	}

	/**
	 * Operation Unit Test
	* Return all RcsBotTags entity
	* 
	 */
	@Test
	public void findAllRcsBotTagss() {
		// TODO: JUnit - Populate test inputs for operation: findAllRcsBotTagss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<RcsBotTags> response = null;
		response = service.findAllRcsBotTagss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRcsBotTagss
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBot entity
	* 
	 */
	@Test
	public void saveRcsBotTagsRcsBot() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotTagsRcsBot 
		Integer id_2 = 0;
		RcsBot related_rcsbot = new com.kirusa.domain.RcsBot();
		RcsBotTags response = null;
		response = service.saveRcsBotTagsRcsBot(id_2, related_rcsbot);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotTagsRcsBot
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotCategory entity
	* 
	 */
	@Test
	public void deleteRcsBotTagsRcsBotCategory() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotTagsRcsBotCategory 
		Integer rcsbottags_id_1 = 0;
		Integer related_rcsbotcategory_id = 0;
		RcsBotTags response = null;
		response = service.deleteRcsBotTagsRcsBotCategory(rcsbottags_id_1, related_rcsbotcategory_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotTagsRcsBotCategory
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotTags entity
	* 
	 */
	@Test
	public void deleteRcsBotTags() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotTags 
		RcsBotTags rcsbottags_1 = new com.kirusa.domain.RcsBotTags();
		service.deleteRcsBotTags(rcsbottags_1);
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
