package rooms;

public enum Number {

    ROOM_NO_101 (101),
    ROOM_NO_102 (102),
    ROOM_NO_103 (103),

    ROOM_NO_201 (201),
    ROOM_NO_202 (202),
    ROOM_NO_203 (203),

    ROOM_NO_301 (301),
    ROOM_NO_302 (302),
    ROOM_NO_303 (303);

    private final int roomNumber;

    Number(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

}
