package pl.coderslab.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.entity.User;

import java.util.List;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    @Override
    List<User> findAll();

    Optional<User> findByUserName(String userName);
}