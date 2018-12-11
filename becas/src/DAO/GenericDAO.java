package DAO;


import java.util.List;

public  interface GenericDAO<T> {
	public List<T> list();
	public <E> T find(E id);
	public String insert(T o);
	public  void update(T o);
	public Boolean delete(T o);
}
