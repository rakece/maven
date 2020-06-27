
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
 * Unit test for the <code>RcsBotSnapNumberController</code> controller.
 *
 * @see com.kirusa.web.RcsBotSnapNumberController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsBotSnapNumberControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexRcsBotSnapNumber()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexRcsBotSnapNumber() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexRcsBotSnapNumber");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotSnapNumberController controller = (RcsBotSnapNumberController) context.getBean("RcsBotSnapNumberController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotSnapNumber()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotSnapNumber() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotSnapNumber");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotSnapNumberController controller = (RcsBotSnapNumberController) context.getBean("RcsBotSnapNumberController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRcsBotSnapNumber()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotSnapNumber() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotSnapNumber");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotSnapNumberController controller = (RcsBotSnapNumberController) context.getBean("RcsBotSnapNumberController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotSnapNumber()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotSnapNumber() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotSnapNumber");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotSnapNumberController controller = (RcsBotSnapNumberController) context.getBean("RcsBotSnapNumberController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotSnapNumber()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotSnapNumber() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotSnapNumber");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotSnapNumberController controller = (RcsBotSnapNumberController) context.getBean("RcsBotSnapNumberController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotSnapNumber()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotSnapNumber() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotSnapNumber");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotSnapNumberController controller = (RcsBotSnapNumberController) context.getBean("RcsBotSnapNumberController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotSnapNumber()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotSnapNumber() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotSnapNumber");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotSnapNumberController controller = (RcsBotSnapNumberController) context.getBean("RcsBotSnapNumberController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>rcsbotsnapnumberControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetrcsbotsnapnumberControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/rcsbotsnapnumberController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotSnapNumberController controller = (RcsBotSnapNumberController) context.getBean("RcsBotSnapNumberController");

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