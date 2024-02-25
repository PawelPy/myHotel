package hotel_structure;

public enum HotelFloor {

    FLOOR_1(1),
    FLOOR_2 (2),
    FLOOR_3 (3);

    private int floorNumber;

    HotelFloor(int floorNumber) {
    }


    public int getFloorNumber() {
        return floorNumber;
    }
}
