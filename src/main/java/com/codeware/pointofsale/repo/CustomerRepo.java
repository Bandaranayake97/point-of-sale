package com.codeware.pointofsale.repo;

import com.codeware.pointofsale.Entity.Customerr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface CustomerRepo extends JpaRepository<Customerr,Integer> {


    List<Customerr> findAllByActiveEquals(boolean customerActive);
}
