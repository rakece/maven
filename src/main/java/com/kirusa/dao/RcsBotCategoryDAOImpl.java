
package com.kirusa.dao;

import com.kirusa.domain.RcsBot;
import com.kirusa.domain.RcsBotCategory;
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
 * DAO to manage RcsBotCategory entities.
 * 
 */
@Repository("RcsBotCategoryDAO")

@Transactional
public class RcsBotCategoryDAOImpl extends AbstractJpaDao<RcsBotCategory> implements RcsBotCategoryDAO {

	/**
	 * Set of entity classes managed by this DAO. Typically a DAO manages a single
	 * entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(
			Arrays.asList(new Class<?>[] { RcsBotCategory.class }));

	/**
	 * EntityManager injected by Spring for persistence unit
	 * com_mysql_cj_jdbc_Driver
	 *
	 */
	// @PersistenceContext(unitName = "com_mysql_cj_jdbc_Driver")
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Instantiates a new RcsBotCategoryDAOImpl
	 *
	 */
	public RcsBotCategoryDAOImpl() {
		super();
	}

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	private NamedParameterJdbcTemplate namedjdbcTemplate;

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
	 * JPQL Query - findRcsBotCategoryByLastUpdate
	 *
	 */
	@Transactional
	public Set<RcsBotCategory> findRcsBotCategoryByLastUpdate(java.util.Calendar lastUpdate)
			throws DataAccessException {

		return findRcsBotCategoryByLastUpdate(lastUpdate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCategoryByLastUpdate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCategory> findRcsBotCategoryByLastUpdate(java.util.Calendar lastUpdate, int startResult,
			int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCategoryByLastUpdate", startResult, maxRows, lastUpdate);
		return new LinkedHashSet<RcsBotCategory>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCategoryByCreateDate
	 *
	 */
	@Transactional
	public Set<RcsBotCategory> findRcsBotCategoryByCreateDate(java.util.Calendar createDate)
			throws DataAccessException {

		return findRcsBotCategoryByCreateDate(createDate, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCategoryByCreateDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCategory> findRcsBotCategoryByCreateDate(java.util.Calendar createDate, int startResult,
			int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCategoryByCreateDate", startResult, maxRows, createDate);
		return new LinkedHashSet<RcsBotCategory>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCategoryByImageName
	 *
	 */
	@Transactional
	public Set<RcsBotCategory> findRcsBotCategoryByImageName(String imageName) throws DataAccessException {

		return findRcsBotCategoryByImageName(imageName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCategoryByImageName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCategory> findRcsBotCategoryByImageName(String imageName, int startResult, int maxRows)
			throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCategoryByImageName", startResult, maxRows, imageName);
		return new LinkedHashSet<RcsBotCategory>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCategoryByCategoryNameContaining
	 *
	 */
	@Transactional
	public Set<RcsBotCategory> findRcsBotCategoryByCategoryNameContaining(String categoryName)
			throws DataAccessException {

		return findRcsBotCategoryByCategoryNameContaining(categoryName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCategoryByCategoryNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCategory> findRcsBotCategoryByCategoryNameContaining(String categoryName, int startResult,
			int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCategoryByCategoryNameContaining", startResult, maxRows,
				categoryName);
		return new LinkedHashSet<RcsBotCategory>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCategoryById
	 *
	 */
	@Transactional
	public RcsBotCategory findRcsBotCategoryById(Integer id) throws DataAccessException {

		return findRcsBotCategoryById(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCategoryById
	 *
	 */

	@Transactional
	public RcsBotCategory findRcsBotCategoryById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotCategoryById", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotCategory) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotCategoryByImageNameContaining
	 *
	 */
	@Transactional
	public Set<RcsBotCategory> findRcsBotCategoryByImageNameContaining(String imageName) throws DataAccessException {

		return findRcsBotCategoryByImageNameContaining(imageName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCategoryByImageNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCategory> findRcsBotCategoryByImageNameContaining(String imageName, int startResult, int maxRows)
			throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCategoryByImageNameContaining", startResult, maxRows, imageName);
		return new LinkedHashSet<RcsBotCategory>(query.getResultList());
	}

	/**
	 * JPQL Query - findRcsBotCategoryByPrimaryKey
	 *
	 */
	@Transactional
	public RcsBotCategory findRcsBotCategoryByPrimaryKey(Integer id) throws DataAccessException {

		return findRcsBotCategoryByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCategoryByPrimaryKey
	 *
	 */

	@Transactional
	public RcsBotCategory findRcsBotCategoryByPrimaryKey(Integer id, int startResult, int maxRows)
			throws DataAccessException {
		try {
			Query query = createNamedQuery("findRcsBotCategoryByPrimaryKey", startResult, maxRows, id);
			return (com.kirusa.domain.RcsBotCategory) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findRcsBotCategoryByCategoryName
	 *
	 */
	@Transactional
	public Set<RcsBotCategory> findRcsBotCategoryByCategoryName(String categoryName) throws DataAccessException {

		return findRcsBotCategoryByCategoryName(categoryName, -1, -1);
	}

	/**
	 * JPQL Query - findRcsBotCategoryByCategoryName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCategory> findRcsBotCategoryByCategoryName(String categoryName, int startResult, int maxRows)
			throws DataAccessException {
		Query query = createNamedQuery("findRcsBotCategoryByCategoryName", startResult, maxRows, categoryName);
		return new LinkedHashSet<RcsBotCategory>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllRcsBotCategorys
	 *
	 */
	@Transactional
	public Set<RcsBotCategory> findAllRcsBotCategorys() throws DataAccessException {

		return findAllRcsBotCategorys(-1, -1);
	}

	/**
	 * JPQL Query - findAllRcsBotCategorys
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<RcsBotCategory> findAllRcsBotCategorys(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllRcsBotCategorys", startResult, maxRows);
		return new LinkedHashSet<RcsBotCategory>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity
	 * when calling Store
	 * 
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(RcsBotCategory entity) {

		return true;
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<BotWebContent> findRcsCategory(String lang) throws DataAccessException {

		List<BotWebContent> botWebContentlist = null;
		Map<String, Object> pramMap = new HashMap<String, Object>();

		pramMap.put("lang", lang);

		SqlParameterSource namedParameters = new MapSqlParameterSource(pramMap);

		botWebContentlist = this.namedjdbcTemplate.query(SQLStatements.sqlFindRcsCategory, namedParameters,

				new RowMapper<BotWebContent>() {
					public BotWebContent mapRow(ResultSet rs, int rowNum) throws SQLException {
						BotWebContent botWebContent = new BotWebContent();
						botWebContent.setId(rs.getInt("id"));
						botWebContent.setName(rs.getString("category_name"));
						botWebContent.setDisplayName(rs.getString("display_name"));

						return botWebContent;

					}
				});
		return botWebContentlist;
	}
}
