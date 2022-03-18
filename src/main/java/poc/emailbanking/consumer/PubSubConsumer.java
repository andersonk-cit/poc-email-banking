package poc.emailbanking.consumer;

import com.google.cloud.spring.pubsub.support.converter.ConvertedBasicAcknowledgeablePubsubMessage;

import java.util.function.Consumer;

public interface PubSubConsumer<T> {

    String subscription();

    Class<String> payloadType();

    Consumer<ConvertedBasicAcknowledgeablePubsubMessage<String>> messageConsumer();
}
