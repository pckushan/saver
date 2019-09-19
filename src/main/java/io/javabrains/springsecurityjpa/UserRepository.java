package io.javabrains.springsecurityjpa;

import io.javabrains.springsecurityjpa.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author kushan
 * @date
 * @time
 */
public interface UserRepository extends JpaRepository<User, Integer > {
	Optional<User> findByUserName(String userName);
}
