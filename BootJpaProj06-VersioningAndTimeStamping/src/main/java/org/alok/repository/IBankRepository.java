package org.alok.repository;

import org.alok.entity.ApnaBank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBankRepository extends JpaRepository<ApnaBank,Integer> {

}
