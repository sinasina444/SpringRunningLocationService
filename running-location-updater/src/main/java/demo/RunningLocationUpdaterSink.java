package demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import demo.model.CurrentPosition;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import java.io.IOException;

@EnableBinding(Sink.class)
@Slf4j
@MessageEndpoint
public class RunningLocationUpdaterSink {

    @Autowired
    private SimpMessagingTemplate template;

    @Autowired
    private ObjectMapper objectMapper;

    @ServiceActivator(inputChannel = Sink.INPUT)

    public void updateLocation(String input) throws IOException {
        log.info("Location input in updater " + input);
        CurrentPosition position = this.objectMapper.readValue(input, CurrentPosition.class);
        this.template.convertAndSend("/topic/locations", position);
    }
}
