package com.hazelcast.client.impl.protocol;


import com.hazelcast.instance.Node;
import com.hazelcast.nio.Connection;
import com.hazelcast.client.impl.protocol.task.MessageTask;
import com.hazelcast.client.impl.protocol.task.NoSuchMessageTask;


public class MessageTaskFactoryImpl implements MessageTaskFactory {

    private final MessageTaskFactory[] tasks = new MessageTaskFactory[Short.MAX_VALUE];

    private final Node node;

    public  MessageTaskFactoryImpl (Node node) {
        this.node = node;
        initFactories();
    }

    public void initFactories() {
//region ----------  REGISTRATION FOR com.hazelcast.client.impl.protocol.task.set
        tasks[com.hazelcast.client.impl.protocol.codec.SetRemoveListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.set.SetRemoveListenerMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.SetClearCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.set.SetClearMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.SetCompareAndRemoveAllCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.set.SetCompareAndRemoveAllMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.SetContainsAllCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.set.SetContainsAllMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.SetIsEmptyCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.set.SetIsEmptyMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.SetAddAllCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.set.SetAddAllMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.SetAddCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.set.SetAddMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.SetCompareAndRetainAllCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.set.SetCompareAndRetainAllMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.SetGetAllCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.set.SetGetAllMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.SetRemoveCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.set.SetRemoveMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.SetAddListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.set.SetAddListenerMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.SetContainsCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.set.SetContainsMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.SetSizeCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.set.SetSizeMessageTask(clientMessage, node, connection);
            }
        };
//endregion
//region ----------  REGISTRATION FOR com.hazelcast.client.impl.protocol.task.ringbuffer
        tasks[com.hazelcast.client.impl.protocol.codec.RingbufferReadOneCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.ringbuffer.RingbufferReadOneMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.RingbufferAddAllCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.ringbuffer.RingbufferAddAllMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.RingbufferCapacityCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.ringbuffer.RingbufferCapacityMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.RingbufferTailSequenceCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.ringbuffer.RingbufferTailSequenceMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.RingbufferAddCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.ringbuffer.RingbufferAddMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.RingbufferRemainingCapacityCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.ringbuffer.RingbufferRemainingCapacityMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.RingbufferReadManyCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.ringbuffer.RingbufferReadManyMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.RingbufferHeadSequenceCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.ringbuffer.RingbufferHeadSequenceMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.RingbufferSizeCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.ringbuffer.RingbufferSizeMessageTask(clientMessage, node, connection);
            }
        };
//endregion
//region ----------  REGISTRATION FOR com.hazelcast.client.impl.protocol.task.lock
        tasks[com.hazelcast.client.impl.protocol.codec.LockUnlockCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.lock.LockUnlockMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.LockIsLockedCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.lock.LockIsLockedMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.LockForceUnlockCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.lock.LockForceUnlockMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.LockGetRemainingLeaseTimeCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.lock.LockGetRemainingLeaseTimeMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.LockIsLockedByCurrentThreadCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.lock.LockIsLockedByCurrentThreadMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.LockLockCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.lock.LockLockMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.LockTryLockCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.lock.LockTryLockMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.LockGetLockCountCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.lock.LockGetLockCountMessageTask(clientMessage, node, connection);
            }
        };
