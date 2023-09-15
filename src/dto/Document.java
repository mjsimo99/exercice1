package dto;

public class Document {


    private Liverable liverable;

    public Document(Liverable liverable) {
        this.liverable = liverable;
    }

    public Liverable getLiverable() {
        return liverable;
    }

    public void setLiverable(Liverable liverable) {
        this.liverable = liverable;
    }
}
