
package com.kirusa.dao;

import com.kirusa.domain.RcsBotAvailable;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage RcsBotAvailable entities.
 * 
 */
@Repository("RcsBotAvailableDAO")

@Transactional
public class RcsBotAvailableDAOImpl extends AbstractJpaDao<RcsBotAvailable> implements RcsBotAvailableDAO {

	/**
	 * Set of entity classes managed by this DAO. Typically a DAO manages a single
	 * entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(
			Arrays.asList(new Class<?>[] { RcsBotAvailable.class }));

	/**
	 * EntityManager injected by Spring for persistence unit
	 * com_mysql_cj_jdbc_Driver
	 *
	 */

	// @PersistenceContext(unitName = "com_mysql_cj_jdbc_Driver")
	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
    private NamedParameterJdbcTemplate namedjdbcTemplate;
	

	/**
	 * Instantiates a new RcsBotAvailableDAOImpl
	 *
	 */
	public RcsBotAvailableDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findRcsBotAvailableByPrimaryKey
	 *
	 */
	@Transactional
	public RcsBotAvailable findRcsBotAvailableByPrimaryKey(Integer id) throws DataAccessException {

		return findRcsBotAvailableByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotAvailableByPrimaryKey
	 *
	 */

	@Transactional
	public RcsBotAvailable findRcsBotAvailableByPrimaryKey(Integer id, int startResult, int maxRows)
			throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotAvailableByPrimaryKey", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotAvailable) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotAvailableByCreateDate
	 *
	 */
	@Transactional
	public Set<RcsBotAvailable> findRcsBotAvailableByCreateDate(java.util.Calendar createDate)
			throws DataAccessException {

		return findRcsBotAvailableByCreateDate(createDate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotAvailableByCreateDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotAvailable> findRcsBotAvailableByCreateDate(java.util.Calendar createDate, int startResult,
			int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotAvailableByCreateDate", startResult, maxRows, createDate);
		return new LinkedHashSet<RcsBotAvailable>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotAvailableByLastUpdate
	 *
	 */
	@Transactional
	public Set<RcsBotAvailable> findRcsBotAvailableByLastUpdate(java.util.Calendar lastUpdate)
			throws DataAccessException {

		return findRcsBotAvailableByLastUpdate(lastUpdate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotAvailableByLastUpdate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotAvailable> findRcsBotAvailableByLastUpdate(java.util.Calendar lastUpdate, int startResult,
			int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotAvailableByLastUpdate", startResult, maxRows, lastUpdate);
		return new LinkedHashSet<RcsBotAvailable>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllRcsBotAvailables
	 *
	 */
	@Transactional
	public Set<RcsBotAvailable> findAllRcsBotAvailables() throws DataAccessException {

		return findAllRcsBotAvailables(-1, -1);
	}

	/**
	 * JPQL Query - findAllRcsBotAvailables
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotAvailable> findAllRcsBotAvailables(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRcsBotAvailables", startResult, maxRows);
		return new LinkedHashSet<RcsBotAvailable>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotAvailableById
	 *
	 */
	@Transactional
	public RcsBotAvailable findRcsBotAvailableById(Integer id) throws DataAccessException {

		return findRcsBotAvailableById(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotAvailableById
	 *
	 */

	@Transactional
	public RcsBotAvailable findRcsBotAvailableById(Integer id, int startResult, int maxRows)
			throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotAvailableById", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotAvailable) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity
	 * when calling Store
	 * 
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(RcsBotAvailable entity) {
		return true;
	}

	public void deletebyRcsBotId(Integer botId) {
		String sql = "delete from rcs_bot_available  WHERE rcs_bot_id=:botId";

		Map<String, Object> pramMap = new HashMap<String, Object>();

		pramMap.put("botId", botId);

		SqlParameterSource namedParameters = new MapSqlParameterSource(pramMap);
		namedjdbcTemplate.update(sql, namedParameters);
	}

	@Override
	public RcsBotAvailable findRcsBotAvailableByRcsBotId(Integer rcs_bot_id) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> findRcsBotAvailableByRcsBotCountryId(Integer countryId) throws DataAccessException {
		
		String sql = "SELECT rcs_bot_id FROM rcs_bot_available where rcs_country_id=:countryId";
		
		final List<Integer> idsList = new ArrayList<Integer>();
		Map<String, Object> pramMap = new HashMap<String, Object>();
		pramMap.put("countryId", countryId);

		SqlParameterSource namedParameters = new MapSqlParameterSource(pramMap);

		this.namedjdbcTemplate.query(sql, namedParameters,

				new RowMapper<Integer>() {
					public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
						Integer botId = rs.getInt("rcs_bot_id");
						idsList.add(botId);
						return botId;
					}
				});
		
		return idsList;
	}
}