//endregion
//region ----------  REGISTRATION FOR com.hazelcast.client.impl.protocol.task.cache
        tasks[com.hazelcast.client.impl.protocol.codec.CacheClearCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CacheClearMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CacheReplaceCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CacheReplaceMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CacheContainsKeyCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CacheContainsKeyMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CacheCreateConfigCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CacheCreateConfigMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CacheGetAndReplaceCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CacheGetAndReplaceMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CacheGetAllCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CacheGetAllMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CachePutCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CachePutMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CacheAddInvalidationListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CacheAddInvalidationListenerTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CachePutAllCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CachePutAllMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CacheLoadAllCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CacheLoadAllMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CacheListenerRegistrationCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CacheListenerRegistrationMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CacheAddEntryListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CacheAddEntryListenerMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CacheRemoveEntryListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CacheRemoveEntryListenerMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CacheRemoveInvalidationListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CacheRemoveInvalidationListenerMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CacheDestroyCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CacheDestroyMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CacheRemoveCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CacheRemoveMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CacheEntryProcessorCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CacheEntryProcessorMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CacheGetAndRemoveCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CacheGetAndRemoveMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CacheManagementConfigCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CacheManagementConfigMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CachePutIfAbsentCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CachePutIfAbsentMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CacheRemoveAllCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CacheRemoveAllMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CacheRemoveAllKeysCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CacheRemoveAllKeysMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CacheIterateCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CacheIterateMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CacheAddPartitionLostListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CacheAddPartitionLostListenerMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CacheGetConfigCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CacheGetConfigMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CacheGetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CacheGetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CacheRemovePartitionLostListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CacheRemovePartitionLostListenerMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CacheSizeCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.cache.CacheSizeMessageTask(clientMessage, node, connection);
            }
        };
//endregion
//region ----------  REGISTRATION FOR com.hazelcast.client.impl.protocol.task.mapreduce
        tasks[com.hazelcast.client.impl.protocol.codec.MapReduceJobProcessInformationCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.mapreduce.MapReduceJobProcessInformationMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapReduceCancelCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.mapreduce.MapReduceCancelMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapReduceForCustomCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.mapreduce.MapReduceForCustomMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapReduceForMapCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.mapreduce.MapReduceForMapMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapReduceForListCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.mapreduce.MapReduceForListMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapReduceForSetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.mapreduce.MapReduceForSetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapReduceForMultiMapCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.mapreduce.MapReduceForMultiMapMessageTask(clientMessage, node, connection);
            }
        };
//endregion
//region ----------  REGISTRATION FOR com.hazelcast.client.impl.protocol.task.replicatedmap
        tasks[com.hazelcast.client.impl.protocol.codec.ReplicatedMapSizeCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.replicatedmap.ReplicatedMapSizeMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ReplicatedMapRemoveEntryListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.replicatedmap.ReplicatedMapRemoveEntryListenerMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ReplicatedMapAddEntryListenerToKeyWithPredicateCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.replicatedmap.ReplicatedMapAddEntryListenerToKeyWithPredicateMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ReplicatedMapIsEmptyCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.replicatedmap.ReplicatedMapIsEmptyMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ReplicatedMapPutAllCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.replicatedmap.ReplicatedMapPutAllMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ReplicatedMapContainsKeyCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.replicatedmap.ReplicatedMapContainsKeyMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ReplicatedMapContainsValueCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.replicatedmap.ReplicatedMapContainsValueMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ReplicatedMapAddNearCacheEntryListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.replicatedmap.ReplicatedMapAddNearCacheListenerMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ReplicatedMapGetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.replicatedmap.ReplicatedMapGetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ReplicatedMapAddEntryListenerWithPredicateCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.replicatedmap.ReplicatedMapAddEntryListenerWithPredicateMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ReplicatedMapAddEntryListenerToKeyCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.replicatedmap.ReplicatedMapAddEntryListenerToKeyMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ReplicatedMapRemoveCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.replicatedmap.ReplicatedMapRemoveMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ReplicatedMapClearCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.replicatedmap.ReplicatedMapClearMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ReplicatedMapValuesCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.replicatedmap.ReplicatedMapValuesMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ReplicatedMapEntrySetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.replicatedmap.ReplicatedMapEntrySetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ReplicatedMapPutCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.replicatedmap.ReplicatedMapPutMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ReplicatedMapAddEntryListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.replicatedmap.ReplicatedMapAddEntryListenerMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ReplicatedMapKeySetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.replicatedmap.ReplicatedMapKeySetMessageTask(clientMessage, node, connection);
            }
        };
