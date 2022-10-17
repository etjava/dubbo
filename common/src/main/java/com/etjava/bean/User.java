package com.etjava.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class User implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String userName;
	private Integer age;
}
