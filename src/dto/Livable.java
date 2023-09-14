package dto;

public class Livable {
    private String code;
    private String title;
    private String description;
    private String link;


    public Livable(String code, String title, String description, String link) {
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
