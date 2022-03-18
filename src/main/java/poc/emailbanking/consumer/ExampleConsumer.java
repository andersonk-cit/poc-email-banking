 package poc.emailbanking.consumer;

 import com.google.cloud.spring.pubsub.support.converter.ConvertedBasicAcknowledgeablePubsubMessage;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.beans.factory.annotation.Value;
 import org.springframework.stereotype.Component;
 import poc.emailbanking.model.MessageEntity;

 import java.util.function.Consumer;

 @Component
 public class ExampleConsumer implements PubSubConsumer<MessageEntity> {

     private static final Logger log = LoggerFactory.getLogger(ExampleConsumer.class);
     private final String subscriptionName;

     public ExampleConsumer(
         @Value("${pubsub-example.subscription.name}") String subscriptionName
     ) {
         this.subscriptionName = subscriptionName;
     }

     @Override
     public String subscription() {
         return subscriptionName;
     }

     @Override
     public Class<String> payloadType() {
         return String.class;
     }

     @Override
     public Consumer<ConvertedBasicAcknowledgeablePubsubMessage<String>> messageConsumer() {
         return this::consume;
     }

     private void consume(ConvertedBasicAcknowledgeablePubsubMessage<String> message) {
         String received = message.getPayload();

         log.info(
//             "Recebendo mensagem no {}: [timestamp= {}, message= {}]",
             "Recebendo mensagem no {}: [message= {}]",
             subscriptionName,
//             received.getTimestamp(),
             received
         );

         message.ack();
     }
 }