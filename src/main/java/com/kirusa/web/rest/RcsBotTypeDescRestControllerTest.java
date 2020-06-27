
package com.kirusa.web.rest;

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
 * Unit test for the <code>RcsBotTypeDescRestController</code> controller.
 *
 * @see com.kirusa.web.rest.RcsBotTypeDescRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsBotTypeDescRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>RcsBotTypeDesc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotTypeDesc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotTypeDesc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTypeDescRestController controller = (RcsBotTypeDescRestController) context.getBean("RcsBotTypeDescRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotTypeDescrcsbottypedesc_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotTypeDescrcsbottypedesc_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotTypeDesc/{rcsbottypedesc_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTypeDescRestController controller = (RcsBotTypeDescRestController) context.getBean("RcsBotTypeDescRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotTypeDesc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsBotTypeDesc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotTypeDesc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTypeDescRestController controller = (RcsBotTypeDescRestController) context.getBean("RcsBotTypeDescRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotTypeDesc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsBotTypeDesc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotTypeDesc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTypeDescRestController controller = (RcsBotTypeDescRestController) context.getBean("RcsBotTypeDescRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotTypeDescrcsbottypedesc_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsBotTypeDescrcsbottypedesc_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotTypeDesc/{rcsbottypedesc_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTypeDescRestController controller = (RcsBotTypeDescRestController) context.getBean("RcsBotTypeDescRestController");

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