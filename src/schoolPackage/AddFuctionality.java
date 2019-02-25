package schoolPackage;

import java.util.ArrayList;
import java.util.Scanner;
import static schoolPackage.Menus.*;



public class AddFuctionality {
    public static void createStudents(ArrayList<Student> students,ArrayList<Course> courses,ArrayList<CoursePerStudent> coursePerStudents, Scanner scanner) {
        autoUserMenu();
        int userInput = 0;
        while (userInput != 3) {
            userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    while (true) {

                        Student student = new Student();
                        System.out.println("Enter the student's first name");
                        student.setFirstName(scanner.next());

                        System.out.println("Enter the student's last name");
                        student.setLastName(scanner.next());

                        System.out.println("Enter the student's Date of birth in dd/MM/yyyy format");
                        student.setDateOfBirth(scanner.next());

                        System.out.println("Enter the student's Tuition fees");
                        student.setTuitionFees(scanner.nextInt());
                        System.out.println("Choose your course ");
                        for (int i = 0; i < courses.size(); i++) {
                            Course course = courses.get(i);
                            System.out.println(i + "." + course.getTitle());
                        }
                        int userInput2 = scanner.nextInt();
                        CoursePerStudent coursePerStudent = new CoursePerStudent();
                        coursePerStudent.setCourse(courses.get(userInput2).getTitle());
                        coursePerStudent.setStudent(student.getFirstName() + " " + student.getLastName());
                        coursePerStudents.add(coursePerStudent);

                        students.add(student);
                        System.out.println("Do you want to add another student? \n" +
                                "1.yes \n" +
                                "2.no");
                        if (scanner.nextInt() == 2) {
                            userInput=3;

                            break;
                        }
                    }
                    break;
                case 2:
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
                    userInput=3;
                    break;
                default:
                    break;
            }

        }

    }

    public static void createAssignments(ArrayList<Assignment> assignments, ArrayList<Course> courses,
                                         ArrayList<AssignmentsPerCourse> assignmentsPerCourses,
                                         ArrayList<Student> students,
                                         ArrayList<AssignmentPerStudent> assignmentPerStudentss,
                                         Scanner scanner) {
        autoUserMenu();
        int userInput = 0;
        while (userInput != 3) {
            userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    while (true) {
                        Assignment assignment = new Assignment();
                        System.out.println("Please put the Assignment's title");
                        assignment.setTitle(scanner.next());
                        System.out.println("Please write the description of the assignment");
                        assignment.setDescription(scanner.next());
                        System.out.println("Please enter the due date of the assignment");
                        assignment.setDueDate(scanner.next());
                        System.out.println("Please enter your oral mark!");
                        assignment.setOralMark(scanner.nextDouble());
                        System.out.println("Please enter your total mark");
                        assignment.getTotalMark(scanner.nextDouble());
                        System.out.println("Choose your course ");
                        for (int i = 0; i < courses.size(); i++) {
                            Course course = courses.get(i);
                            System.out.println(i + "." + course.getTitle());
                        }
                        int userInput2 = scanner.nextInt();
                        AssignmentsPerCourse assignmentsPerCourse = new AssignmentsPerCourse();
                        assignmentsPerCourse.setCourse(courses.get(userInput2).getTitle());
                        assignmentsPerCourse.setAssignment(assignment.getTitle());
                        assignmentsPerCourses.add(assignmentsPerCourse);
                        assignments.add(assignment);
                        if(!students.isEmpty()) {
                            ArrayList<Student> selectedStudents = new ArrayList<>();
                            while (true) {

                                System.out.println("Add students into assignments");
                                for (int i = 0; i < students.size(); i++) {
                                    Student student = students.get(i);
                                    System.out.println(i + "." + student.getLastName());
                                }
                                int userInput3 = scanner.nextInt();
                                selectedStudents.add(students.get(userInput3));
                                System.out.println("Do you want to add another student into assignment? \n" +
                                        "1.yes \n" +
                                        "2.no");
                                userInput3 = scanner.nextInt();
                                if (userInput3 == 2) {
                                    break;
                                }
                            }
                            AssignmentPerStudent assignmentPerStudent = new AssignmentPerStudent();
                            assignmentPerStudent.setAssignment(assignment);
                            assignmentPerStudent.setStudents(selectedStudents);
                            assignmentPerStudentss.add(assignmentPerStudent);

                        }
                        System.out.println("Do you want to add another Assignment? \n" +
                                "1.yes \n" +
                                "2.no");
                        if (scanner.nextInt() == 2) {
                            userInput=3;

                            break;
                        }
                    }
                    break;
                case 2:
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
                    userInput=3;
                    break;
                default:
                    break;
            }

        }

    }

    public static void createCourses(ArrayList<Course> courses, Scanner scanner) {
        autoUserMenu();
        int userInput = 0;
        while (userInput != 3) {
            userInput = scanner.nextInt();

            switch (userInput) {

                case 1:
                    while (true) {
                        Course course = new Course();
                        System.out.println("Please put the course's title");
                        course.setTitle(scanner.nextLine());
                        System.out.println("Please enter the stream course press a for java,\n " +
                                "b for C#,\n " +
                                "c for java expert and,\n " +
                                "d for C# expert,\n");
                        if (scanner.next().equalsIgnoreCase("a"))
//            course.setStream(scanner.nextLine());
                            System.out.println("Please enter the type of the course");
                        course.setType(scanner.next());
                        System.out.println("please enter the starting date of the course");
                        course.setStartDate(scanner.next());
                        System.out.println("Please enter the end date of the course");
                        course.setEndDate(scanner.next());
                        courses.add(course);
                        System.out.println("Do you want to add another course? \n" +
                                "1.yes \n" +
                                "2.no");
                        if (scanner.nextInt() == 2) {
                            userInput=3;

                            break;
                        }
                    }
                    break;
                case 2:
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
                    userInput=3;

                    break;
                default:
                    break;
            }

        }

    }

    public static void createTrainers(ArrayList<Trainer> trainers,ArrayList<Course> courses, ArrayList<TrainersPerCourse> trainersPerCourses, Scanner scanner) {
        autoUserMenu();
        int userInput = 0;
        while (userInput != 3) {
            userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    while (true) {
                        Trainer trainer = new Trainer();
                        System.out.println("Enter the trainers first name");
                        trainer.setFirstName(scanner.next());
                        System.out.println("Enter the trainers last name");
                        trainer.setLastName(scanner.next());
                        System.out.println("Enter your subject");
                        trainer.setSubject(scanner.next());
                        trainers.add(trainer);
                        System.out.println("Choose your course ");
                        for (int i = 0; i < courses.size(); i++) {
                            Course course = courses.get(i);
                            System.out.println(i + "." + course.getTitle());
                        }
                        int userInput2 = scanner.nextInt();
                        TrainersPerCourse trainersPerCourse = new TrainersPerCourse();
                        trainersPerCourse.setCourse(courses.get(userInput2).getTitle());
                        trainersPerCourse.setTrainer(trainer.getFirstName());
                        trainersPerCourses.add(trainersPerCourse);
                        System.out.println("Do you want to add another trainer? \n" +
                                "1.yes \n" +
                                "2.no");
                        if (scanner.nextInt() == 2) {
                            userInput=3;

                            break;
                        }
                    }
                    break;
                case 2:
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
                    userInput=3;

                    break;
                    default:
                        break;
            }

        }
    }
}
