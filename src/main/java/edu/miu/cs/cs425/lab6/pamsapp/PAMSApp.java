package edu.miu.cs.cs425.lab6.pamsapp;

import edu.miu.cs.cs425.lab6.pamsapp.service.PatientsService;
import edu.miu.cs.cs425.lab6.pamsapp.util.JSONConverterUtil;

public class PAMSApp {
    public static void main(String[] args) {
        System.out.println("Hello! Welcome to the Patients-Appointments Management App!");
        System.out.println("Starting the application tasks...");
        System.out.println("Task 1: JSON Array of All Patients Data, sorted by Age in descending order.");
        System.out.println("__________________________________________________________________________");
        // Process data
        var patientsService = new PatientsService();
        var patients = patientsService.getPatientsSortedByAgeDesc();
        var patientsJson = JSONConverterUtil.convertPatientArrayToJSON(patients);
        System.out.println(patientsJson);

        System.out.println("_______________________Task 1 Done________________________________________");

        System.out.println("\nApplication tasks completed successfully!");
        System.out.println("Exiting the application...Goodbye!");
    }
}
