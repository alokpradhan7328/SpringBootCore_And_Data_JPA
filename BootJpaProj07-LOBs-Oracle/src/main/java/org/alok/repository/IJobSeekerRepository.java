package org.alok.repository;

import org.alok.entity.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IJobSeekerRepository extends JpaRepository<JobSeeker, Integer>{

}
