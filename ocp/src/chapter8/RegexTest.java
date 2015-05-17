package chapter8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String patternArg, marcherArg = null;
		
		try {
				System.out.println("Pattern: ");
				patternArg = bufferedReader.readLine();
				System.out.println("Source: ");
				marcherArg = bufferedReader.readLine();
				
				Pattern pattern = Pattern.compile(patternArg);
				Matcher matcher = pattern.matcher(marcherArg);
				System.out.println("source: " + marcherArg);
				System.out.println(" index: 01234567890123456789\n");
				System.out.println("pattern: " + matcher.pattern());
				
				while (matcher.find()) {
					System.out.println(matcher.start() + " " + matcher.end() + " " + matcher.group());
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
