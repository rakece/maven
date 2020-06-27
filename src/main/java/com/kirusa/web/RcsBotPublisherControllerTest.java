
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
 * Unit test for the <code>RcsBotPublisherController</code> controller.
 *
 * @see com.kirusa.web.RcsBotPublisherController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsBotPublisherControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexRcsBotPublisher()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexRcsBotPublisher() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexRcsBotPublisher");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotPublisherController controller = (RcsBotPublisherController) context.getBean("RcsBotPublisherController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotPublisher()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotPublisher() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotPublisher");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotPublisherController controller = (RcsBotPublisherController) context.getBean("RcsBotPublisherController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRcsBotPublisher()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotPublisher() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotPublisher");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotPublisherController controller = (RcsBotPublisherController) context.getBean("RcsBotPublisherController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotPublisher()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotPublisher() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotPublisher");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotPublisherController controller = (RcsBotPublisherController) context.getBean("RcsBotPublisherController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotPublisher()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotPublisher() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotPublisher");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotPublisherController controller = (RcsBotPublisherController) context.getBean("RcsBotPublisherController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotPublisher()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotPublisher() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotPublisher");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotPublisherController controller = (RcsBotPublisherController) context.getBean("RcsBotPublisherController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotPublisher()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotPublisher() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotPublisher");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotPublisherController controller = (RcsBotPublisherController) context.getBean("RcsBotPublisherController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>rcsbotpublisherControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetrcsbotpublisherControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/rcsbotpublisherController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotPublisherController controller = (RcsBotPublisherController) context.getBean("RcsBotPublisherController");

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