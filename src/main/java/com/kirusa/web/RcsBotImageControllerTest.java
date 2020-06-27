
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
 * Unit test for the <code>RcsBotImageController</code> controller.
 *
 * @see com.kirusa.web.RcsBotImageController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsBotImageControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editRcsBotImageRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotImageRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotImageRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotImageController controller = (RcsBotImageController) context.getBean("RcsBotImageController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotImageRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotImageRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotImageRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotImageController controller = (RcsBotImageController) context.getBean("RcsBotImageController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotImageRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotImageRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotImageRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotImageController controller = (RcsBotImageController) context.getBean("RcsBotImageController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotImageRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotImageRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotImageRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotImageController controller = (RcsBotImageController) context.getBean("RcsBotImageController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotImageRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotImageRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotImageRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotImageController controller = (RcsBotImageController) context.getBean("RcsBotImageController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotImageRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotImageRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotImageRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotImageController controller = (RcsBotImageController) context.getBean("RcsBotImageController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRcsBotImageRcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRcsBotImageRcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRcsBotImageRcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotImageController controller = (RcsBotImageController) context.getBean("RcsBotImageController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexRcsBotImage()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexRcsBotImage() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexRcsBotImage");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotImageController controller = (RcsBotImageController) context.getBean("RcsBotImageController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotImage()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotImage() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotImage");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotImageController controller = (RcsBotImageController) context.getBean("RcsBotImageController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRcsBotImage()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotImage() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotImage");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotImageController controller = (RcsBotImageController) context.getBean("RcsBotImageController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotImage()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotImage() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotImage");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotImageController controller = (RcsBotImageController) context.getBean("RcsBotImageController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotImage()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotImage() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotImage");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotImageController controller = (RcsBotImageController) context.getBean("RcsBotImageController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotImage()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotImage() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotImage");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotImageController controller = (RcsBotImageController) context.getBean("RcsBotImageController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotImage()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotImage() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotImage");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotImageController controller = (RcsBotImageController) context.getBean("RcsBotImageController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>rcsbotimageControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetrcsbotimageControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/rcsbotimageController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotImageController controller = (RcsBotImageController) context.getBean("RcsBotImageController");

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