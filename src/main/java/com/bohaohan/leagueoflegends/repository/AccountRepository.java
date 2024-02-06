package com.bohaohan.leagueoflegends.repository;

import com.bohaohan.leagueoflegends.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
