package com.SpringBoot.TodoList.Service;

import com.SpringBoot.TodoList.Repository.TodoRepository;
import com.SpringBoot.TodoList.model.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {


    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo saveTodos(Todo todo) {
        return todoRepository.save(todo);
    }
}
