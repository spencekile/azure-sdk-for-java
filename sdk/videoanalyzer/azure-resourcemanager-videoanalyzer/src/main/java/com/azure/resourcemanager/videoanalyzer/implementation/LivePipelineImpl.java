// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.videoanalyzer.fluent.models.LivePipelineInner;
import com.azure.resourcemanager.videoanalyzer.models.LivePipeline;
import com.azure.resourcemanager.videoanalyzer.models.LivePipelineState;
import com.azure.resourcemanager.videoanalyzer.models.LivePipelineUpdate;
import com.azure.resourcemanager.videoanalyzer.models.ParameterDefinition;
import java.util.Collections;
import java.util.List;

public final class LivePipelineImpl implements LivePipeline, LivePipeline.Definition, LivePipeline.Update {
    private LivePipelineInner innerObject;

    private final com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String topologyName() {
        return this.innerModel().topologyName();
    }

    public String description() {
        return this.innerModel().description();
    }

    public int bitrateKbps() {
        return this.innerModel().bitrateKbps();
    }

    public LivePipelineState state() {
        return this.innerModel().state();
    }

    public List<ParameterDefinition> parameters() {
        List<ParameterDefinition> inner = this.innerModel().parameters();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public LivePipelineInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String livePipelineName;

    private LivePipelineUpdate updateParameters;

    public LivePipelineImpl withExistingVideoAnalyzer(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public LivePipeline create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLivePipelines()
                .createOrUpdateWithResponse(
                    resourceGroupName, accountName, livePipelineName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public LivePipeline create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLivePipelines()
                .createOrUpdateWithResponse(
                    resourceGroupName, accountName, livePipelineName, this.innerModel(), context)
                .getValue();
        return this;
    }

    LivePipelineImpl(String name, com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager) {
        this.innerObject = new LivePipelineInner();
        this.serviceManager = serviceManager;
        this.livePipelineName = name;
    }

    public LivePipelineImpl update() {
        this.updateParameters = new LivePipelineUpdate();
        return this;
    }

    public LivePipeline apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLivePipelines()
                .updateWithResponse(resourceGroupName, accountName, livePipelineName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public LivePipeline apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLivePipelines()
                .updateWithResponse(resourceGroupName, accountName, livePipelineName, updateParameters, context)
                .getValue();
        return this;
    }

    LivePipelineImpl(
        LivePipelineInner innerObject, com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "videoAnalyzers");
        this.livePipelineName = Utils.getValueFromIdByName(innerObject.id(), "livePipelines");
    }

    public LivePipeline refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLivePipelines()
                .getWithResponse(resourceGroupName, accountName, livePipelineName, Context.NONE)
                .getValue();
        return this;
    }

    public LivePipeline refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getLivePipelines()
                .getWithResponse(resourceGroupName, accountName, livePipelineName, context)
                .getValue();
        return this;
    }

    public void activate() {
        serviceManager.livePipelines().activate(resourceGroupName, accountName, livePipelineName);
    }

    public void activate(Context context) {
        serviceManager.livePipelines().activate(resourceGroupName, accountName, livePipelineName, context);
    }

    public void deactivate() {
        serviceManager.livePipelines().deactivate(resourceGroupName, accountName, livePipelineName);
    }

    public void deactivate(Context context) {
        serviceManager.livePipelines().deactivate(resourceGroupName, accountName, livePipelineName, context);
    }

    public LivePipelineImpl withTopologyName(String topologyName) {
        if (isInCreateMode()) {
            this.innerModel().withTopologyName(topologyName);
            return this;
        } else {
            this.updateParameters.withTopologyName(topologyName);
            return this;
        }
    }

    public LivePipelineImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.innerModel().withDescription(description);
            return this;
        } else {
            this.updateParameters.withDescription(description);
            return this;
        }
    }

    public LivePipelineImpl withBitrateKbps(int bitrateKbps) {
        this.innerModel().withBitrateKbps(bitrateKbps);
        return this;
    }

    public LivePipelineImpl withParameters(List<ParameterDefinition> parameters) {
        if (isInCreateMode()) {
            this.innerModel().withParameters(parameters);
            return this;
        } else {
            this.updateParameters.withParameters(parameters);
            return this;
        }
    }

    public LivePipelineImpl withBitrateKbps(Integer bitrateKbps) {
        this.updateParameters.withBitrateKbps(bitrateKbps);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}