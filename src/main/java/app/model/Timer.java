package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
@Component
public class Timer  {
    private Timer timer;
    private final Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
