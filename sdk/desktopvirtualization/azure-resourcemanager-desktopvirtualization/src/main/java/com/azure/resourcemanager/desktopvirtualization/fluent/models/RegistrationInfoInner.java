// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.desktopvirtualization.models.RegistrationTokenOperation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Represents a RegistrationInfo definition. */
@Fluent
public final class RegistrationInfoInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RegistrationInfoInner.class);

    /*
     * Expiration time of registration token.
     */
    @JsonProperty(value = "expirationTime")
    private OffsetDateTime expirationTime;

    /*
     * The registration token base64 encoded string.
     */
    @JsonProperty(value = "token")
    private String token;

    /*
     * The type of resetting the token.
     */
    @JsonProperty(value = "registrationTokenOperation")
    private RegistrationTokenOperation registrationTokenOperation;

    /**
     * Get the expirationTime property: Expiration time of registration token.
     *
     * @return the expirationTime value.
     */
    public OffsetDateTime expirationTime() {
        return this.expirationTime;
    }

    /**
     * Set the expirationTime property: Expiration time of registration token.
     *
     * @param expirationTime the expirationTime value to set.
     * @return the RegistrationInfoInner object itself.
     */
    public RegistrationInfoInner withExpirationTime(OffsetDateTime expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * Get the token property: The registration token base64 encoded string.
     *
     * @return the token value.
     */
    public String token() {
        return this.token;
    }

    /**
     * Set the token property: The registration token base64 encoded string.
     *
     * @param token the token value to set.
     * @return the RegistrationInfoInner object itself.
     */
    public RegistrationInfoInner withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Get the registrationTokenOperation property: The type of resetting the token.
     *
     * @return the registrationTokenOperation value.
     */
    public RegistrationTokenOperation registrationTokenOperation() {
        return this.registrationTokenOperation;
    }

    /**
     * Set the registrationTokenOperation property: The type of resetting the token.
     *
     * @param registrationTokenOperation the registrationTokenOperation value to set.
     * @return the RegistrationInfoInner object itself.
     */
    public RegistrationInfoInner withRegistrationTokenOperation(RegistrationTokenOperation registrationTokenOperation) {
        this.registrationTokenOperation = registrationTokenOperation;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}