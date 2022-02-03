// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.models.DataConnectorTenantId;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** Threat Intelligence TAXII data connector required properties. */
@Fluent
public final class TiTaxiiCheckRequirementsProperties extends DataConnectorTenantId {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TiTaxiiCheckRequirementsProperties.class);

    /** {@inheritDoc} */
    @Override
    public TiTaxiiCheckRequirementsProperties withTenantId(String tenantId) {
        super.withTenantId(tenantId);
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