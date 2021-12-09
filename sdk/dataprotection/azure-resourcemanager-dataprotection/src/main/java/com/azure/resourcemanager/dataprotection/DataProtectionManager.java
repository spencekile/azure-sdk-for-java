// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.http.policy.ArmChallengeAuthenticationPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dataprotection.fluent.DataProtectionClient;
import com.azure.resourcemanager.dataprotection.implementation.BackupInstancesImpl;
import com.azure.resourcemanager.dataprotection.implementation.BackupPoliciesImpl;
import com.azure.resourcemanager.dataprotection.implementation.BackupVaultOperationResultsImpl;
import com.azure.resourcemanager.dataprotection.implementation.BackupVaultsImpl;
import com.azure.resourcemanager.dataprotection.implementation.DataProtectionClientBuilder;
import com.azure.resourcemanager.dataprotection.implementation.DataProtectionOperationsImpl;
import com.azure.resourcemanager.dataprotection.implementation.DataProtectionsImpl;
import com.azure.resourcemanager.dataprotection.implementation.ExportJobsImpl;
import com.azure.resourcemanager.dataprotection.implementation.ExportJobsOperationResultsImpl;
import com.azure.resourcemanager.dataprotection.implementation.JobsImpl;
import com.azure.resourcemanager.dataprotection.implementation.OperationResultsImpl;
import com.azure.resourcemanager.dataprotection.implementation.OperationStatusImpl;
import com.azure.resourcemanager.dataprotection.implementation.RecoveryPointsImpl;
import com.azure.resourcemanager.dataprotection.implementation.ResourceGuardsImpl;
import com.azure.resourcemanager.dataprotection.implementation.RestorableTimeRangesImpl;
import com.azure.resourcemanager.dataprotection.models.BackupInstances;
import com.azure.resourcemanager.dataprotection.models.BackupPolicies;
import com.azure.resourcemanager.dataprotection.models.BackupVaultOperationResults;
import com.azure.resourcemanager.dataprotection.models.BackupVaults;
import com.azure.resourcemanager.dataprotection.models.DataProtectionOperations;
import com.azure.resourcemanager.dataprotection.models.DataProtections;
import com.azure.resourcemanager.dataprotection.models.ExportJobs;
import com.azure.resourcemanager.dataprotection.models.ExportJobsOperationResults;
import com.azure.resourcemanager.dataprotection.models.Jobs;
import com.azure.resourcemanager.dataprotection.models.OperationResults;
import com.azure.resourcemanager.dataprotection.models.OperationStatus;
import com.azure.resourcemanager.dataprotection.models.RecoveryPoints;
import com.azure.resourcemanager.dataprotection.models.ResourceGuards;
import com.azure.resourcemanager.dataprotection.models.RestorableTimeRanges;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/** Entry point to DataProtectionManager. Open API 2.0 Specs for Azure Data Protection service. */
public final class DataProtectionManager {
    private BackupVaults backupVaults;

    private OperationResults operationResults;

    private OperationStatus operationStatus;

    private BackupVaultOperationResults backupVaultOperationResults;

    private DataProtections dataProtections;

    private DataProtectionOperations dataProtectionOperations;

    private BackupPolicies backupPolicies;

    private BackupInstances backupInstances;

    private RecoveryPoints recoveryPoints;

    private Jobs jobs;

    private RestorableTimeRanges restorableTimeRanges;

    private ExportJobs exportJobs;

    private ExportJobsOperationResults exportJobsOperationResults;

    private ResourceGuards resourceGuards;

    private final DataProtectionClient clientObject;

