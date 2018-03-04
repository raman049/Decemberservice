package com.december.service.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.client.clientClass.decemberClient;
import com.client.vo.SurveyAVO;
import com.client.vo.resultVO;



@Controller
public class signup_a {

	@RequestMapping(value = "/login_in")
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/profile")
	public String profile() {
		return "profile";
	}

	@RequestMapping(value = "/survey")
	public String survey() {
		return "survey_a";
	}

	@RequestMapping(value = "/submit_a")
	public String survey_a(@ModelAttribute(value = "surveya") SurveyAVO svo) throws Exception {
		// svo.setAge();
	//decemberClient client = new decemberClient();
	decemberClient.dataEntry(svo);
		return "submit";
	}

	@RequestMapping(value = "/survey_result")
	public String survey_result(@ModelAttribute(value = "resultmodel") resultVO result, Model model) throws Exception {
		//ModelAndView model = new ModelAndView();
		decemberClient client = new decemberClient();
	
		result = client.getResults();
		model.addAttribute("malehr", result.getMale_hr());
		model.addAttribute("femalehr", result.getFemale_hr());
		model.addAttribute("otherhr", result.getOther_hr());
		int audio = result.getAudio_no();
		int video = result.getVideo_no();
		int audioPercent = (audio*100)/(audio+video);
		int videoPercent = (video*100)/(audio+video);
		model.addAttribute("audioPC", audioPercent);
		model.addAttribute("videoPC", videoPercent);
		model.addAttribute("totalno", audio+video);
		return "survey_result";
	}

}
