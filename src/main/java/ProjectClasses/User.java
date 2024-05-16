package ProjectClasses;
/**
 * Class to define people information
 * @author Alejandro Ruiz Rios
 * @version 1
 */
public class User extends Person{

    protected String addres;

    /**
     * Constructor with parameters
     * @param addres A String with the person addres
     */
    public User(String ID, String name, String phoneNumber, String email, String addres) {
        super(ID, name, phoneNumber, email);
        this.addres = addres;
    }
    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public void reportLostObject(){

    }
    @Override
    public String toString() {
        return "User{" +
                "addres='" + addres + '\'' +
                ", ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
