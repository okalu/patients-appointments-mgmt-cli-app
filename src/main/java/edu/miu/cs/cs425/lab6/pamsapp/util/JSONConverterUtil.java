package edu.miu.cs.cs425.lab6.pamsapp.util;

import edu.miu.cs.cs425.lab6.pamsapp.dto.PatientDTO;
import org.json.JSONArray;

import java.util.Arrays;

public class JSONConverterUtil {

    public static String convertPatientArrayToJSON(PatientDTO[] patients) {
        JSONArray jsonArray = new JSONArray();
        Arrays.stream(patients).forEach(patient -> {
            jsonArray.put(patient.toJSON());
        });
        return jsonArray.toString(2);
    }

}
