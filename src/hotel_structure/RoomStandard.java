package hotel_structure;

public enum RoomStandard {

    STANDARD ("standard"),
    BUSINESS ("biznes"),
    SUITE ("suite"),
    ECONOMY ("ekonomik");

    private final String roomStandardName;

    RoomStandard(String roomStandardName) {
        this.roomStandardName = roomStandardName;
    }

    public String getRoomStandardName() {
        return roomStandardName;
    }

    @Override
    public String toString() {
        return roomStandardName;
    }
}
