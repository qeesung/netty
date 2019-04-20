/*
 * Copyright 2019 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.netty.handler.codec.dns.record;

import io.netty.handler.codec.dns.AbstractDnsRecord;
import io.netty.handler.codec.dns.DnsRecordType;
import io.netty.handler.codec.dns.record.opt.EDNS0Option;

import java.util.Collections;
import java.util.List;

import static io.netty.util.internal.ObjectUtil.*;

/**
 * Dns {@link DnsRecordType#OPT} record.
 */
public class DnsOPTRecord extends AbstractDnsRecord {
    private final List<EDNS0Option> options;

    public DnsOPTRecord(String name, int dnsClass, long timeToLive, List<EDNS0Option> options) {
        super(name, DnsRecordType.OPT, dnsClass, timeToLive);
        this.options = Collections.unmodifiableList(checkNotNull(options, "options"));
    }

    public List<EDNS0Option> options() {
        return options;
    }
}
