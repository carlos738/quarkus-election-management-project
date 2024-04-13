package infrastructure.repositories.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "elections")
public class Election {
    @Id
    private String id;

    public static Election fromDomain() {
    return null;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
