// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.AwsEnvironmentData;
import com.azure.resourcemanager.security.models.AwsOrganizationalData;

public final class AwsEnvironmentDataTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AwsEnvironmentData model =
            BinaryData
                .fromString(
                    "{\"environmentType\":\"AwsAccount\",\"organizationalData\":{\"organizationMembershipType\":\"AwsOrganizationalData\"}}")
                .toObject(AwsEnvironmentData.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AwsEnvironmentData model = new AwsEnvironmentData().withOrganizationalData(new AwsOrganizationalData());
        model = BinaryData.fromObject(model).toObject(AwsEnvironmentData.class);
    }
}
