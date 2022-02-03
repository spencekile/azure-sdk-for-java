// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Consent property bag. */
@Fluent
public final class OfficeConsentProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OfficeConsentProperties.class);

    /*
     * The tenantId of the Office365 with the consent.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /*
     * Help to easily cascade among the data layers.
     */
    @JsonProperty(value = "consentId")
    private String consentId;

    /**
     * Get the tenantId property: The tenantId of the Office365 with the consent.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The tenantId of the Office365 with the consent.
     *
     * @param tenantId the tenantId value to set.
     * @return the OfficeConsentProperties object itself.
     */
    public OfficeConsentProperties withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the consentId property: Help to easily cascade among the data layers.
     *
     * @return the consentId value.
     */
    public String consentId() {
        return this.consentId;
    }

    /**
     * Set the consentId property: Help to easily cascade among the data layers.
     *
     * @param consentId the consentId value to set.
     * @return the OfficeConsentProperties object itself.
     */
    public OfficeConsentProperties withConsentId(String consentId) {
        this.consentId = consentId;
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