package com.backend.todolistapp.domain.repository;

//import com.backend.todolistapp.adapter.repository.JpaTodoRepository;
import com.backend.todolistapp.domain.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    Todo save(Todo todo);
    Optional<Todo> findById(Long id);
//    List<Todo> findAll();
    void deleteById(Long id);

}
