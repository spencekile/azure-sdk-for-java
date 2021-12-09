// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Class to contain criteria for item level restore. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "objectType",
    defaultImpl = ItemLevelRestoreCriteria.class)
@JsonTypeName("ItemLevelRestoreCriteria")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "RangeBasedItemLevelRestoreCriteria", value = RangeBasedItemLevelRestoreCriteria.class)
})
@Immutable
public class ItemLevelRestoreCriteria {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ItemLevelRestoreCriteria.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}