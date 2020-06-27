
package com.kirusa.service;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotVideo;

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
public class RcsBotVideoServiceTest {

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
	protected RcsBotVideoService service;

	/**
	 * Instantiates a new RcsBotVideoServiceTest.
	 *
	 */
	public RcsBotVideoServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Return a count of all RcsBotVideo entity
	* 
	 */
	@Test
	public void countRcsBotVideos() {
		Integer response = null;
		response = service.countRcsBotVideos();
		// TODO: JUnit - Add assertions to test outputs of operation: countRcsBotVideos
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBot entity
	* 
	 */
	@Test
	public void saveRcsBotVideoRcsBot() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotVideoRcsBot 
		Integer id = 0;
		RcsBot related_rcsbot = new com.kirusa.domain.RcsBot();
		RcsBotVideo response = null;
		response = service.saveRcsBotVideoRcsBot(id, related_rcsbot);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotVideoRcsBot
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRcsBotVideoByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRcsBotVideoByPrimaryKey 
		Integer id_1 = 0;
		RcsBotVideo response = null;
		response = service.findRcsBotVideoByPrimaryKey(id_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findRcsBotVideoByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Return all RcsBotVideo entity
	* 
	 */
	@Test
	public void findAllRcsBotVideos() {
		// TODO: JUnit - Populate test inputs for operation: findAllRcsBotVideos 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<RcsBotVideo> response = null;
		response = service.findAllRcsBotVideos(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRcsBotVideos
	}

	/**
	 * Operation Unit Test
	* Load an existing RcsBotVideo entity
	* 
	 */
	@Test
	public void loadRcsBotVideos() {
		Set<RcsBotVideo> response = null;
		response = service.loadRcsBotVideos();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRcsBotVideos
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotVideo entity
	* 
	 */
	@Test
	public void saveRcsBotVideo() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotVideo 
		RcsBotVideo rcsbotvideo = new com.kirusa.domain.RcsBotVideo();
		service.saveRcsBotVideo(rcsbotvideo);
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBot entity
	* 
	 */
	@Test
	public void deleteRcsBotVideoRcsBot() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotVideoRcsBot 
		Integer rcsbotvideo_id = 0;
		Integer related_rcsbot_id = 0;
		RcsBotVideo response = null;
		response = service.deleteRcsBotVideoRcsBot(rcsbotvideo_id, related_rcsbot_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotVideoRcsBot
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotVideo entity
	* 
	 */
	@Test
	public void deleteRcsBotVideo() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotVideo 
		RcsBotVideo rcsbotvideo_1 = new com.kirusa.domain.RcsBotVideo();
		service.deleteRcsBotVideo(rcsbotvideo_1);
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
