
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
 * Unit test for the <code>RcsBotCategoryController</code> controller.
 *
 * @see com.kirusa.web.RcsBotCategoryController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsBotCategoryControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editRcsBotCategoryRcsBots()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotCategoryRcsBots() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotCategoryRcsBots");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotCategoryRcsBots()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotCategoryRcsBots() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotCategoryRcsBots");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotCategoryRcsBots()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotCategoryRcsBots() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotCategoryRcsBots");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotCategoryRcsBots()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotCategoryRcsBots() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotCategoryRcsBots");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotCategoryRcsBots()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotCategoryRcsBots() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotCategoryRcsBots");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotCategoryRcsBots()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotCategoryRcsBots() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotCategoryRcsBots");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRcsBotCategoryRcsBots()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRcsBotCategoryRcsBots() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRcsBotCategoryRcsBots");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRcsBotCategoryRcsBotTagses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotCategoryRcsBotTagses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotCategoryRcsBotTagses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotCategoryRcsBotTagses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotCategoryRcsBotTagses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotCategoryRcsBotTagses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotCategoryRcsBotTagses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotCategoryRcsBotTagses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotCategoryRcsBotTagses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotCategoryRcsBotTagses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotCategoryRcsBotTagses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotCategoryRcsBotTagses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotCategoryRcsBotTagses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotCategoryRcsBotTagses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotCategoryRcsBotTagses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotCategoryRcsBotTagses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotCategoryRcsBotTagses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotCategoryRcsBotTagses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRcsBotCategoryRcsBotTagses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRcsBotCategoryRcsBotTagses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRcsBotCategoryRcsBotTagses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRcsBotCategoryRcsBotCategoryDescs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotCategoryRcsBotCategoryDescs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotCategoryRcsBotCategoryDescs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotCategoryRcsBotCategoryDescs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotCategoryRcsBotCategoryDescs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotCategoryRcsBotCategoryDescs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotCategoryRcsBotCategoryDescs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotCategoryRcsBotCategoryDescs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotCategoryRcsBotCategoryDescs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotCategoryRcsBotCategoryDescs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotCategoryRcsBotCategoryDescs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotCategoryRcsBotCategoryDescs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotCategoryRcsBotCategoryDescs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotCategoryRcsBotCategoryDescs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotCategoryRcsBotCategoryDescs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotCategoryRcsBotCategoryDescs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotCategoryRcsBotCategoryDescs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotCategoryRcsBotCategoryDescs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listRcsBotCategoryRcsBotCategoryDescs()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistRcsBotCategoryRcsBotCategoryDescs() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listRcsBotCategoryRcsBotCategoryDescs");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexRcsBotCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexRcsBotCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexRcsBotCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectRcsBotCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectRcsBotCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectRcsBotCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editRcsBotCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditRcsBotCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editRcsBotCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveRcsBotCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveRcsBotCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveRcsBotCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newRcsBotCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewRcsBotCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newRcsBotCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteRcsBotCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteRcsBotCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteRcsBotCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteRcsBotCategory()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteRcsBotCategory() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteRcsBotCategory");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>rcsbotcategoryControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetrcsbotcategoryControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/rcsbotcategoryController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		RcsBotCategoryController controller = (RcsBotCategoryController) context.getBean("RcsBotCategoryController");

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