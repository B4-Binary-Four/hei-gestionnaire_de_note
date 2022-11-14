package com.hei_note.gestion.repository;

import com.hei_note.gestion.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByNameContainingIgnoreCase(String name);

    Student findByFirstNameContainingIgnoreCase(String firstName);

    Student findByIdReference(String idReference);
}
