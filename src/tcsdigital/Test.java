package tcsdigital;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		String str = "-1234567890";
		String x = String.valueOf(Math.abs(Long.parseLong(str)));
		System.out.println(x);
	}
}
 