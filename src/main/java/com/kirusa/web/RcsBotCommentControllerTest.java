
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
 * Unit test for the <code>RcsBotCommentController</code> controller.
 *
 * @see com.kirusa.web.RcsBotCommentController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsBotCommentControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editRcsBotCommentRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotCommentRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotCommentRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCommentController controller = (RcsBotCommentController) context.getBean("RcsBotCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotCommentRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotCommentRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotCommentRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCommentController controller = (RcsBotCommentController) context.getBean("RcsBotCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotCommentRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotCommentRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotCommentRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCommentController controller = (RcsBotCommentController) context.getBean("RcsBotCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotCommentRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotCommentRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotCommentRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCommentController controller = (RcsBotCommentController) context.getBean("RcsBotCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotCommentRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotCommentRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotCommentRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCommentController controller = (RcsBotCommentController) context.getBean("RcsBotCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotCommentRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotCommentRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotCommentRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCommentController controller = (RcsBotCommentController) context.getBean("RcsBotCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRcsBotCommentRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRcsBotCommentRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRcsBotCommentRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCommentController controller = (RcsBotCommentController) context.getBean("RcsBotCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexRcsBotComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexRcsBotComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexRcsBotComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCommentController controller = (RcsBotCommentController) context.getBean("RcsBotCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCommentController controller = (RcsBotCommentController) context.getBean("RcsBotCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRcsBotComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCommentController controller = (RcsBotCommentController) context.getBean("RcsBotCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCommentController controller = (RcsBotCommentController) context.getBean("RcsBotCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCommentController controller = (RcsBotCommentController) context.getBean("RcsBotCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCommentController controller = (RcsBotCommentController) context.getBean("RcsBotCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotComment()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotComment() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotComment");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCommentController controller = (RcsBotCommentController) context.getBean("RcsBotCommentController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>rcsbotcommentControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetrcsbotcommentControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/rcsbotcommentController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCommentController controller = (RcsBotCommentController) context.getBean("RcsBotCommentController");

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