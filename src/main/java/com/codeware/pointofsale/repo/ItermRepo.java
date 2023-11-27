package com.codeware.pointofsale.repo;

import com.codeware.pointofsale.Entity.Items;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItermRepo extends JpaRepository<Items,Integer> {

    List<Items> findAllByItemsNameEqualsAndActiveIsTrue(String itemname);
}
