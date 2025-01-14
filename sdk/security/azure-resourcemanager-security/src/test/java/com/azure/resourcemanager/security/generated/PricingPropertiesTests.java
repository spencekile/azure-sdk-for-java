// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.PricingProperties;
import com.azure.resourcemanager.security.models.PricingTier;
import org.junit.jupiter.api.Assertions;

public final class PricingPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PricingProperties model =
            BinaryData
                .fromString(
                    "{\"pricingTier\":\"Standard\",\"subPlan\":\"mbe\",\"freeTrialRemainingTime\":\"PT76H14M33S\",\"deprecated\":true,\"replacedBy\":[\"qrolfpf\"]}")
                .toObject(PricingProperties.class);
        Assertions.assertEquals(PricingTier.STANDARD, model.pricingTier());
        Assertions.assertEquals("mbe", model.subPlan());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PricingProperties model = new PricingProperties().withPricingTier(PricingTier.STANDARD).withSubPlan("mbe");
        model = BinaryData.fromObject(model).toObject(PricingProperties.class);
        Assertions.assertEquals(PricingTier.STANDARD, model.pricingTier());
        Assertions.assertEquals("mbe", model.subPlan());
    }
}
