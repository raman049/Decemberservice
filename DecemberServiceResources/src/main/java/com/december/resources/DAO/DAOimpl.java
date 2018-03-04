package com.december.resources.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.december.resources.util.HibernateUtil;
import com.december.resources.vo.SurveyAVO;
import com.december.resources.vo.loudnessVO;

public class DAOimpl implements DAO {

	public int dataEntry(SurveyAVO svo) {
		Transaction tx = null;
		Integer ID = 0;
		try {
			Session session = HibernateUtil.getInstance().getSession();
			tx = session.getTransaction();
			tx.begin();
			ID = (Integer) session.save(svo);
			tx.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			tx.rollback();
		}
		return ID;
	}

	public SurveyAVO getData(int Id) {
		Session session = null;
		try {
			session = HibernateUtil.getInstance().getSession();
			Query query = session.createSQLQuery("select * from surveya where id = :id").addEntity(SurveyAVO.class)
					.setParameter("id", Id);

			List queryList = query.list();
			if (queryList != null && queryList.isEmpty()) {
				return null;
			} else {
				return (SurveyAVO) queryList.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {

		}
	}

	public int updateData(SurveyAVO svo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void deleteData(int Id) {
		// TODO Auto-generated method stub

	}

	public List<SurveyAVO> listAll() {
		Session session = null;
		try {
			session = HibernateUtil.getInstance().getSession();
			SQLQuery query = session.createSQLQuery("select * from surveya ").addEntity(SurveyAVO.class);

			List<SurveyAVO> queryList = query.list();
			if (queryList != null && queryList.isEmpty()) {
				return null;
			} else {
				// System.out.println("list " + queryList);
				return queryList;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
	}

	public int[] male_female_other_hr() {
		Session session = null;
		int[] averagehrs = new int[3];
		try {
			session = HibernateUtil.getInstance().getSession();
			Query query = session.createSQLQuery("select time from surveya where gender = 'male'");
			@SuppressWarnings("rawtypes")
			List male_hr_list = query.list();
			Query query2 = session.createSQLQuery("select time from surveya where gender = 'female'");
			@SuppressWarnings("rawtypes")
			List female_hr_list = query2.list();
			Query query3 = session.createSQLQuery("select time from surveya where gender = 'other'");
			@SuppressWarnings("rawtypes")
			List other_hr_list = query3.list();
			int maleHr = 0;
			int maleCount = 0;
			for (Object i : male_hr_list) {
				maleCount++;
				int j = Integer.valueOf(i.toString());
				maleHr = maleHr + j;
			}
			int femaleHr = 0;
			int femaleCount = 0;
			for (Object i : female_hr_list) {
				femaleCount++;
				int j = Integer.valueOf(i.toString());
				femaleHr = femaleHr + j;
			}
			int otherHr = 0;
			int otherCount = 0;
			for (Object i : other_hr_list) {
				otherCount++;
				int j = Integer.valueOf(i.toString());
				otherHr = otherHr + j;
			}
			averagehrs[0] = maleHr / maleCount;
			averagehrs[1] = femaleHr / femaleCount;
			averagehrs[2] = otherHr / otherCount;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return averagehrs;
	}

	public int[] getAudio_Video() {
		Session session = null;
		int[] audio_video = new int[2];
		try {
			session = HibernateUtil.getInstance().getSession();
			Query query = session.createSQLQuery("select form from surveya where form = 'audio'");
			@SuppressWarnings("rawtypes")
			List audio_list = query.list();

			int audio = 0;
			for (Object i : audio_list) {
				audio = audio + 1;
			}
			Query query2 = session.createSQLQuery("select form from surveya where form = 'video'");
			@SuppressWarnings("rawtypes")
			List video_list = query2.list();

			int video = 0;
			for (Object i : video_list) {
				video = video + 1;
			}
			audio_video[0] = audio;
			audio_video[1] = video;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return audio_video;
	}

	public int loudness(String music) {
		Session session = null;
		// List<String> loudness_list = new ArrayList<String>();
		try {
			session = HibernateUtil.getInstance().getSession();
			Query query = session.createSQLQuery("select loudness from surveya where genre = :m").setParameter("m", music);
			@SuppressWarnings("rawtypes")
			List loudness_list = query.list();
			int itemCount = 0;
			int loud = 0;
			for (Object i : loudness_list) {
				int j = Integer.valueOf(i.toString());
				loud = j + loud;
				itemCount++;
			}
			if (itemCount == 0) {
				return 0;
			} else {
				return loud / itemCount;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	

}
