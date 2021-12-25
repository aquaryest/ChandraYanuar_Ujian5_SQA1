package com.sqa.ujian5.driver;

public class DriverStrategyImplementor {

public static DriverStrategy chooseStrategy(String strategy) {
		
		switch (strategy) {
		case "chrome":
			return new Chrome();

		default:
			return null;
		}
	}
}
