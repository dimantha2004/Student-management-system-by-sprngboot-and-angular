package edu.icet.repository;

import edu.icet.entity.StudentEntity;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <StudentEntity, Integer>{



}
