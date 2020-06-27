
package com.kirusa.dao;

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

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotType;
import com.kirusa.sql.SQLStatements;

/**
 * DAO to manage RcsBotType entities.
 * 
 */
@Repository("RcsBotTypeDAO")

@Transactional
public class RcsBotTypeDAOImpl extends AbstractJpaDao<RcsBotType> implements RcsBotTypeDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] {
			RcsBotType.class }));

	/**
	 * EntityManager injected by Spring for persistence unit com_mysql_cj_jdbc_Driver
	 *
	 */
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
    JdbcTemplate jdbcTemplate;
	
	@Autowired
    private NamedParameterJdbcTemplate namedjdbcTemplate;
	

	/**
	 * Instantiates a new RcsBotTypeDAOImpl
	 *
	 */
	public RcsBotTypeDAOImpl() {
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
	 * JPQL Query - findRcsBotTypeByType
	 *
	 */
	@Transactional
	public Set<RcsBotType> findRcsBotTypeByType(String type) throws DataAccessException {

		return findRcsBotTypeByType(type, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotTypeByType
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotType> findRcsBotTypeByType(String type, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotTypeByType", startResult, maxRows, type);
		return new LinkedHashSet<RcsBotType>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotTypeByTypeContaining
	 *
	 */
	@Transactional
	public Set<RcsBotType> findRcsBotTypeByTypeContaining(String type) throws DataAccessException {

		return findRcsBotTypeByTypeContaining(type, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotTypeByTypeContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotType> findRcsBotTypeByTypeContaining(String type, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotTypeByTypeContaining", startResult, maxRows, type);
		return new LinkedHashSet<RcsBotType>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotTypeByCreateDate
	 *
	 */
	@Transactional
	public Set<RcsBotType> findRcsBotTypeByCreateDate(java.util.Calendar createDate) throws DataAccessException {

		return findRcsBotTypeByCreateDate(createDate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotTypeByCreateDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotType> findRcsBotTypeByCreateDate(java.util.Calendar createDate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotTypeByCreateDate", startResult, maxRows, createDate);
		return new LinkedHashSet<RcsBotType>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllRcsBotTypes
	 *
	 */
	@Transactional
	public Set<RcsBotType> findAllRcsBotTypes() throws DataAccessException {

		return findAllRcsBotTypes(-1, -1);
	}

	/**
	 * JPQL Query - findAllRcsBotTypes
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotType> findAllRcsBotTypes(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRcsBotTypes", startResult, maxRows);
		return new LinkedHashSet<RcsBotType>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotTypeByRcsBotCategoryId
	 *
	 */
	@Transactional
	public Set<RcsBotType> findRcsBotTypeByRcsBotCategoryId(Integer rcsBotCategoryId) throws DataAccessException {

		return findRcsBotTypeByRcsBotCategoryId(rcsBotCategoryId, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotTypeByRcsBotCategoryId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotType> findRcsBotTypeByRcsBotCategoryId(Integer rcsBotCategoryId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotTypeByRcsBotCategoryId", startResult, maxRows, rcsBotCategoryId);
		return new LinkedHashSet<RcsBotType>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotTypeById
	 *
	 */
	@Transactional
	public RcsBotType findRcsBotTypeById(Integer id) throws DataAccessException {

		return findRcsBotTypeById(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotTypeById
	 *
	 */

	@Transactional
	public RcsBotType findRcsBotTypeById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotTypeById", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotType) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotTypeByLastUpdate
	 *
	 */
	@Transactional
	public Set<RcsBotType> findRcsBotTypeByLastUpdate(java.util.Calendar lastUpdate) throws DataAccessException {

		return findRcsBotTypeByLastUpdate(lastUpdate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotTypeByLastUpdate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotType> findRcsBotTypeByLastUpdate(java.util.Calendar lastUpdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotTypeByLastUpdate", startResult, maxRows, lastUpdate);
		return new LinkedHashSet<RcsBotType>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotTypeByPrimaryKey
	 *
	 */
	@Transactional
	public RcsBotType findRcsBotTypeByPrimaryKey(Integer id) throws DataAccessException {

		return findRcsBotTypeByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotTypeByPrimaryKey
	 *
	 */

	@Transactional
	public RcsBotType findRcsBotTypeByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotTypeByPrimaryKey", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotType) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotTypeByRcsBotId
	 *
	 */
	@Transactional
	public Set<RcsBotType> findRcsBotTypeByRcsBotId(Integer rcsBotId) throws DataAccessException {

		return findRcsBotTypeByRcsBotId(rcsBotId, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotTypeByRcsBotId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotType> findRcsBotTypeByRcsBotId(Integer rcsBotId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotTypeByRcsBotId", startResult, maxRows, rcsBotId);
		return new LinkedHashSet<RcsBotType>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(RcsBotType entity) {
		return true;
	}
	
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<RcsBot> findRcsBotByType(List<String> type,
			int startResult, int maxRows) throws DataAccessException {
		
		List<RcsBot> userdeviceList=null;
		Map<String, Object> pramMap = new HashMap<String, Object>();
		
		pramMap.put("types", type);
		pramMap.put("startindex", startResult);
		pramMap.put("limit", maxRows);
		
		
		SqlParameterSource namedParameters = new MapSqlParameterSource(pramMap);
		
		userdeviceList = this.namedjdbcTemplate.query(SQLStatements.sqlFindRcsBotByType,namedParameters, 
				
				
				new RowMapper<RcsBot>() {
			public RcsBot mapRow(ResultSet rs, int rowNum)
					throws SQLException {
				RcsBot rcsbot = new RcsBot();
				rcsbot.setType(rs
						.getString("type"));
				rcsbot.setPlatform(rs.getString("platform"));
				
				return rcsbot;
				
			}
		});
		return userdeviceList;
}
	
	public void deletebyRcsBotId(Integer botId) 
	{
		String sql = "delete from rcs_bot_type  WHERE rcs_bot_id=:botId";

		Map<String, Object> pramMap = new HashMap<String, Object>();

		pramMap.put("botId", botId);
		
		SqlParameterSource namedParameters = new MapSqlParameterSource(pramMap);
		namedjdbcTemplate.update(sql, namedParameters);
	}
}
