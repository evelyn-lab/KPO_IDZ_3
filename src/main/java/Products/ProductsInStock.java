package Products;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProductsInStock {

        public static ArrayList<Product> loadProductsInStock(String filePath) {
            ArrayList<Product> productsInStock = new ArrayList<Product>();

            JSONParser parser = new JSONParser();

            try (FileReader reader = new FileReader(filePath)) {
                Object obj = parser.parse(reader);

                JSONObject jsonObject = (JSONObject) obj;

                JSONArray productInStockList = (JSONArray) jsonObject.get("products");

                for (Object productInStockObj : productInStockList) {
                    JSONObject productInStock = (JSONObject) productInStockObj;

                    long id = (long) productInStock.get("prod_type_id");
                    long prod_type = (long) productInStock.get("prod_item_type");
                    String name = (String) productInStock.get("prod_type_name");
                    String company = (String) productInStock.get("prod_item_company");
                    String unit = (String) productInStock.get("prod_item_unit");
                    double quantity = (double) productInStock.get("prod_item_quantity");
                    double cost = (double) productInStock.get("prod_item_cost");
                    String delivered = (String) productInStock.get("prod_item_delivered");
                    String valid_until = (String) productInStock.get("prod_item_valid_until");

                    productsInStock.add(new Product(id, prod_type, name, company,
                            unit, quantity, cost, delivered, valid_until, false));
                }
            } catch (IOException | org.json.simple.parser.ParseException e) {
                e.printStackTrace();
            }

            return productsInStock;
        }
}
