// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DeletedSite resource specific properties. */
@Immutable
public final class DeletedSiteProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeletedSiteProperties.class);

    /*
     * Numeric id for the deleted site
     */
    @JsonProperty(value = "deletedSiteId", access = JsonProperty.Access.WRITE_ONLY)
    private Integer deletedSiteId;

    /*
     * Time in UTC when the app was deleted.
     */
    @JsonProperty(value = "deletedTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String deletedTimestamp;

    /*
     * Subscription containing the deleted site
     */
    @JsonProperty(value = "subscription", access = JsonProperty.Access.WRITE_ONLY)
    private String subscription;

    /*
     * ResourceGroup that contained the deleted site
     */
    @JsonProperty(value = "resourceGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGroup;

    /*
     * Name of the deleted site
     */
    @JsonProperty(value = "deletedSiteName", access = JsonProperty.Access.WRITE_ONLY)
    private String deletedSiteName;

    /*
     * Slot of the deleted site
     */
    @JsonProperty(value = "slot", access = JsonProperty.Access.WRITE_ONLY)
    private String slot;

    /*
     * Kind of site that was deleted
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * Geo Region of the deleted site
     */
    @JsonProperty(value = "geoRegionName", access = JsonProperty.Access.WRITE_ONLY)
    private String geoRegionName;

    /**
     * Get the deletedSiteId property: Numeric id for the deleted site.
     *
     * @return the deletedSiteId value.
     */
    public Integer deletedSiteId() {
        return this.deletedSiteId;
    }

    /**
     * Get the deletedTimestamp property: Time in UTC when the app was deleted.
     *
     * @return the deletedTimestamp value.
     */
    public String deletedTimestamp() {
        return this.deletedTimestamp;
    }

    /**
     * Get the subscription property: Subscription containing the deleted site.
     *
     * @return the subscription value.
     */
    public String subscription() {
        return this.subscription;
    }

    /**
     * Get the resourceGroup property: ResourceGroup that contained the deleted site.
     *
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Get the deletedSiteName property: Name of the deleted site.
     *
     * @return the deletedSiteName value.
     */
    public String deletedSiteName() {
        return this.deletedSiteName;
    }

    /**
     * Get the slot property: Slot of the deleted site.
     *
     * @return the slot value.
     */
    public String slot() {
        return this.slot;
    }

    /**
     * Get the kind property: Kind of site that was deleted.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the geoRegionName property: Geo Region of the deleted site.
     *
     * @return the geoRegionName value.
     */
    public String geoRegionName() {
        return this.geoRegionName;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}