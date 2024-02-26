package fileData;

public class ClientPersonalData extends Data{

    private String nationality;
    private String idNumber;
    private String firstName;
    private String surname;


    public ClientPersonalData() {
        this.nationality = getNationality();
        this.idNumber = getIdNumber();
        this.firstName = getFirstName();
        this.surname = getSurname();
    }

    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
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
