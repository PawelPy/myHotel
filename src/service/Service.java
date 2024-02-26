package service;

import currency.Currency;

public class Service {

    private final String serviceName;
    private final String serviceNameOnDocument;
    private final ServiceKind serviceKind;
    private final VatRate vatRate;
    private final double priceGross;
    private final Currency currency;
    private final boolean isPriceFinal;

    public Service(String serviceName, String serviceNameOnDocument, ServiceKind serviceKind, double priceGross, Currency currency, VatRate vatRate, boolean isPriceFinal) {
        this.serviceName = serviceName;
        this.serviceNameOnDocument = serviceNameOnDocument;
        this.serviceKind = serviceKind;
        this.vatRate = vatRate;
        this.priceGross = priceGross;
        this.currency = currency;
        this.isPriceFinal = isPriceFinal;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getServiceNameOnDocument() {
        return serviceNameOnDocument;
    }

    public ServiceKind getServiceKind() {
        return serviceKind;
    }

    public VatRate getVatRate() {
        return vatRate;
    }

    public double getPriceGross() {
        return priceGross;
    }

    public boolean isPriceFinal() {
        return isPriceFinal;
    }

    public Currency getCurrency() {
        return currency;
    }
}
