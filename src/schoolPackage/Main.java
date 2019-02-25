package schoolPackage;


import java.util.ArrayList;
import java.util.Scanner;
import static schoolPackage.Menus.*;
import static schoolPackage.ShowFunctionality.*;

public class Main {

    private static ArrayList<Student> students = new ArrayList<>();
    private static ArrayList<Trainer> trainers = new ArrayList<>();
    private static ArrayList<Assignment> assignments = new ArrayList<>();
    private static ArrayList<Course> courses = new ArrayList<>();
    private static ArrayList<CoursePerStudent> coursePerStudents = new ArrayList<>();
    private static ArrayList<TrainersPerCourse> trainersPerCourses = new ArrayList<>();
    private static ArrayList<AssignmentsPerCourse> assignmentsPerCourses = new ArrayList<>();
    private static ArrayList<AssignmentPerStudent> assignmentPerStudentss = new ArrayList<>();
    private static AddFuctionality addFuctionality = new AddFuctionality();


    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("Java");
        course1.setType("Full");
        course1.setStream("Java");
        course1.setStartDate("04/02/2019");
        course1.setEndDate("04/05/2019");
        courses.add(course1);
        Course course2 = new Course();
        course2.setTitle("C#");
        course2.setType("Part");
        course2.setStream("C#");
        course2.setStartDate("04/02/2019");
        course2.setEndDate("04/08/2019");
        courses.add(course2);
        Course course3 = new Course();
        course3.setTitle("Java");
        course3.setType("Full");
        course3.setStream("Java");
        course3.setStartDate("04/02/2019");
        course3.setEndDate("04/05/2019");
        courses.add(course3);

        Scanner scanner = new Scanner(System.in);
        mainMenu(scanner);

    }

    private static void mainMenu(Scanner scanner) {
        showMainMenu();
        int userInput = 0;
        while (userInput != 3) {
            userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    addData(scanner);
                    break;
                case 2:
                    showData(scanner);
                    break;
            }
        }
    }
    private static void showData(Scanner scanner) {
        int userInput = -1;
        while (userInput != 0) {
            showListDataMenu();
            userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    showStudentList(students);
                    break;
                case 2:
                    showTrainerList(trainers);
                    break;
                case 3:
                    showAssignmentList(assignments);
                    break;
                case 4 :
                    showCourseList(courses);
                    break;
                case 5:
                    showStudentsPerCourses(coursePerStudents);
                    break;
                case 6:
                    showTrainersPerCourses(trainersPerCourses);
                    break;
                case 7:
                    showAssignmentsPerCourses(assignmentsPerCourses);
                    break;
                case 8:
                    showAssignmentsPerStudents(assignmentPerStudentss);
                    break;
                case 0:
                    mainMenu(scanner);
            }
        }

    }
    private static void addData(Scanner scanner) {

        int userInput = 0;
        while (userInput != 5) {
            showDataMenu();
            userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    addFuctionality.createStudents(students,courses,coursePerStudents, scanner);
                    break;
                case 2:
                    addFuctionality.createTrainers(trainers,courses,trainersPerCourses, scanner);
                    break;
                case 3:
                    addFuctionality.createAssignments(assignments,courses,assignmentsPerCourses,students,assignmentPerStudentss, scanner);
                    break;
                case 4:
                    addFuctionality.createCourses(courses, scanner);
                    break;
                case 5:
                    mainMenu(scanner);
                    break;
            }
        }

    }

}
