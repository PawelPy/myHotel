package fileData;

public class HotelUserData extends Data{

    private final String login;
    private final String loginPassword;

    public HotelUserData(int fileId, String firstName, String surname, String login, String loginPassword) {
        super(fileId, firstName, surname);
        this.login = login;
        this.loginPassword = loginPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getLoginPassword() {
        return loginPassword;
    }
}
