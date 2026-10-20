package security_cache.mateus9.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.Instant;

@Entity
@Data
@Table (name = "idempotency_key")
public class IdempotencyKey {

    @Id
    @Column (name = "key")
    private String key;

    private String paymentId;

    private Instant createdAt;

}
