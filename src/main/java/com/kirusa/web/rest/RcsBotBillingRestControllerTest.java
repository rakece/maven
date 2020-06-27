
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
 * Unit test for the <code>RcsBotBillingRestController</code> controller.
 *
 * @see com.kirusa.web.rest.RcsBotBillingRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsBotBillingRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>RcsBotBillingrcsbotbilling_idrcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotBillingrcsbotbilling_idrcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotBilling/{rcsbotbilling_id}/rcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingRestController controller = (RcsBotBillingRestController) context.getBean("RcsBotBillingRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotBillingrcsbotbilling_idrcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsBotBillingrcsbotbilling_idrcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotBilling/{rcsbotbilling_id}/rcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingRestController controller = (RcsBotBillingRestController) context.getBean("RcsBotBillingRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotBillingrcsbotbilling_idrcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsBotBillingrcsbotbilling_idrcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotBilling/{rcsbotbilling_id}/rcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingRestController controller = (RcsBotBillingRestController) context.getBean("RcsBotBillingRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotBillingrcsbotbilling_idrcsBotUserrcsbotuser_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsBotBillingrcsbotbilling_idrcsBotUserrcsbotuser_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotBilling/{rcsbotbilling_id}/rcsBotUser/{rcsbotuser_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingRestController controller = (RcsBotBillingRestController) context.getBean("RcsBotBillingRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotBillingrcsbotbilling_idrcsBotUserrcsbotuser_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotBillingrcsbotbilling_idrcsBotUserrcsbotuser_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotBilling/{rcsbotbilling_id}/rcsBotUser/{rcsbotuser_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingRestController controller = (RcsBotBillingRestController) context.getBean("RcsBotBillingRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotBillingrcsbotbilling_idrcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotBillingrcsbotbilling_idrcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotBilling/{rcsbotbilling_id}/rcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingRestController controller = (RcsBotBillingRestController) context.getBean("RcsBotBillingRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotBillingrcsbotbilling_idrcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsBotBillingrcsbotbilling_idrcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotBilling/{rcsbotbilling_id}/rcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingRestController controller = (RcsBotBillingRestController) context.getBean("RcsBotBillingRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotBillingrcsbotbilling_idrcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsBotBillingrcsbotbilling_idrcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotBilling/{rcsbotbilling_id}/rcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingRestController controller = (RcsBotBillingRestController) context.getBean("RcsBotBillingRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotBillingrcsbotbilling_idrcsBotrcsbot_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsBotBillingrcsbotbilling_idrcsBotrcsbot_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotBilling/{rcsbotbilling_id}/rcsBot/{rcsbot_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingRestController controller = (RcsBotBillingRestController) context.getBean("RcsBotBillingRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotBillingrcsbotbilling_idrcsBotrcsbot_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotBillingrcsbotbilling_idrcsBotrcsbot_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotBilling/{rcsbotbilling_id}/rcsBot/{rcsbot_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingRestController controller = (RcsBotBillingRestController) context.getBean("RcsBotBillingRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotBilling()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotBilling() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotBilling");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingRestController controller = (RcsBotBillingRestController) context.getBean("RcsBotBillingRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotBillingrcsbotbilling_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotBillingrcsbotbilling_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotBilling/{rcsbotbilling_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingRestController controller = (RcsBotBillingRestController) context.getBean("RcsBotBillingRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotBilling()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsBotBilling() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotBilling");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingRestController controller = (RcsBotBillingRestController) context.getBean("RcsBotBillingRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotBilling()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsBotBilling() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotBilling");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingRestController controller = (RcsBotBillingRestController) context.getBean("RcsBotBillingRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotBillingrcsbotbilling_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsBotBillingrcsbotbilling_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotBilling/{rcsbotbilling_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingRestController controller = (RcsBotBillingRestController) context.getBean("RcsBotBillingRestController");

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