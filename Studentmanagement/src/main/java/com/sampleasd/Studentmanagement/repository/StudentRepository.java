package com.sampleasd.Studentmanagement.repository;

import com.sampleasd.Studentmanagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
