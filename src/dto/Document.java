package dto;

public class Document {
    private String code;
    private String label;
    private String description;
    private String documentLink;

    public Document(String code, String label, String description, String documentLink) {
        this.code = code;
        this.label = label;
        this.description = description;
        this.documentLink = documentLink;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDocumentLink() {
        return documentLink;
    }

    public void setDocumentLink(String documentLink) {
        this.documentLink = documentLink;
    }
}
