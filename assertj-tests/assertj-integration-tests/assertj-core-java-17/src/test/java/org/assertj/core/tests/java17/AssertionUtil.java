/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2024 the original author or authors.
 */
package org.assertj.core.tests.java17;

import org.assertj.core.api.ThrowableAssert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowableOfType;

public class AssertionUtil {
  public static AssertionError expectAssertionError(ThrowableAssert.ThrowingCallable shouldRaiseAssertionError) {
    AssertionError error = catchThrowableOfType(shouldRaiseAssertionError, AssertionError.class);
    assertThat(error).as("The code under test should have raised an AssertionError").isNotNull();
    return error;
  }
}
