package org.alok.service;

import java.util.Optional;

import org.alok.entity.JobSeeker;

public interface IJobSeekerService {
	public String registerJobbSeeker(JobSeeker seeker);
	public Optional<JobSeeker> fetchById(Integer id);
}
