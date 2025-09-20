package com.example.journal.controller;

import com.example.journal.model.JournalEntry;
import com.example.journal.service.JournalService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/entries")
public class JournalController {

    private final JournalService service;

    public JournalController(JournalService service) {
        this.service = service;
    }

    @PostMapping
    public JournalEntry createEntry(@RequestBody JournalEntry entry) {
        return service.createEntry(entry);
    }

    @GetMapping
    public List<JournalEntry> getAllEntries() {
        return service.getAllEntries();
    }

    @GetMapping("/{id}")
    public Optional<JournalEntry> getEntryById(@PathVariable Long id) {
        return service.getEntryById(id);
    }

    @GetMapping("/date/{date}")
    public List<JournalEntry> getEntriesByDate(@PathVariable String date) {
        return service.getEntriesByDate(LocalDate.parse(date));
    }

    @PutMapping("/{id}")
    public JournalEntry updateEntry(@PathVariable Long id, @RequestBody JournalEntry entry) {
        return service.updateEntry(id, entry);
    }

    @DeleteMapping("/{id}")
    public String deleteEntry(@PathVariable Long id) {
        return service.deleteEntry(id) ? "Deleted successfully" : "Entry not found";
    }
}
