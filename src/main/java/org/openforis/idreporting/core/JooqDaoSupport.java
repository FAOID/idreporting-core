package org.openforis.idreporting.core;

import java.sql.Connection;


import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JooqDaoSupport extends JdbcDaoSupport {
	protected DialectAwareJooqFactory getJooqFactory() {
		Connection connection = getConnection();
		return new DialectAwareJooqFactory(connection);
	}
}
