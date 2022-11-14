package com.hei_note.gestion.repository;

import com.hei_note.gestion.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    Teacher findByNameContainingIgnoreCase(String name);

    Teacher findByFirstNameContaingIgnoreCase(String firstName);
}
