package ProjectClasses;
/**
 * Class to define people information
 * @author Alejandro Ruiz Rios
 * @version 1
 */
public abstract class Person {
    protected String ID;
    protected String name;
    protected String phoneNumber;
    protected String email;

    /**
     * Constructor with parameters
     * @param ID A String with the person ID
     * @param name A String with the person name
     * @param phoneNumber A String with the person phone number
     * @param email A String with the person email
     */
    public Person(String ID, String name, String phoneNumber, String email){
        this.ID = ID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    @Override
    public String toString() {
        return "User{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
