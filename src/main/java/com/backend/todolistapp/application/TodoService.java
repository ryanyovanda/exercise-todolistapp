package com.backend.todolistapp.application;

import com.backend.todolistapp.adapter.dto.GetTodoResponseDTO;
import com.backend.todolistapp.domain.entity.Todo;
import com.backend.todolistapp.domain.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;

    }
    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public List<Todo> getAllTodos() {
        List<Todo> allTodos = todoRepository.findAll();
        return allTodos;
//        return allTodos.stream()
//                .map(todo -> new GetTodoResponseDTO(
//                        todo.getId(),
//                        todo.getTitle(),
//                        todo.getDescription(),
//                        todo.getIsCompleted()
//                ))
//                .collect(Collectors.toList());
    }


    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }

//    public Todo updateTodoStatus(Long id, boolean isCompleted) {
//        Todo todo = todoRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Todo not found"));
//        todo.setCompleted(isCompleted);
//        return todoRepository.save(todo);
//
//    }
}
