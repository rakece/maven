
package com.kirusa.dao;


import com.kirusa.domain.RcsBotUpdateDesc;
import com.kirusa.response.BotDescription;
import com.kirusa.response.BotWebContent;
import com.kirusa.sql.SQLStatements;

import java.sql.ResultSet;
import java.sql.SQLException;
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
 * DAO to manage RcsBotUpdateDesc entities.
 * 
 */
@Repository("RcsBotUpdateDescDAO")

@Transactional
public class RcsBotUpdateDescDAOImpl extends AbstractJpaDao<RcsBotUpdateDesc> implements RcsBotUpdateDescDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			RcsBotUpdateDesc.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_cj_jdbc_Driver
	 *
	 */
	//@PersistenceContext(unitName = "com_mysql_cj_jdbc_Driver")
	@PersistenceContext	
	private EntityManager entityManager;
	
	@Autowired
    JdbcTemplate jdbcTemplate;
	
	@Autowired
    private NamedParameterJdbcTemplate namedjdbcTemplate;
	

	/**
	 * Instantiates a new RcsBotUpdateDescDAOImpl
	 *
	 */
	public RcsBotUpdateDescDAOImpl() {
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
	 * JPQL Query - findRcsBotUpdateDescById
	 *
	 */
	@Transactional
	public RcsBotUpdateDesc findRcsBotUpdateDescById(Integer id) throws DataAccessException {

		return findRcsBotUpdateDescById(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUpdateDescById
	 *
	 */

	@Transactional
	public RcsBotUpdateDesc findRcsBotUpdateDescById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotUpdateDescById", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotUpdateDesc) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotUpdateDescByPrimaryKey
	 *
	 */
	@Transactional
	public RcsBotUpdateDesc findRcsBotUpdateDescByPrimaryKey(Integer id) throws DataAccessException {

		return findRcsBotUpdateDescByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUpdateDescByPrimaryKey
	 *
	 */

	@Transactional
	public RcsBotUpdateDesc findRcsBotUpdateDescByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotUpdateDescByPrimaryKey", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotUpdateDesc) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotUpdateDescByLang
	 *
	 */
	@Transactional
	public Set<RcsBotUpdateDesc> findRcsBotUpdateDescByLang(String lang) throws DataAccessException {

		return findRcsBotUpdateDescByLang(lang, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUpdateDescByLang
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUpdateDesc> findRcsBotUpdateDescByLang(String lang, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUpdateDescByLang", startResult, maxRows, lang);
		return new LinkedHashSet<RcsBotUpdateDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllRcsBotUpdateDescs
	 *
	 */
	@Transactional
	public Set<RcsBotUpdateDesc> findAllRcsBotUpdateDescs() throws DataAccessException {

		return findAllRcsBotUpdateDescs(-1, -1);
	}

	/**
	 * JPQL Query - findAllRcsBotUpdateDescs
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUpdateDesc> findAllRcsBotUpdateDescs(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRcsBotUpdateDescs", startResult, maxRows);
		return new LinkedHashSet<RcsBotUpdateDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUpdateDescByCreateDate
	 *
	 */
	@Transactional
	public Set<RcsBotUpdateDesc> findRcsBotUpdateDescByCreateDate(java.util.Calendar createDate) throws DataAccessException {

		return findRcsBotUpdateDescByCreateDate(createDate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUpdateDescByCreateDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUpdateDesc> findRcsBotUpdateDescByCreateDate(java.util.Calendar createDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUpdateDescByCreateDate", startResult, maxRows, createDate);
		return new LinkedHashSet<RcsBotUpdateDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUpdateDescByDescription
	 *
	 */
	@Transactional
	public Set<RcsBotUpdateDesc> findRcsBotUpdateDescByDescription(String description) throws DataAccessException {

		return findRcsBotUpdateDescByDescription(description, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUpdateDescByDescription
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUpdateDesc> findRcsBotUpdateDescByDescription(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUpdateDescByDescription", startResult, maxRows, description);
		return new LinkedHashSet<RcsBotUpdateDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUpdateDescByLastUpdate
	 *
	 */
	@Transactional
	public Set<RcsBotUpdateDesc> findRcsBotUpdateDescByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException {

		return findRcsBotUpdateDescByLastUpdate(lastUpdate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUpdateDescByLastUpdate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUpdateDesc> findRcsBotUpdateDescByLastUpdate(java.util.Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUpdateDescByLastUpdate", startResult, maxRows, lastUpdate);
		return new LinkedHashSet<RcsBotUpdateDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUpdateDescByDescriptionContaining
	 *
	 */
	@Transactional
	public Set<RcsBotUpdateDesc> findRcsBotUpdateDescByDescriptionContaining(String description) throws DataAccessException {

		return findRcsBotUpdateDescByDescriptionContaining(description, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUpdateDescByDescriptionContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUpdateDesc> findRcsBotUpdateDescByDescriptionContaining(String description, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUpdateDescByDescriptionContaining", startResult, maxRows, description);
		return new LinkedHashSet<RcsBotUpdateDesc>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotUpdateDescByLangContaining
	 *
	 */
	@Transactional
	public Set<RcsBotUpdateDesc> findRcsBotUpdateDescByLangContaining(String lang) throws DataAccessException {

		return findRcsBotUpdateDescByLangContaining(lang, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotUpdateDescByLangContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotUpdateDesc> findRcsBotUpdateDescByLangContaining(String lang, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotUpdateDescByLangContaining", startResult, maxRows, lang);
		return new LinkedHashSet<RcsBotUpdateDesc>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(RcsBotUpdateDesc entity) {
		return true;
	}

	/**
	 * Return Most rcent updated bot description
	 * 
	 */
	@Transactional
	public BotDescription findMostRecentUpdateByRcsBotId(Integer botId, String lang) throws DataAccessException {

		BotDescription botUpdatedesc = null;
		Map<String, Object> pramMap = new HashMap<String, Object>();
		pramMap.put("status", "active");
		pramMap.put("botid", botId);
		pramMap.put("language", lang);
		SqlParameterSource namedParameters = new MapSqlParameterSource(pramMap);

		botUpdatedesc = this.namedjdbcTemplate.queryForObject(SQLStatements.sqlBotUpdateSummary, namedParameters,

				new RowMapper<BotDescription>() {
					public BotDescription mapRow(ResultSet rs, int rowNum) throws SQLException {
						BotDescription botDescription = new BotDescription();
						botDescription.setBotUpadtionDate(rs.getString("upd_date"));
						botDescription.setUpadteDescription(rs.getString("description"));
						return botDescription;
					}
				});
		return botUpdatedesc;
	}
	public void deletebyRcsBotId(Integer botId) 
	{
		String sql = "delete from rcs_bot_update_desc  WHERE rcs_bot_id=:botId";

		Map<String, Object> pramMap = new HashMap<String, Object>();

		pramMap.put("botId", botId);
		
		SqlParameterSource namedParameters = new MapSqlParameterSource(pramMap);
		namedjdbcTemplate.update(sql, namedParameters);
	}
}
