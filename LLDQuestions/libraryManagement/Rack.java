package LLDQuestions.libraryManagement;

public class Rack {
    private int id;
    private String locationIdentifier;

    public Rack(int id, String locationIdentifier) {
        this.id = id;
        this.locationIdentifier = locationIdentifier;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocationIdentifier() {
        return locationIdentifier;
    }

    public void setLocationIdentifier(String locationIdentifier) {
        this.locationIdentifier = locationIdentifier;
    }
}
