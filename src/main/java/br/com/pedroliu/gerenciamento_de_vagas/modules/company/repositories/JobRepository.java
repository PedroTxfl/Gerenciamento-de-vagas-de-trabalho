package br.com.pedroliu.gerenciamento_de_vagas.modules.company.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pedroliu.gerenciamento_de_vagas.modules.company.entities.JobEntity;

public interface JobRepository extends JpaRepository<JobEntity, UUID> {
    
    List<JobEntity> findByDescriptionContainingIgnoreCase(String filter);

}
