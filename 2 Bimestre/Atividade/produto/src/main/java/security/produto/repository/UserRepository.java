package security.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import security.produto.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

    UserDetails findByLogin(String role);
}