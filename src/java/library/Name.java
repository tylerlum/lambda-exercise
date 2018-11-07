package library;

public class Name {
    private String firstName;
    private String lastName;
    private String middleName = null;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
	this.lastName = lastName;
    }

    public Name(String firstName, String lastName, String middleName) {
        this(firstName, lastName);
	this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean hasMiddleName() {
        return middleName != null;
    }

    public String getMiddleName() {
        return middleName;
    }

}
