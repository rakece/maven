
package com.kirusa.service;

import com.kirusa.domain.RcsBotCategory;
import com.kirusa.domain.RcsBotCategoryDesc;

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
public class RcsBotCategoryDescServiceTest {

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
	protected RcsBotCategoryDescService service;

	/**
	 * Instantiates a new RcsBotCategoryDescServiceTest.
	 *
	 */
	public RcsBotCategoryDescServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotCategoryDesc entity
	* 
	 */
	@Test
	public void saveRcsBotCategoryDesc() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotCategoryDesc 
		RcsBotCategoryDesc rcsbotcategorydesc = new com.kirusa.domain.RcsBotCategoryDesc();
		service.saveRcsBotCategoryDesc(rcsbotcategorydesc);
	}

	/**
	 * Operation Unit Test
	* Return a count of all RcsBotCategoryDesc entity
	* 
	 */
	@Test
	public void countRcsBotCategoryDescs() {
		Integer response = null;
		response = service.countRcsBotCategoryDescs();
		// TODO: JUnit - Add assertions to test outputs of operation: countRcsBotCategoryDescs
	}

	/**
	 * Operation Unit Test
	* Return all RcsBotCategoryDesc entity
	* 
	 */
	@Test
	public void findAllRcsBotCategoryDescs() {
		// TODO: JUnit - Populate test inputs for operation: findAllRcsBotCategoryDescs 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<RcsBotCategoryDesc> response = null;
		response = service.findAllRcsBotCategoryDescs(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRcsBotCategoryDescs
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotCategory entity
	* 
	 */
	@Test
	public void saveRcsBotCategoryDescRcsBotCategory() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotCategoryDescRcsBotCategory 
		Integer id = 0;
		RcsBotCategory related_rcsbotcategory = new com.kirusa.domain.RcsBotCategory();
		RcsBotCategoryDesc response = null;
		response = service.saveRcsBotCategoryDescRcsBotCategory(id, related_rcsbotcategory);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotCategoryDescRcsBotCategory
	}

	/**
	 * Operation Unit Test
	* Load an existing RcsBotCategoryDesc entity
	* 
	 */
	@Test
	public void loadRcsBotCategoryDescs() {
		Set<RcsBotCategoryDesc> response = null;
		response = service.loadRcsBotCategoryDescs();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRcsBotCategoryDescs
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRcsBotCategoryDescByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRcsBotCategoryDescByPrimaryKey 
		Integer id_1 = 0;
		RcsBotCategoryDesc response = null;
		response = service.findRcsBotCategoryDescByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findRcsBotCategoryDescByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotCategoryDesc entity
	* 
	 */
	@Test
	public void deleteRcsBotCategoryDesc() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotCategoryDesc 
		RcsBotCategoryDesc rcsbotcategorydesc_1 = new com.kirusa.domain.RcsBotCategoryDesc();
		service.deleteRcsBotCategoryDesc(rcsbotcategorydesc_1);
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotCategory entity
	* 
	 */
	@Test
	public void deleteRcsBotCategoryDescRcsBotCategory() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotCategoryDescRcsBotCategory 
		Integer rcsbotcategorydesc_id = 0;
		Integer related_rcsbotcategory_id = 0;
		RcsBotCategoryDesc response = null;
		response = service.deleteRcsBotCategoryDescRcsBotCategory(rcsbotcategorydesc_id, related_rcsbotcategory_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotCategoryDescRcsBotCategory
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
