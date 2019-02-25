package schoolPackage;

public class Assignment {
    private String title;
    private String description;
    private String dueDate;
    private double oralMark;
    private int totalMark;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public double getOralMark() {
        return oralMark;
    }

    public void setOralMark(double oralMark) {
        this.oralMark = oralMark;
    }

    public int getTotalMark(double v) {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", oralMark=" + oralMark +
                ", totalMark=" + totalMark +
                '}';
    }
}
