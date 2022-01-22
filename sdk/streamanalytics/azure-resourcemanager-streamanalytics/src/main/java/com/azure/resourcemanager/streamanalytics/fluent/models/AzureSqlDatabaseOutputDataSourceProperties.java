// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.streamanalytics.models.AuthenticationMode;
import com.azure.resourcemanager.streamanalytics.models.AzureSqlDatabaseDataSourceProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** The properties that are associated with an Azure SQL database output. */
@Fluent
public final class AzureSqlDatabaseOutputDataSourceProperties extends AzureSqlDatabaseDataSourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureSqlDatabaseOutputDataSourceProperties.class);

    /** {@inheritDoc} */
    @Override
    public AzureSqlDatabaseOutputDataSourceProperties withServer(String server) {
        super.withServer(server);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlDatabaseOutputDataSourceProperties withDatabase(String database) {
        super.withDatabase(database);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlDatabaseOutputDataSourceProperties withUser(String user) {
        super.withUser(user);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlDatabaseOutputDataSourceProperties withPassword(String password) {
        super.withPassword(password);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlDatabaseOutputDataSourceProperties withTable(String table) {
        super.withTable(table);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlDatabaseOutputDataSourceProperties withMaxBatchCount(Float maxBatchCount) {
        super.withMaxBatchCount(maxBatchCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlDatabaseOutputDataSourceProperties withMaxWriterCount(Float maxWriterCount) {
        super.withMaxWriterCount(maxWriterCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlDatabaseOutputDataSourceProperties withAuthenticationMode(AuthenticationMode authenticationMode) {
        super.withAuthenticationMode(authenticationMode);
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