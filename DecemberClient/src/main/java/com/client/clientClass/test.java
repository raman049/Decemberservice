package com.client.clientClass;

import com.client.vo.SurveyAVO;
import com.client.vo.SurveyList;
import com.client.vo.loudnessVO;
import com.client.vo.resultVO;

public class test {

	public static void main(String args[]) throws Exception {
		SurveyAVO sv = new SurveyAVO();
		loudnessVO lvo = new loudnessVO();
		resultVO res = new resultVO();
		SurveyList slist = new SurveyList();
		decemberClient dc = new decemberClient();
		// sv = dc.getData(1);
		lvo = dc.getloudness("Pop");
		//res = dc.getResults();
		System.out.println(lvo.getLoud());
	}
}
