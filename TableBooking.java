public class TableBooking {
    int table_no;
    String time_slot;

    static int[][] tableView = new int[12][7];

    static String[] timeSlots = new String[] { "11:00am-12:00pm", "12:00pm-1:00pm", "1:00pm-2:00pm", "2:00pm-3:00pm",
            "3:00pm-4:00pm", "4:00pm-5:00pm", "5:00pm-6:00pm", "6:00pm-7:00pm", "7:00pm-8:00pm", "8:00pm-9:00pm", "9:00pm-10:00pm",
            "10:00pm-11:00pm" };

    static void displayTimeSlots() {
        System.out.println("Try Test ********************TIME SLOTS********************\n");
        for (int i = 0; i < 12; i++) {
            System.out.println(i + 1 + ". " + timeSlots[i]);
        }
        System.out.println("\n**************************************************");
    }

    static void displayTableView() {
        System.out.println("Table View: ");
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 0) {
                    System.out.print(timeSlots[i] + ": ");
                }
                System.out.print(tableView[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    static boolean isAvailable(int option) {
        for (int i = 0; i < 7; i++) {
            if (tableView[option - 1][i] == 0)
                return true;
        }
        return false;
    }

    void bookTable(int option, Customer c) {
        for (int i = 0; i < 7; i++) {
            if (tableView[option - 1][i] == 0) {
                table_no = i + 1;
                time_slot = timeSlots[option - 1];
                tableView[option - 1][i] = 1;
                c.table_no = table_no;
                c.time_slot = time_slot;
                return;
            }
        }
    }
}
