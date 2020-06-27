
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
 * Unit test for the <code>RcsBotVideoController</code> controller.
 *
 * @see com.kirusa.web.RcsBotVideoController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsBotVideoControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editRcsBotVideoRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotVideoRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotVideoRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotVideoController controller = (RcsBotVideoController) context.getBean("RcsBotVideoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotVideoRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotVideoRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotVideoRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotVideoController controller = (RcsBotVideoController) context.getBean("RcsBotVideoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotVideoRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotVideoRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotVideoRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotVideoController controller = (RcsBotVideoController) context.getBean("RcsBotVideoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotVideoRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotVideoRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotVideoRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotVideoController controller = (RcsBotVideoController) context.getBean("RcsBotVideoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotVideoRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotVideoRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotVideoRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotVideoController controller = (RcsBotVideoController) context.getBean("RcsBotVideoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotVideoRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotVideoRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotVideoRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotVideoController controller = (RcsBotVideoController) context.getBean("RcsBotVideoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRcsBotVideoRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRcsBotVideoRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRcsBotVideoRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotVideoController controller = (RcsBotVideoController) context.getBean("RcsBotVideoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexRcsBotVideo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexRcsBotVideo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexRcsBotVideo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotVideoController controller = (RcsBotVideoController) context.getBean("RcsBotVideoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotVideo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotVideo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotVideo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotVideoController controller = (RcsBotVideoController) context.getBean("RcsBotVideoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRcsBotVideo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotVideo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotVideo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotVideoController controller = (RcsBotVideoController) context.getBean("RcsBotVideoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotVideo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotVideo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotVideo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotVideoController controller = (RcsBotVideoController) context.getBean("RcsBotVideoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotVideo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotVideo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotVideo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotVideoController controller = (RcsBotVideoController) context.getBean("RcsBotVideoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotVideo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotVideo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotVideo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotVideoController controller = (RcsBotVideoController) context.getBean("RcsBotVideoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotVideo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotVideo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotVideo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotVideoController controller = (RcsBotVideoController) context.getBean("RcsBotVideoController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>rcsbotvideoControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetrcsbotvideoControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/rcsbotvideoController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotVideoController controller = (RcsBotVideoController) context.getBean("RcsBotVideoController");

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