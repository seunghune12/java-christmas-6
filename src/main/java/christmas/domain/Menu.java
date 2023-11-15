package christmas.domain;

import christmas.constant.FoodName;
import christmas.util.MenuSplitor;
import christmas.view.InputView;
import christmas.view.OutputView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Menu {

    Map<String,Integer> menus;


    public void saveOrder(){
        String order = InputView.inputMenu();
        this.menus = MenuSplitor.splitMenus(order);
    }

    public int calculateTotalPrice() {
        int totalPrice = 0;

        for (Map.Entry<String, Integer> entry : menus.entrySet()) {
            String menuName = entry.getKey();
            int quantity = entry.getValue();
            int menuPrice = FoodName.getPriceByName(menuName);
            totalPrice += menuPrice * quantity;
        }

        return totalPrice;
    }

    public int calculatedaysEvent(String daySalePrice){
        int totalSalePrice = 0;

        for (Map.Entry<String, Integer> entry : menus.entrySet()) {
            String menuName = entry.getKey();
            int number = entry.getValue();

            boolean isMatch = FoodName.isNameAndSortMatch(menuName, daySalePrice);

            if(isMatch){
                totalSalePrice += 2023 * number;
            }
        }

        return totalSalePrice;
    }

    public void printOrderedMenus(){
        OutputView.printOrderedMenus();

        for (Map.Entry<String, Integer> entry : menus.entrySet()) {
            System.out.printf(entry.getKey()+" "+entry.getValue()+"개");
        }

    }
}
