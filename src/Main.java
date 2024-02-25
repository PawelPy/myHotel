
import fileData.Country;
import fileData.HotelObjectData;
import hotel_structure.HotelRoomStructure;

public class Main {

    public static void main(String[] args) {

        HotelObjectData hotel = new HotelObjectData();
        hotel.setHotelName("myHotel");
        hotel.setStreet("Długa");
        hotel.setHouseNumber("45");
        hotel.setCountryCode("32-061");
        hotel.setCountry(Country.POLAND);


        HotelRoomStructure hotelRoomStructure = new HotelRoomStructure();


    }
}
