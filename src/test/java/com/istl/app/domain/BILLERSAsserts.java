package com.istl.app.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class BillersAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertBillersAllPropertiesEquals(Billers expected, Billers actual) {
        assertBillersAutoGeneratedPropertiesEquals(expected, actual);
        assertBillersAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertBillersAllUpdatablePropertiesEquals(Billers expected, Billers actual) {
        assertBillersUpdatableFieldsEquals(expected, actual);
        assertBillersUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertBillersAutoGeneratedPropertiesEquals(Billers expected, Billers actual) {
        assertThat(expected)
            .as("Verify Billers auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertBillersUpdatableFieldsEquals(Billers expected, Billers actual) {
        assertThat(expected)
            .as("Verify Billers relevant properties")
            .satisfies(e -> assertThat(e.getBillerid()).as("check billerid").isEqualTo(actual.getBillerid()))
            .satisfies(e -> assertThat(e.getDescription()).as("check description").isEqualTo(actual.getDescription()))
            .satisfies(e ->
                assertThat(e.getBillercollectionaccount())
                    .as("check billercollectionaccount")
                    .isEqualTo(actual.getBillercollectionaccount())
            )
            .satisfies(e -> assertThat(e.getDatecreated()).as("check datecreated").isEqualTo(actual.getDatecreated()))
            .satisfies(e -> assertThat(e.getCreatedby()).as("check createdby").isEqualTo(actual.getCreatedby()))
            .satisfies(e -> assertThat(e.getApproved()).as("check approved").isEqualTo(actual.getApproved()))
            .satisfies(e -> assertThat(e.getApprovedby()).as("check approvedby").isEqualTo(actual.getApprovedby()))
            .satisfies(e -> assertThat(e.getApproveddate()).as("check approveddate").isEqualTo(actual.getApproveddate()))
            .satisfies(e -> assertThat(e.getChargableproductid()).as("check chargableproductid").isEqualTo(actual.getChargableproductid()))
            .satisfies(e ->
                assertThat(e.getNonchargableproductid()).as("check nonchargableproductid").isEqualTo(actual.getNonchargableproductid())
            )
            .satisfies(e ->
                assertThat(e.getUsdbillercollectionaccount())
                    .as("check usdbillercollectionaccount")
                    .isEqualTo(actual.getUsdbillercollectionaccount())
            )
            .satisfies(e ->
                assertThat(e.getEnableduplicatecheck()).as("check enableduplicatecheck").isEqualTo(actual.getEnableduplicatecheck())
            )
            .satisfies(e -> assertThat(e.getRemarks()).as("check remarks").isEqualTo(actual.getRemarks()))
            .satisfies(e -> assertThat(e.getSessionid()).as("check sessionid").isEqualTo(actual.getSessionid()))
            .satisfies(e -> assertThat(e.getReworkby()).as("check reworkby").isEqualTo(actual.getReworkby()))
            .satisfies(e -> assertThat(e.getStatus()).as("check status").isEqualTo(actual.getStatus()))
            .satisfies(e -> assertThat(e.getActive()).as("check active").isEqualTo(actual.getActive()))
            .satisfies(e -> assertThat(e.getRework()).as("check rework").isEqualTo(actual.getRework()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertBillersUpdatableRelationshipsEquals(Billers expected, Billers actual) {
        // empty method
    }
}
