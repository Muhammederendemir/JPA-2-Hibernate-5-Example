import com.entity.Customer;
import com.util.JPAUtil;

import javax.persistence.EntityManager;
public class CustomerTest {

    public static void main(String[] args) {

        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

        Customer customer=new Customer();
        customer.setName("Muhammed");
        customer.setAddress("sivas");

        entityManager.persist(customer);
        entityManager.getTransaction().commit();
        entityManager.close();

    }
}