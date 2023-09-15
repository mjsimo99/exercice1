package dto;

import java.util.List;

public class Liverable {
    private String code;
    private String title;
    private String description;
    private String link;
    private Phase phases;
    private List<Document> documents;

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public Phase getPhases() {
        return phases;
    }

    public void setPhases(Phase phases) {
        this.phases = phases;
    }

    public Liverable(String code, String title, String description, String link) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.link = link;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}


