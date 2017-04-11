package com.di;

public class OutputHelper {

	IOutput outputgenerator;

	public void generateOutput() {

		outputgenerator.generateOutput();
	}

	public void setOutputgenerator(IOutput outputgenerator) {

		this.outputgenerator = outputgenerator;

	}
}
