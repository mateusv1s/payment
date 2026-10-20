package security_cache.mateus9.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table (name = "outbox")
public class OutboxEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;

    private Long paymentEventId;

    private String eventType;

    private String payload;

    private LocalDateTime createdAt;

    private LocalDateTime publishedAt;

}
