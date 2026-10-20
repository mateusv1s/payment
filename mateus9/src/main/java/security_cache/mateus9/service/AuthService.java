package security_cache.mateus9.service;

import org.springframework.stereotype.Service;
import security_cache.mateus9.config.dto.request.LoginRequest;
import security_cache.mateus9.config.dto.response.LoginResponse;
import security_cache.mateus9.entity.User;
import security_cache.mateus9.repository.UserRepository;

import java.time.Instant;

@Service
public class AuthService {

    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


}
