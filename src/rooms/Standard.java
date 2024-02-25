package rooms;

public enum Standard {

    STANDARD ("standard"),
    BUSINESS ("biznes"),
    SUITE ("suite"),
    ECONOMY ("ekonomik");

    private final String roomStandardName;

    Standard(String roomStandardName) {
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
