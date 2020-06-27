
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
 * Unit test for the <code>RcsBotCategoryRestController</code> controller.
 *
 * @see com.kirusa.web.rest.RcsBotCategoryRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsBotCategoryRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>RcsBotCategoryrcsbotcategory_idrcsBots()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotCategoryrcsbotcategory_idrcsBots() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotCategory/{rcsbotcategory_id}/rcsBots");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryRestController controller = (RcsBotCategoryRestController) context.getBean("RcsBotCategoryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotCategoryrcsbotcategory_idrcsBots()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsBotCategoryrcsbotcategory_idrcsBots() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotCategory/{rcsbotcategory_id}/rcsBots");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryRestController controller = (RcsBotCategoryRestController) context.getBean("RcsBotCategoryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotCategoryrcsbotcategory_idrcsBots()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsBotCategoryrcsbotcategory_idrcsBots() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotCategory/{rcsbotcategory_id}/rcsBots");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryRestController controller = (RcsBotCategoryRestController) context.getBean("RcsBotCategoryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotCategoryrcsbotcategory_idrcsBotsrcsbot_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsBotCategoryrcsbotcategory_idrcsBotsrcsbot_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotCategory/{rcsbotcategory_id}/rcsBots/{rcsbot_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryRestController controller = (RcsBotCategoryRestController) context.getBean("RcsBotCategoryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotCategoryrcsbotcategory_idrcsBotsrcsbot_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotCategoryrcsbotcategory_idrcsBotsrcsbot_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotCategory/{rcsbotcategory_id}/rcsBots/{rcsbot_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryRestController controller = (RcsBotCategoryRestController) context.getBean("RcsBotCategoryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotCategoryrcsbotcategory_idrcsBotTagses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotCategoryrcsbotcategory_idrcsBotTagses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotCategory/{rcsbotcategory_id}/rcsBotTagses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryRestController controller = (RcsBotCategoryRestController) context.getBean("RcsBotCategoryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotCategoryrcsbotcategory_idrcsBotTagses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsBotCategoryrcsbotcategory_idrcsBotTagses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotCategory/{rcsbotcategory_id}/rcsBotTagses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryRestController controller = (RcsBotCategoryRestController) context.getBean("RcsBotCategoryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotCategoryrcsbotcategory_idrcsBotTagses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsBotCategoryrcsbotcategory_idrcsBotTagses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotCategory/{rcsbotcategory_id}/rcsBotTagses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryRestController controller = (RcsBotCategoryRestController) context.getBean("RcsBotCategoryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotCategoryrcsbotcategory_idrcsBotTagsesrcsbottags_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsBotCategoryrcsbotcategory_idrcsBotTagsesrcsbottags_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotCategory/{rcsbotcategory_id}/rcsBotTagses/{rcsbottags_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryRestController controller = (RcsBotCategoryRestController) context.getBean("RcsBotCategoryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotCategoryrcsbotcategory_idrcsBotTagsesrcsbottags_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotCategoryrcsbotcategory_idrcsBotTagsesrcsbottags_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotCategory/{rcsbotcategory_id}/rcsBotTagses/{rcsbottags_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryRestController controller = (RcsBotCategoryRestController) context.getBean("RcsBotCategoryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotCategoryrcsbotcategory_idrcsBotCategoryDescs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotCategoryrcsbotcategory_idrcsBotCategoryDescs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotCategory/{rcsbotcategory_id}/rcsBotCategoryDescs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryRestController controller = (RcsBotCategoryRestController) context.getBean("RcsBotCategoryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotCategoryrcsbotcategory_idrcsBotCategoryDescs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsBotCategoryrcsbotcategory_idrcsBotCategoryDescs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotCategory/{rcsbotcategory_id}/rcsBotCategoryDescs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryRestController controller = (RcsBotCategoryRestController) context.getBean("RcsBotCategoryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotCategoryrcsbotcategory_idrcsBotCategoryDescs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsBotCategoryrcsbotcategory_idrcsBotCategoryDescs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotCategory/{rcsbotcategory_id}/rcsBotCategoryDescs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryRestController controller = (RcsBotCategoryRestController) context.getBean("RcsBotCategoryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotCategoryrcsbotcategory_idrcsBotCategoryDescsrcsbotcategorydesc_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsBotCategoryrcsbotcategory_idrcsBotCategoryDescsrcsbotcategorydesc_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotCategory/{rcsbotcategory_id}/rcsBotCategoryDescs/{rcsbotcategorydesc_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryRestController controller = (RcsBotCategoryRestController) context.getBean("RcsBotCategoryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotCategoryrcsbotcategory_idrcsBotCategoryDescsrcsbotcategorydesc_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotCategoryrcsbotcategory_idrcsBotCategoryDescsrcsbotcategorydesc_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotCategory/{rcsbotcategory_id}/rcsBotCategoryDescs/{rcsbotcategorydesc_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryRestController controller = (RcsBotCategoryRestController) context.getBean("RcsBotCategoryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryRestController controller = (RcsBotCategoryRestController) context.getBean("RcsBotCategoryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotCategoryrcsbotcategory_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotCategoryrcsbotcategory_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotCategory/{rcsbotcategory_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryRestController controller = (RcsBotCategoryRestController) context.getBean("RcsBotCategoryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsBotCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryRestController controller = (RcsBotCategoryRestController) context.getBean("RcsBotCategoryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsBotCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryRestController controller = (RcsBotCategoryRestController) context.getBean("RcsBotCategoryRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotCategoryrcsbotcategory_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsBotCategoryrcsbotcategory_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotCategory/{rcsbotcategory_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryRestController controller = (RcsBotCategoryRestController) context.getBean("RcsBotCategoryRestController");

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