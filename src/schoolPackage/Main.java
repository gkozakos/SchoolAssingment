package schoolPackage;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // edw arxikopoiw to scanner pou 8a diavazei tis apantiseis tou xrhsth
        Scanner scanner = new Scanner(System.in);

        //edw arxikopoiw tis listes mou
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Trainer> trainers = new ArrayList<>();
        ArrayList<Assignment> assignments = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<CoursePerStudent> coursePerStudents = new ArrayList<>();
        ArrayList<TrainersPerCourse> trainersPerCourses = new ArrayList<>();
        ArrayList<AssignmentsPerCourse> assignmentsPerCourses = new ArrayList<>();
        ArrayList<AssignmentPerStudent> assignmentPerStudentss = new ArrayList<>();

        showMenu();
        while (scanner.nextInt()!=5) {
            switch (scanner.nextInt()){
                case 1:
                    createStudents(students, scanner);
                    break;
                case 2:
                    createTrainers(trainers, scanner );
                    break;
                case 3:
                    createAssignments(assignments, scanner);
                    break;
                case 4:
                    createCourses(courses, scanner);
                    break;
            }
        }

        if (students.isEmpty()){
            Student student1 = new Student();
            student1.setFirstName("George");
            student1.setLastName("papadopoulos");
            student1.setDateOfBirth("20/06/1989");
            student1.setTuitionFees(1000);
            students.add(student1);
            Student student2 = new Student();
            student2.setFirstName("George");
            student2.setLastName("kozakos");
            student2.setDateOfBirth("15/06/1989");
            student2.setTuitionFees(1000);
            students.add(student2);
            Student student3 = new Student();
            student3.setFirstName("Nikos");
            student3.setLastName("Tzavelekos");
            student3.setDateOfBirth("8/08/1988");
            student3.setTuitionFees(1000);
            students.add(student3);
            Student student4 = new Student();
            student4.setFirstName("Antwnis");
            student4.setLastName("segkanis");
            student4.setDateOfBirth("23/01/1990");
            student4.setTuitionFees(1000);
            students.add(student4);
        }
        if (assignments.isEmpty()){
            Assignment assignment1 = new Assignment();
            assignment1.setTitle("Coffee Shop");
            assignment1.setDescription("present the coffee menu");
            assignment1.setDueDate("15/02/2019");
            assignment1.setOralMark(25);
            assignment1.setTotalMark(70);
            assignments.add(assignment1);
            Assignment assignment2 = new Assignment();
            assignment2.setTitle("Coffee Shop");
            assignment2.setDescription("present the coffee menu");
            assignment2.setDueDate("15/02/2019");
            assignment2.setOralMark(20);
            assignment2.setTotalMark(80);
            assignments.add(assignment2);
            Assignment assignment3 = new Assignment();
            assignment3.setTitle("Coffee Shop");
            assignment3.setDescription("present the coffee menu");
            assignment3.setDueDate("15/02/2019");
            assignment3.setOralMark(40);
            assignment3.setTotalMark(70);
            assignments.add(assignment3);
        }
        if (courses.isEmpty()){
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
        }
        //        simpirwse ta ifs
        if (trainers.isEmpty()) {
            Trainer trainer1 = new Trainer();
            trainer1.setFirstName("Tasos");
            trainer1.setLastName("panagiwtou");
            trainer1.setSubject("Java");
            trainers.add(trainer1);
            Trainer trainer2 = new Trainer();
            trainer2.setFirstName("Giwrgos");
            trainer2.setLastName("Theoxaris");
            trainer2.setSubject("C#");
            trainers.add(trainer2);
            Trainer trainer3 = new Trainer();
            trainer3.setFirstName("Thomas");
            trainer3.setLastName("Mpariampas");
            trainer3.setSubject("Java Expert");
            trainers.add(trainer3);
            Trainer trainer4 = new Trainer();
            trainer4.setFirstName("Sarantis");
            trainer4.setLastName("Makoudis");
            trainer4.setSubject("C# Expert");
            trainers.add(trainer4);
        }

        System.out.println("Students:");
        for (int i=0; i<students.size(); i++){
            Student student = students.get(i);
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
        System.out.println("Assignments:");
        for (int i=0; i<assignments.size(); i++){
            Assignment assignment = assignments.get(i);
            System.out.println(assignment.getTitle());
        }
        System.out.println("Trainers:");
        for (int i=0; i<trainers.size(); i++){
            Trainer trainer = trainers.get(i);
            System.out.println(trainer.getFirstName() + " " + trainer.getLastName());
        }
        System.out.println("Courses:");
        for (int i=0; i<courses.size(); i++){
            Course course = courses.get(i);
            System.out.println(course.getTitle());
        }

        for ( int i =0; i < assignments.size(); i++){
            AssignmentPerStudent assignmentPerStudent = new AssignmentPerStudent();
            assignmentPerStudent.setAssignment(assignments.get(i));

            for(int j =0; j < students.size(); j++){
                assignmentPerStudent.getStudents().add(students.get(j));
            }
            assignmentPerStudentss.add(assignmentPerStudent);
        }

    }

    private static void showMenu(){
        System.out.println("Press 1 if you want to add a new student,\n" +
                "Press 2 if you want to add a new trainer,\n" +
                "Press 3 if you want to add a new assignment,\n" +
                "Press 4 if you want to add a new courses\n" +
                "Press 5 if you want to quit!\n" +
                "You can add a synthetic data for each of these option if you dont add an option!\n");

    }

    private static void createStudents(ArrayList<Student> students, Scanner scanner) {

            //ftiaxnw mia metavliti student gia na parei tis times apo tis aoantiseis t xristi
            Student student = new Student();
            //se ka8e 8etiko input vazw tn timi p diavazw sto antistixo setter ths metavlitis
            System.out.println("Enter the students first name");
            student.setFirstName(scanner.next());

            System.out.println("Enter the students last name");
            student.setLastName(scanner.next());

            System.out.println("Enter the students Date of birth in dd/MM/yyyy format");
            student.setDateOfBirth(scanner.next());

            System.out.println("Enter the students Tuition fees");
            student.setTuitionFees(scanner.nextInt());
            //mollis teleiwsw tis erwtiseis pros8etw tn ma8iti stn lista me tous ma8ites
            students.add(student);
            //telos rwtaw an 8elei n pros8esw allon ma8iti g na epanaliu8ei i loopa
            showMenu();

    }

    private static void createAssignments(ArrayList<Assignment> assignments, Scanner scanner) {

               Assignment assignment = new Assignment();
            System.out.println("Please put the Assignment title");
            assignment.setTitle(scanner.next());
            System.out.println("Please write the description of the assignment");
            assignment.setDescription(scanner.next());
            System.out.println("Please enter the due date of the assignment");
            assignment.setDueDate(scanner.next());
            System.out.println("Please enter your oral mark!");
            assignment.setOralMark(scanner.nextDouble());
            System.out.println("Please enter your total mark");
            assignment.getTotalMark(scanner.nextDouble());
            assignments.add(assignment);
            showMenu();

    }


    private static void createCourses(ArrayList<Course> courses, Scanner scanner) {

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
            showMenu();

    }
    private static void createTrainers(ArrayList<Trainer> trainers, Scanner scanner) {

            Trainer trainer = new Trainer();
            System.out.println("Enter the trainers first name");
            trainer.setFirstName(scanner.next());
            System.out.println("Enter the trainers last name");
            trainer.setLastName(scanner.next());
            System.out.println("Enter your subject");
            trainer.setSubject(scanner.next());
            trainers.add(trainer);
            showMenu();


    }


}
