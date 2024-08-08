package com.alok.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("journey")
@Data
public class Journey
{

	@Value("11016")
	private Integer trainNo;
	
	@Value("${train.name}")
	private String trainName;
	
	@Value("${boardingstation.name}")
	private String boardingStation;
	
	@Value("${destinationstation.name}")
	private String destinationStation;
	
	//SPEL
	@Value("#{ticket.generalFees+ticket.sleeperFees+ticket.thirdAcFees+ticket.secondAcFees+ticket.firstAcFees}")
	private Double allTicketPrice;
	
	
	@Value("#{ticket.firstAcFees>ticket.generalFees}")
	private boolean is1stACIsHigher;
	
	@Value("${os.name}")
	private String osName;

	@Value("${os.version}")
	private String osVer;
	
	@Value("${path}")
	private String path;
	
	
}
