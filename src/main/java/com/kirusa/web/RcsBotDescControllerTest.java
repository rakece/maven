
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
 * Unit test for the <code>RcsBotDescController</code> controller.
 *
 * @see com.kirusa.web.RcsBotDescController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsBotDescControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editRcsBotDescRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotDescRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotDescRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotDescController controller = (RcsBotDescController) context.getBean("RcsBotDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotDescRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotDescRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotDescRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotDescController controller = (RcsBotDescController) context.getBean("RcsBotDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotDescRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotDescRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotDescRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotDescController controller = (RcsBotDescController) context.getBean("RcsBotDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotDescRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotDescRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotDescRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotDescController controller = (RcsBotDescController) context.getBean("RcsBotDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotDescRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotDescRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotDescRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotDescController controller = (RcsBotDescController) context.getBean("RcsBotDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotDescRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotDescRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotDescRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotDescController controller = (RcsBotDescController) context.getBean("RcsBotDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRcsBotDescRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRcsBotDescRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRcsBotDescRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotDescController controller = (RcsBotDescController) context.getBean("RcsBotDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexRcsBotDesc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexRcsBotDesc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexRcsBotDesc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotDescController controller = (RcsBotDescController) context.getBean("RcsBotDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotDesc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotDesc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotDesc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotDescController controller = (RcsBotDescController) context.getBean("RcsBotDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRcsBotDesc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotDesc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotDesc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotDescController controller = (RcsBotDescController) context.getBean("RcsBotDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotDesc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotDesc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotDesc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotDescController controller = (RcsBotDescController) context.getBean("RcsBotDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotDesc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotDesc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotDesc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotDescController controller = (RcsBotDescController) context.getBean("RcsBotDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotDesc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotDesc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotDesc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotDescController controller = (RcsBotDescController) context.getBean("RcsBotDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotDesc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotDesc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotDesc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotDescController controller = (RcsBotDescController) context.getBean("RcsBotDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>rcsbotdescControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetrcsbotdescControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/rcsbotdescController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotDescController controller = (RcsBotDescController) context.getBean("RcsBotDescController");

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