package Operations;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class OperationTypes {

    public static ArrayList<Operation> loadOperationTypes(String filePath) {
        ArrayList<Operation> operationTypes = new ArrayList<Operation>();

        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(filePath)) {
            Object obj = parser.parse(reader);

            JSONObject jsonObject = (JSONObject) obj;

            JSONArray operationsList = (JSONArray) jsonObject.get("operation_types");

            for (Object operationObj : operationsList) {
                JSONObject operation = (JSONObject) operationObj;

                long id = (long) operation.get("oper_type_id");
                String name = (String) operation.get("oper_type_name");

                operationTypes.add(new Operation(id, name, 0, 0, 0, null));
            }
        } catch (IOException | org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }

        return operationTypes;
    }
}

