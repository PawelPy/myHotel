package rooms;

public enum Category {

    DOUBLE ("dbl"),
    TWIN ("twin"),
    DBL_TRPL ("d_trpl"),
    TWIN_TRPL ("t_trpl");

    private final String roomMainCategoryName;

    Category(String roomMainCategoryname) {
        this.roomMainCategoryName = roomMainCategoryname;
    }

    public String getRoomMainCategoryName() {
        return roomMainCategoryName;
    }
}
