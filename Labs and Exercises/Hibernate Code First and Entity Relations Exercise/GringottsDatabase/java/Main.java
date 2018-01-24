import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("example_db");
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();

        em.getTransaction().commit();
        em.close();
    }
}