package com.avanadeteste.Treinamento2.model.repository;

import com.avanadeteste.Treinamento2.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long > {
}