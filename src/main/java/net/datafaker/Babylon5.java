package net.datafaker;

/**
 * @since 0.9.0
 */
public class Babylon5 extends AbstractProvider {

    protected Babylon5(Faker faker) {
        super(faker);
    }

    public String character() {
        return faker.resolve("babylon5.characters");
    }

    public String quote() {
        return faker.resolve("babylon5.quotes");
    }
}
