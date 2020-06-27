
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
 * Unit test for the <code>RcsBotBillingController</code> controller.
 *
 * @see com.kirusa.web.RcsBotBillingController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsBotBillingControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editRcsBotBillingRcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotBillingRcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotBillingRcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingController controller = (RcsBotBillingController) context.getBean("RcsBotBillingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotBillingRcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotBillingRcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotBillingRcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingController controller = (RcsBotBillingController) context.getBean("RcsBotBillingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotBillingRcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotBillingRcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotBillingRcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingController controller = (RcsBotBillingController) context.getBean("RcsBotBillingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotBillingRcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotBillingRcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotBillingRcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingController controller = (RcsBotBillingController) context.getBean("RcsBotBillingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotBillingRcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotBillingRcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotBillingRcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingController controller = (RcsBotBillingController) context.getBean("RcsBotBillingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotBillingRcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotBillingRcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotBillingRcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingController controller = (RcsBotBillingController) context.getBean("RcsBotBillingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRcsBotBillingRcsBotUser()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRcsBotBillingRcsBotUser() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRcsBotBillingRcsBotUser");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingController controller = (RcsBotBillingController) context.getBean("RcsBotBillingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRcsBotBillingRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotBillingRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotBillingRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingController controller = (RcsBotBillingController) context.getBean("RcsBotBillingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotBillingRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotBillingRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotBillingRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingController controller = (RcsBotBillingController) context.getBean("RcsBotBillingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotBillingRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotBillingRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotBillingRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingController controller = (RcsBotBillingController) context.getBean("RcsBotBillingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotBillingRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotBillingRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotBillingRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingController controller = (RcsBotBillingController) context.getBean("RcsBotBillingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotBillingRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotBillingRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotBillingRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingController controller = (RcsBotBillingController) context.getBean("RcsBotBillingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotBillingRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotBillingRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotBillingRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingController controller = (RcsBotBillingController) context.getBean("RcsBotBillingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRcsBotBillingRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRcsBotBillingRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRcsBotBillingRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingController controller = (RcsBotBillingController) context.getBean("RcsBotBillingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexRcsBotBilling()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexRcsBotBilling() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexRcsBotBilling");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingController controller = (RcsBotBillingController) context.getBean("RcsBotBillingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotBilling()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotBilling() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotBilling");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingController controller = (RcsBotBillingController) context.getBean("RcsBotBillingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRcsBotBilling()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotBilling() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotBilling");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingController controller = (RcsBotBillingController) context.getBean("RcsBotBillingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotBilling()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotBilling() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotBilling");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingController controller = (RcsBotBillingController) context.getBean("RcsBotBillingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotBilling()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotBilling() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotBilling");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingController controller = (RcsBotBillingController) context.getBean("RcsBotBillingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotBilling()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotBilling() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotBilling");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingController controller = (RcsBotBillingController) context.getBean("RcsBotBillingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotBilling()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotBilling() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotBilling");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingController controller = (RcsBotBillingController) context.getBean("RcsBotBillingController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>rcsbotbillingControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetrcsbotbillingControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/rcsbotbillingController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotBillingController controller = (RcsBotBillingController) context.getBean("RcsBotBillingController");

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