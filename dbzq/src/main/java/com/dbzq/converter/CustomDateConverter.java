package com.dbzq.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class CustomDateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String arg0) {
		// TODO Auto-generated method stub
		try {
			return new SimpleDateFormat("yyyy-MM-dd").parse(arg0);
		} catch (ParseException e) {
			return null;
			
		}
	}

}
