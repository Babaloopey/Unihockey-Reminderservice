package com.unihockeyreminderservice.repositories;

import com.unihockeyreminderservice.models.Training;
import org.springframework.data.repository.CrudRepository;

public interface TrainingRepository extends CrudRepository<Training, Integer> {
}
