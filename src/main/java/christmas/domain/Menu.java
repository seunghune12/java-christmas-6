package christmas.domain;

import christmas.constant.FoodName;
import christmas.util.MenuSplitor;
import christmas.view.InputView;
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

            // FoodName 열거형에서 해당 메뉴의 가격을 가져와서 총 가격에 더함
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
}
