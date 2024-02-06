package com.bohaohan.leagueoflegends.repository;

import com.bohaohan.leagueoflegends.entity.Champion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChampionRepository extends JpaRepository<Champion, Long> {
}
