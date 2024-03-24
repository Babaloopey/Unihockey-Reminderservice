package com.unihockeyreminderservice.repositories;

import com.unihockeyreminderservice.models.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
