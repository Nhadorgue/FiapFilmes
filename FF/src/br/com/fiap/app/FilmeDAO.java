package br.com.fiap.app;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.table.DefaultTableModel;


public class FilmeDAO {

	public void cadastrar(Filme filme) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("filme");
		EntityManager manager = factory.createEntityManager();
		
		manager.persist(filme);
		
	}

}
