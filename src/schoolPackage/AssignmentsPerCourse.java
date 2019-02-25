package schoolPackage;

public class AssignmentsPerCourse {
    private  String assignment;
    private String  course;

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "AssignmentsPerCourse{" +
                "assignment='" + assignment + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
