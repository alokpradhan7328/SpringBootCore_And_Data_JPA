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
@Table(name="ALOK_LIBRARY")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LibraryMgmt 
{
	@Column(name="BOOK_ID")
	@Id
	@SequenceGenerator(name="b1",initialValue=100,allocationSize = 1,sequenceName="BOOK_SEQ")
	@GeneratedValue(generator = "b1",strategy = GenerationType.SEQUENCE)
	private Integer bookId;
	@Column(name="BOOK_NAME",length = 30)
	private String bookName;
	@Column(name="AUTHOR_NAME",length=25)
	private String authorName;
	@Column(name="BOOK_TYPE",length=20)
	private String bookType;
	@Column(name="PRICE")
	private Double price;
	@Column(name="QTY")
	private Integer qty;
	
	
}
