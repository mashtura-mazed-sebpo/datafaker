package net.datafaker;

/**
 * Community is an American television sitcom created by Dan Harmon.
 *
 * @since 1.6.0
 */
public class Community extends AbstractProvider {

    protected Community(Faker faker) {
        super(faker);
    }

    public String character() {
        return faker.resolve("community.characters");
    }

    public String quote() {
        return faker.resolve("community.quotes");
    }
}
