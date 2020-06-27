
package com.kirusa.service;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotAvailable;
import com.kirusa.domain.RcsBotBilling;
import com.kirusa.domain.RcsBotCategory;
import com.kirusa.domain.RcsBotComment;
import com.kirusa.domain.RcsBotDesc;
import com.kirusa.domain.RcsBotImage;
import com.kirusa.domain.RcsBotTags;

import com.kirusa.domain.RcsBotUpdateDesc;
import com.kirusa.domain.RcsBotUser;
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
public class RcsBotServiceTest {

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
	protected RcsBotService service;

	/**
	 * Instantiates a new RcsBotServiceTest.
	 *
	 */
	public RcsBotServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotImage entity
	* 
	 */
	@Test
	public void saveRcsBotRcsBotImages() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotRcsBotImages 
		Integer id = 0;
		RcsBotImage related_rcsbotimages = new com.kirusa.domain.RcsBotImage();
		RcsBot response = null;
		response = service.saveRcsBotRcsBotImages(id, related_rcsbotimages);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotRcsBotImages
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotBilling entity
	* 
	 */
	@Test
	public void saveRcsBotRcsBotBillings() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotRcsBotBillings 
		Integer id_1 = 0;
		RcsBotBilling related_rcsbotbillings = new com.kirusa.domain.RcsBotBilling();
		RcsBot response = null;
		response = service.saveRcsBotRcsBotBillings(id_1, related_rcsbotbillings);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotRcsBotBillings
	}

	/**
	 * Operation Unit Test
	* Load an existing RcsBot entity
	* 
	 */
	@Test
	public void loadRcsBots() {
		Set<RcsBot> response = null;
		response = service.loadRcsBots();
		// TODO: JUnit - Add assertions to test outputs of operation: loadRcsBots
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotVideo entity
	* 
	 */
	@Test
	public void deleteRcsBotRcsBotVideos() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotRcsBotVideos 
		Integer rcsbot_id = 0;
		Integer related_rcsbotvideos_id = 0;
		RcsBot response = null;
		response = service.deleteRcsBotRcsBotVideos(rcsbot_id, related_rcsbotvideos_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotRcsBotVideos
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotDesc entity
	* 
	 */
	@Test
	public void saveRcsBotRcsBotDescs() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotRcsBotDescs 
		Integer id_2 = 0;
		RcsBotDesc related_rcsbotdescs = new com.kirusa.domain.RcsBotDesc();
		RcsBot response = null;
		response = service.saveRcsBotRcsBotDescs(id_2, related_rcsbotdescs);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotRcsBotDescs
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotAvailable entity
	* 
	 */
	@Test
	public void saveRcsBotRcsBotAvailables() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotRcsBotAvailables 
		Integer id_3 = 0;
		RcsBotAvailable related_rcsbotavailables = new com.kirusa.domain.RcsBotAvailable();
		RcsBot response = null;
		response = service.saveRcsBotRcsBotAvailables(id_3, related_rcsbotavailables);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotRcsBotAvailables
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotUpdate entity
	* 
	 */
	@Test
	public void saveRcsBotRcsBotUpdates() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotRcsBotUpdates 
		Integer id_4 = 0;
		RcsBotUpdateDesc related_rcsbotupdates = new com.kirusa.domain.RcsBotUpdateDesc();
		RcsBot response = null;
		response = service.saveRcsBotRcsBotUpdates(id_4, related_rcsbotupdates);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotRcsBotUpdates
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotTags entity
	* 
	 */
	@Test
	public void saveRcsBotRcsBotTagses() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotRcsBotTagses 
		Integer id_5 = 0;
		RcsBotTags related_rcsbottagses = new com.kirusa.domain.RcsBotTags();
		RcsBot response = null;
		response = service.saveRcsBotRcsBotTagses(id_5, related_rcsbottagses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotRcsBotTagses
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotComment entity
	* 
	 */
	@Test
	public void deleteRcsBotRcsBotComments() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotRcsBotComments 
		Integer rcsbot_id_1 = 0;
		Integer related_rcsbotcomments_id = 0;
		RcsBot response = null;
		response = service.deleteRcsBotRcsBotComments(rcsbot_id_1, related_rcsbotcomments_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotRcsBotComments
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotImage entity
	* 
	 */
	@Test
	public void deleteRcsBotRcsBotImages() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotRcsBotImages 
		Integer rcsbot_id_2 = 0;
		Integer related_rcsbotimages_id = 0;
		RcsBot response = null;
		response = service.deleteRcsBotRcsBotImages(rcsbot_id_2, related_rcsbotimages_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotRcsBotImages
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotDesc entity
	* 
	 */
	@Test
	public void deleteRcsBotRcsBotDescs() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotRcsBotDescs 
		Integer rcsbot_id_3 = 0;
		Integer related_rcsbotdescs_id = 0;
		RcsBot response = null;
		response = service.deleteRcsBotRcsBotDescs(rcsbot_id_3, related_rcsbotdescs_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotRcsBotDescs
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotAvailable entity
	* 
	 */
	@Test
	public void deleteRcsBotRcsBotAvailables() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotRcsBotAvailables 
		Integer rcsbot_id_4 = 0;
		Integer related_rcsbotavailables_id = 0;
		RcsBot response = null;
		response = service.deleteRcsBotRcsBotAvailables(rcsbot_id_4, related_rcsbotavailables_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotRcsBotAvailables
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotUpdate entity
	* 
	 */
	@Test
	public void deleteRcsBotRcsBotUpdates() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotRcsBotUpdates 
		Integer rcsbot_id_5 = 0;
		Integer related_rcsbotupdates_id = 0;
		RcsBot response = null;
		response = service.deleteRcsBotRcsBotUpdatesDesc(rcsbot_id_5, related_rcsbotupdates_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotRcsBotUpdates
	}

	/**
	 * Operation Unit Test
	* Return all RcsBot entity
	* 
	 */
	@Test
	public void findAllRcsBots() {
		// TODO: JUnit - Populate test inputs for operation: findAllRcsBots 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<RcsBot> response = null;
		response = service.findAllRcsBots(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllRcsBots
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotComment entity
	* 
	 */
	@Test
	public void saveRcsBotRcsBotComments() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotRcsBotComments 
		Integer id_6 = 0;
		RcsBotComment related_rcsbotcomments = new com.kirusa.domain.RcsBotComment();
		RcsBot response = null;
		response = service.saveRcsBotRcsBotComments(id_6, related_rcsbotcomments);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotRcsBotComments
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBot entity
	* 
	 */
	@Test
	public void deleteRcsBot() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBot 
		RcsBot rcsbot = new com.kirusa.domain.RcsBot();
		service.deleteRcsBot(rcsbot);
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotVideo entity
	* 
	 */
	@Test
	public void saveRcsBotRcsBotVideos() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotRcsBotVideos 
		Integer id_7 = 0;
		RcsBotVideo related_rcsbotvideos = new com.kirusa.domain.RcsBotVideo();
		RcsBot response = null;
		response = service.saveRcsBotRcsBotVideos(id_7, related_rcsbotvideos);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotRcsBotVideos
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotTags entity
	* 
	 */
	@Test
	public void deleteRcsBotRcsBotTagses() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotRcsBotTagses 
		Integer rcsbot_id_6 = 0;
		Integer related_rcsbottagses_id = 0;
		RcsBot response = null;
		response = service.deleteRcsBotRcsBotTagses(rcsbot_id_6, related_rcsbottagses_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotRcsBotTagses
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBot entity
	* 
	 */
	@Test
	public void saveRcsBot() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBot 
		RcsBot rcsbot_1 = new com.kirusa.domain.RcsBot();
		service.saveRcsBot(rcsbot_1);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findRcsBotByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findRcsBotByPrimaryKey 
		Integer id_8 = 0;
		RcsBot response = null;
		response = service.findRcsBotByPrimaryKey(id_8);
		// TODO: JUnit - Add assertions to test outputs of operation: findRcsBotByPrimaryKey
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotBilling entity
	* 
	 */
	@Test
	public void deleteRcsBotRcsBotBillings() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotRcsBotBillings 
		Integer rcsbot_id_7 = 0;
		Integer related_rcsbotbillings_id = 0;
		RcsBot response = null;
		response = service.deleteRcsBotRcsBotBillings(rcsbot_id_7, related_rcsbotbillings_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotRcsBotBillings
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotUser entity
	* 
	 */
	@Test
	public void saveRcsBotRcsBotUser() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotRcsBotUser 
		Integer id_9 = 0;
		RcsBotUser related_rcsbotuser = new com.kirusa.domain.RcsBotUser();
		RcsBot response = null;
		response = service.saveRcsBotRcsBotUser(id_9, related_rcsbotuser);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotRcsBotUser
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotCategory entity
	* 
	 */
	@Test
	public void deleteRcsBotRcsBotCategory() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotRcsBotCategory 
		Integer rcsbot_id_8 = 0;
		Integer related_rcsbotcategory_id = 0;
		RcsBot response = null;
		response = service.deleteRcsBotRcsBotCategory(rcsbot_id_8, related_rcsbotcategory_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotRcsBotCategory
	}

	/**
	 * Operation Unit Test
	* Save an existing RcsBotCategory entity
	* 
	 */
	@Test
	public void saveRcsBotRcsBotCategory() {
		// TODO: JUnit - Populate test inputs for operation: saveRcsBotRcsBotCategory 
		Integer id_10 = 0;
		RcsBotCategory related_rcsbotcategory = new com.kirusa.domain.RcsBotCategory();
		RcsBot response = null;
		response = service.saveRcsBotRcsBotCategory(id_10, related_rcsbotcategory);
		// TODO: JUnit - Add assertions to test outputs of operation: saveRcsBotRcsBotCategory
	}

	/**
	 * Operation Unit Test
	* Delete an existing RcsBotUser entity
	* 
	 */
	@Test
	public void deleteRcsBotRcsBotUser() {
		// TODO: JUnit - Populate test inputs for operation: deleteRcsBotRcsBotUser 
		Integer rcsbot_id_9 = 0;
		Integer related_rcsbotuser_id = 0;
		RcsBot response = null;
		response = service.deleteRcsBotRcsBotUser(rcsbot_id_9, related_rcsbotuser_id);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteRcsBotRcsBotUser
	}

	/**
	 * Operation Unit Test
	* Return a count of all RcsBot entity
	* 
	 */
	@Test
	public void countRcsBots() {
		Integer response = null;
		response = service.countRcsBots();
		// TODO: JUnit - Add assertions to test outputs of operation: countRcsBots
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
