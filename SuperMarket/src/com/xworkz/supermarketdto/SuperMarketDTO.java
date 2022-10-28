package com.xworkz.supermarketdto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor

public class SuperMarketDTO implements Serializable{

	private int id;
	private String name;
	private String company;
	private String gstNo;
	private int pincode;
	private String type;
}
