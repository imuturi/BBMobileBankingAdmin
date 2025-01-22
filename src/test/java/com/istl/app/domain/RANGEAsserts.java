package com.istl.app.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class RangeAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertRangeAllPropertiesEquals(Range expected, Range actual) {
        assertRangeAutoGeneratedPropertiesEquals(expected, actual);
        assertRangeAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertRangeAllUpdatablePropertiesEquals(Range expected, Range actual) {
        assertRangeUpdatableFieldsEquals(expected, actual);
        assertRangeUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertRangeAutoGeneratedPropertiesEquals(Range expected, Range actual) {
        assertThat(expected)
            .as("Verify Range auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertRangeUpdatableFieldsEquals(Range expected, Range actual) {
        assertThat(expected)
            .as("Verify Range relevant properties")
            .satisfies(e -> assertThat(e.getRangefrom()).as("check rangefrom").isEqualTo(actual.getRangefrom()))
            .satisfies(e -> assertThat(e.getRangeto()).as("check rangeto").isEqualTo(actual.getRangeto()))
            .satisfies(e -> assertThat(e.getAmount()).as("check amount").isEqualTo(actual.getAmount()))
            .satisfies(e -> assertThat(e.getTxntype()).as("check txntype").isEqualTo(actual.getTxntype()))
            .satisfies(e -> assertThat(e.getTxncode()).as("check txncode").isEqualTo(actual.getTxncode()))
            .satisfies(e -> assertThat(e.getChargeid()).as("check chargeid").isEqualTo(actual.getChargeid()))
            .satisfies(e -> assertThat(e.getChannel()).as("check channel").isEqualTo(actual.getChannel()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertRangeUpdatableRelationshipsEquals(Range expected, Range actual) {
        // empty method
    }
}
