package edu.miu.cs.cs425.lab6.pamsapp.service;

import edu.miu.cs.cs425.lab6.pamsapp.dao.PatientsDAO;
import edu.miu.cs.cs425.lab6.pamsapp.dto.MailingAddressDTO;
import edu.miu.cs.cs425.lab6.pamsapp.dto.PatientDTO;

import java.util.Arrays;
import java.util.Comparator;

public class PatientsService {
    private final PatientsDAO patientsDAO;

    public PatientsService() {
        this.patientsDAO = PatientsDAO.getInstance();
    }

    public PatientDTO[] getPatientsSortedByAgeDesc() {
        var patients = patientsDAO.getPatients();
        return Arrays.stream(patients)
                .map(p -> new PatientDTO(
                        p.getPatientId().toString(),
                        p.getFirstName(),
                        p.getLastName(),
                        p.getContactPhoneNumber(),
                        p.getEmail(),
                        p.getDateOfBirth(),
                        p.getAge(),
                        (p.getMailingAddress()!=null)?new MailingAddressDTO(
                                p.getMailingAddress().getStreet(),
                                p.getMailingAddress().getCity(),
                                p.getMailingAddress().getState(),
                                p.getMailingAddress().getZipcode()
                        ):null
                )).sorted(Comparator.comparing(PatientDTO::age,
                        Comparator.reverseOrder()))
                .toArray(PatientDTO[]::new);
    }
}
