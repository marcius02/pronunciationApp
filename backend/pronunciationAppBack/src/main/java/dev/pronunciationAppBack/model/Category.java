package dev.pronunciationAppBack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Category {
    @Id
    private String id;
    private String categoryName;
    private String subCategoryName;
    private String description;
    private int wordCount;

    @ManyToMany(mappedBy = "categories")
    private List<Word> words;

    public Category() {}

    public Category(String id, String categoryName, String subCategoryName, String description, int wordCount) {
        this.id = id;
        this.categoryName = categoryName;
        this.subCategoryName = subCategoryName;
        this.description = description;
        this.wordCount = wordCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", subCategoryName='" + subCategoryName + '\'' +
                ", description='" + description + '\'' +
                ", wordCount=" + wordCount +
                '}';
    }
}