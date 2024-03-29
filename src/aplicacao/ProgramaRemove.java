package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class ProgramaRemove {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 3);
		
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		System.out.println("Removido com sucesso!");
		
		em.close();
		emf.close();

	}

}
