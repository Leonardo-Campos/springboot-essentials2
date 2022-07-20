package academy.devdojo.springboot2.service;

import academy.devdojo.springboot2.domain.DevdojoUser;
import academy.devdojo.springboot2.repository.DevdojoUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DevdojoUserDetailsService implements UserDetailsService {
    private final DevdojoUserRepository devdojoUserRepository;
    @Override
    public UserDetails loadUserByUsername(String username) {
        return Optional.ofNullable(devdojoUserRepository.findByUsername(username))
                .orElseThrow(() ->new UsernameNotFoundException("Devdojo User not found"));
    }
}
