/*
 * Copyright 2018 Google LLC. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.cloud.tools.jib.json;

import java.util.List;

/**
 * All JSON templates to be used with {@link JsonTemplateMapper} that need to be wrapped in a list
 * must extend this class.
 *
 * <p>Json fields should be private fields and fields that are {@code null} will not be serialized.
 */
public interface ListOfJsonTemplate extends JsonTemplate {

  /** Returns the JsonTemplate wrapped as a list. e.g.: [{"property":"value"}] */
  List<JsonTemplate> getList();
}
