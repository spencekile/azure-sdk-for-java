// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerservice.models.ManagedClusterPoolUpgradeProfile;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Control plane and agent pool upgrade profiles. */
@Fluent
public final class ManagedClusterUpgradeProfileProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedClusterUpgradeProfileProperties.class);

    /*
     * The list of available upgrade versions for the control plane.
     */
    @JsonProperty(value = "controlPlaneProfile", required = true)
    private ManagedClusterPoolUpgradeProfile controlPlaneProfile;

    /*
     * The list of available upgrade versions for agent pools.
     */
    @JsonProperty(value = "agentPoolProfiles", required = true)
    private List<ManagedClusterPoolUpgradeProfile> agentPoolProfiles;

    /**
     * Get the controlPlaneProfile property: The list of available upgrade versions for the control plane.
     *
     * @return the controlPlaneProfile value.
     */
    public ManagedClusterPoolUpgradeProfile controlPlaneProfile() {
        return this.controlPlaneProfile;
    }

    /**
     * Set the controlPlaneProfile property: The list of available upgrade versions for the control plane.
     *
     * @param controlPlaneProfile the controlPlaneProfile value to set.
     * @return the ManagedClusterUpgradeProfileProperties object itself.
     */
    public ManagedClusterUpgradeProfileProperties withControlPlaneProfile(
        ManagedClusterPoolUpgradeProfile controlPlaneProfile) {
        this.controlPlaneProfile = controlPlaneProfile;
        return this;
    }

    /**
     * Get the agentPoolProfiles property: The list of available upgrade versions for agent pools.
     *
     * @return the agentPoolProfiles value.
     */
    public List<ManagedClusterPoolUpgradeProfile> agentPoolProfiles() {
        return this.agentPoolProfiles;
    }

    /**
     * Set the agentPoolProfiles property: The list of available upgrade versions for agent pools.
     *
     * @param agentPoolProfiles the agentPoolProfiles value to set.
     * @return the ManagedClusterUpgradeProfileProperties object itself.
     */
    public ManagedClusterUpgradeProfileProperties withAgentPoolProfiles(
        List<ManagedClusterPoolUpgradeProfile> agentPoolProfiles) {
        this.agentPoolProfiles = agentPoolProfiles;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (controlPlaneProfile() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property controlPlaneProfile in model"
                            + " ManagedClusterUpgradeProfileProperties"));
        } else {
            controlPlaneProfile().validate();
        }
        if (agentPoolProfiles() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property agentPoolProfiles in model ManagedClusterUpgradeProfileProperties"));
        } else {
            agentPoolProfiles().forEach(e -> e.validate());
        }
    }
}