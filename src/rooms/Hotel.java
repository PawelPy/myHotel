package rooms;

public class Hotel {

    public Hotel() {

        Room room101 = new Room(Number.ROOM_NO_101, "aa", Standard.STANDARD, Category.DOUBLE, Floor.FLOOR_1);
        room101.setRoomBeds(Bed.BED_140, 1);

        Room room102 = new Room(Number.ROOM_NO_102, "ab", Standard.ECONOMY, Category.DOUBLE, Floor.FLOOR_1);
        room101.setRoomBeds(Bed.BED_140, 1);

        Room room103 = new Room(Number.ROOM_NO_103, "ac", Standard.ECONOMY, Category.DBL_TRPL, Floor.FLOOR_1);
        room101.setRoomBeds(Bed.BED_140, 1);
        room101.setRoomBeds(Bed.BED_90, 2);


        Room room201 = new Room(Number.ROOM_NO_201, "ba", Standard.STANDARD, Category.TWIN, Floor.FLOOR_2);
        room101.setRoomBeds(Bed.BED_90, 2);

        Room room202 = new Room(Number.ROOM_NO_202, "bb", Standard.STANDARD, Category.TWIN, Floor.FLOOR_2);
        room101.setRoomBeds(Bed.BED_90, 2);

        Room room203 = new Room(Number.ROOM_NO_203, "bc", Standard.BUSINESS, Category.TWIN, Floor.FLOOR_2);
        room101.setRoomBeds(Bed.BED_90, 2);


        Room room301 = new Room(Number.ROOM_NO_301, "ca", Standard.SUITE, Category.DOUBLE, Floor.FLOOR_1);
        room101.setRoomBeds(Bed.BED_160, 1);

        Room room302 = new Room(Number.ROOM_NO_302, "cb", Standard.SUITE, Category.TWIN_TRPL, Floor.FLOOR_3);
        room101.setRoomBeds(Bed.BED_90, 3);

        Room room303 = new Room(Number.ROOM_NO_303, "cc", Standard.BUSINESS, Category.DBL_TRPL, Floor.FLOOR_3);
        room101.setRoomBeds(Bed.BED_160, 1);
        room101.setRoomBeds(Bed.BED_90, 1);

    }







}
