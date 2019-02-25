package schoolPackage;

import java.util.ArrayList;

public class AssignmentPerStudent {
    private Assignment assignment;
    private ArrayList<Student> students;

    public AssignmentPerStudent() {
        students = new ArrayList<>();
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "AssignmentPerStudent{" +
                "assignment=" + assignment +
                ", students=" + students +
                '}';
    }
}
