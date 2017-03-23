package POJO;

//import java.util.EnumSet;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.service.ServiceRegistry;
import org.hibernate.cfg.Configuration;

import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

public class TestCreateTable {

	@Test
	public void TestSchemaExport() {
		// create config object
		Configuration configuration = new Configuration().configure();
		// Service registry
//		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
//				.applySettings(configuration.getProperties()).build();
		// create session factory
//		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		// create session
//		Session session = sessionFactory.getCurrentSession();
		
//		Metadata metadata = new MetadataSources(serviceRegistry).buildMetadata();
		// create SchemaExport
		SchemaExport schemaExport = new SchemaExport(configuration);
//		schemaExport.create(EnumSet.of(TargetType.DATABASE), metadata);
		schemaExport.create(true,true);
	}
}
