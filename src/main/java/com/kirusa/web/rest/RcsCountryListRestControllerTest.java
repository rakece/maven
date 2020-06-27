
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
 * Unit test for the <code>RcsCountryListRestController</code> controller.
 *
 * @see com.kirusa.web.rest.RcsCountryListRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsCountryListRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>RcsCountryListrcscountrylist_idrcsBotUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsCountryListrcscountrylist_idrcsBotUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsCountryList/{rcscountrylist_id}/rcsBotUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListRestController controller = (RcsCountryListRestController) context.getBean("RcsCountryListRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsCountryListrcscountrylist_idrcsBotUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsCountryListrcscountrylist_idrcsBotUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsCountryList/{rcscountrylist_id}/rcsBotUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListRestController controller = (RcsCountryListRestController) context.getBean("RcsCountryListRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsCountryListrcscountrylist_idrcsBotUsers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsCountryListrcscountrylist_idrcsBotUsers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsCountryList/{rcscountrylist_id}/rcsBotUsers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListRestController controller = (RcsCountryListRestController) context.getBean("RcsCountryListRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsCountryListrcscountrylist_idrcsBotUsersrcsbotuser_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsCountryListrcscountrylist_idrcsBotUsersrcsbotuser_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsCountryList/{rcscountrylist_id}/rcsBotUsers/{rcsbotuser_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListRestController controller = (RcsCountryListRestController) context.getBean("RcsCountryListRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsCountryListrcscountrylist_idrcsBotUsersrcsbotuser_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsCountryListrcscountrylist_idrcsBotUsersrcsbotuser_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsCountryList/{rcscountrylist_id}/rcsBotUsers/{rcsbotuser_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListRestController controller = (RcsCountryListRestController) context.getBean("RcsCountryListRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsCountryListrcscountrylist_idrcsBotAvailables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsCountryListrcscountrylist_idrcsBotAvailables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsCountryList/{rcscountrylist_id}/rcsBotAvailables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListRestController controller = (RcsCountryListRestController) context.getBean("RcsCountryListRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsCountryListrcscountrylist_idrcsBotAvailables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsCountryListrcscountrylist_idrcsBotAvailables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsCountryList/{rcscountrylist_id}/rcsBotAvailables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListRestController controller = (RcsCountryListRestController) context.getBean("RcsCountryListRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsCountryListrcscountrylist_idrcsBotAvailables()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsCountryListrcscountrylist_idrcsBotAvailables() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsCountryList/{rcscountrylist_id}/rcsBotAvailables");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListRestController controller = (RcsCountryListRestController) context.getBean("RcsCountryListRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsCountryListrcscountrylist_idrcsBotAvailablesrcsbotavailable_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsCountryListrcscountrylist_idrcsBotAvailablesrcsbotavailable_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsCountryList/{rcscountrylist_id}/rcsBotAvailables/{rcsbotavailable_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListRestController controller = (RcsCountryListRestController) context.getBean("RcsCountryListRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsCountryListrcscountrylist_idrcsBotAvailablesrcsbotavailable_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsCountryListrcscountrylist_idrcsBotAvailablesrcsbotavailable_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsCountryList/{rcscountrylist_id}/rcsBotAvailables/{rcsbotavailable_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListRestController controller = (RcsCountryListRestController) context.getBean("RcsCountryListRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListRestController controller = (RcsCountryListRestController) context.getBean("RcsCountryListRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsCountryListrcscountrylist_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsCountryListrcscountrylist_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsCountryList/{rcscountrylist_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListRestController controller = (RcsCountryListRestController) context.getBean("RcsCountryListRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListRestController controller = (RcsCountryListRestController) context.getBean("RcsCountryListRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListRestController controller = (RcsCountryListRestController) context.getBean("RcsCountryListRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsCountryListrcscountrylist_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsCountryListrcscountrylist_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsCountryList/{rcscountrylist_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsCountryListRestController controller = (RcsCountryListRestController) context.getBean("RcsCountryListRestController");

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