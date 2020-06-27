package com.kirusa.sql;

public class SQLStatements {

	public static final String sqlFindRcsBotByType ="SELECT m2.type,m1.* FROM rcs_bot_type as m1 JOIN rcs_bot_type m2 ON m2.rcs_bot_id=m1.id"
			+ " where m2.type in (:types)"
			+ "order by m2.last_update desc LIMIT :startindex,:limit";
	
	public static final String sqlFindRcsCategory ="SELECT m1.category_name,m2.* FROM rcs_bot_category as m1 JOIN rcs_bot_category_desc m2 ON m2.rcs_bot_category_id=m1.id"
			+ " where m2.lang =:lang";
	
	/*
	 * public static final String sqlBotUpdateSummary =
	 * "SELECT (CASE WHEN de.id IS NULL THEN (SELECT de0.id FROM rcs_bot_update_desc de0 where upd.rcs_bot_id = de0.rcs_bot_update_id AND de0.lang = 'en_US') ELSE de.id END)  AS id,"
	 * +
	 * " (CASE WHEN de.rcs_bot_update_id IS NULL THEN (SELECT de3.rcs_bot_update_id FROM rcs_bot_update_desc de3 where upd.rcs_bot_id = de3.rcs_bot_update_id AND de3.lang = 'en_US') ELSE de.rcs_bot_update_id END)  AS rcs_bot_update_id, "
	 * +
	 * "(CASE WHEN de.lang IS NULL THEN 'en_US' ELSE de.lang END) AS lang, (CASE WHEN de.description IS NULL THEN (SELECT de1.description FROM rcs_bot_update_desc de1 where upd.rcs_bot_id = de1.rcs_bot_update_id AND de1.lang = 'en_US') ELSE de.description END)  AS description, "
	 * +
	 * "(CASE WHEN de.last_update IS NULL THEN (SELECT de2.last_update FROM rcs_bot_update_desc de2 where upd.rcs_bot_id = de2.rcs_bot_update_id AND de2.lang = 'en_US') ELSE de.last_update END)  AS upd_date "
	 * +
	 * "FROM rcs_bot_update upd LEFT OUTER JOIN rcs_bot_update_desc de ON upd.rcs_bot_id = de.rcs_bot_update_id AND de.lang=:language WHERE upd.rcs_bot_id =:botid;"
	 * ;
	 */	

	public static final String sqlBotUpdateSummary = "SELECT (CASE WHEN de.id IS NULL THEN (SELECT de0.id FROM rcs_bot_update_desc de0 where bot.id = de0.rcs_bot_id AND de0.lang = 'en_US') ELSE de.id END) AS id,(CASE WHEN de.rcs_bot_id IS NULL THEN (SELECT de1.rcs_bot_id FROM rcs_bot_update_desc de1 where bot.id = de1.rcs_bot_id AND de1.lang = 'en_US') ELSE de.rcs_bot_id END)  AS rcs_bot_id, (CASE WHEN de.lang IS NULL THEN 'en_US' ELSE de.lang END) AS lang, (CASE WHEN de.description IS NULL THEN (SELECT de2.description FROM rcs_bot_update_desc de2 where bot.id = de2.rcs_bot_id AND de2.lang = 'en_US') ELSE de.description END) AS description, (CASE WHEN de.last_update IS NULL THEN (SELECT de3.last_update FROM rcs_bot_update_desc de3 where bot.id = de3.rcs_bot_id AND de3.lang = 'en_US') ELSE de.last_update END)  AS upd_date FROM rcs_bot bot LEFT OUTER JOIN rcs_bot_update_desc de ON bot.id = de.rcs_bot_id AND de.lang=:language AND de.status =:status WHERE bot.id=:botid";
	
	public static final String sqlFindRcsBotCarrier ="SELECT m2.rcs_bot_id,m1.* FROM rcs_bot_carrier as m1 JOIN rcs_bot_carrier_mapping m2 ON m2.rcs_bot_carrier_id=m1.id"
			+ " where m2.rcs_bot_id =:rcs_bot_id "
			+ "order by m2.last_update desc LIMIT :startindex,:limit";
	
	public static final String sqlFindAllRcsBotCarrier ="SELECT m2.rcs_bot_id,m2.rcs_bot_carrier_id,m1.* FROM rcs_bot_carrier as m1 JOIN rcs_bot_carrier_mapping m2 ON m2.rcs_bot_carrier_id=m1.id "
			+ "order by m2.last_update desc LIMIT :startindex,:limit";
}
