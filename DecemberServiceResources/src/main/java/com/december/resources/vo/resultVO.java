package com.december.resources.vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class resultVO {
	private int male_hr, female_hr, other_hr,audio_no, video_no;

	public resultVO() {
		super();
	}

	public int getMale_hr() {
		return male_hr;
	}

	public void setMale_hr(int male_hr) {
		this.male_hr = male_hr;
	}

	public int getFemale_hr() {
		return female_hr;
	}

	public void setFemale_hr(int female_hr) {
		this.female_hr = female_hr;
	}

	public int getOther_hr() {
		return other_hr;
	}

	public void setOther_hr(int other_hr) {
		this.other_hr = other_hr;
	}

	public int getAudio_no() {
		return audio_no;
	}

	public void setAudio_no(int audio_no) {
		this.audio_no = audio_no;
	}

	public int getVideo_no() {
		return video_no;
	}

	public void setVideo_no(int video_no) {
		this.video_no = video_no;
	}



}
