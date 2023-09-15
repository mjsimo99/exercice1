package dto;

import java.util.List;

public class Phase {

    private String code;
    private String title;
    private String description;
    private String dateStart;
    private String dateEnd;
    private ProjectStatus status;
    private double amount;
    private boolean statusphase;
    private boolean billed;
    private boolean payed;
    private Project projects;
    private List<Employer> employers;
    private Liverable liverables;

    public Liverable getLiverables() {
        return liverables;
    }

    public void setLiverables(Liverable liverables) {
        this.liverables = liverables;
    }

    public Project getProjects() {
        return projects;
    }

    public void setProjects(Project projects) {
        this.projects = projects;
    }



    public List<Employer> getEmployers() {
        return employers;
    }

    public void setEmployers(List<Employer> employers) {
        this.employers = employers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Phase(String code, String title, String description, String dateStart, String dateEnd, ProjectStatus status, double amount, boolean statusphase, boolean billed, boolean payed) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.status = status;
        this.amount = amount;
        this.statusphase = statusphase;
        this.billed = billed;
        this.payed = payed;
    }

    public enum ProjectStatus {
        Done,

        Pending
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitre() {
        return title;
    }

    public void setTitre(String titre) {
        this.title = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public ProjectStatus getStatus() {
        return status;
    }

    public void setStatus(ProjectStatus status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isStatusphase() {
        return statusphase;
    }

    public void setStatusphase(boolean statusphase) {
        this.statusphase = statusphase;
    }

    public boolean isBilled() {
        return billed;
    }

    public void setBilled(boolean billed) {
        this.billed = billed;
    }

    public boolean isPayed() {
        return payed;
    }

    public void setPayed(boolean payed) {
        this.payed = payed;
    }
}

