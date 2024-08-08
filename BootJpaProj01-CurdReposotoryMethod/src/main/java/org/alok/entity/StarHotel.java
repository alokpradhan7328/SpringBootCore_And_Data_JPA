package org.alok.entity;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="STAR_HOTEL_MENU")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StarHotel 
{
	@Column(name="ITEM_ID")
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(name="gen1",initialValue = 100,allocationSize = 1,sequenceName = "HOTEL_SEQ")
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer itemId;
	@Column(name="ITEM_NAME",length=30)
	private String itemName;
	@Column(name="ITEM_TYPE",length=20)
	private String itemType;
	@Column(name="PRICE")
	private Double price;
	
}
