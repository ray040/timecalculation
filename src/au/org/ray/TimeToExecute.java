package au.org.ray;

import java.io.IOException;
import java.net.MalformedURLException;

public class TimeToExecute {
	public static void main(String Args[]) throws MalformedURLException, IOException {
		long startTime = System.nanoTime();
		Tester.testMethodExcTime();
		long endTime = System.nanoTime();

		long duration = (endTime - startTime);

		System.out.println("Duration " + duration);
	}

	public static class Tester {

		public static void testMethodExcTime() throws MalformedURLException, IOException {
			for (int i = 0; i < 100000000; i++) {
				i++;
			}
		}
	}
}
