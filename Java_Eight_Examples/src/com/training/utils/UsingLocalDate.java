/**
 * 
 */
package com.training.utils;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @author manan
 *
 */
public class UsingLocalDate {

	public static void main(String[] args) {
		
		LocalDateTime currentTime = LocalDateTime.now();
		
		System.out.println(currentTime);
		
		System.out.println(currentTime.getDayOfMonth());
		
		System.out.println(currentTime.getYear());
		
		LocalDate today = LocalDate.now();
		
		LocalDate birthday = LocalDate.of(1999, 2, 3);
		
		Period period = Period.between(birthday, today);
		
		System.out.println(period);
		
		System.out.println("Days: " + period.getDays());
		
		System.out.println("Months: " + period.getMonths());
		
		System.out.println("Years: " + period.getYears());
		
//		LocalDate to SQLDate
		Date sqlDate = Date.valueOf(today);
		
		System.out.println(sqlDate);
		
//		SQLDate to LocalDate
		LocalDate sqlToLocal = sqlDate.toLocalDate();
		
		System.out.println(sqlToLocal);
		
//		Date toSql = Date.valueOf(sqlToLocal);
		
		System.out.println("Date after a Millennia: " + today.plus(1, ChronoUnit.MILLENNIA));
		
		System.out.println("Date after a Week: " + today.plus(1, ChronoUnit.WEEKS));
		
		System.out.println("Date before a Month: " + today.minus(1, ChronoUnit.MONTHS));
	}
	
}
