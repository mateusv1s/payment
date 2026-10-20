package security_cache.mateus9.entity;

import jakarta.persistence.*;
import lombok.Data;
import security_cache.mateus9.config.enums.UserStatus;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column (nullable = false)
    private String name;

    @Column (nullable = false)
    private String email;

    @Column (name = "hash", nullable = false)
    private String password;

    @Column (nullable = false)
    @Enumerated(EnumType.STRING)
    private UserStatus status;

    @Column (name = "created_at")
    private LocalDateTime createdAt;

    @Column (name = "expires_at")
    private LocalDateTime expiresAt;


}
