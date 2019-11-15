package com.offcn.dao;

import com.offcn.po.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;


@RepositoryRestResource(path = "as")
public interface PersonRepository extends JpaRepository<Person,Long> {

   Person findByNameIs(String name);

   @Query("select p from Person p where p.name=:name")
   Person findPerson(@Param("name") String name);

   //@RestResource(path = "findbynames")
   //@RestResource(exported = false)
   List<Person> findByNameContains(@Param("name") String name);
}
