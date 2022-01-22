// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

import com.azure.core.util.Context;

/** Samples for Subscriptions ListLocations. */
public final class SubscriptionsListLocationsSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2021-01-01/examples/GetLocationsWithExtendedLocations.json
     */
    /**
     * Sample code: GetLocationsWithExtendedLocations.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getLocationsWithExtendedLocations(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .genericResources()
            .manager()
            .subscriptionClient()
            .getSubscriptions()
            .listLocations("291bba3f-e0a5-47bc-a099-3bdcb2a50a05", true, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2021-01-01/examples/GetLocations.json
     */
    /**
     * Sample code: GetLocationsWithASubscriptionId.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getLocationsWithASubscriptionId(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .genericResources()
            .manager()
            .subscriptionClient()
            .getSubscriptions()
            .listLocations("291bba3f-e0a5-47bc-a099-3bdcb2a50a05", null, Context.NONE);
    }
}