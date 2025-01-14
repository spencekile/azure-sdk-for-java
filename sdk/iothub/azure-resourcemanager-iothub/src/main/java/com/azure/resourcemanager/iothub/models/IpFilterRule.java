// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The IP filter rules for the IoT hub. */
@Fluent
public final class IpFilterRule {
    /*
     * The name of the IP filter rule.
     */
    @JsonProperty(value = "filterName", required = true)
    private String filterName;

    /*
     * The desired action for requests captured by this rule.
     */
    @JsonProperty(value = "action", required = true)
    private IpFilterActionType action;

    /*
     * A string that contains the IP address range in CIDR notation for the rule.
     */
    @JsonProperty(value = "ipMask", required = true)
    private String ipMask;

    /**
     * Get the filterName property: The name of the IP filter rule.
     *
     * @return the filterName value.
     */
    public String filterName() {
        return this.filterName;
    }

    /**
     * Set the filterName property: The name of the IP filter rule.
     *
     * @param filterName the filterName value to set.
     * @return the IpFilterRule object itself.
     */
    public IpFilterRule withFilterName(String filterName) {
        this.filterName = filterName;
        return this;
    }

    /**
     * Get the action property: The desired action for requests captured by this rule.
     *
     * @return the action value.
     */
    public IpFilterActionType action() {
        return this.action;
    }

    /**
     * Set the action property: The desired action for requests captured by this rule.
     *
     * @param action the action value to set.
     * @return the IpFilterRule object itself.
     */
    public IpFilterRule withAction(IpFilterActionType action) {
        this.action = action;
        return this;
    }

    /**
     * Get the ipMask property: A string that contains the IP address range in CIDR notation for the rule.
     *
     * @return the ipMask value.
     */
    public String ipMask() {
        return this.ipMask;
    }

    /**
     * Set the ipMask property: A string that contains the IP address range in CIDR notation for the rule.
     *
     * @param ipMask the ipMask value to set.
     * @return the IpFilterRule object itself.
     */
    public IpFilterRule withIpMask(String ipMask) {
        this.ipMask = ipMask;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (filterName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property filterName in model IpFilterRule"));
        }
        if (action() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property action in model IpFilterRule"));
        }
        if (ipMask() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property ipMask in model IpFilterRule"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IpFilterRule.class);
}
