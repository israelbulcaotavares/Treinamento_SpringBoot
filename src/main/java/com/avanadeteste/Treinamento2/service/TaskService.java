package com.avanadeteste.Treinamento2.service;

import com.avanadeteste.Treinamento2.model.Task;
import com.avanadeteste.Treinamento2.model.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public Task create(Task task ) {
        task.setCreatedAt( LocalDateTime.now( ) );
        task.setIsCompleted( false );
        task.setCompletedAt( null );
        return this.repository.save( task );
    }

    public List< Task > findAll( ) {
        return repository.findAll( );
    }

    public Task findById( Long id ) {
        return new Task( );
    }

    public void delete( Long id ) {

    }

    public Task update( Task task ) {
        return new Task( );
    }
}