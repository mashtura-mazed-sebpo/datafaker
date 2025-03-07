package net.datafaker;

/**
 * Generate random, different kinds of disease.
 *
 * @since 0.8.0
 */
public class Disease extends AbstractProvider {

    /**
     * Create a constructor for Disease
     *
     * @param faker The Faker instance for generating random, different kinds of disease, e.g. the internal disease.
     */
    protected Disease(Faker faker) {
        super(faker);
    }

    /**
     * Generate random internal disease
     *
     * @return An internal disease
     */
    public String internalDisease() {
        return faker.fakeValuesService().resolve("disease.internal_disease", this);
    }

    /**
     * Generate random neurology disease
     *
     * @return A neurology disease
     */
    public String neurology() {
        return faker.fakeValuesService().resolve("disease.neurology", this);
    }

    /**
     * Generate random surgery disease
     *
     * @return A surgery disease
     */
    public String surgery() {
        return faker.fakeValuesService().resolve("disease.surgery", this);
    }

    /**
     * Generate random paediattics disease
     *
     * @return A paediatrics disease
     */
    public String paediatrics() {
        return faker.fakeValuesService().resolve("disease.paediatrics", this);
    }

    /**
     * Generate random gynecology and obstetrics disease
     *
     * @return A gynecology and obstetrics disease
     */
    public String gynecologyAndObstetrics() {
        return faker.fakeValuesService().resolve("disease.gynecology_and_obstetrics", this);
    }

    /**
     * Generate random ophthalmology and otorhinolaryngology disease
     *
     * @return A ophthalmology and otorhinolaryngology disease
     */
    public String ophthalmologyAndOtorhinolaryngology() {
        return faker.fakeValuesService().resolve("disease.ophthalmology_and_otorhinolaryngology", this);
    }

    /**
     * Generate random dermatolory disease
     *
     * @return A dermatolory disease
     */
    public String dermatolory() {
        return faker.fakeValuesService().resolve("disease.dermatolory", this);
    }

}
