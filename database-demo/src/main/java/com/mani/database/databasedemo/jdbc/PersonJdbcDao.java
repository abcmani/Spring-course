package com.mani.database.databasedemo.jdbc;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mani.database.databasedemo.entity.Person;

@Repository
public class PersonJdbcDao {
	
	@Autowired
	JdbcTemplate jdbctemplate;
	
	
	class PersonRowMapper implements RowMapper<Person>{

		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			Person person=new Person();
			person.setId(rs.getInt("id"));
			person.setName(rs.getString("name"));
			person.setLocation(rs.getString("location"));
			person.setDob(rs.getTimestamp("dob"));
			return person;
		}
		
	}
	
	public List<Person> findAll()
	{
		return jdbctemplate.query("select * from person",
				new PersonRowMapper());
	}
	
	public Person FindById(int id)
	{
		return jdbctemplate.queryForObject
				("select * from person where id=?",  new Object[] { id },
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public List<Person> FindByLoc(String location)
	{
		return  jdbctemplate.query
				("select * from person where location=?",  new Object[] { location },
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	public int DeleteById(int id)
	{
		return jdbctemplate.update
				("delete from person where id=?",  new Object[] { id });
	}
	
	public int Insert(Person person)
	{
		return jdbctemplate.update
				("insert into person (id, name, location , dob)" 
						+"values (?, ?, ?, ?);",  new Object[] { person.getId(),person.getName(),
								person.getLocation(), 
								new Timestamp(person.getDob().getTime())});
	}
	
	public int update(Person person)
	{
		return jdbctemplate.update
				("update person "
						+"set name = ?, location = ? , dob = ?"
						+" where id = ?",
						new Object[] { person.getName(),
								person.getLocation(), 
								new Timestamp(person.getDob().getTime()),person.getId()});
	}

}
