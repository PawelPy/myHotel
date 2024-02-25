package rooms;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Room {

    private final Number roomNumber;
    private final String roomName;

    private final Standard roomStandard;
    private final Category roomCategory;
    private final Floor roomFloor;
    private final Map<Bed, Integer> roomBeds = new HashMap<>();

    protected Room(Number roomNumber, String roomName, Standard roomStandard, Category roomCategory, Floor roomFloor) {
        this.roomNumber = roomNumber;
        this.roomName = roomName;
        this.roomStandard = roomStandard;
        this.roomCategory = roomCategory;
        this.roomFloor = roomFloor;
    }

    void setRoomBeds(Bed bedKind, int bedNumber) {
        this.getRoomBeds().put(bedKind, bedNumber);
    }

    public Number getRoomNumber() {
        return roomNumber;
    }

    public String getRoomName() {
        return roomName;
    }

    public Standard getRoomStandard() {
        return roomStandard;
    }

    public Standard getRoomCategory() {
        return roomStandard;
    }

    public Floor getRoomFloor() {
        return roomFloor;
    }

    public Map<Bed, Integer> getRoomBeds() {
        return roomBeds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room room)) return false;
        return getRoomNumber() == room.getRoomNumber() && Objects.equals(getRoomName(), room.getRoomName()) && getRoomCategory() == room.getRoomCategory() && getRoomFloor() == room.getRoomFloor() && Objects.equals(getRoomBeds(), room.getRoomBeds());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRoomNumber(), getRoomName(), getRoomCategory(), getRoomFloor(), getRoomBeds());
    }
}
