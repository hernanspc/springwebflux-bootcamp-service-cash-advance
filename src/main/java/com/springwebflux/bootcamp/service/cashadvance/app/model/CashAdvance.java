package com.springwebflux.bootcamp.service.cashadvance.app.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "cash-advance")
public class CashAdvance {
	@Id
	private String id;
	 
}
