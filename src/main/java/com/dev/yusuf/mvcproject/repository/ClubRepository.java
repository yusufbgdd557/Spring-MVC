package com.dev.yusuf.mvcproject.repository;

import com.dev.yusuf.mvcproject.models.Club;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClubRepository extends JpaRepository<Club, Long> {
    Optional<Club> findByTitle(String url);
}
