package domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //the table
public class UnitOfMeasure {

@Id 					//the ID associated with the entity 
@GeneratedValue ( strategy = GenerationType.IDENTITY) //getting an ID value from the database
private Long id;
private String description;
private BigDecimal amount;


public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
