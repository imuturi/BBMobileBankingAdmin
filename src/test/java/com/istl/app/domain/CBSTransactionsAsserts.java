package com.istl.app.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class CBSTransactionsAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertCBSTransactionsAllPropertiesEquals(CBSTransactions expected, CBSTransactions actual) {
        assertCBSTransactionsAutoGeneratedPropertiesEquals(expected, actual);
        assertCBSTransactionsAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertCBSTransactionsAllUpdatablePropertiesEquals(CBSTransactions expected, CBSTransactions actual) {
        assertCBSTransactionsUpdatableFieldsEquals(expected, actual);
        assertCBSTransactionsUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertCBSTransactionsAutoGeneratedPropertiesEquals(CBSTransactions expected, CBSTransactions actual) {
        assertThat(expected)
            .as("Verify CBSTransactions auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertCBSTransactionsUpdatableFieldsEquals(CBSTransactions expected, CBSTransactions actual) {
        assertThat(expected)
            .as("Verify CBSTransactions relevant properties")
            .satisfies(e -> assertThat(e.getMessageid()).as("check messageid").isEqualTo(actual.getMessageid()))
            .satisfies(e -> assertThat(e.getChannelcode()).as("check channelcode").isEqualTo(actual.getChannelcode()))
            .satisfies(e -> assertThat(e.getMessagetype()).as("check messagetype").isEqualTo(actual.getMessagetype()))
            .satisfies(e -> assertThat(e.getTranscurrency()).as("check transcurrency").isEqualTo(actual.getTranscurrency()))
            .satisfies(e -> assertThat(e.getDebtorsname()).as("check debtorsname").isEqualTo(actual.getDebtorsname()))
            .satisfies(e -> assertThat(e.getDebtorsaccountid()).as("check debtorsaccountid").isEqualTo(actual.getDebtorsaccountid()))
            .satisfies(e -> assertThat(e.getDebtorsphone()).as("check debtorsphone").isEqualTo(actual.getDebtorsphone()))
            .satisfies(e -> assertThat(e.getCreditorsname()).as("check creditorsname").isEqualTo(actual.getCreditorsname()))
            .satisfies(e -> assertThat(e.getCreditorsaccountid()).as("check creditorsaccountid").isEqualTo(actual.getCreditorsaccountid()))
            .satisfies(e -> assertThat(e.getCreditorsphone()).as("check creditorsphone").isEqualTo(actual.getCreditorsphone()))
            .satisfies(e -> assertThat(e.getNarration()).as("check narration").isEqualTo(actual.getNarration()))
            .satisfies(e -> assertThat(e.getExternalreference()).as("check externalreference").isEqualTo(actual.getExternalreference()))
            .satisfies(e -> assertThat(e.getCbsreference()).as("check cbsreference").isEqualTo(actual.getCbsreference()))
            .satisfies(e -> assertThat(e.getCbsstatus()).as("check cbsstatus").isEqualTo(actual.getCbsstatus()))
            .satisfies(e -> assertThat(e.getCbsstatusdesc()).as("check cbsstatusdesc").isEqualTo(actual.getCbsstatusdesc()))
            .satisfies(e -> assertThat(e.getRequestInstanttime()).as("check requestInstanttime").isEqualTo(actual.getRequestInstanttime()))
            .satisfies(e -> assertThat(e.getRequestjson()).as("check requestjson").isEqualTo(actual.getRequestjson()))
            .satisfies(e -> assertThat(e.getCbsrequestxml()).as("check cbsrequestxml").isEqualTo(actual.getCbsrequestxml()))
            .satisfies(e -> assertThat(e.getCbsresponsexml()).as("check cbsresponsexml").isEqualTo(actual.getCbsresponsexml()))
            .satisfies(e -> assertThat(e.getAmount()).as("check amount").isEqualTo(actual.getAmount()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertCBSTransactionsUpdatableRelationshipsEquals(CBSTransactions expected, CBSTransactions actual) {
        // empty method
    }
}
