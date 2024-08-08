package org.alok.repository;

import org.alok.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICollegeRepository extends JpaRepository<College, Integer> {

}
