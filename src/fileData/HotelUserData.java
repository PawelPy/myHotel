package fileData;

public class HotelUserData extends Data{

    private final String login;
    private final String loginPassword;

    public HotelUserData(String firstName, String surname, String login, String loginPassword) {
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
