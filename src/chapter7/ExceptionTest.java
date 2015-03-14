package chapter7;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			switch (args[0]) {
				case "x":
					throw new IOException();	
	
				default:
					throw new SQLException();
			}
			
		} catch(IOException | SQLException e) {
		
		}
	}

}
