/*
 * Copyright 2007-2008 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gradle;

/**
 * <p>A {@code GradleFactory} is responsible for creating a {@link Gradle} instance for a build, from a {@link
 * StartParameter}.</p>
 *
 * @author Hans Dockter
 */
public interface GradleFactory {
    /**
     * Creates a new {@link Gradle} instance for the given parameters.
     *
     * @param startParameter The parameters to use for the build.
     * @return The new instance.
     */
    Gradle newInstance(StartParameter startParameter);

    Gradle newInstance(final String[] commandLineArgs);

    StartParameter createStartParameter(String[] commandLineArgs);
}
