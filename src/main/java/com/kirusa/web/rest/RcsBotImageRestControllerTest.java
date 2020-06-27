
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
 * Unit test for the <code>RcsBotImageRestController</code> controller.
 *
 * @see com.kirusa.web.rest.RcsBotImageRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsBotImageRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>RcsBotImagercsbotimage_idrcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotImagercsbotimage_idrcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotImage/{rcsbotimage_id}/rcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotImageRestController controller = (RcsBotImageRestController) context.getBean("RcsBotImageRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotImagercsbotimage_idrcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsBotImagercsbotimage_idrcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotImage/{rcsbotimage_id}/rcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotImageRestController controller = (RcsBotImageRestController) context.getBean("RcsBotImageRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotImagercsbotimage_idrcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsBotImagercsbotimage_idrcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotImage/{rcsbotimage_id}/rcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotImageRestController controller = (RcsBotImageRestController) context.getBean("RcsBotImageRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotImagercsbotimage_idrcsBotrcsbot_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsBotImagercsbotimage_idrcsBotrcsbot_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotImage/{rcsbotimage_id}/rcsBot/{rcsbot_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotImageRestController controller = (RcsBotImageRestController) context.getBean("RcsBotImageRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotImagercsbotimage_idrcsBotrcsbot_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotImagercsbotimage_idrcsBotrcsbot_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotImage/{rcsbotimage_id}/rcsBot/{rcsbot_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotImageRestController controller = (RcsBotImageRestController) context.getBean("RcsBotImageRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotImage()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotImage() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotImage");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotImageRestController controller = (RcsBotImageRestController) context.getBean("RcsBotImageRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotImagercsbotimage_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotImagercsbotimage_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotImage/{rcsbotimage_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotImageRestController controller = (RcsBotImageRestController) context.getBean("RcsBotImageRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotImage()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsBotImage() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotImage");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotImageRestController controller = (RcsBotImageRestController) context.getBean("RcsBotImageRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotImage()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsBotImage() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotImage");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotImageRestController controller = (RcsBotImageRestController) context.getBean("RcsBotImageRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotImagercsbotimage_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsBotImagercsbotimage_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotImage/{rcsbotimage_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotImageRestController controller = (RcsBotImageRestController) context.getBean("RcsBotImageRestController");

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