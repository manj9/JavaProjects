package com.beans;

import com.spring.IOutput;

public class OutputHelper {
	
	IOutput output;
	
	public void generateOutput(){
		
		output.generateOutput();
	}
	
	public OutputHelper(IOutput output){
		
		this.output=output;
	}

}
