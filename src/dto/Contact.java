package dto;

public class Contact {
    private Project project;
    private Client client;

    public Contact(Project project, Client client) {
        this.project = project;
        this.client = client;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
