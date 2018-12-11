package util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

  

public class Conexion<T> {
	private Class<T> c;
	private static EntityManager em = null;
	
	public Conexion() {
		em = this.getEm();
	}
	
	public Conexion(Class<T> c) {
		em = this.getEm();
		this.c = c;
	}
	
	public void setC(Class<T> c){
		this.c = c;
	}
	
	public static EntityManager getEm(){
		if ( em == null ) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("becas");
            em = emf.createEntityManager();
        }
		return em;
	}
	
	public <E> T find(E codigo){ //buscar
		
		System.out.println("esta buscandooo el id");
		T object = (T) em.find(c, codigo);
		System.out.println("el objeto es "+ object.toString());
		return object;
	}
	
	
	
	public List<T> list(){
		TypedQuery<T> consulta= em.createNamedQuery(c.getSimpleName()+".findAll", c);
		List<T> lista = (List<T>) consulta.getResultList();
		return lista;
	}
	
	
	public String insert(T o){
		String msn=null;
		try {
			em.getTransaction().begin();
			em.persist(o);
			em.getTransaction().commit();
			msn=" bien....:P";
		} catch (Exception e) {
			e.printStackTrace();
			msn="con error llore";
		}finally {
			//em.close();
		}
		return msn;
		
	}
	
	public void update(T o){ // actualizar
		try {
			System.out.println("entro al try de actualizar");
			em.getTransaction().begin();
			em.merge(o);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("entro al catch de actualizar");
			e.printStackTrace();
		}finally {
			//em.close();
		}
		System.out.println("salio de actualizar...");
	}
	
	public Boolean delete(T o){
		boolean r=false;
		try {
			System.out.println("entro al try de eliminar");
			em.getTransaction().begin();
			em.remove(o);
			em.getTransaction().commit();
			r=true;
		} catch (Exception e) {
			System.out.println("entro al catch de eliminar");
			e.printStackTrace();
		}finally {
			//em.close();
		}
		return r;
		
	}
}
