
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
 * Unit test for the <code>RcsBotAvailableRestController</code> controller.
 *
 * @see com.kirusa.web.rest.RcsBotAvailableRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsBotAvailableRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>RcsBotAvailablercsbotavailable_idrcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotAvailablercsbotavailable_idrcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotAvailable/{rcsbotavailable_id}/rcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableRestController controller = (RcsBotAvailableRestController) context.getBean("RcsBotAvailableRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotAvailablercsbotavailable_idrcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsBotAvailablercsbotavailable_idrcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotAvailable/{rcsbotavailable_id}/rcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableRestController controller = (RcsBotAvailableRestController) context.getBean("RcsBotAvailableRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotAvailablercsbotavailable_idrcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsBotAvailablercsbotavailable_idrcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotAvailable/{rcsbotavailable_id}/rcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableRestController controller = (RcsBotAvailableRestController) context.getBean("RcsBotAvailableRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotAvailablercsbotavailable_idrcsBotrcsbot_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsBotAvailablercsbotavailable_idrcsBotrcsbot_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotAvailable/{rcsbotavailable_id}/rcsBot/{rcsbot_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableRestController controller = (RcsBotAvailableRestController) context.getBean("RcsBotAvailableRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotAvailablercsbotavailable_idrcsBotrcsbot_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotAvailablercsbotavailable_idrcsBotrcsbot_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotAvailable/{rcsbotavailable_id}/rcsBot/{rcsbot_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableRestController controller = (RcsBotAvailableRestController) context.getBean("RcsBotAvailableRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotAvailablercsbotavailable_idrcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotAvailablercsbotavailable_idrcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotAvailable/{rcsbotavailable_id}/rcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableRestController controller = (RcsBotAvailableRestController) context.getBean("RcsBotAvailableRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotAvailablercsbotavailable_idrcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsBotAvailablercsbotavailable_idrcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotAvailable/{rcsbotavailable_id}/rcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableRestController controller = (RcsBotAvailableRestController) context.getBean("RcsBotAvailableRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotAvailablercsbotavailable_idrcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsBotAvailablercsbotavailable_idrcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotAvailable/{rcsbotavailable_id}/rcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableRestController controller = (RcsBotAvailableRestController) context.getBean("RcsBotAvailableRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotAvailablercsbotavailable_idrcsCountryListrcscountrylist_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsBotAvailablercsbotavailable_idrcsCountryListrcscountrylist_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotAvailable/{rcsbotavailable_id}/rcsCountryList/{rcscountrylist_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableRestController controller = (RcsBotAvailableRestController) context.getBean("RcsBotAvailableRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotAvailablercsbotavailable_idrcsCountryListrcscountrylist_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotAvailablercsbotavailable_idrcsCountryListrcscountrylist_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotAvailable/{rcsbotavailable_id}/rcsCountryList/{rcscountrylist_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableRestController controller = (RcsBotAvailableRestController) context.getBean("RcsBotAvailableRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotAvailable()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotAvailable() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotAvailable");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableRestController controller = (RcsBotAvailableRestController) context.getBean("RcsBotAvailableRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotAvailablercsbotavailable_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotAvailablercsbotavailable_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotAvailable/{rcsbotavailable_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableRestController controller = (RcsBotAvailableRestController) context.getBean("RcsBotAvailableRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotAvailable()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsBotAvailable() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotAvailable");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableRestController controller = (RcsBotAvailableRestController) context.getBean("RcsBotAvailableRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotAvailable()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsBotAvailable() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotAvailable");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableRestController controller = (RcsBotAvailableRestController) context.getBean("RcsBotAvailableRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotAvailablercsbotavailable_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsBotAvailablercsbotavailable_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotAvailable/{rcsbotavailable_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableRestController controller = (RcsBotAvailableRestController) context.getBean("RcsBotAvailableRestController");

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