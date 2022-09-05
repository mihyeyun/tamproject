package com.spring.persistence;

import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;


public class JDBCUtil {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
