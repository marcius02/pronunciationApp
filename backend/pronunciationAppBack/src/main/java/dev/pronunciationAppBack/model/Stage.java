package dev.pronunciationAppBack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Stage {
    @Id
    private String id;
    private String name;
    private String avatarUrl;
    private String status;
    private int progress;
    private int currentScore;

    @ManyToOne
    private GameProgress gameProgress;

    @OneToMany(mappedBy = "stage")
    private List<StageWord> stageWords;

}
