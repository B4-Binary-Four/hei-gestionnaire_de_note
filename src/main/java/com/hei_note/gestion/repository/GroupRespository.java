package com.hei_note.gestion.repository;

import com.hei_note.gestion.model.Group_2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRespository extends JpaRepository<Group_2, Long> {
    Group_2 findByNameGroup(String name);
}
