package Cookers;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CookersList {

    public static ArrayList<Cooker> loadCookers(String filePath) {
        ArrayList<Cooker> cookers = new ArrayList<Cooker>();

        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(filePath)) {
            Object obj = parser.parse(reader);

            JSONObject jsonObject = (JSONObject) obj;

            JSONArray cookersList = (JSONArray) jsonObject.get("cookers");

            for (Object cookerObj : cookersList) {
                JSONObject cooker = (JSONObject) cookerObj;

                long id = (long) cooker.get("equip_type");
                String name = (String) cooker.get("equip_name");
                boolean active = (boolean) cooker.get("equip_active");

                cookers.add(new Cooker(id, name, active));
            }
        } catch (IOException | org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }

        return cookers;
    }
}
