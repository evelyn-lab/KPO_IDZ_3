package Menu;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class MenuDishes {

    public static ArrayList<Dish> loadMenuDishes(String filePath) {
        ArrayList<Dish> menuDishes = new ArrayList<Dish>();

        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(filePath)) {
            Object obj = parser.parse(reader);

            JSONObject jsonObject = (JSONObject) obj;

            JSONArray menuDishList = (JSONArray) jsonObject.get("menu_dishes");

            for (Object menuDishObj : menuDishList) {
                JSONObject menuDish = (JSONObject) menuDishObj;

                long id = (long) menuDish.get("menu_dish_id");
                long card = (long) menuDish.get("menu_dish_card");
                double price = (double) menuDish.get("menu_dish_price");
                boolean active = (boolean) menuDish.get("menu_dish_active");

                menuDishes.add(new Dish(id, card, price, active));
            }
        } catch (IOException | org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }

        return menuDishes;
    }
}
