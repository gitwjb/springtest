package com.wjb.one.testb.enumtest;

import java.util.Locale;

public enum TestEnum {
    Asc,DESC;
	
	public static TestEnum fromStringOrNull(String xx) {
		return TestEnum.valueOf(xx.toUpperCase(Locale.US));
	}
}
