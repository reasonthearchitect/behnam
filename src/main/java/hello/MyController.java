package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @Autowired
    private SimpMessagingTemplate template;

    @GetMapping("/api/hello/{name}")
    //@SendTo("/topic/greetings")
    public Greeting greetingGet(@PathVariable String name) throws Exception {
        this.template.convertAndSend("/topic/greetings", new Greeting(name));
        return new Greeting(name+ ": should be sent");
    }

    @GetMapping("/api/denied")
    //@SendTo("/topic/greetings")
    public Greeting denied() throws Exception {
        this.template.convertAndSend("/topic/greetings", new Greeting("DENIED"));
        return new Greeting("DENIED : should be sent");
    }
}
