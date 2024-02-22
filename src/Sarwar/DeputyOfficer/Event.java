package Sarwar.DeputyOfficer;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Alert;

import java.time.LocalDate;

public class Event {

    private final SimpleIntegerProperty eventId;
    private final SimpleStringProperty eventName;
    private final SimpleStringProperty eventDate;
    private final SimpleStringProperty eventDetails;

    public Event(int eventId, String eventName, String eventDate, String eventDetails) {
        this.eventId = new SimpleIntegerProperty(eventId);
        this.eventName = new SimpleStringProperty(eventName);
        this.eventDate = new SimpleStringProperty(eventDate);
        this.eventDetails = new SimpleStringProperty(eventDetails);
    }

    // Getter and Setter methods for eventId
    public int getEventId() {
        return eventId.get();
    }

    public SimpleIntegerProperty eventIdProperty() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId.set(eventId);
    }

    // Getter and Setter methods for eventName
    public String getEventName() {
        return eventName.get();
    }

    public SimpleStringProperty eventNameProperty() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName.set(eventName);
    }

    // Getter and Setter methods for eventDate
    public String getEventDate() {
        return eventDate.get();
    }

    public SimpleStringProperty eventDateProperty() {
        return eventDate;
    }

    public LocalDate getEventDateAsLocalDate() {
        return LocalDate.parse(eventDate.get());
    }

    public void setEventDate(String eventDate) {
        this.eventDate.set(eventDate);
    }

    // Getter and Setter methods for eventDetails
    public String getEventDetails() {
        return eventDetails.get();
    }

    public SimpleStringProperty eventDetailsProperty() {
        return eventDetails;
    }

    public void setEventDetails(String eventDetails) {
        this.eventDetails.set(eventDetails);
    }
}
