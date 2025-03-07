package net.datafaker;

/**
 * @since 1.5.0
 */
public class IndustrySegments extends AbstractProvider {

    protected IndustrySegments(Faker faker) {
        super(faker);
    }

    public String industry() {
        return faker.resolve("industry_segments.industry");
    }

    public String superSector() {
        return faker.resolve("industry_segments.super_sector");
    }

    public String sector() {
        return faker.resolve("industry_segments.sector");
    }

    public String subSector() {
        return faker.resolve("industry_segments.sub_sector");
    }

}
