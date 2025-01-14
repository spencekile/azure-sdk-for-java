// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Library resource info. */
@Immutable
public final class LibraryResourceInfo {
    /*
     * Fully qualified resource ID for the resource. Ex -
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * record Id of the library/package.
     */
    @JsonProperty(value = "recordId", access = JsonProperty.Access.WRITE_ONLY)
    private Integer recordId;

    /*
     * Provisioning status of the library/package.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private String state;

    /*
     * The creation time of the library/package.
     */
    @JsonProperty(value = "created", access = JsonProperty.Access.WRITE_ONLY)
    private String created;

    /*
     * The last updated time of the library/package.
     */
    @JsonProperty(value = "changed", access = JsonProperty.Access.WRITE_ONLY)
    private String changed;

    /*
     * The type of the resource. E.g. LibraryArtifact
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Name of the library/package.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Operation Id of the operation performed on library/package.
     */
    @JsonProperty(value = "operationId", access = JsonProperty.Access.WRITE_ONLY)
    private String operationId;

    /*
     * artifact Id of the library/package.
     */
    @JsonProperty(value = "artifactId", access = JsonProperty.Access.WRITE_ONLY)
    private String artifactId;

    /** Creates an instance of LibraryResourceInfo class. */
    public LibraryResourceInfo() {}

    /**
     * Get the id property: Fully qualified resource ID for the resource. Ex -
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the recordId property: record Id of the library/package.
     *
     * @return the recordId value.
     */
    public Integer getRecordId() {
        return this.recordId;
    }

    /**
     * Get the state property: Provisioning status of the library/package.
     *
     * @return the state value.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Get the created property: The creation time of the library/package.
     *
     * @return the created value.
     */
    public String getCreated() {
        return this.created;
    }

    /**
     * Get the changed property: The last updated time of the library/package.
     *
     * @return the changed value.
     */
    public String getChanged() {
        return this.changed;
    }

    /**
     * Get the type property: The type of the resource. E.g. LibraryArtifact.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Get the name property: Name of the library/package.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the operationId property: Operation Id of the operation performed on library/package.
     *
     * @return the operationId value.
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * Get the artifactId property: artifact Id of the library/package.
     *
     * @return the artifactId value.
     */
    public String getArtifactId() {
        return this.artifactId;
    }
}
