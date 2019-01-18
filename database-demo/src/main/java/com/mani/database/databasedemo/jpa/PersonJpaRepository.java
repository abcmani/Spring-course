package com.mani.database.databasedemo.jpa;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mani.database.databasedemo.entity.Person;

//Repository
//Transaction

@Repository
@Transactional
public class PersonJpaRepository {
	
	
	//connect to the database
	@PersistenceContext
	EntityManager entityManager;
	
	public List<Person> findAll()
	{
		TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons", Person.class);
		return  namedQuery.getResultList();
	}
	
	public Person FindById(int id)
	{
		return entityManager.find(Person.class, id); //JPA
	}
	
	public Person update(Person person)
	{
		return entityManager.merge(person);
	}
	
	public Person insert(Person person)
	{
		return entityManager.merge(person);
	}
	
	
	public void deleteById(int id)
	{
		Person person= FindById(id);
		entityManager.remove(person);
	}

}
