import java.time.LocalDateTime;

public class Full extends Subscription {
    public Full(Human human, String type, LocalDateTime registration, LocalDateTime end) {
        super(human, type, registration, end);
    }
}
