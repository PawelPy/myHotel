package service;

public enum ServiceKind {

    ACCOMMODATION("NOCLEG"),
    CONFERENCE_ROOM("KONFERENCJA"),
    BEVERAGE("NAPÓJ"),
    FOOD("JEDZENIE"),
    BREAKFAST("ŚNIADANIE"),
    ALCOHOL_A("ALKOHOL do 4.5% & PIWO"),
    ALCOHOL_B("ALKOHOL 4.5% - 18%"),
    ALCOHOL_C("ALKOHOL pow. 18%"),
    OTHER("INNE");


    private final String serviceKindName;

    ServiceKind(String serviceKindName) {
        this.serviceKindName = serviceKindName;
    }

    public String getServiceKindName() {
        return serviceKindName;
    }
}