
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
 * Unit test for the <code>RcsBotUserroleRestController</code> controller.
 *
 * @see com.kirusa.web.rest.RcsBotUserroleRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsBotUserroleRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>RcsBotUserrolercsbotuserrole_idrcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotUserrolercsbotuserrole_idrcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUserrole/{rcsbotuserrole_id}/rcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserroleRestController controller = (RcsBotUserroleRestController) context.getBean("RcsBotUserroleRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrolercsbotuserrole_idrcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsBotUserrolercsbotuserrole_idrcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUserrole/{rcsbotuserrole_id}/rcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserroleRestController controller = (RcsBotUserroleRestController) context.getBean("RcsBotUserroleRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrolercsbotuserrole_idrcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsBotUserrolercsbotuserrole_idrcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUserrole/{rcsbotuserrole_id}/rcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserroleRestController controller = (RcsBotUserroleRestController) context.getBean("RcsBotUserroleRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrolercsbotuserrole_idrcsBotUserrcsbotuser_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsBotUserrolercsbotuserrole_idrcsBotUserrcsbotuser_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUserrole/{rcsbotuserrole_id}/rcsBotUser/{rcsbotuser_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserroleRestController controller = (RcsBotUserroleRestController) context.getBean("RcsBotUserroleRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrolercsbotuserrole_idrcsBotUserrcsbotuser_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotUserrolercsbotuserrole_idrcsBotUserrcsbotuser_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUserrole/{rcsbotuserrole_id}/rcsBotUser/{rcsbotuser_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserroleRestController controller = (RcsBotUserroleRestController) context.getBean("RcsBotUserroleRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotUserrole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUserrole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserroleRestController controller = (RcsBotUserroleRestController) context.getBean("RcsBotUserroleRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrolercsbotuserrole_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotUserrolercsbotuserrole_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUserrole/{rcsbotuserrole_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserroleRestController controller = (RcsBotUserroleRestController) context.getBean("RcsBotUserroleRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsBotUserrole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUserrole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserroleRestController controller = (RcsBotUserroleRestController) context.getBean("RcsBotUserroleRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsBotUserrole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUserrole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserroleRestController controller = (RcsBotUserroleRestController) context.getBean("RcsBotUserroleRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrolercsbotuserrole_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsBotUserrolercsbotuserrole_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUserrole/{rcsbotuserrole_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserroleRestController controller = (RcsBotUserroleRestController) context.getBean("RcsBotUserroleRestController");

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