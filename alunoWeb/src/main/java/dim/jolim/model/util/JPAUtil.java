package dim.jolim.model.util;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("jolim");  
    
    @Produces   
    @RequestScoped  
    public EntityManager getEntityManager() {  
        return factory.createEntityManager();  
    }  
  
    public void close(@Disposes EntityManager em) {  
        em.close();  
    }  
  

}
