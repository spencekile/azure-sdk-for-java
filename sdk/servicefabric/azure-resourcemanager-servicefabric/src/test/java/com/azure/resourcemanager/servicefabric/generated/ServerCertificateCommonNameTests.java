// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabric.models.ServerCertificateCommonName;
import org.junit.jupiter.api.Assertions;

public final class ServerCertificateCommonNameTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServerCertificateCommonName model =
            BinaryData
                .fromString(
                    "{\"certificateCommonName\":\"zlhjxrifkwmrvkt\",\"certificateIssuerThumbprint\":\"izntocipao\"}")
                .toObject(ServerCertificateCommonName.class);
        Assertions.assertEquals("zlhjxrifkwmrvkt", model.certificateCommonName());
        Assertions.assertEquals("izntocipao", model.certificateIssuerThumbprint());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServerCertificateCommonName model =
            new ServerCertificateCommonName()
                .withCertificateCommonName("zlhjxrifkwmrvkt")
                .withCertificateIssuerThumbprint("izntocipao");
        model = BinaryData.fromObject(model).toObject(ServerCertificateCommonName.class);
        Assertions.assertEquals("zlhjxrifkwmrvkt", model.certificateCommonName());
        Assertions.assertEquals("izntocipao", model.certificateIssuerThumbprint());
    }
}
