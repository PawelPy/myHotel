package hotel_structure;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Room {

    private final RoomNumber roomNumber;
    private final String roomName;

    private final RoomStandard roomStandard;
    private final RoomCategory roomCategory;
    private final HotelFloor roomFloor;
    private final Map<Bed, Integer> roomBeds = new HashMap<>();

    protected Room(RoomNumber roomNumber, String roomName, RoomStandard roomStandard, RoomCategory roomCategory, HotelFloor roomFloor) {
        this.roomNumber = roomNumber;
        this.roomName = roomName;
        this.roomStandard = roomStandard;
        this.roomCategory = roomCategory;
        this.roomFloor = roomFloor;
    }

    void setRoomBeds(Bed bedKind, int bedNumber) {
        this.getRoomBeds().put(bedKind, bedNumber);
    }

    public RoomNumber getRoomNumber() {
        return roomNumber;
    }

    public String getRoomName() {
        return roomName;
    }

    public RoomStandard getRoomStandard() {
        return roomStandard;
    }

    public RoomCategory getRoomCategory() {
        return roomCategory;
    }

    public HotelFloor getRoomFloor() {
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
