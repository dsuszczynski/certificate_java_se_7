package chapter6;

import java.util.concurrent.ExecutionException;

public class Exceptions {

	public static void main(String[] args) throws ExecutionException {
		System.out.println("Throw nothing but could!");
		
		Integer.valueOf("100");
		Integer.parseInt("200");
	}

	void throwThrowable() throws Throwable {
		try {
			throw new Throwable();
		}
		catch(Throwable throwable) {
			throw throwable;
		}
	}

	void throwException() throws Exception {
		try {
			throw new Exception();
		}
		catch(Exception exception) {
			throw exception;
		}
	}
	
	void throwRuntimeException() {
		try {
			throw new RuntimeException();
		}
		catch(RuntimeException runtimeException) {
			throw runtimeException;
		}
	}
	
	void throwError() {
		try {
			throw new Error();
		}
		catch(Error error) {
			throw error;
		}
	}

}
