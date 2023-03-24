package Products;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProductTypes {

    public static ArrayList<Product> loadProductTypes(String filePath) {
        ArrayList<Product> productTypes = new ArrayList<Product>();

        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(filePath)) {
            Object obj = parser.parse(reader);

            JSONObject jsonObject = (JSONObject) obj;

            JSONArray productTypesList = (JSONArray) jsonObject.get("product_types");

            for (Object productTypeObj : productTypesList) {
                JSONObject productType = (JSONObject) productTypeObj;

                long prod_type = (long) productType.get("prod_type_id");
                String name = (String) productType.get("prod_type_name");
                boolean is_food = (boolean) productType.get("prod_is_food");

                productTypes.add(new Product(0, prod_type, name, "", "", 0, 0, "", "", is_food));
            }
        } catch (IOException | org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }

        return productTypes;
    }
}
