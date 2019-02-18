package schoolPackage;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Press 1 if you want to add a new student," +
                           "Press 2 if you want to add a new trainer, " +
                           "Press 3 if you want to add a new assignment, " +
                           "Press 4 if you want to add a new courses " +
                           "Press 5 if you want to quit!" +
                           "You can add a synthetic data for each of these option later! ");


        //edw arxikopoiw tis listes mou
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Trainer> trainers = new ArrayList<Trainer>();
        ArrayList<Assignment> assignments = new ArrayList<Assignment>();
        ArrayList<Course> courses = new ArrayList<Course>();
        ArrayList<CoursePerStudent> cPs = new ArrayList<CoursePerStudent>();
        ArrayList<TrainersPerCourse> tPc = new ArrayList<TrainersPerCourse>();
        ArrayList<AssignmentsPerCourse> aPc = new ArrayList<AssignmentsPerCourse>();
        ArrayList<AssignmentPerStudent> aPs = new ArrayList<AssignmentPerStudent>();


        // edw arxikopoiw to scanner pou 8a diavazei tis apantiseis tou xrhsth
        Scanner scanner = new Scanner(System.in);

        //edw ftiaxnw tis methodous mou gia to ti xreiazete i ka8e lista na gemisei
        createStudents(students, scanner);
        createTrainers(trainers, scanner);
        createAssignments(assignments, scanner);
        createCourses(courses, scanner);
    }




    private static void createAssignments(ArrayList<Assignment> assignments, Scanner scanner) {
        System.out.println("Do you wish to add an assignment? press Y for yes or N for no");
        while (scanner.next().equalsIgnoreCase("y")) {
               Assignment assignment = new Assignment();
            System.out.println("Please put the Assignment title");
            assignment.setTitle(scanner.next());
            System.out.println("Please write the description of the assignment");
            assignment.setDescription(scanner.next());
            System.out.println("Please enter the due date of the assignment");
            assignment.setDueDate(scanner.next());
//            String inputDate = scanner.next();
//            Date dueDate=new SimpleDateFormat("dd/MM/yyyy").parse(inputDate);
            System.out.println("Please enter your oral mark!");
            assignment.setOralMark(scanner.nextDouble());
            System.out.println("Please enter your total mark");
            assignment.getTotalMark(scanner.nextDouble());
            assignments.add(assignment);
            System.out.println("Do you wish to add another Assignment? press Y for yes or N for No! ");



        }
    }


    private static void createCourses(ArrayList<Course> courses, Scanner scanner) {
        System.out.println("Do you wish to add a course? press Y for yes and N for No");
        while (scanner.next().equalsIgnoreCase("y")) {
            Course course = new Course();
            System.out.println("Please put the course title");
            course.setTitle(scanner.nextLine());
            System.out.println("Please enter the stream course press a for java or b for C#");
            if (scanner.next().equalsIgnoreCase("a") )
//            course.setStream(scanner.nextLine());
                System.out.println("Please enter the type of the course");
            course.setType(scanner.next());
            System.out.println("please enter the starting date of the course");
            course.setStartDate(scanner.next());
            System.out.println("Please enter the end date of the course");
            course.setEndDate(scanner.next());
            courses.add(course);
            System.out.println("Do you wish to add another Course? press Y for yes or N for No! ");



        }



    }
    private static void createTrainers(ArrayList<Trainer> trainers, Scanner scanner) {
        System.out.println("Do you want to add a trainer? press Y for yes or N for No");
        while (scanner.next().equalsIgnoreCase("y")){
            Trainer trainer = new Trainer();
            System.out.println("Enter the trainers first name");
            trainer.setFirstName(scanner.next());
            System.out.println("Enter the trainers last name");
            trainer.setLastName(scanner.next());
            System.out.println("Enter your subject");
            trainer.setSubject(scanner.next());
            trainers.add(trainer);
            System.out.println("Do you wish to add another trainer? press Y for yes or N for No! ");
        }

    }

    private static void createStudents(ArrayList<Student> students, Scanner scanner) {
        //vima 1...rwtaw ton xrhsth an 8elei na pros8esei ena ma8iti  student
        System.out.println("Do you wish to add a student? press Y for yes or N for no! ");
        //edw diavazw tb apantisi t xristi kai an einai 8etikh mpenw stn loopa kai sinexizw tis erwtiseis
        while (scanner.next().equalsIgnoreCase("y")){
        //ftiaxnw mia metavliti student gia na parei tis times apo tis aoantiseis t xristi
            Student student = new Student();
        //se ka8e 8etiko input vazw tn timi p diavazw sto antistixo setter ths metavlitis
            System.out.println("Enter the students first name");
            student.setFirstName(scanner.next());

            System.out.println("Enter the students last name");
            student.setLastName(scanner.next());

            System.out.println("Enter the students Date of birth");
            student.setDateOfBirth(scanner.next());

            System.out.println("Enter the students Tuition fees");
            student.setTuitionFees(scanner.nextInt());
        //mollis teleiwsw tis erwtiseis pros8etw tn ma8iti stn lista me tous ma8ites
            students.add(student);
        //telos rwtaw an 8elei n pros8esw allon ma8iti g na epanaliu8ei i loopa
            System.out.println("Do you wish to add another student? press Y for yes or N for No! ");
        }
    }
}
