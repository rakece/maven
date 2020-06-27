
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
 * Unit test for the <code>RcsBotAvailableController</code> controller.
 *
 * @see com.kirusa.web.RcsBotAvailableController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsBotAvailableControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editRcsBotAvailableRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotAvailableRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotAvailableRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableController controller = (RcsBotAvailableController) context.getBean("RcsBotAvailableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotAvailableRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotAvailableRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotAvailableRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableController controller = (RcsBotAvailableController) context.getBean("RcsBotAvailableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotAvailableRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotAvailableRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotAvailableRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableController controller = (RcsBotAvailableController) context.getBean("RcsBotAvailableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotAvailableRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotAvailableRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotAvailableRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableController controller = (RcsBotAvailableController) context.getBean("RcsBotAvailableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotAvailableRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotAvailableRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotAvailableRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableController controller = (RcsBotAvailableController) context.getBean("RcsBotAvailableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotAvailableRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotAvailableRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotAvailableRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableController controller = (RcsBotAvailableController) context.getBean("RcsBotAvailableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRcsBotAvailableRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRcsBotAvailableRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRcsBotAvailableRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableController controller = (RcsBotAvailableController) context.getBean("RcsBotAvailableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRcsBotAvailableRcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotAvailableRcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotAvailableRcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableController controller = (RcsBotAvailableController) context.getBean("RcsBotAvailableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotAvailableRcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotAvailableRcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotAvailableRcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableController controller = (RcsBotAvailableController) context.getBean("RcsBotAvailableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotAvailableRcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotAvailableRcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotAvailableRcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableController controller = (RcsBotAvailableController) context.getBean("RcsBotAvailableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotAvailableRcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotAvailableRcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotAvailableRcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableController controller = (RcsBotAvailableController) context.getBean("RcsBotAvailableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotAvailableRcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotAvailableRcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotAvailableRcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableController controller = (RcsBotAvailableController) context.getBean("RcsBotAvailableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotAvailableRcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotAvailableRcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotAvailableRcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableController controller = (RcsBotAvailableController) context.getBean("RcsBotAvailableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRcsBotAvailableRcsCountryList()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRcsBotAvailableRcsCountryList() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRcsBotAvailableRcsCountryList");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableController controller = (RcsBotAvailableController) context.getBean("RcsBotAvailableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexRcsBotAvailable()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexRcsBotAvailable() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexRcsBotAvailable");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableController controller = (RcsBotAvailableController) context.getBean("RcsBotAvailableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotAvailable()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotAvailable() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotAvailable");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableController controller = (RcsBotAvailableController) context.getBean("RcsBotAvailableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRcsBotAvailable()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotAvailable() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotAvailable");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableController controller = (RcsBotAvailableController) context.getBean("RcsBotAvailableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotAvailable()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotAvailable() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotAvailable");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableController controller = (RcsBotAvailableController) context.getBean("RcsBotAvailableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotAvailable()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotAvailable() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotAvailable");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableController controller = (RcsBotAvailableController) context.getBean("RcsBotAvailableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotAvailable()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotAvailable() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotAvailable");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableController controller = (RcsBotAvailableController) context.getBean("RcsBotAvailableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotAvailable()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotAvailable() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotAvailable");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableController controller = (RcsBotAvailableController) context.getBean("RcsBotAvailableController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>rcsbotavailableControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetrcsbotavailableControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/rcsbotavailableController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotAvailableController controller = (RcsBotAvailableController) context.getBean("RcsBotAvailableController");

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