//endregion
//region ----------  REGISTRATION FOR com.hazelcast.client.impl.protocol.task.atomiclong
        tasks[com.hazelcast.client.impl.protocol.codec.AtomicLongApplyCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.atomiclong.AtomicLongApplyMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.AtomicLongDecrementAndGetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.atomiclong.AtomicLongDecrementAndGetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.AtomicLongGetAndAddCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.atomiclong.AtomicLongGetAndAddMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.AtomicLongAlterAndGetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.atomiclong.AtomicLongAlterAndGetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.AtomicLongAddAndGetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.atomiclong.AtomicLongAddAndGetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.AtomicLongGetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.atomiclong.AtomicLongGetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.AtomicLongCompareAndSetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.atomiclong.AtomicLongCompareAndSetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.AtomicLongSetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.atomiclong.AtomicLongSetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.AtomicLongAlterCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.atomiclong.AtomicLongAlterMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.AtomicLongIncrementAndGetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.atomiclong.AtomicLongIncrementAndGetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.AtomicLongGetAndSetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.atomiclong.AtomicLongGetAndSetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.AtomicLongGetAndAlterCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.atomiclong.AtomicLongGetAndAlterMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.AtomicLongGetAndIncrementCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.atomiclong.AtomicLongGetAndIncrementMessageTask(clientMessage, node, connection);
            }
        };
//endregion
//region ----------  REGISTRATION FOR com.hazelcast.client.impl.protocol.task.semaphore
        tasks[com.hazelcast.client.impl.protocol.codec.SemaphoreDrainPermitsCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.semaphore.SemaphoreDrainPermitsMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.SemaphoreAvailablePermitsCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.semaphore.SemaphoreAvailablePermitsMessageTasks(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.SemaphoreInitCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.semaphore.SemaphoreInitMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.SemaphoreAcquireCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.semaphore.SemaphoreAcquireMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.SemaphoreReducePermitsCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.semaphore.SemaphoreReducePermitsMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.SemaphoreTryAcquireCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.semaphore.SemaphoreTryAcquireMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.SemaphoreReleaseCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.semaphore.SemaphoreReleaseMessageTask(clientMessage, node, connection);
            }
        };
//endregion
//region ----------  REGISTRATION FOR com.hazelcast.client.impl.protocol.task.transactionallist
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalListSizeCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionallist.TransactionalListSizeMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalListRemoveCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionallist.TransactionalListRemoveMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalListAddCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionallist.TransactionalListAddMessageTask(clientMessage, node, connection);
            }
        };
//endregion
//region ----------  REGISTRATION FOR com.hazelcast.client.impl.protocol.task.transactionalmultimap
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalMultiMapPutCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalmultimap.TransactionalMultiMapPutMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalMultiMapRemoveEntryCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalmultimap.TransactionalMultiMapRemoveEntryMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalMultiMapGetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalmultimap.TransactionalMultiMapGetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalMultiMapRemoveCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalmultimap.TransactionalMultiMapRemoveMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalMultiMapSizeCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalmultimap.TransactionalMultiMapSizeMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalMultiMapValueCountCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalmultimap.TransactionalMultiMapValueCountMessageTask(clientMessage, node, connection);
            }
        };
//endregion
//region ----------  REGISTRATION FOR com.hazelcast.client.impl.protocol.task.condition
        tasks[com.hazelcast.client.impl.protocol.codec.ConditionSignalCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.condition.ConditionSignalMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ConditionBeforeAwaitCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.condition.ConditionBeforeAwaitMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ConditionAwaitCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.condition.ConditionAwaitMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ConditionSignalAllCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.condition.ConditionSignalAllMessageTask(clientMessage, node, connection);
            }
        };
