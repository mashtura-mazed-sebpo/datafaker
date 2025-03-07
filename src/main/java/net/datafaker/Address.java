package net.datafaker;

/**
 * @since 0.8.0
 */
public class Address extends AbstractProvider{
    protected Address(Faker faker) {
        super(faker);
    }

    public String streetName() {
        return faker.fakeValuesService().resolve("address.street_name", this);
    }

    public String streetAddressNumber() {
        return String.valueOf(faker.random().nextInt(1000));
    }

    public String streetAddress() {
        return faker.fakeValuesService().resolve("address.street_address", this);
    }

    public String streetAddress(boolean includeSecondary) {
        String streetAddress = faker.fakeValuesService().resolve("address.street_address", this);
        if (includeSecondary) {
            streetAddress = streetAddress + " " + secondaryAddress();
        }
        return streetAddress;
    }

    public String secondaryAddress() {
        return faker.numerify(faker.fakeValuesService().resolve("address.secondary_address", this));
    }

    /**
     * Returns a String representing a standard 5-digit zip code.
     *
     * @return a String representing a standard zip code
     */
    public String zipCode() {
        return faker.bothify(faker.fakeValuesService().resolve("address.postcode", this));
    }

    public String postcode() {
        return faker.bothify(faker.fakeValuesService().resolve("address.postcode", this));
    }

    /**
     * Returns a String representing a ZIP+4 code for greater geographic specificity.
     * This is a 9-digit zip code, but the String itself is 10 characters including the hyphen.
     *
     * @return a String representing a ZIP+4 code
     */
    public String zipCodePlus4() {
        return faker.bothify(faker.fakeValuesService().resolve("address.postcode_plus_four", this));
    }

    public String zipCodeByState(String stateAbbr) {
        return faker.fakeValuesService().resolve("address.postcode_by_state." + stateAbbr, this);
    }

    public String countyByZipCode(String postCode) {
        return faker.fakeValuesService().resolve("address.county_by_postcode." + postCode, this, faker, () -> "County are not configured for postcode " + postCode);
    }

    public String streetSuffix() {
        return faker.fakeValuesService().resolve("address.street_suffix", this);
    }

    public String streetPrefix() {
        return faker.fakeValuesService().resolve("address.street_prefix", this);
    }

    public String citySuffix() {
        return faker.fakeValuesService().resolve("address.city_suffix", this);
    }

    public String cityPrefix() {
        return faker.fakeValuesService().resolve("address.city_prefix", this);
    }

    public String city() {
        return faker.fakeValuesService().resolve("address.city", this);
    }

    public String cityName() {
        return faker.fakeValuesService().resolve("address.city_name", this);
    }

    public String state() {
        return faker.fakeValuesService().resolve("address.state", this);
    }

    public String stateAbbr() {
        return faker.fakeValuesService().resolve("address.state_abbr", this);
    }

    /**
     * @return Returns the latitude, a number between -90 to 90.
     */
    public String latitude() {
        return String.format(faker.getLocale(), "%.8f", (faker.random().nextDouble() * 180) - 90);
    }

    /**
     * @return Returns the longitude, a number between -180 and 180
     */
    public String longitude() {
        return String.format(faker.getLocale(), "%.8f", (faker.random().nextDouble() * 360) - 180);
    }

    /**
     * @return Returns the lat/lon coordinates formatted as lat,lon.
     */
    public String latLon() {
        return latLon(",");
    }

    /**
     * @return Returns the lat/lon coordinates formatted as lat delimiter lon.
     */
    public String latLon(String delimiter) {
        return latitude() + delimiter + longitude();
    }

    /**
     * @return Returns the lat/lon coordinates formatted as lon,lat.
     */
    public String lonLat() {
        return lonLat(",");
    }

    /**
     * @return Returns the lat/lon coordinates formatted as lon delimiter lat.
     */
    public String lonLat(String delimiter) {
        return longitude() + delimiter + latitude();
    }

    public String timeZone() {
        return faker.fakeValuesService().resolve("address.time_zone", this);
    }

    public String country() {
        return faker.fakeValuesService().resolve("address.country", this);
    }

    public String countryCode() {
        return faker.fakeValuesService().resolve("address.country_code", this);
    }

    public String buildingNumber() {
        return faker.numerify(faker.fakeValuesService().resolve("address.building_number", this));
    }

    public String fullAddress() {
        return faker.fakeValuesService().resolve("address.full_address", this);
    }

    public String mailBox() {
        return faker.numerify(faker.fakeValuesService().resolve("address.mail_box", this));
    }
}
