package com.example.journal.service;

import com.example.journal.model.JournalEntry;
import com.example.journal.repository.JournalRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class JournalService {

    private final JournalRepository repository;

    public JournalService(JournalRepository repository) {
        this.repository = repository;
    }

    public JournalEntry createEntry(JournalEntry entry) {
        return repository.save(entry);
    }

    public List<JournalEntry> getAllEntries() {
        return repository.findAll();
    }

    public Optional<JournalEntry> getEntryById(Long id) {
        return repository.findById(id);
    }

    public List<JournalEntry> getEntriesByDate(LocalDate date) {
        return repository.findByDate(date);
    }

    public JournalEntry updateEntry(Long id, JournalEntry updatedEntry) {
        return repository.findById(id).map(entry -> {
            entry.setTitle(updatedEntry.getTitle());
            entry.setContent(updatedEntry.getContent());
            entry.setDate(updatedEntry.getDate());
            entry.setTag(updatedEntry.getTag());
            entry.setMood(updatedEntry.getMood());
            return repository.save(entry);
        }).orElse(null);
    }

    public boolean deleteEntry(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
