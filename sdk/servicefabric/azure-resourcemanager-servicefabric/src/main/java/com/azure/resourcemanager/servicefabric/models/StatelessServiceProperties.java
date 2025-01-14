// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The properties of a stateless service resource. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "serviceKind")
@JsonTypeName("Stateless")
@Fluent
public final class StatelessServiceProperties extends ServiceResourceProperties {
    /*
     * The instance count.
     */
    @JsonProperty(value = "instanceCount")
    private Integer instanceCount;

    /*
     * Delay duration for RequestDrain feature to ensures that the endpoint advertised by the stateless instance is
     * removed before the delay starts prior to closing the instance. This delay enables existing requests to drain
     * gracefully before the instance actually goes down
     * (https://docs.microsoft.com/en-us/azure/service-fabric/service-fabric-application-upgrade-advanced#avoid-connection-drops-during-stateless-service-planned-downtime-preview).
     * It is represented in ISO 8601 format (hh:mm:ss.s).
     */
    @JsonProperty(value = "instanceCloseDelayDuration")
    private String instanceCloseDelayDuration;

    /** Creates an instance of StatelessServiceProperties class. */
    public StatelessServiceProperties() {
    }

    /**
     * Get the instanceCount property: The instance count.
     *
     * @return the instanceCount value.
     */
    public Integer instanceCount() {
        return this.instanceCount;
    }

    /**
     * Set the instanceCount property: The instance count.
     *
     * @param instanceCount the instanceCount value to set.
     * @return the StatelessServiceProperties object itself.
     */
    public StatelessServiceProperties withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * Get the instanceCloseDelayDuration property: Delay duration for RequestDrain feature to ensures that the endpoint
     * advertised by the stateless instance is removed before the delay starts prior to closing the instance. This delay
     * enables existing requests to drain gracefully before the instance actually goes down
     * (https://docs.microsoft.com/en-us/azure/service-fabric/service-fabric-application-upgrade-advanced#avoid-connection-drops-during-stateless-service-planned-downtime-preview).
     * It is represented in ISO 8601 format (hh:mm:ss.s).
     *
     * @return the instanceCloseDelayDuration value.
     */
    public String instanceCloseDelayDuration() {
        return this.instanceCloseDelayDuration;
    }

    /**
     * Set the instanceCloseDelayDuration property: Delay duration for RequestDrain feature to ensures that the endpoint
     * advertised by the stateless instance is removed before the delay starts prior to closing the instance. This delay
     * enables existing requests to drain gracefully before the instance actually goes down
     * (https://docs.microsoft.com/en-us/azure/service-fabric/service-fabric-application-upgrade-advanced#avoid-connection-drops-during-stateless-service-planned-downtime-preview).
     * It is represented in ISO 8601 format (hh:mm:ss.s).
     *
     * @param instanceCloseDelayDuration the instanceCloseDelayDuration value to set.
     * @return the StatelessServiceProperties object itself.
     */
    public StatelessServiceProperties withInstanceCloseDelayDuration(String instanceCloseDelayDuration) {
        this.instanceCloseDelayDuration = instanceCloseDelayDuration;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StatelessServiceProperties withServiceTypeName(String serviceTypeName) {
        super.withServiceTypeName(serviceTypeName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StatelessServiceProperties withPartitionDescription(PartitionSchemeDescription partitionDescription) {
        super.withPartitionDescription(partitionDescription);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StatelessServiceProperties withServicePackageActivationMode(
        ArmServicePackageActivationMode servicePackageActivationMode) {
        super.withServicePackageActivationMode(servicePackageActivationMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StatelessServiceProperties withServiceDnsName(String serviceDnsName) {
        super.withServiceDnsName(serviceDnsName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StatelessServiceProperties withPlacementConstraints(String placementConstraints) {
        super.withPlacementConstraints(placementConstraints);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StatelessServiceProperties withCorrelationScheme(List<ServiceCorrelationDescription> correlationScheme) {
        super.withCorrelationScheme(correlationScheme);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StatelessServiceProperties withServiceLoadMetrics(List<ServiceLoadMetricDescription> serviceLoadMetrics) {
        super.withServiceLoadMetrics(serviceLoadMetrics);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StatelessServiceProperties withServicePlacementPolicies(
        List<ServicePlacementPolicyDescription> servicePlacementPolicies) {
        super.withServicePlacementPolicies(servicePlacementPolicies);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StatelessServiceProperties withDefaultMoveCost(MoveCost defaultMoveCost) {
        super.withDefaultMoveCost(defaultMoveCost);
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
