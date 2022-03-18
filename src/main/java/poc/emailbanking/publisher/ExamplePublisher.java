package poc.emailbanking.publisher;
import com.google.cloud.spring.pubsub.core.PubSubTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExamplePublisher {

    private final String topic;
    private final PubSubTemplate pubSubTemplate;
    private static final Logger log = LoggerFactory.getLogger(ExamplePublisher.class);

    public ExamplePublisher(
            @Value("${pubsub-example.topic.name}") String topic,
            PubSubTemplate pubSubTemplate) {
        this.topic = topic;
        this.pubSubTemplate = pubSubTemplate;
    }

    public void publish(String payload) {
        log.info("Publicando no tópico {}", topic);
        pubSubTemplate.publish(topic, payload);
    }
}
