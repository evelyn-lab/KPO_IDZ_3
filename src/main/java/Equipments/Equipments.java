package Equipments;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Equipments {

    public static ArrayList<Equipment> loadEquipments(String filePath) {
        ArrayList<Equipment> equipmentTypes = new ArrayList<Equipment>();

        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(filePath)) {
            Object obj = parser.parse(reader);

            JSONObject jsonObject = (JSONObject) obj;

            JSONArray equipmentsList = (JSONArray) jsonObject.get("equipment");

            for (Object equipmentObj : equipmentsList) {
                JSONObject equipment = (JSONObject) equipmentObj;

                long type = (long) equipment.get("equip_type");
                String name = (String) equipment.get("equip_name");
                boolean active = (boolean) equipment.get("equip_active");

                equipmentTypes.add(new Equipment(0, type, name, active));
            }
        } catch (IOException | org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }

        return equipmentTypes;
    }
}