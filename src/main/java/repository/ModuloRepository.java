package repository;

import entities.Alumno;
import entities.Modulo;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class ModuloRepository {
	private Session session;

	public ModuloRepository(Session session){
		this.session=session;
	}

	public void save(Modulo modulo){
		session.getTransaction().begin();
		session.save(modulo);
		session.getTransaction().commit();
	}

	public List<Modulo> findAll(){
		session.getTransaction().begin();
		Query<Modulo> query = session.createQuery("FROM Modulo",Modulo.class);
		List<Modulo> alumnos = query.getResultList();
		alumnos.forEach(System.out::println);
		session.getTransaction().commit();
		return alumnos;
	}
}
