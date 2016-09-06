/*
 * Copyright 2016 Red Hat, Inc.
 * <p>
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */
package io.fabric8.funktion.example;

import io.fabric8.funktion.support.Strings;
import org.apache.camel.Headers;
import org.apache.camel.component.kafka.KafkaConstants;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 */
public class Producer {
    private static final AtomicInteger counter = new AtomicInteger();

    public String message(String body, @Headers Map headers) {
        String result = body;
        headers.put(KafkaConstants.PARTITION_KEY,0);
        headers.put(KafkaConstants.KEY,"1");
        if (Strings.isEmpty(body)){
            result = "Message: " +  counter.getAndIncrement();

        }
        System.err.println("publishing message: " + result);
        return result;
    }

}
