package Equipments;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class EquipmentTypes {

    public static ArrayList<Equipment> loadEquipmentTypes(String filePath) {
        ArrayList<Equipment> equipmentTypes = new ArrayList<Equipment>();

        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(filePath)) {
            Object obj = parser.parse(reader);

            JSONObject jsonObject = (JSONObject) obj;

            JSONArray equipmentTypesList = (JSONArray) jsonObject.get("equipment_type");

            for (Object equipmentTypeObj : equipmentTypesList) {
                JSONObject equipmentType = (JSONObject) equipmentTypeObj;

                long id = (long) equipmentType.get("equip_type_id");
                String name = (String) equipmentType.get("equip_type_name");

                equipmentTypes.add(new Equipment(id, 0, name, false));
            }
        } catch (IOException | org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }

        return equipmentTypes;
    }
}
