// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Private Endpoint resource. */
@Fluent
public final class PrivateEndpoint {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateEndpoint.class);

    /*
     * This is private endpoint resource created with Microsoft.Network
     * resource provider.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the id property: This is private endpoint resource created with Microsoft.Network resource provider.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: This is private endpoint resource created with Microsoft.Network resource provider.
     *
     * @param id the id value to set.
     * @return the PrivateEndpoint object itself.
     */
    public PrivateEndpoint withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}