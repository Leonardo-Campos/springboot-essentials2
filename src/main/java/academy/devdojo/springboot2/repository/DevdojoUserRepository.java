package academy.devdojo.springboot2.repository;

import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.domain.DevdojoUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DevdojoUserRepository extends JpaRepository<DevdojoUser, Long> {

    DevdojoUser findByUsername(String username);


}
