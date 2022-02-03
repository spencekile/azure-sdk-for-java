// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.models.EntityCommonProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** Mailbox entity property bag. */
@Immutable
public final class MailboxEntityProperties extends EntityCommonProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MailboxEntityProperties.class);

    /*
     * The mailbox's primary address
     */
    @JsonProperty(value = "mailboxPrimaryAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String mailboxPrimaryAddress;

    /*
     * The mailbox's display name
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * The mailbox's UPN
     */
    @JsonProperty(value = "upn", access = JsonProperty.Access.WRITE_ONLY)
    private String upn;

    /*
     * The AzureAD identifier of mailbox. Similar to AadUserId in account
     * entity but this property is specific to mailbox object on office side
     */
    @JsonProperty(value = "externalDirectoryObjectId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID externalDirectoryObjectId;

    /**
     * Get the mailboxPrimaryAddress property: The mailbox's primary address.
     *
     * @return the mailboxPrimaryAddress value.
     */
    public String mailboxPrimaryAddress() {
        return this.mailboxPrimaryAddress;
    }

    /**
     * Get the displayName property: The mailbox's display name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the upn property: The mailbox's UPN.
     *
     * @return the upn value.
     */
    public String upn() {
        return this.upn;
    }

    /**
     * Get the externalDirectoryObjectId property: The AzureAD identifier of mailbox. Similar to AadUserId in account
     * entity but this property is specific to mailbox object on office side.
     *
     * @return the externalDirectoryObjectId value.
     */
    public UUID externalDirectoryObjectId() {
        return this.externalDirectoryObjectId;
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