package com.hei_note.gestion.repository;

import com.hei_note.gestion.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findByDateExamen(LocalDate dateExamen);
}