    private DataProtectionManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new DataProtectionClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of DataProtection service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the DataProtection service API instance.
     */
    public static DataProtectionManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create DataProtectionManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new DataProtectionManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private final ClientLogger logger = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Adds the scope to permission sets.
         *
         * @param scope the scope.
         * @return the configurable object itself.
         */
        public Configurable withScope(String scope) {
            this.scopes.add(Objects.requireNonNull(scope, "'scope' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval = Objects.requireNonNull(defaultPollInterval, "'retryPolicy' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw logger.logExceptionAsError(new IllegalArgumentException("'httpPipeline' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of DataProtection service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the DataProtection service API instance.
         */
        public DataProtectionManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.dataprotection")
                .append("/")
                .append("1.0.0-beta.1");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder
                    .append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (scopes.isEmpty()) {
                scopes.add(profile.getEnvironment().getManagementEndpoint() + "/.default");
            }
            if (retryPolicy == null) {
                retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new RequestIdPolicy());
            policies
                .addAll(
                    this
                        .policies
                        .stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                        .collect(Collectors.toList()));
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new ArmChallengeAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies
                .addAll(
                    this
                        .policies
                        .stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
                        .collect(Collectors.toList()));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new DataProtectionManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of BackupVaults. */
    public BackupVaults backupVaults() {
        if (this.backupVaults == null) {
            this.backupVaults = new BackupVaultsImpl(clientObject.getBackupVaults(), this);
        }
        return backupVaults;
    }

    /** @return Resource collection API of OperationResults. */
    public OperationResults operationResults() {
        if (this.operationResults == null) {
            this.operationResults = new OperationResultsImpl(clientObject.getOperationResults(), this);
        }
        return operationResults;
    }

    /** @return Resource collection API of OperationStatus. */
    public OperationStatus operationStatus() {
        if (this.operationStatus == null) {
            this.operationStatus = new OperationStatusImpl(clientObject.getOperationStatus(), this);
        }
        return operationStatus;
    }

    /** @return Resource collection API of BackupVaultOperationResults. */
    public BackupVaultOperationResults backupVaultOperationResults() {
        if (this.backupVaultOperationResults == null) {
            this.backupVaultOperationResults =
                new BackupVaultOperationResultsImpl(clientObject.getBackupVaultOperationResults(), this);
        }
        return backupVaultOperationResults;
    }

    /** @return Resource collection API of DataProtections. */
    public DataProtections dataProtections() {
        if (this.dataProtections == null) {
            this.dataProtections = new DataProtectionsImpl(clientObject.getDataProtections(), this);
        }
        return dataProtections;
    }

    /** @return Resource collection API of DataProtectionOperations. */
    public DataProtectionOperations dataProtectionOperations() {
        if (this.dataProtectionOperations == null) {
            this.dataProtectionOperations =
                new DataProtectionOperationsImpl(clientObject.getDataProtectionOperations(), this);
        }
        return dataProtectionOperations;
    }

    /** @return Resource collection API of BackupPolicies. */
    public BackupPolicies backupPolicies() {
        if (this.backupPolicies == null) {
            this.backupPolicies = new BackupPoliciesImpl(clientObject.getBackupPolicies(), this);
        }
        return backupPolicies;
    }

    /** @return Resource collection API of BackupInstances. */
    public BackupInstances backupInstances() {
        if (this.backupInstances == null) {
            this.backupInstances = new BackupInstancesImpl(clientObject.getBackupInstances(), this);
        }
        return backupInstances;
    }

    /** @return Resource collection API of RecoveryPoints. */
    public RecoveryPoints recoveryPoints() {
        if (this.recoveryPoints == null) {
            this.recoveryPoints = new RecoveryPointsImpl(clientObject.getRecoveryPoints(), this);
        }
        return recoveryPoints;
    }

    /** @return Resource collection API of Jobs. */
    public Jobs jobs() {
        if (this.jobs == null) {
            this.jobs = new JobsImpl(clientObject.getJobs(), this);
        }
        return jobs;
    }

    /** @return Resource collection API of RestorableTimeRanges. */
    public RestorableTimeRanges restorableTimeRanges() {
        if (this.restorableTimeRanges == null) {
            this.restorableTimeRanges = new RestorableTimeRangesImpl(clientObject.getRestorableTimeRanges(), this);
        }
        return restorableTimeRanges;
    }

    /** @return Resource collection API of ExportJobs. */
    public ExportJobs exportJobs() {
        if (this.exportJobs == null) {
            this.exportJobs = new ExportJobsImpl(clientObject.getExportJobs(), this);
        }
        return exportJobs;
    }

    /** @return Resource collection API of ExportJobsOperationResults. */
    public ExportJobsOperationResults exportJobsOperationResults() {
        if (this.exportJobsOperationResults == null) {
            this.exportJobsOperationResults =
                new ExportJobsOperationResultsImpl(clientObject.getExportJobsOperationResults(), this);
        }
        return exportJobsOperationResults;
    }

    /** @return Resource collection API of ResourceGuards. */
    public ResourceGuards resourceGuards() {
        if (this.resourceGuards == null) {
            this.resourceGuards = new ResourceGuardsImpl(clientObject.getResourceGuards(), this);
        }
        return resourceGuards;
    }

    /**
     * @return Wrapped service client DataProtectionClient providing direct access to the underlying auto-generated API
     *     implementation, based on Azure REST API.
     */
    public DataProtectionClient serviceClient() {
        return this.clientObject;
    }
}