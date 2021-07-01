/**
 * Copyright © 2016-2021 The Thingsboard Authors
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
package org.thingsboard.server.service.ttl;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

@Slf4j
public class EventsCleanUpServiceTest {

    @Test
    public void givenInterval_whenRandomDelay_ThenDelayInInterval() {
        final long executionIntervalMs = 2220000; //37min
        final long randomDelay = org.apache.commons.lang3.RandomUtils.nextLong(0, executionIntervalMs); //same as @Scheduled(initialDelayString = ...
        log.info("randomDelay {}", randomDelay);
        assertThat(randomDelay, greaterThanOrEqualTo(0L));
        assertThat(randomDelay, lessThanOrEqualTo(executionIntervalMs));
    }
}