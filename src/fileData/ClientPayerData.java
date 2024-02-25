package fileData;

public class ClientPayerData extends Data{

    private String companyName;
    private String nipNumber;


    public String getNipNumber() {
        return nipNumber;
    }
    public void setNipNumber(String nipNumber) {
        this.nipNumber = nipNumber;
    }

    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
