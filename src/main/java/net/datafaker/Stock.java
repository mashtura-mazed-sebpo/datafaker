package net.datafaker;

/**
 * @since 0.8.0
 */
public class Stock extends AbstractProvider {

    protected Stock(Faker faker) {
        super(faker);
    }

    public String nsdqSymbol() {
        return faker.fakeValuesService().resolve("stock.symbol_nsdq", this);
    }

    public String nyseSymbol() {
        return faker.fakeValuesService().resolve("stock.symbol_nyse", this);
    }

}
