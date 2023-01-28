package com.taskcrud.crudtask.repository;

import com.taskcrud.crudtask.models.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskModel, Integer> {
}
