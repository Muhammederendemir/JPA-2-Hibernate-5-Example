import com.entity.Customer;
import com.util.JPAUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import javax.persistence.EntityManager;
import com.entity.Customer;
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