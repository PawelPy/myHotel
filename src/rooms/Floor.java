package rooms;

public enum Floor {

    FLOOR_1(1),
    FLOOR_2 (2),
    FLOOR_3 (3);

    private int floorNumber;

    Floor(int floorNumber) {
    }


    public int getFloorNumber() {
        return floorNumber;
    }
}