//endregion
//region ----------  REGISTRATION FOR com.hazelcast.client.impl.protocol.task.list
        tasks[com.hazelcast.client.impl.protocol.codec.ListGetAllCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.list.ListGetAllMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ListListIteratorCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.list.ListListIteratorMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ListSetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.list.ListSetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ListAddAllWithIndexCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.list.ListAddAllWithIndexMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ListCompareAndRemoveAllCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.list.ListCompareAndRemoveAllMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ListGetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.list.ListGetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ListRemoveListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.list.ListRemoveListenerMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ListRemoveWithIndexCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.list.ListRemoveWithIndexMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ListAddListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.list.ListAddListenerMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ListIteratorCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.list.ListIteratorMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ListClearCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.list.ListClearMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ListAddAllCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.list.ListAddAllMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ListAddCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.list.ListAddMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ListAddWithIndexCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.list.ListAddWithIndexMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ListLastIndexOfCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.list.ListLastIndexOfMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ListRemoveCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.list.ListRemoveMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ListSubCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.list.ListSubMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ListContainsCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.list.ListContainsMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ListIndexOfCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.list.ListIndexOfMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ListSizeCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.list.ListSizeMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ListContainsAllCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.list.ListContainsAllMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ListIsEmptyCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.list.ListIsEmptyMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ListCompareAndRetainAllCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.list.ListCompareAndRetainAllMessageTask(clientMessage, node, connection);
            }
        };
//endregion
//region ----------  REGISTRATION FOR com.hazelcast.client.impl.protocol.task.countdownlatch
        tasks[com.hazelcast.client.impl.protocol.codec.CountDownLatchAwaitCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.countdownlatch.CountDownLatchAwaitMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CountDownLatchCountDownCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.countdownlatch.CountDownLatchCountDownMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CountDownLatchGetCountCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.countdownlatch.CountDownLatchGetCountMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.CountDownLatchTrySetCountCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.countdownlatch.CountDownLatchTrySetCountMessageTask(clientMessage, node, connection);
            }
        };
//endregion
//region ----------  REGISTRATION FOR com.hazelcast.client.impl.protocol.task.transactionalqueue
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalQueueSizeCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalqueue.TransactionalQueueSizeMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalQueueOfferCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalqueue.TransactionalQueueOfferMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalQueuePeekCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalqueue.TransactionalQueuePeekMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalQueuePollCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalqueue.TransactionalQueuePollMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalQueueTakeCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalqueue.TransactionalQueueTakeMessageTask(clientMessage, node, connection);
            }
        };
//endregion
//region ----------  REGISTRATION FOR com.hazelcast.client.impl.protocol.task.multimap
        tasks[com.hazelcast.client.impl.protocol.codec.MultiMapClearCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.multimap.MultiMapClearMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MultiMapGetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.multimap.MultiMapGetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MultiMapRemoveEntryCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.multimap.MultiMapRemoveEntryMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MultiMapContainsKeyCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.multimap.MultiMapContainsKeyMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MultiMapSizeCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.multimap.MultiMapSizeMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MultiMapAddEntryListenerToKeyCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.multimap.MultiMapAddEntryListenerToKeyMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MultiMapAddEntryListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.multimap.MultiMapAddEntryListenerMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MultiMapRemoveCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.multimap.MultiMapRemoveMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MultiMapTryLockCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.multimap.MultiMapTryLockMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MultiMapIsLockedCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.multimap.MultiMapIsLockedMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MultiMapContainsValueCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.multimap.MultiMapContainsValueMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MultiMapKeySetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.multimap.MultiMapKeySetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MultiMapPutCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.multimap.MultiMapPutMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MultiMapEntrySetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.multimap.MultiMapEntrySetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MultiMapValueCountCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.multimap.MultiMapValueCountMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MultiMapUnlockCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.multimap.MultiMapUnlockMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MultiMapLockCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.multimap.MultiMapLockMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MultiMapRemoveEntryListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.multimap.MultiMapRemoveEntryListenerMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MultiMapContainsEntryCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.multimap.MultiMapContainsEntryMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MultiMapForceUnlockCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.multimap.MultiMapForceUnlockMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MultiMapValuesCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.multimap.MultiMapValuesMessageTask(clientMessage, node, connection);
            }
        };
