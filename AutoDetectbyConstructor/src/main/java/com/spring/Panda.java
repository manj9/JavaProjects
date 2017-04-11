package com.spring;

public class Panda {

	String pandaName;

	public void setPandaName(String pandaName) {
		this.pandaName = pandaName;
	}

	@Override
	public String toString() {
		return "Kungfu [pandaName=" + pandaName + "]";
	}

}
