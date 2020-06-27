
package com.kirusa.service;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotImage;

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
public class RcsBotImageServiceTest {

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
	protected RcsBotImageService service;

	/**
	 * Instantiates a new RcsBotImageServiceTest.
	 *
	 */
	public RcsBotImageServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBot entity
	* 
	 */
	@Test
	public void saveRcsBotImageRcsBot() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotImageRcsBot 
		Integer id = 0;
		RcsBot related_rcsbot = new com.kirusa.domain.RcsBot();
		RcsBotImage response = null;
		response = service.saveRcsBotImageRcsBot(id, related_rcsbot);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotImageRcsBot
	}

	/**
	 * Operation Unit Test
	* Return a count of all RcsBotImage entity
	* 
	 */
	@Test
	public void countRcsBotImages() {
		Integer response = null;
		response = service.countRcsBotImages();
		// TODO: JUnit - Add assertions to test outputs of operation: countRcsBotImages
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotImage entity
	* 
	 */
	@Test
	public void saveRcsBotImage() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotImage 
		RcsBotImage rcsbotimage = new com.kirusa.domain.RcsBotImage();
		service.saveRcsBotImage(rcsbotimage);
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBot entity
	* 
	 */
	@Test
	public void deleteRcsBotImageRcsBot() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotImageRcsBot 
		Integer rcsbotimage_id = 0;
		Integer related_rcsbot_id = 0;
		RcsBotImage response = null;
		response = service.deleteRcsBotImageRcsBot(rcsbotimage_id, related_rcsbot_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotImageRcsBot
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRcsBotImageByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRcsBotImageByPrimaryKey 
		Integer id_1 = 0;
		RcsBotImage response = null;
		response = service.findRcsBotImageByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findRcsBotImageByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotImage entity
	* 
	 */
	@Test
	public void deleteRcsBotImage() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotImage 
		RcsBotImage rcsbotimage_1 = new com.kirusa.domain.RcsBotImage();
		service.deleteRcsBotImage(rcsbotimage_1);
	}

	/**
	 * Operation Unit Test
	* Return all RcsBotImage entity
	* 
	 */
	@Test
	public void findAllRcsBotImages() {
		// TODO: JUnit - Populate test inputs for operation: findAllRcsBotImages 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<RcsBotImage> response = null;
		response = service.findAllRcsBotImages(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRcsBotImages
	}

	/**
	 * Operation Unit Test
	* Load an existing RcsBotImage entity
	* 
	 */
	@Test
	public void loadRcsBotImages() {
		Set<RcsBotImage> response = null;
		response = service.loadRcsBotImages();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRcsBotImages
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
