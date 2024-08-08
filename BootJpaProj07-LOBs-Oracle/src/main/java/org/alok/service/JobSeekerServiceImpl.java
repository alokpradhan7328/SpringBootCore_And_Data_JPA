package org.alok.service;

import java.util.Optional;

import org.alok.entity.JobSeeker;
import org.alok.repository.IJobSeekerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class JobSeekerServiceImpl implements IJobSeekerService {

	@Autowired
	private IJobSeekerRepository jobRepo;
	
	@Override
	public String registerJobbSeeker(JobSeeker seeker)
	{
		Integer idVal = jobRepo.save(seeker).getJobId();
		return "Job Profile is saved having id"+idVal;
	}
	
	@Override
	public Optional<JobSeeker> fetchById(Integer id) {
		return jobRepo.findById(id);
	}

}
