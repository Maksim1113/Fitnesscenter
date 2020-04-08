import java.time.LocalDateTime;

public class Day extends Subscription {
    public Day(Human human, String type, LocalDateTime registration, LocalDateTime end) {
        super(human, type, registration, end);
    }
}
