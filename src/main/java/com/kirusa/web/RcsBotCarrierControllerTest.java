
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
 * Unit test for the <code>RcsBotCarrierController</code> controller.
 *
 * @see com.kirusa.web.RcsBotCarrierController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsBotCarrierControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexRcsBotCarrier()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexRcsBotCarrier() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexRcsBotCarrier");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCarrierController controller = (RcsBotCarrierController) context.getBean("RcsBotCarrierController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotCarrier()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotCarrier() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotCarrier");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCarrierController controller = (RcsBotCarrierController) context.getBean("RcsBotCarrierController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRcsBotCarrier()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotCarrier() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotCarrier");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCarrierController controller = (RcsBotCarrierController) context.getBean("RcsBotCarrierController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotCarrier()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotCarrier() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotCarrier");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCarrierController controller = (RcsBotCarrierController) context.getBean("RcsBotCarrierController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotCarrier()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotCarrier() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotCarrier");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCarrierController controller = (RcsBotCarrierController) context.getBean("RcsBotCarrierController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotCarrier()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotCarrier() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotCarrier");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCarrierController controller = (RcsBotCarrierController) context.getBean("RcsBotCarrierController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotCarrier()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotCarrier() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotCarrier");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCarrierController controller = (RcsBotCarrierController) context.getBean("RcsBotCarrierController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>rcsbotcarrierControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetrcsbotcarrierControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/rcsbotcarrierController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCarrierController controller = (RcsBotCarrierController) context.getBean("RcsBotCarrierController");

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