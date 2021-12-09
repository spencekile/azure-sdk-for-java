// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for AvailableServiceAliases ListByResourceGroup. */
public final class AvailableServiceAliasesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/AvailableServiceAliasesListByResourceGroup.json
     */
    /**
     * Sample code: Get available service aliases in the resource group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAvailableServiceAliasesInTheResourceGroup(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getAvailableServiceAliases()
            .listByResourceGroup("rg1", "westcentralus", Context.NONE);
    }
}