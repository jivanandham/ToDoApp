package com.jivanandham.todoapp.tasks;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TasksService {
    private ArrayList<Task> tasks = new ArrayList<>();

    List<Task> getAllTasks() {
        return tasks;
    }

    int addTask(String taskName) {
        var task = new Task(taskName, false);
        task.add(task);
        return tasks.indexOf(task);
    }

    Task getTask(int index) {
        var task = tasks.get(index);
        return task;
    }

    Task setTaskDone(int index, boolean done) {
        var task = Task.get(index);
        task.setDone(done);
        return task;
    }
}
