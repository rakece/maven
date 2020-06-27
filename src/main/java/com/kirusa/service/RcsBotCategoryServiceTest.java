
package com.kirusa.service;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotCategory;
import com.kirusa.domain.RcsBotCategoryDesc;
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
public class RcsBotCategoryServiceTest {

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
	protected RcsBotCategoryService service;

	/**
	 * Instantiates a new RcsBotCategoryServiceTest.
	 *
	 */
	public RcsBotCategoryServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBot entity
	* 
	 */
	@Test
	public void saveRcsBotCategoryRcsBots() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotCategoryRcsBots 
		Integer id = 0;
		RcsBot related_rcsbots = new com.kirusa.domain.RcsBot();
		RcsBotCategory response = null;
		response = service.saveRcsBotCategoryRcsBots(id, related_rcsbots);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotCategoryRcsBots
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotTags entity
	* 
	 */
	@Test
	public void deleteRcsBotCategoryRcsBotTagses() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotCategoryRcsBotTagses 
		Integer rcsbotcategory_id = 0;
		Integer related_rcsbottagses_id = 0;
		RcsBotCategory response = null;
		response = service.deleteRcsBotCategoryRcsBotTagses(rcsbotcategory_id, related_rcsbottagses_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotCategoryRcsBotTagses
	}

	/**
	 * Operation Unit Test
	* Load an existing RcsBotCategory entity
	* 
	 */
	@Test
	public void loadRcsBotCategorys() {
		Set<RcsBotCategory> response = null;
		response = service.loadRcsBotCategorys();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRcsBotCategorys
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotCategoryDesc entity
	* 
	 */
	@Test
	public void saveRcsBotCategoryRcsBotCategoryDescs() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotCategoryRcsBotCategoryDescs 
		Integer id_1 = 0;
		RcsBotCategoryDesc related_rcsbotcategorydescs = new com.kirusa.domain.RcsBotCategoryDesc();
		RcsBotCategory response = null;
		response = service.saveRcsBotCategoryRcsBotCategoryDescs(id_1, related_rcsbotcategorydescs);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotCategoryRcsBotCategoryDescs
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotCategory entity
	* 
	 */
	@Test
	public void saveRcsBotCategory() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotCategory 
		RcsBotCategory rcsbotcategory = new com.kirusa.domain.RcsBotCategory();
		service.saveRcsBotCategory(rcsbotcategory);
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotCategory entity
	* 
	 */
	@Test
	public void deleteRcsBotCategory() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotCategory 
		RcsBotCategory rcsbotcategory_1 = new com.kirusa.domain.RcsBotCategory();
		service.deleteRcsBotCategory(rcsbotcategory_1);
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBot entity
	* 
	 */
	@Test
	public void deleteRcsBotCategoryRcsBots() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotCategoryRcsBots 
		Integer rcsbotcategory_id_1 = 0;
		Integer related_rcsbots_id = 0;
		RcsBotCategory response = null;
		response = service.deleteRcsBotCategoryRcsBots(rcsbotcategory_id_1, related_rcsbots_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotCategoryRcsBots
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotTags entity
	* 
	 */
	@Test
	public void saveRcsBotCategoryRcsBotTagses() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotCategoryRcsBotTagses 
		Integer id_2 = 0;
		RcsBotTags related_rcsbottagses = new com.kirusa.domain.RcsBotTags();
		RcsBotCategory response = null;
		response = service.saveRcsBotCategoryRcsBotTagses(id_2, related_rcsbottagses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotCategoryRcsBotTagses
	}

	/**
	 * Operation Unit Test
	* Return a count of all RcsBotCategory entity
	* 
	 */
	@Test
	public void countRcsBotCategorys() {
		Integer response = null;
		response = service.countRcsBotCategorys();
		// TODO: JUnit - Add assertions to test outputs of operation: countRcsBotCategorys
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotCategoryDesc entity
	* 
	 */
	@Test
	public void deleteRcsBotCategoryRcsBotCategoryDescs() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotCategoryRcsBotCategoryDescs 
		Integer rcsbotcategory_id_2 = 0;
		Integer related_rcsbotcategorydescs_id = 0;
		RcsBotCategory response = null;
		response = service.deleteRcsBotCategoryRcsBotCategoryDescs(rcsbotcategory_id_2, related_rcsbotcategorydescs_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotCategoryRcsBotCategoryDescs
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRcsBotCategoryByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRcsBotCategoryByPrimaryKey 
		Integer id_3 = 0;
		RcsBotCategory response = null;
		response = service.findRcsBotCategoryByPrimaryKey(id_3);
		// TODO: JUnit - Add assertions to test outputs of operation: findRcsBotCategoryByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Return all RcsBotCategory entity
	* 
	 */
	@Test
	public void findAllRcsBotCategorys() {
		// TODO: JUnit - Populate test inputs for operation: findAllRcsBotCategorys 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<RcsBotCategory> response = null;
		response = service.findAllRcsBotCategorys(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRcsBotCategorys
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
