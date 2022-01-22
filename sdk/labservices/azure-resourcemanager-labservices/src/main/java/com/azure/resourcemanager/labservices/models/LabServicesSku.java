// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.resourcemanager.labservices.fluent.models.LabServicesSkuInner;
import java.util.List;

/** An immutable client-side representation of LabServicesSku. */
public interface LabServicesSku {
    /**
     * Gets the resourceType property: The lab services resource type.
     *
     * @return the resourceType value.
     */
    String resourceType();

    /**
     * Gets the name property: The name of the SKU.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the tier property: The tier of the SKU.
     *
     * @return the tier value.
     */
    LabServicesSkuTier tier();

    /**
     * Gets the size property: The SKU size.
     *
     * @return the size value.
     */
    String size();

    /**
     * Gets the family property: The family of the SKU.
     *
     * @return the family value.
     */
    String family();

    /**
     * Gets the capacity property: The scale out/in options of the SKU.
     *
     * @return the capacity value.
     */
    LabServicesSkuCapacity capacity();

    /**
     * Gets the capabilities property: The capabilities of the SKU.
     *
     * @return the capabilities value.
     */
    List<LabServicesSkuCapabilities> capabilities();

    /**
     * Gets the locations property: List of locations that are available for a size.
     *
     * @return the locations value.
     */
    List<String> locations();

    /**
     * Gets the costs property: Metadata for retrieving price info of a lab services SKUs.
     *
     * @return the costs value.
     */
    List<LabServicesSkuCost> costs();

    /**
     * Gets the restrictions property: Restrictions of a lab services SKUs.
     *
     * @return the restrictions value.
     */
    List<LabServicesSkuRestrictions> restrictions();

    /**
     * Gets the inner com.azure.resourcemanager.labservices.fluent.models.LabServicesSkuInner object.
     *
     * @return the inner object.
     */
    LabServicesSkuInner innerModel();
}