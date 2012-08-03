package org.openforis.idreporting.core;
import junit.framework.Assert;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openforis.idreporting.core.DialectAwareJooqFactory;
import org.openforis.idreporting.core.FactoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( locations = {"classpath:test-context.xml"} )
public class DatabaseTest {
	private final Log log = LogFactory.getLog(DatabaseTest.class);
	
	@Autowired
	protected FactoryDao factoryDaox;
	
	@Test
	public void testSetupSuccess() throws Exception {
		Assert.assertNotNull(factoryDaox);
		DialectAwareJooqFactory jf = factoryDaox.getJooqFactory();
		Assert.assertNotNull(jf);
	}
	
}
