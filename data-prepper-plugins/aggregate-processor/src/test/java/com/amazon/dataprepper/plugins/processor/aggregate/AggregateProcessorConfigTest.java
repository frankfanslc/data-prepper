/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package com.amazon.dataprepper.plugins.processor.aggregate;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AggregateProcessorConfigTest {
    @Test
    public void testDefault() {
        final AggregateProcessorConfig aggregateConfig = new AggregateProcessorConfig();

        assertThat(aggregateConfig.getGroupDuration(), equalTo(AggregateProcessorConfig.DEFAULT_GROUP_DURATION));
    }
}
