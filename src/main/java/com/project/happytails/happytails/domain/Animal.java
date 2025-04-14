package com.project.happytails.happytails.domain;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "animals")
public class Animal {

    @Id
    private String id;
    private String type;       
    private String location;
    private String state;      
    private String description;
    private String reporterUsername;
    
    public Animal() {}

    public Animal(String type, String location, String state, String description, String reporterUsername) {
        this.type = type;
        this.location = location;
        this.state = state;
        this.description = description;
        this.reporterUsername = reporterUsername;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getReporterUsername() { return reporterUsername; }
    public void setReporterUsername(String reporterUsername) { this.reporterUsername = reporterUsername; }
}
