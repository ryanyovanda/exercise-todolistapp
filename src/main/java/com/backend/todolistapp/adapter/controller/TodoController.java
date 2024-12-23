package com.backend.todolistapp.adapter.controller;

import com.backend.todolistapp.adapter.dto.GetTodoResponseDTO;
import com.backend.todolistapp.application.TodoService;
import com.backend.todolistapp.domain.entity.Todo;
import jakarta.validation.Valid;
import org.hibernate.annotations.ValueGenerationType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/todos")
public class TodoController {
    private final TodoService todoService;
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public ResponseEntity<Todo> createTodo(@Valid @RequestBody Todo todo) {

        Todo savedTodo = todoService.createTodo(todo);
        return ResponseEntity.ok(savedTodo);
    }

    @GetMapping
    public ResponseEntity<?> getAllTodos() {
        List<Todo> todos = todoService.getAllTodos();
        return ResponseEntity.ok("success");
    }

//    @PutMapping("/{id}/status")
//    public ResponseEntity<Todo> updateTodoStatus(@PathVariable Long id, @RequestParam boolean isCompleted) {
//        return ResponseEntity.ok(todoService.updateTodoStatus(id, isCompleted));
//    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
        return ResponseEntity.noContent().build();
    }

}
