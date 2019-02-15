package schoolPackage;

import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int tuitionFees;

//    public Student() {
//        firstName = "George";
//
//    }
//
//    public Student(String firstName, String lastName, String dateOfBirth, int tuitionFees) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.dateOfBirth = dateOfBirth;
//        this.tuitionFees = tuitionFees;
//    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(int tuitionFees) {
        this.tuitionFees = tuitionFees;
    }
}
