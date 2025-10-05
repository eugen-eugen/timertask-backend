package moldawski.de.timertask;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
@ConditionalOnProperty(name = "timertask.scheduling.enabled", havingValue = "true", matchIfMissing = true)
public class TimerTaskScheduler {
    private final TimerTaskBean timerTaskBean;

    public TimerTaskScheduler(TimerTaskBean timerTaskBean) {
        this.timerTaskBean = timerTaskBean;
    }

    @Scheduled(fixedRate = 10)
    public void runScheduled() {
    	System.out.println("Running the scheduled timer task...");
        timerTaskBean.run();
    	System.out.println("Running the scheduled timer task... End");
    }
}
