package edu.miu.cs.cs425.lab6.pamsapp.model;

import org.json.JSONObject;

import java.time.LocalDate;
import java.time.Period;
import java.util.StringJoiner;
import java.util.UUID;

public class Patient {
    private UUID patientId;
    private String firstName;
    private String lastName;
    private String contactPhoneNumber;
    private String email;
    private LocalDate dateOfBirth;
    private MailingAddress mailingAddress;

    public Patient(UUID patientId, String firstName, String lastName, String contactPhoneNumber, String email, LocalDate dateOfBirth, MailingAddress mailingAddress) {
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactPhoneNumber = contactPhoneNumber;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.mailingAddress = mailingAddress;
    }

    public Patient() {
    }

    public UUID getPatientId() {
        return patientId;
    }

    public void setPatientId(UUID patientId) {
        this.patientId = patientId;
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

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public MailingAddress getMailingAddress() {
        return mailingAddress;
    }
    public void setMailingAddress(MailingAddress mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Patient.class.getSimpleName() + "[", "]")
                .add("patientId=" + patientId)
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("contactPhoneNumber='" + contactPhoneNumber + "'")
                .add("email='" + email + "'")
                .add("dateOfBirth=" + dateOfBirth)
                .add("mailingAddress=" + mailingAddress)
                .toString();
    }

    public Integer getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

}
