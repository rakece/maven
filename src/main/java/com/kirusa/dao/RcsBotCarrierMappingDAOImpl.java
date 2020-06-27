
package com.kirusa.dao;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotCarrier;
import com.kirusa.domain.RcsBotCarrierMapping;
import com.kirusa.dto.RcsBotCarrierMappingDTO;
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
 * DAO to manage RcsBotCarrierMapping entities.
 * 
 */
@Repository("RcsBotCarrierMappingDAO")

@Transactional
public class RcsBotCarrierMappingDAOImpl extends AbstractJpaDao<RcsBotCarrierMapping>
		implements RcsBotCarrierMappingDAO {

	/**
	 * Set of entity classes managed by this DAO. Typically a DAO manages a single
	 * entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(
			Arrays.asList(new Class<?>[] { RcsBotCarrierMapping.class }));

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
	 * Instantiates a new RcsBotCarrierMappingDAOImpl
	 *
	 */
	public RcsBotCarrierMappingDAOImpl() {
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
	 * JPQL Query - findRcsBotCarrierMappingById
	 *
	 */
	@Transactional
	public RcsBotCarrierMapping findRcsBotCarrierMappingById(Integer id) throws DataAccessException {

		return findRcsBotCarrierMappingById(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCarrierMappingById
	 *
	 */

	@Transactional
	public RcsBotCarrierMapping findRcsBotCarrierMappingById(Integer id, int startResult, int maxRows)
			throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotCarrierMappingById", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotCarrierMapping) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotCarrierMappingByPrimaryKey
	 *
	 */
	@Transactional
	public RcsBotCarrierMapping findRcsBotCarrierMappingByPrimaryKey(Integer id) throws DataAccessException {

		return findRcsBotCarrierMappingByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCarrierMappingByPrimaryKey
	 *
	 */

	@Transactional
	public RcsBotCarrierMapping findRcsBotCarrierMappingByPrimaryKey(Integer id, int startResult, int maxRows)
			throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotCarrierMappingByPrimaryKey", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotCarrierMapping) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotCarrierMappingByRcsBotCarrierId
	 *
	 */
	@Transactional
	public Set<RcsBotCarrierMapping> findRcsBotCarrierMappingByRcsBotCarrierId(Integer rcsBotCarrierId)
			throws DataAccessException {

		return findRcsBotCarrierMappingByRcsBotCarrierId(rcsBotCarrierId, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCarrierMappingByRcsBotCarrierId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCarrierMapping> findRcsBotCarrierMappingByRcsBotCarrierId(Integer rcsBotCarrierId, int startResult,
			int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCarrierMappingByRcsBotCarrierId", startResult, maxRows,
				rcsBotCarrierId);
		return new LinkedHashSet<RcsBotCarrierMapping>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCarrierMappingByRcsBotId
	 *
	 */
	@Transactional
	public Set<RcsBotCarrierMapping> findRcsBotCarrierMappingByRcsBotId(Integer rcsBotId) throws DataAccessException {

		return findRcsBotCarrierMappingByRcsBotId(rcsBotId, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCarrierMappingByRcsBotId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCarrierMapping> findRcsBotCarrierMappingByRcsBotId(Integer rcsBotId, int startResult, int maxRows)
			throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCarrierMappingByRcsBotId", startResult, maxRows, rcsBotId);
		return new LinkedHashSet<RcsBotCarrierMapping>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllRcsBotCarrierMappings
	 *
	 */
	@Transactional
	public Set<RcsBotCarrierMapping> findAllRcsBotCarrierMappings() throws DataAccessException {

		return findAllRcsBotCarrierMappings(-1, -1);
	}

	/**
	 * JPQL Query - findAllRcsBotCarrierMappings
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCarrierMapping> findAllRcsBotCarrierMappings(int startResult, int maxRows)
			throws DataAccessException {
		Query query = createNamedQuery("findAllRcsBotCarrierMappings", startResult, maxRows);
		return new LinkedHashSet<RcsBotCarrierMapping>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCarrierMappingByCreateDate
	 *
	 */
	@Transactional
	public Set<RcsBotCarrierMapping> findRcsBotCarrierMappingByCreateDate(java.util.Calendar createDate)
			throws DataAccessException {

		return findRcsBotCarrierMappingByCreateDate(createDate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCarrierMappingByCreateDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCarrierMapping> findRcsBotCarrierMappingByCreateDate(java.util.Calendar createDate,
			int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCarrierMappingByCreateDate", startResult, maxRows, createDate);
		return new LinkedHashSet<RcsBotCarrierMapping>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCarrierMappingByLastUpdate
	 *
	 */
	@Transactional
	public Set<RcsBotCarrierMapping> findRcsBotCarrierMappingByLastUpdate(java.util.Calendar lastUpdate)
			throws DataAccessException {

		return findRcsBotCarrierMappingByLastUpdate(lastUpdate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCarrierMappingByLastUpdate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCarrierMapping> findRcsBotCarrierMappingByLastUpdate(java.util.Calendar lastUpdate,
			int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCarrierMappingByLastUpdate", startResult, maxRows, lastUpdate);
		return new LinkedHashSet<RcsBotCarrierMapping>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity
	 * when calling Store
	 * 
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(RcsBotCarrierMapping entity) {
		return true;
	}

	public void deletebyRcsBotId(Integer botId) {
		String sql = "delete from rcs_bot_carrier_mapping  WHERE rcs_bot_id=:botId";

		Map<String, Object> pramMap = new HashMap<String, Object>();

		pramMap.put("botId", botId);

		SqlParameterSource namedParameters = new MapSqlParameterSource(pramMap);
		namedjdbcTemplate.update(sql, namedParameters);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<RcsBotCarrier> findRcsBotCarrierByBotId(Integer rcs_bot_id, int startResult, int maxRows)
			throws DataAccessException {

		List<RcsBotCarrier> carrierList = null;
		Map<String, Object> pramMap = new HashMap<String, Object>();

		pramMap.put("rcs_bot_id", rcs_bot_id);
		pramMap.put("startindex", startResult);
		pramMap.put("limit", maxRows);

		SqlParameterSource namedParameters = new MapSqlParameterSource(pramMap);

		carrierList = this.namedjdbcTemplate.query(SQLStatements.sqlFindRcsBotCarrier, namedParameters,

				new RowMapper<RcsBotCarrier>() {
					public RcsBotCarrier mapRow(ResultSet rs, int rowNum) throws SQLException {
						RcsBotCarrier rcsbot = new RcsBotCarrier();
						rcsbot.setDisplayName(rs.getString("display_name"));
						rcsbot.setDescription(rs.getString("description"));
						rcsbot.setName(rs.getString("name"));
						rcsbot.setRcsCountryId(rs.getInt("rcs_country_id"));
						rcsbot.setId(rs.getInt("id"));
						return rcsbot;

					}
				});
		return carrierList;
	}

	public List<RcsBotCarrierMappingDTO> findAllRcsBotCarrierMappingByRcsBot() {

		List<RcsBotCarrierMappingDTO> carrierList = null;
		Map<String, Object> pramMap = new HashMap<String, Object>();

		pramMap.put("startindex", 0);
		pramMap.put("limit", 10000);

		SqlParameterSource namedParameters = new MapSqlParameterSource(pramMap);

		carrierList = this.namedjdbcTemplate.query(SQLStatements.sqlFindAllRcsBotCarrier, namedParameters,

				new RowMapper<RcsBotCarrierMappingDTO>() {
					public RcsBotCarrierMappingDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
						RcsBotCarrierMappingDTO rcsbot = new RcsBotCarrierMappingDTO();
						rcsbot.setDisplayName(rs.getString("display_name"));
						rcsbot.setDescription(rs.getString("description"));
						rcsbot.setName(rs.getString("name"));
						rcsbot.setRcs_country_id(rs.getInt("rcs_country_id"));
						rcsbot.setRcs_bot_carrier_id(rs.getInt("rcs_bot_carrier_id"));
						rcsbot.setRcs_bot_id(rs.getInt("rcs_bot_id"));
						return rcsbot;

					}
				});
		return carrierList;
		
	}

}
