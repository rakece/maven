
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
 * Unit test for the <code>RcsBotUserController</code> controller.
 *
 * @see com.kirusa.web.RcsBotUserController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsBotUserControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editRcsBotUserRcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotUserRcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotUserRcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotUserRcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotUserRcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotUserRcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotUserRcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotUserRcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotUserRcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotUserRcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotUserRcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotUserRcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotUserRcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotUserRcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotUserRcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotUserRcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotUserRcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotUserRcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRcsBotUserRcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRcsBotUserRcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRcsBotUserRcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRcsBotUserRcsBots()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotUserRcsBots() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotUserRcsBots");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotUserRcsBots()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotUserRcsBots() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotUserRcsBots");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotUserRcsBots()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotUserRcsBots() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotUserRcsBots");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotUserRcsBots()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotUserRcsBots() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotUserRcsBots");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotUserRcsBots()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotUserRcsBots() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotUserRcsBots");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotUserRcsBots()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotUserRcsBots() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotUserRcsBots");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRcsBotUserRcsBots()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRcsBotUserRcsBots() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRcsBotUserRcsBots");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRcsBotUserRcsBotBillings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotUserRcsBotBillings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotUserRcsBotBillings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotUserRcsBotBillings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotUserRcsBotBillings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotUserRcsBotBillings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotUserRcsBotBillings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotUserRcsBotBillings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotUserRcsBotBillings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotUserRcsBotBillings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotUserRcsBotBillings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotUserRcsBotBillings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotUserRcsBotBillings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotUserRcsBotBillings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotUserRcsBotBillings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotUserRcsBotBillings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotUserRcsBotBillings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotUserRcsBotBillings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRcsBotUserRcsBotBillings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRcsBotUserRcsBotBillings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRcsBotUserRcsBotBillings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRcsBotUserRcsBotUserroles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotUserRcsBotUserroles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotUserRcsBotUserroles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotUserRcsBotUserroles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotUserRcsBotUserroles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotUserRcsBotUserroles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotUserRcsBotUserroles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotUserRcsBotUserroles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotUserRcsBotUserroles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotUserRcsBotUserroles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotUserRcsBotUserroles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotUserRcsBotUserroles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotUserRcsBotUserroles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotUserRcsBotUserroles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotUserRcsBotUserroles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotUserRcsBotUserroles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotUserRcsBotUserroles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotUserRcsBotUserroles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRcsBotUserRcsBotUserroles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRcsBotUserRcsBotUserroles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRcsBotUserRcsBotUserroles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexRcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexRcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexRcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>rcsbotuserControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetrcsbotuserControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/rcsbotuserController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserController controller = (RcsBotUserController) context.getBean("RcsBotUserController");

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