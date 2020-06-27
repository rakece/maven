
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
 * Unit test for the <code>RcsBotVideoRestController</code> controller.
 *
 * @see com.kirusa.web.rest.RcsBotVideoRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsBotVideoRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>RcsBotVideorcsbotvideo_idrcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotVideorcsbotvideo_idrcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotVideo/{rcsbotvideo_id}/rcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotVideoRestController controller = (RcsBotVideoRestController) context.getBean("RcsBotVideoRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotVideorcsbotvideo_idrcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsBotVideorcsbotvideo_idrcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotVideo/{rcsbotvideo_id}/rcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotVideoRestController controller = (RcsBotVideoRestController) context.getBean("RcsBotVideoRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotVideorcsbotvideo_idrcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsBotVideorcsbotvideo_idrcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotVideo/{rcsbotvideo_id}/rcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotVideoRestController controller = (RcsBotVideoRestController) context.getBean("RcsBotVideoRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotVideorcsbotvideo_idrcsBotrcsbot_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsBotVideorcsbotvideo_idrcsBotrcsbot_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotVideo/{rcsbotvideo_id}/rcsBot/{rcsbot_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotVideoRestController controller = (RcsBotVideoRestController) context.getBean("RcsBotVideoRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotVideorcsbotvideo_idrcsBotrcsbot_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotVideorcsbotvideo_idrcsBotrcsbot_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotVideo/{rcsbotvideo_id}/rcsBot/{rcsbot_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotVideoRestController controller = (RcsBotVideoRestController) context.getBean("RcsBotVideoRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotVideo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotVideo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotVideo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotVideoRestController controller = (RcsBotVideoRestController) context.getBean("RcsBotVideoRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotVideorcsbotvideo_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotVideorcsbotvideo_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotVideo/{rcsbotvideo_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotVideoRestController controller = (RcsBotVideoRestController) context.getBean("RcsBotVideoRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotVideo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsBotVideo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotVideo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotVideoRestController controller = (RcsBotVideoRestController) context.getBean("RcsBotVideoRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotVideo()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsBotVideo() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotVideo");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotVideoRestController controller = (RcsBotVideoRestController) context.getBean("RcsBotVideoRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotVideorcsbotvideo_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsBotVideorcsbotvideo_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotVideo/{rcsbotvideo_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotVideoRestController controller = (RcsBotVideoRestController) context.getBean("RcsBotVideoRestController");

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