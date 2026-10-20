package security_cache.mateus9.repository;

import org.apache.catalina.User;
import org.hibernate.internal.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {

    Optional <User> findByEmail(String email);

}
