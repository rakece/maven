
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
 * Unit test for the <code>RcsCountryListController</code> controller.
 *
 * @see com.kirusa.web.RcsCountryListController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsCountryListControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editRcsCountryListRcsBotUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsCountryListRcsBotUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsCountryListRcsBotUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListController controller = (RcsCountryListController) context.getBean("RcsCountryListController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsCountryListRcsBotUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsCountryListRcsBotUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsCountryListRcsBotUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListController controller = (RcsCountryListController) context.getBean("RcsCountryListController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsCountryListRcsBotUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsCountryListRcsBotUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsCountryListRcsBotUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListController controller = (RcsCountryListController) context.getBean("RcsCountryListController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsCountryListRcsBotUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsCountryListRcsBotUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsCountryListRcsBotUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListController controller = (RcsCountryListController) context.getBean("RcsCountryListController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsCountryListRcsBotUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsCountryListRcsBotUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsCountryListRcsBotUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListController controller = (RcsCountryListController) context.getBean("RcsCountryListController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsCountryListRcsBotUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsCountryListRcsBotUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsCountryListRcsBotUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListController controller = (RcsCountryListController) context.getBean("RcsCountryListController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRcsCountryListRcsBotUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRcsCountryListRcsBotUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRcsCountryListRcsBotUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListController controller = (RcsCountryListController) context.getBean("RcsCountryListController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRcsCountryListRcsBotAvailables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsCountryListRcsBotAvailables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsCountryListRcsBotAvailables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListController controller = (RcsCountryListController) context.getBean("RcsCountryListController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsCountryListRcsBotAvailables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsCountryListRcsBotAvailables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsCountryListRcsBotAvailables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListController controller = (RcsCountryListController) context.getBean("RcsCountryListController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsCountryListRcsBotAvailables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsCountryListRcsBotAvailables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsCountryListRcsBotAvailables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListController controller = (RcsCountryListController) context.getBean("RcsCountryListController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsCountryListRcsBotAvailables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsCountryListRcsBotAvailables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsCountryListRcsBotAvailables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListController controller = (RcsCountryListController) context.getBean("RcsCountryListController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsCountryListRcsBotAvailables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsCountryListRcsBotAvailables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsCountryListRcsBotAvailables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListController controller = (RcsCountryListController) context.getBean("RcsCountryListController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsCountryListRcsBotAvailables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsCountryListRcsBotAvailables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsCountryListRcsBotAvailables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListController controller = (RcsCountryListController) context.getBean("RcsCountryListController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRcsCountryListRcsBotAvailables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRcsCountryListRcsBotAvailables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRcsCountryListRcsBotAvailables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListController controller = (RcsCountryListController) context.getBean("RcsCountryListController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexRcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexRcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexRcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListController controller = (RcsCountryListController) context.getBean("RcsCountryListController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListController controller = (RcsCountryListController) context.getBean("RcsCountryListController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListController controller = (RcsCountryListController) context.getBean("RcsCountryListController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListController controller = (RcsCountryListController) context.getBean("RcsCountryListController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListController controller = (RcsCountryListController) context.getBean("RcsCountryListController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListController controller = (RcsCountryListController) context.getBean("RcsCountryListController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListController controller = (RcsCountryListController) context.getBean("RcsCountryListController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>rcscountrylistControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetrcscountrylistControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/rcscountrylistController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListController controller = (RcsCountryListController) context.getBean("RcsCountryListController");

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