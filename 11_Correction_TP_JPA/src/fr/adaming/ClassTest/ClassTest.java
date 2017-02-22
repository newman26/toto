package fr.adaming.ClassTest;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import fr.adaming.model.Todo;

public class ClassTest {

	public static void main(String[] args) {
		

		/*
		 * 2- Test d'Association 1-N
		 */

	}

	/*
	 * 1- Methode pour Mise en place de l'environnement
	 */
	public static void ajoterTodo() {

		// Cr�er une fabrique EntityManager (EntityManagerFactory)
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("PU_TP");

		// Cr�er un EntityManager � partir de EntityManagerFactory
		EntityManager em = emf.createEntityManager();

		// Cr�er une EntityTransaction � partir de EntityManager
		EntityTransaction tx = em.getTransaction();

		// Ouvrir la transaction
		tx.begin();

		/*
		 * 1--------- Ajouter Todo
		 */
		// Instanciation d'un Utilisateur
		Todo todo = new Todo("Menage", "Faire le menage");

		// Faire persister l'objet dans l'EntityManager
		em.persist(todo);

		// Commiter la transaxion
		tx.commit();

		/*
		 * 2--------- Recuperer la liste des Todo
		 */

		// Cr�er une requete JPQL
		// Attention, c'est l'entity qui est utilis�e dans la requete, pas la
		// table
		String jpqlRequest = "SELECT t FROM Todo as t";

		Query queryJpql = em.createQuery(jpqlRequest);

		// R�cup�ration du r�sultat de la requ�te
		List<Todo> listeTodos = queryJpql.getResultList();

		// Affichage
		System.out.println("\n----------Liste des Todo----------");

		for (Todo t : listeTodos) {
			System.out.println(t);
		}

		// Fermer les flux
		em.close();
		emf.close();

	}

	/*
	 * 2- Methode d'Association 1-N
	 */
	public static void associationOneToMany() {

		// Cr�er une fabrique EntityManager (EntityManagerFactory)
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("PU_TP");

		// Cr�er un EntityManager � partir de EntityManagerFactory
		EntityManager em = emf.createEntityManager();

		// Cr�er une EntityTransaction � partir de EntityManager
		EntityTransaction tx = em.getTransaction();

		// Ouvrir la transaction
		tx.begin();

		/*
		 * 1--------- Ajouter Todo
		 */
		// Instanciation d'un Utilisateur
		Todo todo = new Todo("Menage", "Faire le menage");

		// Faire persister l'objet dans l'EntityManager
		em.persist(todo);

		// Commiter la transaxion
		tx.commit();
		
		
		

	}

}
