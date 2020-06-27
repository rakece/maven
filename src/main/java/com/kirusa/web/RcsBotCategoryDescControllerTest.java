
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
 * Unit test for the <code>RcsBotCategoryDescController</code> controller.
 *
 * @see com.kirusa.web.RcsBotCategoryDescController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsBotCategoryDescControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editRcsBotCategoryDescRcsBotCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotCategoryDescRcsBotCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotCategoryDescRcsBotCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryDescController controller = (RcsBotCategoryDescController) context.getBean("RcsBotCategoryDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotCategoryDescRcsBotCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotCategoryDescRcsBotCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotCategoryDescRcsBotCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryDescController controller = (RcsBotCategoryDescController) context.getBean("RcsBotCategoryDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotCategoryDescRcsBotCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotCategoryDescRcsBotCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotCategoryDescRcsBotCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryDescController controller = (RcsBotCategoryDescController) context.getBean("RcsBotCategoryDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotCategoryDescRcsBotCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotCategoryDescRcsBotCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotCategoryDescRcsBotCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryDescController controller = (RcsBotCategoryDescController) context.getBean("RcsBotCategoryDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotCategoryDescRcsBotCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotCategoryDescRcsBotCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotCategoryDescRcsBotCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryDescController controller = (RcsBotCategoryDescController) context.getBean("RcsBotCategoryDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotCategoryDescRcsBotCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotCategoryDescRcsBotCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotCategoryDescRcsBotCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryDescController controller = (RcsBotCategoryDescController) context.getBean("RcsBotCategoryDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRcsBotCategoryDescRcsBotCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRcsBotCategoryDescRcsBotCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRcsBotCategoryDescRcsBotCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryDescController controller = (RcsBotCategoryDescController) context.getBean("RcsBotCategoryDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexRcsBotCategoryDesc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexRcsBotCategoryDesc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexRcsBotCategoryDesc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryDescController controller = (RcsBotCategoryDescController) context.getBean("RcsBotCategoryDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotCategoryDesc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotCategoryDesc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotCategoryDesc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryDescController controller = (RcsBotCategoryDescController) context.getBean("RcsBotCategoryDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRcsBotCategoryDesc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotCategoryDesc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotCategoryDesc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryDescController controller = (RcsBotCategoryDescController) context.getBean("RcsBotCategoryDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotCategoryDesc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotCategoryDesc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotCategoryDesc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryDescController controller = (RcsBotCategoryDescController) context.getBean("RcsBotCategoryDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotCategoryDesc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotCategoryDesc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotCategoryDesc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryDescController controller = (RcsBotCategoryDescController) context.getBean("RcsBotCategoryDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotCategoryDesc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotCategoryDesc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotCategoryDesc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryDescController controller = (RcsBotCategoryDescController) context.getBean("RcsBotCategoryDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotCategoryDesc()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotCategoryDesc() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotCategoryDesc");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryDescController controller = (RcsBotCategoryDescController) context.getBean("RcsBotCategoryDescController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>rcsbotcategorydescControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetrcsbotcategorydescControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/rcsbotcategorydescController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryDescController controller = (RcsBotCategoryDescController) context.getBean("RcsBotCategoryDescController");

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