package com.SpringBoot.TodoList.Controller;

import com.SpringBoot.TodoList.Service.TodoService;
import com.SpringBoot.TodoList.model.Todo;
import com.sun.istack.NotNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/todo")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/")
    public String welcome(){
        return "<html><body>" +
                 "<h1>WELCOME</h1>" +
                                "</body></html>";
    }

    @GetMapping
    public List<Todo> getAllTodos(){
        return todoService.getAllTodos();
    }

    @PostMapping
    public Todo save(@NotNull @RequestBody Todo todo){
        return todoService.saveTodos(todo);
    }


}
