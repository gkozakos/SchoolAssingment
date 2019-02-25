package schoolPackage;

import java.util.ArrayList;

public class Course {
    private String title;
    private String stream;
    private String type;
    private String startDate;
    private String endDate;
    public ArrayList<Student> getCourseStudents() {
        return courseStudents;
    }

    public void setCourseStudents(ArrayList<Student> courseStudents) {
        this.courseStudents = courseStudents;
    }

    private ArrayList<Student> courseStudents;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }


    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", stream='" + stream + '\'' +
                ", type='" + type + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", courseStudents=" + courseStudents +
                '}';
    }
}
