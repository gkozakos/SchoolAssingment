package schoolPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Trainer> trainers = new ArrayList<Trainer>();
        ArrayList<Assignment> assignments = new ArrayList<Assignment>();
        ArrayList<Course> courses = new ArrayList<Course>();

        Scanner scanner = new Scanner(System.in);
        createStudents(students, scanner);
        createTrainers(trainers, scanner);
        createAssignments(assignments, scanner);
    }

    private static void createAssignments(ArrayList<Assignment> assignments, Scanner scanner) {
        System.out.println("Do you wish to add an assignment? press Y for yes or N for no");
        while (scanner.next().equalsIgnoreCase("y")) {
               Assignment assignment = new Assignment();
            System.out.println("Please put the Assignment title");


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
        System.out.println("Do you wish to add a student? press Y for yes or N for No! ");
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
