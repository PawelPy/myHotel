package hotel_structure;

public class HotelRoomStructure {

    public HotelRoomStructure() {

        Room room101 = new Room(RoomNumber.ROOM_NO_101, "aa", RoomStandard.STANDARD, RoomCategory.DOUBLE, HotelFloor.FLOOR_1);
        room101.setRoomBeds(Bed.BED_140, 1);

        Room room102 = new Room(RoomNumber.ROOM_NO_102, "ab", RoomStandard.ECONOMY, RoomCategory.DOUBLE, HotelFloor.FLOOR_1);
        room101.setRoomBeds(Bed.BED_140, 1);

        Room room103 = new Room(RoomNumber.ROOM_NO_103, "ac", RoomStandard.ECONOMY, RoomCategory.DOUBLE_PLUS, HotelFloor.FLOOR_1);
        room101.setRoomBeds(Bed.BED_140, 1);
        room101.setRoomBeds(Bed.BED_90, 2);


        Room room201 = new Room(RoomNumber.ROOM_NO_201, "ba", RoomStandard.STANDARD, RoomCategory.TWIN, HotelFloor.FLOOR_2);
        room101.setRoomBeds(Bed.BED_90, 2);

        Room room202 = new Room(RoomNumber.ROOM_NO_202, "bb", RoomStandard.STANDARD, RoomCategory.TWIN, HotelFloor.FLOOR_2);
        room101.setRoomBeds(Bed.BED_90, 2);

        Room room203 = new Room(RoomNumber.ROOM_NO_203, "bc", RoomStandard.BUSINESS, RoomCategory.TWIN, HotelFloor.FLOOR_2);
        room101.setRoomBeds(Bed.BED_90, 2);


        Room room301 = new Room(RoomNumber.ROOM_NO_301, "ca", RoomStandard.SUITE, RoomCategory.DOUBLE, HotelFloor.FLOOR_1);
        room101.setRoomBeds(Bed.BED_160, 1);

        Room room302 = new Room(RoomNumber.ROOM_NO_302, "cb", RoomStandard.SUITE, RoomCategory.TWIN_PLUS, HotelFloor.FLOOR_3);
        room101.setRoomBeds(Bed.BED_90, 3);

        Room room303 = new Room(RoomNumber.ROOM_NO_303, "cc", RoomStandard.BUSINESS, RoomCategory.DOUBLE_PLUS, HotelFloor.FLOOR_3);
        room101.setRoomBeds(Bed.BED_160, 1);
        room101.setRoomBeds(Bed.BED_90, 1);

    }







}
