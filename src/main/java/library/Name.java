package library;

/* DO NOT CHANGE */

public class Name {
    private String firstName;
    private String lastName;

    /**
     * Name Constructor
     *
     * @param firstName the first name
     *
     * @param lastName the last name
     */
    public Name(String firstName, String lastName) {
        this.firstName = firstName;
	this.lastName = lastName;
    }

    /**
     * @return String first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return String last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return int hashcode of Name
     */
    @Override
    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode();
    }

    /**
     * Check equality to name
     *
     * @param o other object to compare with 
     *
     * @return boolean true iff o is equal to Name
     */
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
	} else if (o instanceof Name) {
            Name on = (Name)o;
            return firstName.equals(on.firstName) && lastName.equals(on.lastName);
	} else {
            return false;
	}
    }
}
