package Kyu6;

import java.util.Locale;

/**
 * Some new cashiers started to work at your restaurant.
 * <p>
 * They are good at taking orders, but they don't know how to capitalize words, or use a space bar!
 * <p>
 * All the orders they create look something like this:
 * <p>
 * "milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza"
 * <p>
 * The kitchen staff are threatening to quit, because of how difficult it is to read the orders.
 * <p>
 * Their preference is to get the orders as a nice clean string with spaces and capitals like so:
 * <p>
 * "Burger Fries Chicken Pizza Pizza Pizza Sandwich Milkshake Milkshake Coke"
 * <p>
 * The kitchen staff expect the items to be in the same order as they appear in the menu.
 * <p>
 * The menu items are fairly simple, there is no overlap in the names of the items:
 * <p>
 * 1. Burger
 * 2. Fries
 * 3. Chicken
 * 4. Pizza
 * 5. Sandwich
 * 6. Onionrings
 * 7. Milkshake
 * 8. Coke
 */

public class NewCashierDoesNotKnowAboutSpaceOrShift {
    public static void main(String[] args) {
        String txt = "milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza";
//        System.out.println(getOrder(txt));
        txt = "pizzachickenfriesburgercokemilkshakefriessandwich";
        System.out.println(getOrder(txt));
    }

    public static String getOrder(String input) {
        String[] menu = {"Burger", "Fries", "Chicken", "Pizza", "Sandwich", "Onionrings", "Milkshake", "Coke"};
        String order = "";
        for (int i = 0; i < menu.length; i++) {
            if (i == 0) {
                if (input.contains(menu[i].toLowerCase(Locale.ROOT))) {
                    order = menu[i];
                    i++;
                }
            }
            if (input.contains(menu[i].toLowerCase(Locale.ROOT))) {
                order = order + " " + menu[i];
            }
        }
        return order;
    }
}
