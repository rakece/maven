
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
 * Unit test for the <code>RcsBotTypeDescController</code> controller.
 *
 * @see com.kirusa.web.RcsBotTypeDescController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsBotTypeDescControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexRcsBotTypeDesc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexRcsBotTypeDesc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexRcsBotTypeDesc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTypeDescController controller = (RcsBotTypeDescController) context.getBean("RcsBotTypeDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotTypeDesc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotTypeDesc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotTypeDesc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTypeDescController controller = (RcsBotTypeDescController) context.getBean("RcsBotTypeDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRcsBotTypeDesc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotTypeDesc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotTypeDesc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTypeDescController controller = (RcsBotTypeDescController) context.getBean("RcsBotTypeDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotTypeDesc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotTypeDesc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotTypeDesc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTypeDescController controller = (RcsBotTypeDescController) context.getBean("RcsBotTypeDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotTypeDesc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotTypeDesc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotTypeDesc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTypeDescController controller = (RcsBotTypeDescController) context.getBean("RcsBotTypeDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotTypeDesc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotTypeDesc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotTypeDesc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTypeDescController controller = (RcsBotTypeDescController) context.getBean("RcsBotTypeDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotTypeDesc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotTypeDesc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotTypeDesc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTypeDescController controller = (RcsBotTypeDescController) context.getBean("RcsBotTypeDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>rcsbottypedescControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetrcsbottypedescControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/rcsbottypedescController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTypeDescController controller = (RcsBotTypeDescController) context.getBean("RcsBotTypeDescController");

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