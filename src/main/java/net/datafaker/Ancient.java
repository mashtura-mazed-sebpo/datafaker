package net.datafaker;

/**
 * @since 0.8.0
 */
public class Ancient extends AbstractProvider {

    protected Ancient(Faker faker) {
        super(faker);
    }

    public String god() {
        return faker.resolve("ancient.god");
    }

    public String primordial() {
        return faker.resolve("ancient.primordial");
    }

    public String titan() {
        return faker.resolve("ancient.titan");
    }

    public String hero() {
        return faker.resolve("ancient.hero");
    }
}
