package com.december.resources.DAO;

import java.util.List;

import com.december.resources.vo.SurveyAVO;



public interface DAO {
	public int dataEntry(SurveyAVO svo);
	public SurveyAVO getData(int Id);
	public int updateData(SurveyAVO svo);
	public void deleteData(int Id);
	public List<SurveyAVO> listAll();
	public int[] male_female_other_hr();
	public int[] getAudio_Video();
	public int loudness(String music);
}
