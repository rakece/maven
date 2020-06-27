
package com.kirusa.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;
import com.kirusa.domain.RcsBotAvailable;


/**
 * Class used to test the basic Data Store Functionality
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@Transactional
@ContextConfiguration(locations = {
		"file:./src/main/resources/rcsbotdirectory-security-context.xml",
		"file:./src/main/resources/rcsbotdirectory-service-context.xml",
		"file:./src/main/resources/rcsbotdirectory-dao-context.xml",
		"file:./src/main/resources/rcsbotdirectory-web-context.xml" })
public class RcsBotAvailableDAOTest {
	/**
	 * The DAO being tested, injected by Spring
	 *
	 */
	private RcsBotAvailableDAO dataStore;

	/**
	 * Instantiates a new RcsBotAvailableDAOTest.
	 *
	 */
	public RcsBotAvailableDAOTest() {
	}

	/**
	* Method to test RcsBotAvailable domain object.
	*
	*/
	@Rollback(false)
	@Test
	public void RcsBotAvailable() {
		RcsBotAvailable instance = new RcsBotAvailable();

		// Test create				
		// TODO: Populate instance for create.  The store will fail if the primary key fields are blank.				

		// store the object
		dataStore.store(instance);

		// Test update
		// TODO: Modify non-key domain object values for update

		// update the object
		dataStore.store(instance);

		// Test delete
		dataStore.remove(instance);

	}

	/**
	 * Method to allow Spring to inject the DAO that will be tested
	 *
	*/
	@Autowired
	public void setDataStore(RcsBotAvailableDAO dataStore) {
		this.dataStore = dataStore;
	}
}
