/*
 * Copyright 2019 dmfs GmbH
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

package org.dmfs.oauth2.client.http.requests.parameters;

/**
 * The OAuth2 {@code grant_type} parameter.
 *
 * @author Marten Gajda
 */
public final class GrantTypeParam extends DelegatingPair<CharSequence, CharSequence>
{
    public GrantTypeParam(CharSequence grantType)
    {
        super("grant_type", grantType);
    }
}
