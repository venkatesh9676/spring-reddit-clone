package com.spring.reddit.clone.Exception;



public class SpringRedditException extends RuntimeException {

	
	  public SpringRedditException(String exMessage, Exception exception) {
	  super(exMessage, exception); }
	 

	    public SpringRedditException(String exMessage) {
	        super(exMessage);
	    }

		
}
