package ProjectClasses;

/**
 * Class to define people information
 * @author Alejandro Ruiz Rios
 * @version 1
 */

public class Administrator extends Person {
    /**
     * Constructor with parameters
     *
     * @param ID          A String with the person ID
     * @param name        A String with the person name
     * @param phoneNumber A String with the person phone number
     * @param email       A String with the person email
     */
    public Administrator(String ID, String name, String phoneNumber, String email) {
        super(ID, name, phoneNumber, email);
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}
