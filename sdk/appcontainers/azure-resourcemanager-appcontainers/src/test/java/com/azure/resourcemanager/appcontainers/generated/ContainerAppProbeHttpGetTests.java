// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.ContainerAppProbeHttpGet;
import com.azure.resourcemanager.appcontainers.models.ContainerAppProbeHttpGetHttpHeadersItem;
import com.azure.resourcemanager.appcontainers.models.Scheme;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ContainerAppProbeHttpGetTests {
    @Test
    public void testDeserialize() {
        ContainerAppProbeHttpGet model =
            BinaryData
                .fromString(
                    "{\"host\":\"jawneaiv\",\"httpHeaders\":[{\"name\":\"zel\",\"value\":\"c\"},{\"name\":\"r\",\"value\":\"lsfeaenwabfatkld\"},{\"name\":\"xbjhwuaanozjosph\",\"value\":\"oulpjrv\"}],\"path\":\"glrvimjwosytxi\",\"port\":1413257471,\"scheme\":\"HTTP\"}")
                .toObject(ContainerAppProbeHttpGet.class);
        Assertions.assertEquals("jawneaiv", model.host());
        Assertions.assertEquals("zel", model.httpHeaders().get(0).name());
        Assertions.assertEquals("c", model.httpHeaders().get(0).value());
        Assertions.assertEquals("glrvimjwosytxi", model.path());
        Assertions.assertEquals(1413257471, model.port());
        Assertions.assertEquals(Scheme.HTTP, model.scheme());
    }

    @Test
    public void testSerialize() {
        ContainerAppProbeHttpGet model =
            new ContainerAppProbeHttpGet()
                .withHost("jawneaiv")
                .withHttpHeaders(
                    Arrays
                        .asList(
                            new ContainerAppProbeHttpGetHttpHeadersItem().withName("zel").withValue("c"),
                            new ContainerAppProbeHttpGetHttpHeadersItem().withName("r").withValue("lsfeaenwabfatkld"),
                            new ContainerAppProbeHttpGetHttpHeadersItem()
                                .withName("xbjhwuaanozjosph")
                                .withValue("oulpjrv")))
                .withPath("glrvimjwosytxi")
                .withPort(1413257471)
                .withScheme(Scheme.HTTP);
        model = BinaryData.fromObject(model).toObject(ContainerAppProbeHttpGet.class);
        Assertions.assertEquals("jawneaiv", model.host());
        Assertions.assertEquals("zel", model.httpHeaders().get(0).name());
        Assertions.assertEquals("c", model.httpHeaders().get(0).value());
        Assertions.assertEquals("glrvimjwosytxi", model.path());
        Assertions.assertEquals(1413257471, model.port());
        Assertions.assertEquals(Scheme.HTTP, model.scheme());
    }
}
