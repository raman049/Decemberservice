package com.december.resources.restservice;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.december.resources.DAO.DAOimpl;
import com.december.resources.vo.SurveyAVO;
import com.december.resources.vo.loudnessVO;
import com.december.resources.vo.resultVO;

@Path("/survey_service")
public class Webservice {

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public SurveyAVO getData(@PathParam("id") int ID) {
		SurveyAVO svo = new SurveyAVO();
		DAOimpl dao = new DAOimpl();
		svo = dao.getData(ID);
		return svo;
	}

	@POST
	@Path("/post")
	@Consumes({ MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_XML })
	public Response dataEntry(SurveyAVO svo) {
		DAOimpl dao = new DAOimpl();
		dao.dataEntry(svo);
		String result = "Order created: " + svo;
		return Response.status(201).entity(result).build();
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void updateOrder(SurveyAVO svo) {
		return;
	}

	@DELETE
	@Path("/{id}")
	public void deleteOrder(@PathParam("id") int orderID) {
		return;
	}

	@GET
	@Path("/all")
	@Produces({ MediaType.APPLICATION_XML })
	public List<SurveyAVO> getAllOrder() {
		DAOimpl dao = new DAOimpl();
		ArrayList<SurveyAVO> lvo = new ArrayList<SurveyAVO>();
		lvo = (ArrayList<SurveyAVO>) dao.listAll();
		return lvo;
	}

	@GET
	@Path("/result")
	@Produces({ MediaType.APPLICATION_XML })
	public resultVO getHours() {
		DAOimpl dao = new DAOimpl();
		int[] hrs = new int[3];
		hrs = dao.male_female_other_hr();
		resultVO rvo = new resultVO();
		rvo.setMale_hr(hrs[0]);
		rvo.setFemale_hr(hrs[1]);
		rvo.setOther_hr(hrs[2]);
		int[] av = new int[2];
		av = dao.getAudio_Video();
		rvo.setAudio_no(av[0]);
		rvo.setVideo_no(av[1]);
		return rvo;
	}


	@GET
	@Path("/music"+"/{path}")
	@Produces({ MediaType.APPLICATION_JSON })
	public loudnessVO getLoudness(@PathParam("path") String music) {
		DAOimpl dao = new DAOimpl();
		int loud = dao.loudness(music);
		loudnessVO lvo = new loudnessVO();
		lvo.setLoud(loud);
		return lvo;
	}

}
