package com.example.journal.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class JournalEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private String tag;   // optional
    private Integer mood; // optional, 1–5

    public JournalEntry() {}

    public JournalEntry(String title, String content, LocalDate date, String tag, Integer mood) {
        this.title = title;
        this.content = content;
        this.date = date;
        this.tag = tag;
        this.mood = mood;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getTag() { return tag; }
    public void setTag(String tag) { this.tag = tag; }

    public Integer getMood() { return mood; }
    public void setMood(Integer mood) { this.mood = mood; }
}