//endregion
//region ----------  REGISTRATION FOR com.hazelcast.client.impl.protocol.task.atomicreference
        tasks[com.hazelcast.client.impl.protocol.codec.AtomicReferenceClearCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.atomicreference.AtomicReferenceClearMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.AtomicReferenceCompareAndSetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.atomicreference.AtomicReferenceCompareAndSetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.AtomicReferenceGetAndAlterCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.atomicreference.AtomicReferenceGetAndAlterMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.AtomicReferenceGetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.atomicreference.AtomicReferenceGetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.AtomicReferenceGetAndSetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.atomicreference.AtomicReferenceGetAndSetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.AtomicReferenceApplyCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.atomicreference.AtomicReferenceApplyMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.AtomicReferenceIsNullCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.atomicreference.AtomicReferenceIsNullMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.AtomicReferenceSetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.atomicreference.AtomicReferenceSetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.AtomicReferenceAlterAndGetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.atomicreference.AtomicReferenceAlterAndGetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.AtomicReferenceSetAndGetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.atomicreference.AtomicReferenceSetAndGetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.AtomicReferenceAlterCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.atomicreference.AtomicReferenceAlterMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.AtomicReferenceContainsCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.atomicreference.AtomicReferenceContainsMessageTask(clientMessage, node, connection);
            }
        };
//endregion
//region ----------  REGISTRATION FOR com.hazelcast.client.impl.protocol.task.topic
        tasks[com.hazelcast.client.impl.protocol.codec.TopicPublishCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.topic.TopicPublishMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TopicAddMessageListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.topic.TopicAddMessageListenerMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TopicRemoveMessageListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.topic.TopicRemoveMessageListenerMessageTask(clientMessage, node, connection);
            }
        };
//endregion
//region ----------  REGISTRATION FOR com.hazelcast.client.impl.protocol.task.transactionalmap
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalMapValuesCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalmap.TransactionalMapValuesMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalMapSizeCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalmap.TransactionalMapSizeMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalMapPutIfAbsentCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalmap.TransactionalMapPutIfAbsentMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalMapRemoveCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalmap.TransactionalMapRemoveMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalMapGetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalmap.TransactionalMapGetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalMapGetForUpdateCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalmap.TransactionalMapGetForUpdateMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalMapIsEmptyCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalmap.TransactionalMapIsEmptyMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalMapKeySetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalmap.TransactionalMapKeySetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalMapKeySetWithPredicateCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalmap.TransactionalMapKeySetWithPredicateMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalMapReplaceIfSameCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalmap.TransactionalMapReplaceIfSameMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalMapContainsKeyCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalmap.TransactionalMapContainsKeyMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalMapRemoveIfSameCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalmap.TransactionalMapRemoveIfSameMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalMapSetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalmap.TransactionalMapSetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalMapReplaceCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalmap.TransactionalMapReplaceMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalMapPutCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalmap.TransactionalMapPutMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalMapDeleteCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalmap.TransactionalMapDeleteMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalMapValuesWithPredicateCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalmap.TransactionalMapValuesWithPredicateMessageTask(clientMessage, node, connection);
            }
        };
//endregion
//region ----------  REGISTRATION FOR com.hazelcast.client.impl.protocol.task.executorservice
        tasks[com.hazelcast.client.impl.protocol.codec.ExecutorServiceCancelOnPartitionCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.executorservice.ExecutorServiceCancelOnPartitionMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ExecutorServiceSubmitToPartitionCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.executorservice.ExecutorServiceSubmitToPartitionMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ExecutorServiceCancelOnAddressCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.executorservice.ExecutorServiceCancelOnAddressMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ExecutorServiceIsShutdownCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.executorservice.ExecutorServiceIsShutdownMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ExecutorServiceShutdownCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.executorservice.ExecutorServiceShutdownMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ExecutorServiceSubmitToAddressCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.executorservice.ExecutorServiceSubmitToAddressMessageTask(clientMessage, node, connection);
            }
        };
