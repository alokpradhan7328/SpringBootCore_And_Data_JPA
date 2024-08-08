package com.alok.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component("ticket")
@Data
public class TicketPrice 
{
	@Value("${general.fees}")
	private Double generalFees;
	
	@Value("${sleeper.fees}")
	private Double sleeperFees;
	
	@Value("${3rdAc.fees}")
	private Double thirdAcFees;
	
	@Value("${2ndAc.fees}")
	private Double secondAcFees;
	
	@Value("${1stAc.fees}")
	private Double firstAcFees;
	
	
	
}
