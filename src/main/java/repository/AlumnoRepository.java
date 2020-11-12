package repository;

import entities.Alumno;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class AlumnoRepository {
	private Session session;

	public AlumnoRepository(Session session){
		this.session=session;
	}

	public void save(Alumno alumno){
		session.getTransaction().begin();
		session.save(alumno);
		session.getTransaction().commit();
	}

	public List<Alumno> findAll(){
		session.getTransaction().begin();
		Query<Alumno> query = session.createQuery("FROM alumnos",Alumno.class);
		List<Alumno> alumnos = query.getResultList();
		alumnos.forEach(System.out::println);
		session.getTransaction().commit();
		return alumnos;
	}
	public Alumno findOneByid(long id){
		session.getTransaction().begin();
		Query<Alumno> query = session.createQuery("FROM alumnos a where a.alumnoId = :alumnoId",Alumno.class);
		query.setParameter("alumnoId",id);
		Alumno alumno = query.getSingleResult();
		System.out.println(alumno);
		session.getTransaction().commit();
		return alumno;
	}

	public void delete(Alumno alumno){
		session.getTransaction().begin();
		session.delete(alumno);
		session.getTransaction().commit();
	}
}
