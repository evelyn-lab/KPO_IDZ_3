import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DishCards {

    public static ArrayList<Card> loadDishCards(String filePath) {
        ArrayList<Card> dishCards = new ArrayList<Card>();
        ArrayList<Operation> operations = new ArrayList<Operation>();
        ArrayList<Product> products = new ArrayList<Product>();

        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(filePath)) {
            Object obj = parser.parse(reader);

            JSONObject jsonObject = (JSONObject) obj;

            JSONArray dishCardsList = (JSONArray) jsonObject.get("dish_cards");

            for (Object dishCardObj : dishCardsList) {
                JSONObject dishCard = (JSONObject) dishCardObj;
                long id = (long) dishCard.get("card_id");
                String name = (String) dishCard.get("dish_name");
                String description = (String) dishCard.get("card_descr");
                double time = (double) dishCard.get("card_time");
                long equipment = (long) dishCard.get("equip_type");
                JSONArray operationsList = (JSONArray) dishCard.get("operations");

                for (Object operationObj : operationsList) {
                    JSONObject operation = (JSONObject) operationObj;
                    long type = (long) operation.get("oper_type");
                    double oper_time = (double) operation.get("oper_time");
                    int point = (int) operation.get("oper_async_point");

                    JSONArray productsList = (JSONArray) operation.get("oper_products");
                    for (Object productObj : productsList) {
                        JSONObject product = (JSONObject) productObj;
                        long prod_type = (long) product.get("prod_type");
                        double quantity = (double) product.get("prod_quantity");
                        products.add(new Product(prod_type,"", "", "", quantity, 0,  "","",  false));
                    }
                    operations.add(new Operation(type, oper_time, point, products));
                }
                dishCards.add(new Card(id, name, description, time, equipment, operations));
            }
        } catch (IOException | org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }

        return dishCards;
    }
}
