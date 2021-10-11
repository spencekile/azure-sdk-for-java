// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.billing.models.AddressDetails;
import com.azure.resourcemanager.billing.models.BillingAccountUpdateRequest;

/** Samples for BillingAccounts Update. */
public final class BillingAccountsUpdateSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2020-05-01/examples/UpdateBillingAccount.json
     */
    /**
     * Sample code: UpdateBillingAccount.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void updateBillingAccount(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingAccounts()
            .update(
                "{billingAccountName}",
                new BillingAccountUpdateRequest()
                    .withDisplayName("Test Account")
                    .withSoldTo(
                        new AddressDetails()
                            .withFirstName("Test")
                            .withLastName("User")
                            .withCompanyName("Contoso")
                            .withAddressLine1("Test Address 1")
                            .withCity("Redmond")
                            .withRegion("WA")
                            .withCountry("US")
                            .withPostalCode("12345")),
                Context.NONE);
    }
}