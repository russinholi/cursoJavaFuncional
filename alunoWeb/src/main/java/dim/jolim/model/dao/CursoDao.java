package dim.jolim.model.dao;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import dim.jolim.model.Curso;

@Stateless
public class CursoDao {

	@Inject
	private EntityManager em;
	
	
	public Curso salvar(Curso curso) {
		em.getTransaction().begin();  
		if (curso.getId() == null) {
			em.persist(curso);
		}
		em.flush();
		em.getTransaction().commit();  
		return curso;
	}
	
}