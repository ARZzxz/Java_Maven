package com.maven.JavaPortofolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.maven.JavaPortofolio.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