//endregion
//region ----------  REGISTRATION FOR com.hazelcast.client.impl.protocol.task.transaction
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionCreateCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transaction.TransactionCreateMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.XATransactionClearRemoteCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transaction.XAClearRemoteTransactionMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.XATransactionFinalizeCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transaction.XAFinalizeTransactionMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionCommitCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transaction.TransactionCommitMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.XATransactionCollectTransactionsCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transaction.XACollectTransactionsMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.XATransactionPrepareCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transaction.XATransactionPrepareMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.XATransactionCreateCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transaction.XATransactionCreateMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionRollbackCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transaction.TransactionRollbackMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.XATransactionCommitCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transaction.XATransactionCommitMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.XATransactionRollbackCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transaction.XATransactionRollbackMessageTask(clientMessage, node, connection);
            }
        };
//endregion
//region ----------  REGISTRATION FOR com.hazelcast.client.impl.protocol.task.transactionalset
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalSetSizeCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalset.TransactionalSetSizeMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalSetAddCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalset.TransactionalSetAddMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.TransactionalSetRemoveCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.transactionalset.TransactionalSetRemoveMessageTask(clientMessage, node, connection);
            }
        };
//endregion
//region ----------  REGISTRATION FOR com.hazelcast.client.impl.protocol.task.map
        tasks[com.hazelcast.client.impl.protocol.codec.MapEntriesWithPagingPredicateCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapEntriesWithPagingPredicateMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapClearNearCacheCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapClearNearCacheMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapAddEntryListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapAddEntryListenerMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapRemoveIfSameCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapRemoveIfSameMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapAddInterceptorCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapAddInterceptorMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapEntriesWithPredicateCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapEntriesWithPredicateMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapPutTransientCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapPutTransientMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapContainsValueCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapContainsValueMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapIsEmptyCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapIsEmptyMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapReplaceCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapReplaceMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapRemoveInterceptorCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapRemoveInterceptorMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapAddNearCacheEntryListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapAddNearCacheEntryListenerMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapExecuteOnAllKeysCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapExecuteOnAllKeysMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapFlushCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapFlushMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapSetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapSetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapTryLockCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapTryLockMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapAddEntryListenerToKeyCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapAddEntryListenerToKeyMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapEntrySetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapEntrySetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapClearCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapClearMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapLockCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapLockMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapGetEntryViewCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapGetEntryViewMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapRemovePartitionLostListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapRemovePartitionLostListenerMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapLoadGivenKeysCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapLoadGivenKeysMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapExecuteWithPredicateCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapExecuteWithPredicateMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapPutIfAbsentCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapPutIfAbsentMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapTryRemoveCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapTryRemoveMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapPutCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapPutMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapUnlockCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapUnlockMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapSizeCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapSizeMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapValuesWithPredicateCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapValuesWithPredicateMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapAddEntryListenerToKeyWithPredicateCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapAddEntryListenerToKeyWithPredicateMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapEvictCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapEvictMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapGetAllCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapGetAllMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapForceUnlockCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapForceUnlockMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapLoadAllCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapLoadAllMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapAddIndexCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapAddIndexMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapExecuteOnKeyCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapExecuteOnKeyMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapKeySetWithPagingPredicateCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapKeySetWithPagingPredicateMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapRemoveEntryListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapRemoveEntryListenerMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapIsLockedCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapIsLockedMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapEvictAllCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapEvictAllMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapSubmitToKeyCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapSubmitToKeyMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapValuesCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapValuesMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapAddEntryListenerWithPredicateCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapAddEntryListenerWithPredicateMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapDeleteCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapDeleteMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapAddPartitionLostListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapAddPartitionLostListenerMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapPutAllCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapPutAllMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapRemoveCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapRemoveMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapKeySetWithPredicateCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapKeySetWithPredicateMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapExecuteOnKeysCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapExecuteOnKeysMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapReplaceIfSameCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapReplaceIfSameMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapContainsKeyCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapContainsKeyMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapTryPutCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapTryPutMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapValuesWithPagingPredicateCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapValuesWithPagingPredicateMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapGetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapGetMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.MapKeySetCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.map.MapKeySetMessageTask(clientMessage, node, connection);
            }
        };
