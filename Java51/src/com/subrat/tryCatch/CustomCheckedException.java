package com.subrat.tryCatch;

class InvalidAgeException extends Exception{
	
	private static final long serialVersionUID = 1L;
	public InvalidAgeException(){
		
	};
	public InvalidAgeException(String error) {
		super(error);
	}
	
}

public class CustomCheckedException {
void main() {
	try {
		IO.println("enter age");
		int age=Integer.parseInt(IO.readln());	
		validateAge(age);
	}
	catch(InvalidAgeException e) {
		e.printStackTrace();
	}	
}
public void validateAge(int age) throws InvalidAgeException  {
	if(age<18) {
		throw new InvalidAgeException("Age is Invalid");
	}
	else {
		IO.println("age is valid");
	}
}

}

