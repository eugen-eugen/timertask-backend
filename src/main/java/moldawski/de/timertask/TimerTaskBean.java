package moldawski.de.timertask;

import org.springframework.stereotype.Component;

@Component
public class TimerTaskBean {
    public void run() {
        System.out.println("Hello, I am a timer task");
    }
}
