package com.Mapping.Mapping.Repository;

import com.Mapping.Mapping.Entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerReposistory extends JpaRepository<Player, Long> {
}
