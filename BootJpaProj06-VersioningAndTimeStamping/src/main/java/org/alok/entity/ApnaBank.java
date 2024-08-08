package org.alok.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.Version;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@Table(name="JPA_BANK")
@Entity
@RequiredArgsConstructor
@AllArgsConstructor
public class ApnaBank{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer bankAccNo;
	@NonNull
	private String holderName;
	@NonNull
	private String addrs;
	@NonNull
	private Double balance;
	
	@CreationTimestamp
	@NonNull
	private LocalDateTime openingTime;
	
	@UpdateTimestamp
	@NonNull
	private LocalDateTime updateTime;
	
	@Version
	@NonNull
	private Integer noOfUpate;
 
}
