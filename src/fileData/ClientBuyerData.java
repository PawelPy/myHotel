package fileData;

public class ClientBuyerData extends Data{

    private String firstName;
    private String surname;
    private String nipNumber;


    public String getNipNumber() {
        return nipNumber;
    }
    public void setNipNumber(String nipNumber) {
        this.nipNumber = nipNumber;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
}
