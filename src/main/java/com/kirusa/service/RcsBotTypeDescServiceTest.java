
package com.kirusa.service;

import com.kirusa.domain.RcsBotTypeDesc;

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
public class RcsBotTypeDescServiceTest {

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
	protected RcsBotTypeDescService service;

	/**
	 * Instantiates a new RcsBotTypeDescServiceTest.
	 *
	 */
	public RcsBotTypeDescServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Return a count of all RcsBotTypeDesc entity
	* 
	 */
	@Test
	public void countRcsBotTypeDescs() {
		Integer response = null;
		response = service.countRcsBotTypeDescs();
		// TODO: JUnit - Add assertions to test outputs of operation: countRcsBotTypeDescs
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotTypeDesc entity
	* 
	 */
	@Test
	public void deleteRcsBotTypeDesc() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotTypeDesc 
		RcsBotTypeDesc rcsbottypedesc = new com.kirusa.domain.RcsBotTypeDesc();
		service.deleteRcsBotTypeDesc(rcsbottypedesc);
	}

	/**
	 * Operation Unit Test
	* Return all RcsBotTypeDesc entity
	* 
	 */
	@Test
	public void findAllRcsBotTypeDescs() {
		// TODO: JUnit - Populate test inputs for operation: findAllRcsBotTypeDescs 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<RcsBotTypeDesc> response = null;
		response = service.findAllRcsBotTypeDescs(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRcsBotTypeDescs
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRcsBotTypeDescByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRcsBotTypeDescByPrimaryKey 
		Integer id = 0;
		RcsBotTypeDesc response = null;
		response = service.findRcsBotTypeDescByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findRcsBotTypeDescByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotTypeDesc entity
	* 
	 */
	@Test
	public void saveRcsBotTypeDesc() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotTypeDesc 
		RcsBotTypeDesc rcsbottypedesc_1 = new com.kirusa.domain.RcsBotTypeDesc();
		service.saveRcsBotTypeDesc(rcsbottypedesc_1);
	}

	/**
	 * Operation Unit Test
	* Load an existing RcsBotTypeDesc entity
	* 
	 */
	@Test
	public void loadRcsBotTypeDescs() {
		Set<RcsBotTypeDesc> response = null;
		response = service.loadRcsBotTypeDescs();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRcsBotTypeDescs
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
