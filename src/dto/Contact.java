package dto;

import java.util.List;

public class Contact {
    private String name;
    private String adressWeb;
    private int phoneNumber;
    private List<Project> projects;
    private Client client;

    public Contact(String name, String adressWeb, int phoneNumber, List<Project> projects, Client client) {
        this.name = name;
        this.adressWeb = adressWeb;
        this.phoneNumber = phoneNumber;
        this.projects = projects;
        this.client = client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdressWeb() {
        return adressWeb;
    }

    public void setAdressWeb(String adressWeb) {
        this.adressWeb = adressWeb;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
