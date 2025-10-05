package moldawski.de.timertask;

import java.lang.System;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {TaskSchedulingAutoConfiguration.class})
public class TimerTaskCliApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(TimerTaskCliApp.class)
            .properties("timertask.scheduling.enabled=false")
            .run(args);
    }

    @Bean
    public CommandLineRunner runTimerTaskOnce(TimerTaskBean timerTaskBean) {
        return args -> {
        	System.out.println("Starting the timer task...");
            timerTaskBean.run();
            System.out.println("Bye, I am done");
            System.out.flush();
            System.exit(0);
        };
    }
}
