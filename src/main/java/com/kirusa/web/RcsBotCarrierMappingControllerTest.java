
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
 * Unit test for the <code>RcsBotCarrierMappingController</code> controller.
 *
 * @see com.kirusa.web.RcsBotCarrierMappingController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsBotCarrierMappingControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexRcsBotCarrierMapping()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexRcsBotCarrierMapping() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexRcsBotCarrierMapping");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCarrierMappingController controller = (RcsBotCarrierMappingController) context.getBean("RcsBotCarrierMappingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotCarrierMapping()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotCarrierMapping() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotCarrierMapping");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCarrierMappingController controller = (RcsBotCarrierMappingController) context.getBean("RcsBotCarrierMappingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRcsBotCarrierMapping()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotCarrierMapping() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotCarrierMapping");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCarrierMappingController controller = (RcsBotCarrierMappingController) context.getBean("RcsBotCarrierMappingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotCarrierMapping()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotCarrierMapping() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotCarrierMapping");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCarrierMappingController controller = (RcsBotCarrierMappingController) context.getBean("RcsBotCarrierMappingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotCarrierMapping()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotCarrierMapping() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotCarrierMapping");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCarrierMappingController controller = (RcsBotCarrierMappingController) context.getBean("RcsBotCarrierMappingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotCarrierMapping()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotCarrierMapping() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotCarrierMapping");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCarrierMappingController controller = (RcsBotCarrierMappingController) context.getBean("RcsBotCarrierMappingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotCarrierMapping()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotCarrierMapping() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotCarrierMapping");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCarrierMappingController controller = (RcsBotCarrierMappingController) context.getBean("RcsBotCarrierMappingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>rcsbotcarriermappingControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetrcsbotcarriermappingControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/rcsbotcarriermappingController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCarrierMappingController controller = (RcsBotCarrierMappingController) context.getBean("RcsBotCarrierMappingController");

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