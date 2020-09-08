package hello;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class MessageDao {
  private SessionFactory sessionFactory;

  public MessageDao() {
    setUp();
  }

  private void setUp() {
    final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
    try {
      sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
    } catch (Exception e) {
      e.printStackTrace();
      StandardServiceRegistryBuilder.destroy(registry);
    }
  }

  public void createNewMessage(String text) {
    Session session = sessionFactory.openSession();
    Transaction tx = session.beginTransaction();
    Message message = new Message(text);
    session.save(message);
    tx.commit();
    session.close();
  }
}
