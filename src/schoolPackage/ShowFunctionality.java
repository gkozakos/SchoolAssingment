package schoolPackage;

import java.util.ArrayList;

import static schoolPackage.Menus.showDataMenu;

public class ShowFunctionality {
    public static void showStudentList(ArrayList<Student> students) {
        System.out.println(students.toString());
    }
    public static void showAssignmentList(ArrayList<Assignment> assignments) {
        System.out.println(assignments.toString());
    }
    public static void showTrainerList(ArrayList<Trainer> trainers) {
        System.out.println(trainers.toString());
    }
    public static void showCourseList(ArrayList<Course> courses) {
        System.out.println(courses.toString());
    }
    public static void showStudentsPerCourses(ArrayList<CoursePerStudent> coursePerStudents) {
        System.out.println(coursePerStudents.toString());
    }
    public static void showTrainersPerCourses(ArrayList<TrainersPerCourse> trainersPerCourses) {
        System.out.println(trainersPerCourses.toString());
    }
    public static void showAssignmentsPerCourses(ArrayList<AssignmentsPerCourse> assignmentsPerCourses) {
        System.out.println(assignmentsPerCourses.toString());
    }
    public static void showAssignmentsPerStudents(ArrayList<AssignmentPerStudent> assignmentPerStudents) {
        System.out.println(assignmentPerStudents.toString());
    }

}
