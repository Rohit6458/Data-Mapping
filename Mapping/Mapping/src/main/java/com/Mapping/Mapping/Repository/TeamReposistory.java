package com.Mapping.Mapping.Repository;

import com.Mapping.Mapping.Entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamReposistory extends JpaRepository<Team,Long> {

    Team findByName(String teamName);
}
