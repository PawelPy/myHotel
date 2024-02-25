package fileData;

public enum Country {

    POLAND ("Poland", "PL"),
    DENMARK ("Denmark", "DK"),
    GREAT_BRITAIN ("Great Britain", "GB"),
    GERMANY ("Germany", "DE");

    private final String countryName;
    private final String countrySymbol;

    Country(String name, String countrySymbol) {
        this.countryName = name;
        this.countrySymbol = countrySymbol;
    }


    public String getCountryName() {
        return countryName;
    }

    public String getCountrySymbol() {
        return countrySymbol;
    }
}
