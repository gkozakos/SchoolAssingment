package schoolPackage;

public class Menus {
    public static void showDataMenu() {
        System.out.println("Press 1 if you want to add a new student,\n" +
                "Press 2 if you want to add a new trainer,\n" +
                "Press 3 if you want to add a new assignment,\n" +
                "Press 4 if you want to add a new courses\n" +
                "Press 5 if you want to hgo back!\n" +
                "You can add a synthetic data for each of these option if you don't add an option!\n");

    }

    public static void autoUserMenu() {
        System.out.println("Press 1 if you want to add manually, \n " +
                "press 2 if you want to add synthetic data, \n" +
                "press 3 if you want to go back");


    }

    //edw
    public static void showMainMenu() {
        System.out.println("Press 1 to add data ,\n" +
                "Press 2 to show data ,\n" +
                "Press 3 if you want to quit!\n");
    }

    //edw
    public static void showListDataMenu() {
        System.out.println(
                "Press 1 to show the the  student's ist ,\n" +
                        "Press 2 to show the trainer's list\n" +
                        "Press 3 to show the assignment's list\n" +
                        "Press 4 to show the course's list\n" +
                        "Press 5 to show the students per course list\n" +
                        "Press 6 to show the trainers per course list\n" +
                        "Press 7 to show the assignment per course list\n" +
                        "Press 8 to show the assignment per students list\n" +
                        "Press 0 if you want to go Back!\n");
    }
}
