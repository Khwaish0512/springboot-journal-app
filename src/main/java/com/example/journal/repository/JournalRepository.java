package com.example.journal.repository;

import com.example.journal.model.JournalEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface JournalRepository extends JpaRepository<JournalEntry, Long> {
    List<JournalEntry> findByDate(LocalDate date);
}

