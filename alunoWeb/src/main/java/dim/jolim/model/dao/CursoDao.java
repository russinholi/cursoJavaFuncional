package dim.jolim.model.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.jpa.criteria.CriteriaBuilderImpl;

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


	public List<Curso> listarTodosCursos() {
		CriteriaQuery<Curso> query = em.getCriteriaBuilder().createQuery(Curso.class);
		query.from(Curso.class);
		em.createQuery(query);
		return em.createQuery(query).getResultList();
	}


	public Curso buscarPorId(Integer id) {
		return em.find(Curso.class, id);
	}
	
}