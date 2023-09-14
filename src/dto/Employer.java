package dto;

import java.util.List;

public class Employer {
    private String registerNumber;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String login;
    private String password;

    private List<Phase> phases;

    public List<Phase> getPhases() {
        return phases;
    }

    public void setPhases(List<Phase> phases) {
        this.phases = phases;
    }

    public Employer(String registerNumber, String firstName, String lastName, String phoneNumber, String email, String login, String password) {
        this.registerNumber = registerNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.login = login;
        this.password = password;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
