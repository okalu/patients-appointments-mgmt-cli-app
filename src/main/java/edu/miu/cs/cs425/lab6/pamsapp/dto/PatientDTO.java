package edu.miu.cs.cs425.lab6.pamsapp.dto;

import org.json.JSONObject;

import java.time.LocalDate;

public record PatientDTO(
        String patientId,
        String firstName,
        String lastName,
        String contactPhoneNumber,
        String email,
        LocalDate dateOfBirth,
        Integer age,
        MailingAddressDTO mailingAddress
) {
    public JSONObject toJSON() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("patientId", patientId);
        jsonObject.put("firstName", firstName);
        jsonObject.put("lastName", lastName);
        jsonObject.put("contactPhoneNumber", (contactPhoneNumber!=null)?contactPhoneNumber:"null");
        jsonObject.put("email", (email!=null)?email:"null");
        jsonObject.put("dateOfBirth", dateOfBirth);
        jsonObject.put("age", age);
        if(mailingAddress != null) {
            jsonObject.put("mailingAddress", mailingAddress.toJSON());
        } else {
            jsonObject.put("mailingAddress", "null");
        }
        return  jsonObject;
    }
}
