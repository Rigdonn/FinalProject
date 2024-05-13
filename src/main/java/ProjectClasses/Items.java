package ProjectClasses;

import java.util.Date;

/**
 * Class to define people information
 * @author Alejandro Ruiz Rios
 * @version 1
 */
public class Items {
    private String ID;
    private String name;
    private Date dateOfReport;

    /**
     * Constructor with parameters
     *
     * @param ID          A String with the person ID
     * @param name        A String with the person name
     * @param dateOfReport A Date with the date of object report(format: dd/mm/yyyy)
     */
    public Items(String ID, String name, Date dateOfReport) {
        this.ID = ID;
        this.name = name;
        this.dateOfReport = dateOfReport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfReport() {
        return dateOfReport;
    }

    public void setDateOfReport(Date dateOfReport) {
        this.dateOfReport = dateOfReport;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Items{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", dateOfReport=" + dateOfReport +
                '}';
    }
}
