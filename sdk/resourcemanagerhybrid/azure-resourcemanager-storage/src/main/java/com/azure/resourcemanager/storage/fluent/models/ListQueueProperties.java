// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The ListQueueProperties model. */
@Fluent
public final class ListQueueProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ListQueueProperties.class);

    /*
     * A name-value pair that represents queue metadata.
     */
    @JsonProperty(value = "metadata")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> metadata;

    /**
     * Get the metadata property: A name-value pair that represents queue metadata.
     *
     * @return the metadata value.
     */
    public Map<String, String> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: A name-value pair that represents queue metadata.
     *
     * @param metadata the metadata value to set.
     * @return the ListQueueProperties object itself.
     */
    public ListQueueProperties withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
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