
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
 * Unit test for the <code>RcsBotTagsRestController</code> controller.
 *
 * @see com.kirusa.web.rest.RcsBotTagsRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsBotTagsRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>RcsBotTagsrcsbottags_idrcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotTagsrcsbottags_idrcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotTags/{rcsbottags_id}/rcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsRestController controller = (RcsBotTagsRestController) context.getBean("RcsBotTagsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotTagsrcsbottags_idrcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsBotTagsrcsbottags_idrcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotTags/{rcsbottags_id}/rcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsRestController controller = (RcsBotTagsRestController) context.getBean("RcsBotTagsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotTagsrcsbottags_idrcsBot()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsBotTagsrcsbottags_idrcsBot() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotTags/{rcsbottags_id}/rcsBot");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsRestController controller = (RcsBotTagsRestController) context.getBean("RcsBotTagsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotTagsrcsbottags_idrcsBotrcsbot_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsBotTagsrcsbottags_idrcsBotrcsbot_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotTags/{rcsbottags_id}/rcsBot/{rcsbot_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsRestController controller = (RcsBotTagsRestController) context.getBean("RcsBotTagsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotTagsrcsbottags_idrcsBotrcsbot_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotTagsrcsbottags_idrcsBotrcsbot_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotTags/{rcsbottags_id}/rcsBot/{rcsbot_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsRestController controller = (RcsBotTagsRestController) context.getBean("RcsBotTagsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotTagsrcsbottags_idrcsBotCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotTagsrcsbottags_idrcsBotCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotTags/{rcsbottags_id}/rcsBotCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsRestController controller = (RcsBotTagsRestController) context.getBean("RcsBotTagsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotTagsrcsbottags_idrcsBotCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsBotTagsrcsbottags_idrcsBotCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotTags/{rcsbottags_id}/rcsBotCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsRestController controller = (RcsBotTagsRestController) context.getBean("RcsBotTagsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotTagsrcsbottags_idrcsBotCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsBotTagsrcsbottags_idrcsBotCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotTags/{rcsbottags_id}/rcsBotCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsRestController controller = (RcsBotTagsRestController) context.getBean("RcsBotTagsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotTagsrcsbottags_idrcsBotCategoryrcsbotcategory_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsBotTagsrcsbottags_idrcsBotCategoryrcsbotcategory_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotTags/{rcsbottags_id}/rcsBotCategory/{rcsbotcategory_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsRestController controller = (RcsBotTagsRestController) context.getBean("RcsBotTagsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotTagsrcsbottags_idrcsBotCategoryrcsbotcategory_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotTagsrcsbottags_idrcsBotCategoryrcsbotcategory_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotTags/{rcsbottags_id}/rcsBotCategory/{rcsbotcategory_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsRestController controller = (RcsBotTagsRestController) context.getBean("RcsBotTagsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotTags()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotTags() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotTags");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsRestController controller = (RcsBotTagsRestController) context.getBean("RcsBotTagsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotTagsrcsbottags_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetRcsBotTagsrcsbottags_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotTags/{rcsbottags_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsRestController controller = (RcsBotTagsRestController) context.getBean("RcsBotTagsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotTags()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutRcsBotTags() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotTags");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsRestController controller = (RcsBotTagsRestController) context.getBean("RcsBotTagsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotTags()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostRcsBotTags() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotTags");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsRestController controller = (RcsBotTagsRestController) context.getBean("RcsBotTagsRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>RcsBotTagsrcsbottags_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteRcsBotTagsrcsbottags_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/RcsBotTags/{rcsbottags_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotTagsRestController controller = (RcsBotTagsRestController) context.getBean("RcsBotTagsRestController");

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