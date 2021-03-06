package com.matrix.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matrix.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
