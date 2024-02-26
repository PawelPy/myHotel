
import fileData.Country;
import fileData.HotelObjectData;
import hotel_structure.HotelRoomStructure;
import currency.Currency;
import service.Service;
import service.ServiceKind;
import service.VatRate;

public class Main {

    public static void main(String[] args) {

        HotelObjectData hotel = new HotelObjectData();
        hotel.setHotelName("myHotel");
        hotel.setStreet("Długa");
        hotel.setHouseNumber("45");
        hotel.setCountryCode("32-061");
        hotel.setCountry(Country.POLAND);

        HotelRoomStructure hotelRoomStructure = new HotelRoomStructure();

        Service wino = new Service("wino 10cl", "wino 10cl", ServiceKind.ALCOHOL_B, 15.0, Currency.PLN, VatRate.VAT_23, false);
        Service nocleg = new Service("nocleg", "nocleg", ServiceKind.ACCOMMODATION, 300.0, Currency.PLN, VatRate.VAT_8, false);
        Service sniadanie = new Service("śniadanie", "śniadanie", ServiceKind.BREAKFAST, 60.0, Currency.PLN, VatRate.VAT_8, true);
        Service zupaRybna = new Service("zupa rybna", "zupa rybna", ServiceKind.FOOD, 35.0, Currency.PLN, VatRate.VAT_8, false);
        Service kawa = new Service("kawa", "kawa", ServiceKind.BEVERAGE, 15.0, Currency.PLN, VatRate.VAT_23, true);


    }
}
