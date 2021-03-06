/*
 * Copyright 2016-2019 Cloudera, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hortonworks.registries.schemaregistry.client;

import java.util.Map;

/**
 * This interface can be implemented to design a strategy to choose a URL for a given list of urls.
 */
public interface UrlSelector {

    public void init(Map<String, Object> conf);

    /**
     * Returns the current url chosen among the given cluster urls.
     */
    String select();

    /**
     * Sets the given {@code url} is failed with the given Exception {@code ex}.
     * @param url failed url
     * @param ex exception encountered
     */
    void urlWithError(String url, Exception ex);
}
