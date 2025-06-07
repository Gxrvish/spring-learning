package com.tutorial.garvish.Todo_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.garvish.Todo_app.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
