package com.hei_note.gestion.repository;

import com.hei_note.gestion.model.Semestre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemestreRepository extends JpaRepository<Semestre, Long> {

}
