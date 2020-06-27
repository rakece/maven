
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
 * Unit test for the <code>RcsBotUserRestController</code> controller.
 *
 * @see com.kirusa.web.rest.RcsBotUserRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsBotUserRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>RcsBotUserrcsbotuser_idrcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotUserrcsbotuser_idrcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUser/{rcsbotuser_id}/rcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserRestController controller = (RcsBotUserRestController) context.getBean("RcsBotUserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrcsbotuser_idrcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsBotUserrcsbotuser_idrcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUser/{rcsbotuser_id}/rcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserRestController controller = (RcsBotUserRestController) context.getBean("RcsBotUserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrcsbotuser_idrcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsBotUserrcsbotuser_idrcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUser/{rcsbotuser_id}/rcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserRestController controller = (RcsBotUserRestController) context.getBean("RcsBotUserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrcsbotuser_idrcsCountryListrcscountrylist_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsBotUserrcsbotuser_idrcsCountryListrcscountrylist_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUser/{rcsbotuser_id}/rcsCountryList/{rcscountrylist_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserRestController controller = (RcsBotUserRestController) context.getBean("RcsBotUserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrcsbotuser_idrcsCountryListrcscountrylist_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotUserrcsbotuser_idrcsCountryListrcscountrylist_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUser/{rcsbotuser_id}/rcsCountryList/{rcscountrylist_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserRestController controller = (RcsBotUserRestController) context.getBean("RcsBotUserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrcsbotuser_idrcsBots()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotUserrcsbotuser_idrcsBots() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUser/{rcsbotuser_id}/rcsBots");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserRestController controller = (RcsBotUserRestController) context.getBean("RcsBotUserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrcsbotuser_idrcsBots()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsBotUserrcsbotuser_idrcsBots() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUser/{rcsbotuser_id}/rcsBots");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserRestController controller = (RcsBotUserRestController) context.getBean("RcsBotUserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrcsbotuser_idrcsBots()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsBotUserrcsbotuser_idrcsBots() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUser/{rcsbotuser_id}/rcsBots");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserRestController controller = (RcsBotUserRestController) context.getBean("RcsBotUserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrcsbotuser_idrcsBotsrcsbot_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsBotUserrcsbotuser_idrcsBotsrcsbot_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUser/{rcsbotuser_id}/rcsBots/{rcsbot_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserRestController controller = (RcsBotUserRestController) context.getBean("RcsBotUserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrcsbotuser_idrcsBotsrcsbot_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotUserrcsbotuser_idrcsBotsrcsbot_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUser/{rcsbotuser_id}/rcsBots/{rcsbot_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserRestController controller = (RcsBotUserRestController) context.getBean("RcsBotUserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrcsbotuser_idrcsBotBillings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotUserrcsbotuser_idrcsBotBillings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUser/{rcsbotuser_id}/rcsBotBillings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserRestController controller = (RcsBotUserRestController) context.getBean("RcsBotUserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrcsbotuser_idrcsBotBillings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsBotUserrcsbotuser_idrcsBotBillings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUser/{rcsbotuser_id}/rcsBotBillings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserRestController controller = (RcsBotUserRestController) context.getBean("RcsBotUserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrcsbotuser_idrcsBotBillings()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsBotUserrcsbotuser_idrcsBotBillings() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUser/{rcsbotuser_id}/rcsBotBillings");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserRestController controller = (RcsBotUserRestController) context.getBean("RcsBotUserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrcsbotuser_idrcsBotBillingsrcsbotbilling_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsBotUserrcsbotuser_idrcsBotBillingsrcsbotbilling_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUser/{rcsbotuser_id}/rcsBotBillings/{rcsbotbilling_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserRestController controller = (RcsBotUserRestController) context.getBean("RcsBotUserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrcsbotuser_idrcsBotBillingsrcsbotbilling_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotUserrcsbotuser_idrcsBotBillingsrcsbotbilling_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUser/{rcsbotuser_id}/rcsBotBillings/{rcsbotbilling_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserRestController controller = (RcsBotUserRestController) context.getBean("RcsBotUserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrcsbotuser_idrcsBotUserroles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotUserrcsbotuser_idrcsBotUserroles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUser/{rcsbotuser_id}/rcsBotUserroles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserRestController controller = (RcsBotUserRestController) context.getBean("RcsBotUserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrcsbotuser_idrcsBotUserroles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsBotUserrcsbotuser_idrcsBotUserroles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUser/{rcsbotuser_id}/rcsBotUserroles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserRestController controller = (RcsBotUserRestController) context.getBean("RcsBotUserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrcsbotuser_idrcsBotUserroles()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsBotUserrcsbotuser_idrcsBotUserroles() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUser/{rcsbotuser_id}/rcsBotUserroles");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserRestController controller = (RcsBotUserRestController) context.getBean("RcsBotUserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrcsbotuser_idrcsBotUserrolesrcsbotuserrole_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsBotUserrcsbotuser_idrcsBotUserrolesrcsbotuserrole_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUser/{rcsbotuser_id}/rcsBotUserroles/{rcsbotuserrole_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserRestController controller = (RcsBotUserRestController) context.getBean("RcsBotUserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrcsbotuser_idrcsBotUserrolesrcsbotuserrole_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotUserrcsbotuser_idrcsBotUserrolesrcsbotuserrole_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUser/{rcsbotuser_id}/rcsBotUserroles/{rcsbotuserrole_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserRestController controller = (RcsBotUserRestController) context.getBean("RcsBotUserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserRestController controller = (RcsBotUserRestController) context.getBean("RcsBotUserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrcsbotuser_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotUserrcsbotuser_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUser/{rcsbotuser_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserRestController controller = (RcsBotUserRestController) context.getBean("RcsBotUserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserRestController controller = (RcsBotUserRestController) context.getBean("RcsBotUserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserRestController controller = (RcsBotUserRestController) context.getBean("RcsBotUserRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotUserrcsbotuser_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsBotUserrcsbotuser_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotUser/{rcsbotuser_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotUserRestController controller = (RcsBotUserRestController) context.getBean("RcsBotUserRestController");

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