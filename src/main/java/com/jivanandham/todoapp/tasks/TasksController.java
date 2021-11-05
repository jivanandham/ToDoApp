package com.jivanandham.todoapp.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RequestMapping("/tasks")
@RestController
public class TasksController {

    @Autowired
    TasksService tasksService;

    @GetMapping("/")
    List<Task> getAllTask() {
        return tasksService.getAllTasks();
    }

    @GetMapping("/{id}")
    Task getTaskById(@PathVariable("id") int taskId) {
        return tasksService.getTask(taskId);
    }

    @PostMapping("/")
    Task addNewTask(@RequestBody AddTaskDto body) {
        var index = tasksService.addTask(body.task);
        return tasksService.getTask(index);
    }
}
