package service;

public enum VatRate {

    VAT_23("23%", 0.23),
    VAT_8("8%", 0.08),
    VAT_0("0%", 0.0),
    VAT_NP("NP", 0.0),
    VAT_ZW("ZW", 0.0);


    private final String vatRateName;
    private final double vatRate;


    VatRate(String vatRateName, double vatRate) {
        this.vatRateName = vatRateName;
        this.vatRate = vatRate;
    }

    public String getVatRateName() {
        return vatRateName;
    }

    public double getVatRate() {
        return vatRate;
    }
}
