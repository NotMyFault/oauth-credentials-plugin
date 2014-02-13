/*
 * Copyright 2013 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.jenkins.plugins.credentials.oauth;

import com.cloudbees.plugins.credentials.domains.DomainRestrictedCredentials;

/**
 * Credentials that store an OAuth2 token (refresh or access)
 *
 * @param <T> The type of requirements to which this credential should
 * be applied.
 */
public interface OAuth2Token<T extends OAuth2ScopeRequirement>
    extends OAuth2Credentials<T>, DomainRestrictedCredentials {
}