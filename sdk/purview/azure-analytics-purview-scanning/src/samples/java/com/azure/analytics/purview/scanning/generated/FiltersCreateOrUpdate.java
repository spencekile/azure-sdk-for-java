// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.scanning.generated;

import com.azure.analytics.purview.scanning.FiltersClient;
import com.azure.analytics.purview.scanning.PurviewScanningClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class FiltersCreateOrUpdate {
    public static void main(String[] args) {
        FiltersClient client =
                new PurviewScanningClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildFiltersClient();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.setBody(
                BinaryData.fromString(
                        "{\"properties\":{\"excludeUriPrefixes\":[\"https://foo.file.core.windows.net/share1/user/temp\"],\"includeUriPrefixes\":[\"https://foo.file.core.windows.net/share1/user\",\"https://foo.file.core.windows.net/share1/aggregated\"]}}"));
        Response<BinaryData> response = client.createOrUpdateWithResponse("DataSource1", "Scan1", requestOptions);
    }
}