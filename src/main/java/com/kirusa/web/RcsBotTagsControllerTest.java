
package com.kirusa.web;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Unit test for the <code>RcsBotTagsController</code> controller.
 *
 * @see com.kirusa.web.RcsBotTagsController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsBotTagsControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editRcsBotTagsRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotTagsRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotTagsRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsController controller = (RcsBotTagsController) context.getBean("RcsBotTagsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotTagsRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotTagsRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotTagsRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsController controller = (RcsBotTagsController) context.getBean("RcsBotTagsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotTagsRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotTagsRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotTagsRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsController controller = (RcsBotTagsController) context.getBean("RcsBotTagsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotTagsRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotTagsRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotTagsRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsController controller = (RcsBotTagsController) context.getBean("RcsBotTagsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotTagsRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotTagsRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotTagsRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsController controller = (RcsBotTagsController) context.getBean("RcsBotTagsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotTagsRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotTagsRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotTagsRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsController controller = (RcsBotTagsController) context.getBean("RcsBotTagsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRcsBotTagsRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRcsBotTagsRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRcsBotTagsRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsController controller = (RcsBotTagsController) context.getBean("RcsBotTagsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRcsBotTagsRcsBotCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotTagsRcsBotCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotTagsRcsBotCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsController controller = (RcsBotTagsController) context.getBean("RcsBotTagsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotTagsRcsBotCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotTagsRcsBotCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotTagsRcsBotCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsController controller = (RcsBotTagsController) context.getBean("RcsBotTagsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotTagsRcsBotCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotTagsRcsBotCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotTagsRcsBotCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsController controller = (RcsBotTagsController) context.getBean("RcsBotTagsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotTagsRcsBotCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotTagsRcsBotCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotTagsRcsBotCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsController controller = (RcsBotTagsController) context.getBean("RcsBotTagsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotTagsRcsBotCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotTagsRcsBotCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotTagsRcsBotCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsController controller = (RcsBotTagsController) context.getBean("RcsBotTagsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotTagsRcsBotCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotTagsRcsBotCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotTagsRcsBotCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsController controller = (RcsBotTagsController) context.getBean("RcsBotTagsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRcsBotTagsRcsBotCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRcsBotTagsRcsBotCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRcsBotTagsRcsBotCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsController controller = (RcsBotTagsController) context.getBean("RcsBotTagsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexRcsBotTags()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexRcsBotTags() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexRcsBotTags");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsController controller = (RcsBotTagsController) context.getBean("RcsBotTagsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotTags()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotTags() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotTags");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsController controller = (RcsBotTagsController) context.getBean("RcsBotTagsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRcsBotTags()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotTags() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotTags");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsController controller = (RcsBotTagsController) context.getBean("RcsBotTagsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotTags()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotTags() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotTags");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsController controller = (RcsBotTagsController) context.getBean("RcsBotTagsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotTags()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotTags() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotTags");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsController controller = (RcsBotTagsController) context.getBean("RcsBotTagsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotTags()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotTags() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotTags");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsController controller = (RcsBotTagsController) context.getBean("RcsBotTagsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotTags()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotTags() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotTags");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsController controller = (RcsBotTagsController) context.getBean("RcsBotTagsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>rcsbottagsControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetrcsbottagsControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/rcsbottagsController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsController controller = (RcsBotTagsController) context.getBean("RcsBotTagsController");

		// TODO Invoke method and Assert return values

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
	 * Returns a mock HttpServletRequest object.
	 *
	 */
	private MockHttpServletRequest getMockHttpServletRequest() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
		return request;
	}

	/**
	 * Returns a mock HttpServletResponse object.
	 *
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}