import config.HibernateUtil;
import entities.Alumno;
import entities.Modulo;
import org.hibernate.Session;
import repository.AlumnoRepository;
import repository.ModuloRepository;

public class Main {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		AlumnoRepository alumnoRepository = new AlumnoRepository(session);
		alumnoRepository.save(new Alumno("Alvaro",27));
		alumnoRepository.save(new Alumno("Alvaro",27));
		alumnoRepository.save(new Alumno("Alvaro",27));
		alumnoRepository.save(new Alumno("Alvaro",27));
		alumnoRepository.save(new Alumno("Alvaro",27));
		alumnoRepository.save(new Alumno("Alvaro",27));
		//alumnoRepository.findAll();
		alumnoRepository.delete(alumnoRepository.findOneByid(3));
		ModuloRepository moduloRepository = new ModuloRepository(session);
		moduloRepository.save(new Modulo("Acceso a datos","M06"));
		moduloRepository.save(new Modulo("Acceso a datos","M06"));
		moduloRepository.save(new Modulo("Acceso a datos","M06"));
		moduloRepository.save(new Modulo("Acceso a datos","M06"));
		moduloRepository.save(new Modulo("Acceso a datos","M06"));
		moduloRepository.save(new Modulo("Acceso a datos","M06"));
		//moduloRepository.findAll();
		session.close();
	}
}
