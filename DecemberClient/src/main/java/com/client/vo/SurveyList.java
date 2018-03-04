package com.client.vo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name ="surveyAVOes")
public class SurveyList {
	
	List<SurveyAVO> lvo = new ArrayList<SurveyAVO>();
	@XmlElement(name="surveyAVO")
	public List<SurveyAVO> getLvo() {
		return lvo;
	}

	
	public void setLvo(ArrayList<SurveyAVO> lvo) {
		this.lvo = lvo;
	}

}
