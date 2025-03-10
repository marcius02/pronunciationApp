package dev.pronunciationAppBack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class LevelWord {
    @Id
    private String id;
    private int number;
    private String name;
    private int requiredScore;
    private boolean isBlocked;

    @OneToMany(mappedBy = "levelWord")
    private List<Word> words;

    public LevelWord() {}

    public LevelWord(String id, int number, String name, int requiredScore, boolean isBlocked) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.requiredScore = requiredScore;
        this.isBlocked = isBlocked;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRequiredScore() {
        return requiredScore;
    }
    public void setRequiredScore(int requiredScore) {
        this.requiredScore = requiredScore;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return "LevelWord{" +
                "id='" + id + '\'' +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", requiredScore=" + requiredScore +
                ", isBlocked=" + isBlocked +
                ", words=" + words +
                '}';
    }

}
