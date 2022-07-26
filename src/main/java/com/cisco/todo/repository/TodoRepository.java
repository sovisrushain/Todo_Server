package com.cisco.todo.repository;

import com.cisco.todo.dto.TodoDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoDTO, Long> {
}
