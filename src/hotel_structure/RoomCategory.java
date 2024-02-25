package hotel_structure;

public enum RoomCategory {

    DOUBLE ("dbl"),
    TWIN ("twin"),
    DOUBLE_PLUS("dbl+"),
    TWIN_PLUS("twin+");

    private final String roomMainCategoryName;

    RoomCategory(String roomMainCategoryName) {
        this.roomMainCategoryName = roomMainCategoryName;
    }

    public String getRoomMainCategoryName() {
        return roomMainCategoryName;
    }
}
