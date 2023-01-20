public class Menu {
    String foodItem;
    double price;

    Menu(String f, double p) {
        foodItem = f;
        price = p;
    }

    static String[] items = new String[] { "Nasi Ayam", "Nasi Goreng", "Mi Goreng", "Kuey Tiau Goreng",
            "Nasi Kerabu","Nasi Kukus", "Nasi Dagang", "Laksa", "Lontong", "Laksam", "Satay Ayam", "Satay Daging",
            "Satay Ikan", "Mi Kari", "Tomyam", "Roti Canai",
            "Roti Boom", "Roti Nan Cheese"  };
    static double[] prices = new double[] { 8.00, 7.00, 6.50, 7.00, 10.00, 9.00, 8.50, 6.00, 7.50, 6.80,
            2.00, 2.50, 3.00, 6.30, 7.90, 2.20, 2.30, 3.50 };

    static void displayMenu() {
        int len = items.length;
        System.out.println("********************MENU********************\n");
        for (int i = 0; i < len; i++) {
            System.out.println((i + 1) + ". " + items[i] + " --------------------- RM" + prices[i]);
        }
        System.out.println("\n********************************************");
    }
}
