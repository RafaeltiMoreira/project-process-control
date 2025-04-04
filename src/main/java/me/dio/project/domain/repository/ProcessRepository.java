package me.dio.project.domain.repository;

import me.dio.project.domain.model.Process;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProcessRepository extends JpaRepository<Process, String> {
  List<Process> findByStatus(String status);
  List<Process> findByResponsavel(String responsavel);
}
