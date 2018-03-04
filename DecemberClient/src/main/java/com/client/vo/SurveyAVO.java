package com.client.vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class SurveyAVO {
	private String age, gender, genre, time, source, loudness, form;

	public SurveyAVO() {
		super();
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getLoudness() {
		return loudness;
	}

	public void setLoudness(String loudness) {
		this.loudness = loudness;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

}
