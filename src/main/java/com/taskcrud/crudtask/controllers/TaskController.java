package com.taskcrud.crudtask.controllers;

import com.taskcrud.crudtask.models.TaskModel;
import com.taskcrud.crudtask.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping (value = "/tasks")
    public List<TaskModel> getTasks(){
        return taskRepository.findAll();
    }
    @PostMapping (value = "/task")
    public String createTask(@RequestBody TaskModel taskModel){
        taskRepository.save(taskModel);
        return "Saved Task";
    }
    @GetMapping (value = "/task/{id}")
    public Object getTask(@PathVariable Integer id){
        return taskRepository.findById(id).get();
    }
    @PutMapping (value = "/task/{id}")
    public String updateTask(@PathVariable Integer id, @RequestBody TaskModel taskModel){
        TaskModel updatedTask = taskRepository.findById(id).get();
        updatedTask.setTittle(taskModel.getTittle());
        updatedTask.setDescription(taskModel.getDescription());
        taskRepository.save(updatedTask);
        return "Updated Task Successful";
    }
    @DeleteMapping (value = "/task/{id}")
    public String deleteTask(@PathVariable Integer id){
        TaskModel deletedTask = taskRepository.findById(id).get();
        taskRepository.delete(deletedTask);
        return "Deleted Task Successful";
    }
}
