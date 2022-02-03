// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oep.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.oep.fluent.models.EnergyServiceInner;
import com.azure.resourcemanager.oep.models.EnergyResourceUpdate;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in EnergyServicesClient. */
public interface EnergyServicesClient {
    /**
     * Returns list of oep resources..
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of oep resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EnergyServiceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Returns list of oep resources..
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of oep resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EnergyServiceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists a collection of oep resources under the given Azure Subscription ID.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of oep resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EnergyServiceInner> list();

    /**
     * Lists a collection of oep resources under the given Azure Subscription ID.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of oep resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EnergyServiceInner> list(Context context);

    /**
     * Returns oep resource for a given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EnergyServiceInner getByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Returns oep resource for a given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EnergyServiceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Method that gets called if subscribed for ResourceCreationBegin trigger.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The resource name.
     * @param body Request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<EnergyServiceInner>, EnergyServiceInner> beginCreate(
        String resourceGroupName, String resourceName, EnergyServiceInner body);

    /**
     * Method that gets called if subscribed for ResourceCreationBegin trigger.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The resource name.
     * @param body Request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<EnergyServiceInner>, EnergyServiceInner> beginCreate(
        String resourceGroupName, String resourceName, EnergyServiceInner body, Context context);

    /**
     * Method that gets called if subscribed for ResourceCreationBegin trigger.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The resource name.
     * @param body Request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EnergyServiceInner create(String resourceGroupName, String resourceName, EnergyServiceInner body);

    /**
     * Method that gets called if subscribed for ResourceCreationBegin trigger.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EnergyServiceInner create(String resourceGroupName, String resourceName);

    /**
     * Method that gets called if subscribed for ResourceCreationBegin trigger.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The resource name.
     * @param body Request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EnergyServiceInner create(String resourceGroupName, String resourceName, EnergyServiceInner body, Context context);

    /**
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EnergyServiceInner update(String resourceGroupName, String resourceName);

    /**
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The resource name.
     * @param body The resource model definition used for updating a tracked ARM resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EnergyServiceInner> updateWithResponse(
        String resourceGroupName, String resourceName, EnergyResourceUpdate body, Context context);

    /**
     * Deletes oep resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String resourceName);

    /**
     * Deletes oep resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String resourceName, Context context);

    /**
     * Deletes oep resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String resourceName);

    /**
     * Deletes oep resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String resourceName, Context context);
}