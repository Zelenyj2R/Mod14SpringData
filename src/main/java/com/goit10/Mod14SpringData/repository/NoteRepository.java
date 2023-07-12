package com.goit10.Mod14SpringData.repository;

import com.goit10.Mod14SpringData.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}