// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;

/** The GremlinDatabaseGetPropertiesOptions model. */
@Fluent
public final class GremlinDatabaseGetPropertiesOptions extends OptionsResource {
    /** Creates an instance of GremlinDatabaseGetPropertiesOptions class. */
    public GremlinDatabaseGetPropertiesOptions() {
    }

    /** {@inheritDoc} */
    @Override
    public GremlinDatabaseGetPropertiesOptions withThroughput(Integer throughput) {
        super.withThroughput(throughput);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GremlinDatabaseGetPropertiesOptions withAutoscaleSettings(AutoscaleSettings autoscaleSettings) {
        super.withAutoscaleSettings(autoscaleSettings);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
