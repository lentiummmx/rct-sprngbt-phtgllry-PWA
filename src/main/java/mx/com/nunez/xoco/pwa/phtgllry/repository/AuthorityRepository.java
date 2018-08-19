package mx.com.nunez.xoco.pwa.phtgllry.repository;

import mx.com.nunez.xoco.pwa.phtgllry.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
