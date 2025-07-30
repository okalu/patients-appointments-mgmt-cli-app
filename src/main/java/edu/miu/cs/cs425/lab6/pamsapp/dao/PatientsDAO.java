package edu.miu.cs.cs425.lab6.pamsapp.dao;

import edu.miu.cs.cs425.lab6.pamsapp.model.MailingAddress;
import edu.miu.cs.cs425.lab6.pamsapp.model.Patient;

import java.time.LocalDate;
import java.util.UUID;

public class PatientsDAO {
    private static PatientsDAO instance;

    private Patient[] patients = null;

    // Private constructor to prevent instantiation
    private PatientsDAO() {
    }

    // Public method to provide access to the single instance
    public static synchronized PatientsDAO getInstance() {
        if (instance == null) {
            // Lazy initialization of the singleton instance
            // This ensures that the instance is created only when it is needed.
            instance = new PatientsDAO();
        }
        return instance;
    }

    private void loadData() {
        this.patients = new Patient[] {
                new Patient(
                        UUID.randomUUID(),
                        "Daniel", "Agar", "(641) 123-0009",
                        "dagar@m.as", LocalDate.of(1987, 1, 19),
                        new MailingAddress("1 N Street", "Fairfield", "IA", "52556-0187")
                ),
                new Patient(
                        UUID.randomUUID(),
                        "Ana", "Smith", null,
                        "amsith@te.edu", LocalDate.of(1948, 12, 5),
                        null
                ),
                new Patient(
                        UUID.randomUUID(),
                        "Marcus", "Garvey", "(123) 292-0018",
                        null, LocalDate.of(2001, 9, 18),
                        new MailingAddress("4 East Avenue", "Cleveland", "OH", "32001-9910")
                ),
                new Patient(
                        UUID.randomUUID(),
                        "Jeff", "Goldbloom", "(999) 165-1192",
                        "jgold@es.co.za", LocalDate.of(1995, 2, 28),
                        null
                ),
                new Patient(
                        UUID.randomUUID(),
                        "Mary", "Washington", null,
                        null, LocalDate.of(1932, 5, 31),
                        new MailingAddress("30 W Burlington Avenue", "Fairfield", "IA", "52556-0114")
                )
        };
    }

    /**
     * Fetches the Patients data from the data source.
     * If the array is null or empty, loads the data first.
     * @return patients the array of Patients
     */
    public Patient[] getPatients() {
        if (patients == null || patients.length == 0) {
            loadData();
        }
        return patients;
    }
}
