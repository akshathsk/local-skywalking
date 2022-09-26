/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.skywalking.oap.server.storage.plugin.banyandb.stream;

import lombok.RequiredArgsConstructor;
import org.apache.skywalking.banyandb.v1.client.StreamWrite;
import org.apache.skywalking.oap.server.core.analysis.TimeBucket;
import org.apache.skywalking.oap.server.core.analysis.record.Record;
import org.apache.skywalking.oap.server.core.storage.IRecordDAO;
import org.apache.skywalking.oap.server.core.storage.model.Model;
import org.apache.skywalking.oap.server.core.storage.type.Convert2Storage;
import org.apache.skywalking.oap.server.core.storage.type.StorageBuilder;
import org.apache.skywalking.oap.server.library.client.request.InsertRequest;
import org.apache.skywalking.oap.server.storage.plugin.banyandb.BanyanDBConverter;
import org.apache.skywalking.oap.server.storage.plugin.banyandb.MetadataRegistry;

import java.io.IOException;

@RequiredArgsConstructor
public class BanyanDBRecordDAO implements IRecordDAO {
    private final StorageBuilder<Record> storageBuilder;

    @Override
    public InsertRequest prepareBatchInsert(Model model, Record record) throws IOException {
        MetadataRegistry.Schema schema = MetadataRegistry.INSTANCE.findMetadata(model.getName());
        if (schema == null) {
            throw new IOException(model.getName() + " is not registered");
        }
        StreamWrite streamWrite = new StreamWrite(schema.getMetadata().getGroup(), // group name
                model.getName(), // index-name
                record.id(), // identity
                TimeBucket.getTimestamp(record.getTimeBucket(), model.getDownsampling())); // timestamp
        Convert2Storage<StreamWrite> convert2Storage = new BanyanDBConverter.StreamToStorage(schema, streamWrite);
        storageBuilder.entity2Storage(record, convert2Storage);

        return new BanyanDBStreamInsertRequest(convert2Storage.obtain());
    }
}
