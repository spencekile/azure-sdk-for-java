// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of UrlPathMap of the application gateway. */
@Fluent
public final class ApplicationGatewayUrlPathMapPropertiesFormat {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ApplicationGatewayUrlPathMapPropertiesFormat.class);

    /*
     * Default backend address pool resource of URL path map.
     */
    @JsonProperty(value = "defaultBackendAddressPool")
    private SubResource defaultBackendAddressPool;

    /*
     * Default backend http settings resource of URL path map.
     */
    @JsonProperty(value = "defaultBackendHttpSettings")
    private SubResource defaultBackendHttpSettings;

    /*
     * Default Rewrite rule set resource of URL path map.
     */
    @JsonProperty(value = "defaultRewriteRuleSet")
    private SubResource defaultRewriteRuleSet;

    /*
     * Default redirect configuration resource of URL path map.
     */
    @JsonProperty(value = "defaultRedirectConfiguration")
    private SubResource defaultRedirectConfiguration;

    /*
     * Path rule of URL path map resource.
     */
    @JsonProperty(value = "pathRules")
    private List<ApplicationGatewayPathRuleInner> pathRules;

    /*
     * Provisioning state of the backend http settings resource. Possible
     * values are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "provisioningState")
    private String provisioningState;

    /**
     * Get the defaultBackendAddressPool property: Default backend address pool resource of URL path map.
     *
     * @return the defaultBackendAddressPool value.
     */
    public SubResource defaultBackendAddressPool() {
        return this.defaultBackendAddressPool;
    }

    /**
     * Set the defaultBackendAddressPool property: Default backend address pool resource of URL path map.
     *
     * @param defaultBackendAddressPool the defaultBackendAddressPool value to set.
     * @return the ApplicationGatewayUrlPathMapPropertiesFormat object itself.
     */
    public ApplicationGatewayUrlPathMapPropertiesFormat withDefaultBackendAddressPool(
        SubResource defaultBackendAddressPool) {
        this.defaultBackendAddressPool = defaultBackendAddressPool;
        return this;
    }

    /**
     * Get the defaultBackendHttpSettings property: Default backend http settings resource of URL path map.
     *
     * @return the defaultBackendHttpSettings value.
     */
    public SubResource defaultBackendHttpSettings() {
        return this.defaultBackendHttpSettings;
    }

    /**
     * Set the defaultBackendHttpSettings property: Default backend http settings resource of URL path map.
     *
     * @param defaultBackendHttpSettings the defaultBackendHttpSettings value to set.
     * @return the ApplicationGatewayUrlPathMapPropertiesFormat object itself.
     */
    public ApplicationGatewayUrlPathMapPropertiesFormat withDefaultBackendHttpSettings(
        SubResource defaultBackendHttpSettings) {
        this.defaultBackendHttpSettings = defaultBackendHttpSettings;
        return this;
    }

    /**
     * Get the defaultRewriteRuleSet property: Default Rewrite rule set resource of URL path map.
     *
     * @return the defaultRewriteRuleSet value.
     */
    public SubResource defaultRewriteRuleSet() {
        return this.defaultRewriteRuleSet;
    }

    /**
     * Set the defaultRewriteRuleSet property: Default Rewrite rule set resource of URL path map.
     *
     * @param defaultRewriteRuleSet the defaultRewriteRuleSet value to set.
     * @return the ApplicationGatewayUrlPathMapPropertiesFormat object itself.
     */
    public ApplicationGatewayUrlPathMapPropertiesFormat withDefaultRewriteRuleSet(SubResource defaultRewriteRuleSet) {
        this.defaultRewriteRuleSet = defaultRewriteRuleSet;
        return this;
    }

    /**
     * Get the defaultRedirectConfiguration property: Default redirect configuration resource of URL path map.
     *
     * @return the defaultRedirectConfiguration value.
     */
    public SubResource defaultRedirectConfiguration() {
        return this.defaultRedirectConfiguration;
    }

    /**
     * Set the defaultRedirectConfiguration property: Default redirect configuration resource of URL path map.
     *
     * @param defaultRedirectConfiguration the defaultRedirectConfiguration value to set.
     * @return the ApplicationGatewayUrlPathMapPropertiesFormat object itself.
     */
    public ApplicationGatewayUrlPathMapPropertiesFormat withDefaultRedirectConfiguration(
        SubResource defaultRedirectConfiguration) {
        this.defaultRedirectConfiguration = defaultRedirectConfiguration;
        return this;
    }

    /**
     * Get the pathRules property: Path rule of URL path map resource.
     *
     * @return the pathRules value.
     */
    public List<ApplicationGatewayPathRuleInner> pathRules() {
        return this.pathRules;
    }

    /**
     * Set the pathRules property: Path rule of URL path map resource.
     *
     * @param pathRules the pathRules value to set.
     * @return the ApplicationGatewayUrlPathMapPropertiesFormat object itself.
     */
    public ApplicationGatewayUrlPathMapPropertiesFormat withPathRules(List<ApplicationGatewayPathRuleInner> pathRules) {
        this.pathRules = pathRules;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the backend http settings resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state of the backend http settings resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ApplicationGatewayUrlPathMapPropertiesFormat object itself.
     */
    public ApplicationGatewayUrlPathMapPropertiesFormat withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (pathRules() != null) {
            pathRules().forEach(e -> e.validate());
        }
    }
}