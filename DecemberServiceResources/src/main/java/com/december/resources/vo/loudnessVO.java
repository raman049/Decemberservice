package com.december.resources.vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class loudnessVO {
	private int loud;

	public int getLoud() {
		return loud;
	}

	public void setLoud(int loud) {
		this.loud = loud;
	}

	public loudnessVO() {
		super();
	}



}
