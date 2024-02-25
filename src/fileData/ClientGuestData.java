package fileData;

public class ClientGuestData extends Data{

    private String nationality;
    private String iDNumber;
    private String firstName;
    private String surname;
    private String companyName;
    private String nipNumber;

    public ClientGuestData() {
        this.nationality = getNationality();
        this.iDNumber = getiDNumber();
        this.firstName = getFirstName();
        this.surname = getSurname();
        this.companyName = getCompanyName();
        this.nipNumber = getNipNumber();
    }

    public String getNipNumber() {
        return nipNumber;
    }
    public void setNipNumber(String nipNumber) {
        this.nipNumber = nipNumber;
    }

    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getiDNumber() {
        return iDNumber;
    }
    public void setiDNumber(String iDNumber) {
        this.iDNumber = iDNumber;
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

    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