//endregion
//region ----------  REGISTRATION FOR com.hazelcast.client.impl.protocol.task
        tasks[com.hazelcast.client.impl.protocol.codec.ClientAddPartitionLostListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.AddPartitionLostListenerMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ClientRemovePartitionLostListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.RemovePartitionLostListenerMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ClientCreateProxyCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.CreateProxyMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ClientGetDistributedObjectsCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.GetDistributedObjectsMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ClientAddDistributedObjectListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.AddDistributedObjectListenerMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ClientDestroyProxyCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.DestroyProxyMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ClientPingCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.PingMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ClientAddMembershipListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.AddMembershipListenerMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ClientAuthenticationCustomCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.AuthenticationCustomCredentialsMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ClientRemoveAllListenersCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.RemoveAllListenersMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ClientRemoveDistributedObjectListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.RemoveDistributedObjectListenerMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ClientGetPartitionsCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.GetPartitionsMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.ClientAuthenticationCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.AuthenticationMessageTask(clientMessage, node, connection);
            }
        };
//endregion
//region ----------  REGISTRATION FOR com.hazelcast.client.impl.protocol.task.queue
        tasks[com.hazelcast.client.impl.protocol.codec.QueueCompareAndRemoveAllCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.queue.QueueCompareAndRemoveAllMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.QueueContainsAllCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.queue.QueueContainsAllMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.QueueAddAllCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.queue.QueueAddAllMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.QueueTakeCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.queue.QueueTakeMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.QueueAddListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.queue.QueueAddListenerMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.QueueCompareAndRetainAllCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.queue.QueueCompareAndRetainAllMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.QueueOfferCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.queue.QueueOfferMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.QueuePeekCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.queue.QueuePeekMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.QueueRemoveCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.queue.QueueRemoveMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.QueueIsEmptyCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.queue.QueueIsEmptyMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.QueueIteratorCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.queue.QueueIteratorMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.QueueSizeCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.queue.QueueSizeMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.QueuePutCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.queue.QueuePutMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.QueueContainsCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.queue.QueueContainsMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.QueuePollCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.queue.QueuePollMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.QueueDrainToCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.queue.QueueDrainMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.QueueRemoveListenerCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.queue.QueueRemoveListenerMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.QueueRemainingCapacityCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.queue.QueueRemainingCapacityMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.QueueClearCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.queue.QueueClearMessageTask(clientMessage, node, connection);
            }
        };
        tasks[com.hazelcast.client.impl.protocol.codec.QueueDrainToMaxSizeCodec.RequestParameters.TYPE.id()] = new MessageTaskFactory() {
            public MessageTask create(ClientMessage clientMessage, Connection connection) {
                return new com.hazelcast.client.impl.protocol.task.queue.QueueDrainMaxSizeMessageTask(clientMessage, node, connection);
            }
        };
//endregion

    }

    @edu.umd.cs.findbugs.annotations.SuppressWarnings({"MS_EXPOSE_REP", "EI_EXPOSE_REP"})
    public MessageTaskFactory[] getTasks() {
        return tasks;
    }

    @Override
    public MessageTask create(ClientMessage clientMessage, Connection connection) {
        try{
            final MessageTaskFactory factory = tasks[clientMessage.getMessageType()];
            if (factory != null) {
                return factory.create(clientMessage, connection);
            }
        } catch(Exception e) {
        }
        return new NoSuchMessageTask(clientMessage, node, connection);
    }

}


