package Exception;

public class CustomException {
	
    public static void main(String[] args)throws TestException {
		    
			throw new TestException();
	}
}

class TestException extends Exception {

}
