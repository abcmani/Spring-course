package com.mani.database.databasedemo.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mani.database.databasedemo.entity.Person;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer>{

}
