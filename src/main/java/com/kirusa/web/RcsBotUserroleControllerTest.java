
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
 * Unit test for the <code>RcsBotUserroleController</code> controller.
 *
 * @see com.kirusa.web.RcsBotUserroleController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsBotUserroleControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editRcsBotUserroleRcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotUserroleRcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotUserroleRcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserroleController controller = (RcsBotUserroleController) context.getBean("RcsBotUserroleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotUserroleRcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotUserroleRcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotUserroleRcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserroleController controller = (RcsBotUserroleController) context.getBean("RcsBotUserroleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotUserroleRcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotUserroleRcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotUserroleRcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserroleController controller = (RcsBotUserroleController) context.getBean("RcsBotUserroleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotUserroleRcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotUserroleRcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotUserroleRcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserroleController controller = (RcsBotUserroleController) context.getBean("RcsBotUserroleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotUserroleRcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotUserroleRcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotUserroleRcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserroleController controller = (RcsBotUserroleController) context.getBean("RcsBotUserroleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotUserroleRcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotUserroleRcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotUserroleRcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserroleController controller = (RcsBotUserroleController) context.getBean("RcsBotUserroleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRcsBotUserroleRcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRcsBotUserroleRcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRcsBotUserroleRcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserroleController controller = (RcsBotUserroleController) context.getBean("RcsBotUserroleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexRcsBotUserrole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexRcsBotUserrole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexRcsBotUserrole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserroleController controller = (RcsBotUserroleController) context.getBean("RcsBotUserroleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotUserrole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotUserrole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotUserrole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserroleController controller = (RcsBotUserroleController) context.getBean("RcsBotUserroleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRcsBotUserrole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotUserrole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotUserrole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserroleController controller = (RcsBotUserroleController) context.getBean("RcsBotUserroleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotUserrole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotUserrole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotUserrole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserroleController controller = (RcsBotUserroleController) context.getBean("RcsBotUserroleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotUserrole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotUserrole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotUserrole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserroleController controller = (RcsBotUserroleController) context.getBean("RcsBotUserroleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotUserrole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotUserrole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotUserrole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserroleController controller = (RcsBotUserroleController) context.getBean("RcsBotUserroleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotUserrole()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotUserrole() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotUserrole");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserroleController controller = (RcsBotUserroleController) context.getBean("RcsBotUserroleController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>rcsbotuserroleControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetrcsbotuserroleControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/rcsbotuserroleController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserroleController controller = (RcsBotUserroleController) context.getBean("RcsBotUserroleController");

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