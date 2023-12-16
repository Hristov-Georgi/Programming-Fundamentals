package objectsAndClasses.ex_04_Students;

public class Students {

    private String firstName;
    private String lastName;
    private double grade;

    public Students(String firstName, String lastName, double grade) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getGrade() {
        return this.grade;
    }

    public String toString() {
        return String.format("%s %s: %.2f", this.firstName, this.lastName, this.grade);
    }
}
