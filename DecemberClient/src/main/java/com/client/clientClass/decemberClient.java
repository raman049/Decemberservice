package com.client.clientClass;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringBufferInputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.PathParam;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import com.client.vo.SurveyAVO;
import com.client.vo.SurveyList;
import com.client.vo.loudnessVO;
import com.client.vo.resultVO;

public class decemberClient {

	public static final String SERVICE_URL = "http://localhost:8080/DecemberServiceResources/api/survey_service";

	public SurveyAVO getData(int id) throws Exception {
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpGet getRequest = new HttpGet(SERVICE_URL + "/" + id);
		getRequest.addHeader("accept", "application/XML");
		HttpResponse response = httpClient.execute(getRequest);
		if (response.getStatusLine().getStatusCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
		}
		BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
		String output;
		StringBuffer sb = new StringBuffer();
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
			sb.append(output);
		}
		JAXBContext jaxbContext = JAXBContext.newInstance(SurveyAVO.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		SurveyAVO svo = (SurveyAVO) jaxbUnmarshaller.unmarshal(new StringBufferInputStream(sb.toString()));
		httpClient.getConnectionManager().shutdown();
		return svo;

	}

	public static void dataEntry(SurveyAVO svo) throws Exception {
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost postRequest = new HttpPost(SERVICE_URL + "/post");
		// object to xml
		JAXBContext jaxbContext = JAXBContext.newInstance(SurveyAVO.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		// output pretty printed
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		StringWriter sw = new StringWriter();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller.marshal(svo, sw);
		StringEntity input = new StringEntity(sw.toString());
		System.out.println(sw);
		input.setContentType("application/XML");
		postRequest.setEntity(input);
		HttpResponse response = httpClient.execute(postRequest);

		if (response.getStatusLine().getStatusCode() != 201) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));

		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

		httpClient.getConnectionManager().shutdown();

	}

	public void updateOrder(SurveyAVO svo) {
		return;
	}

	public void deleteOrder(@PathParam("id") int orderID) {
		return;
	}

	public List<SurveyAVO> getAll() throws Exception {
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpGet getRequest = new HttpGet(SERVICE_URL + "/" + "all");
		getRequest.addHeader("accept", "application/XML");
		HttpResponse response = httpClient.execute(getRequest);
		if (response.getStatusLine().getStatusCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
		}
		BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
		String output;
		StringBuffer sb = new StringBuffer();
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
			sb.append(output);
		}
		JAXBContext jaxbContext = JAXBContext.newInstance(SurveyList.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		SurveyList svo = (SurveyList) jaxbUnmarshaller.unmarshal(new StringBufferInputStream(sb.toString()));
		List<SurveyAVO> list = new ArrayList<SurveyAVO>();
		for (SurveyAVO savo : svo.getLvo()) {
			list.add(savo);
			System.out.println("savo.getAge()");
			System.out.println(savo.getAge());
		}
		httpClient.getConnectionManager().shutdown();
		return list;
	}

	public resultVO getResults() throws Exception {
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpGet getRequest = new HttpGet(SERVICE_URL + "/" + "result");
		getRequest.addHeader("accept", "application/XML");
		HttpResponse response = httpClient.execute(getRequest);
		if (response.getStatusLine().getStatusCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
		}
		BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
		String output;
		StringBuffer sb = new StringBuffer();
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
			sb.append(output);
		}
		JAXBContext jaxbContext = JAXBContext.newInstance(resultVO.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		resultVO result = (resultVO) jaxbUnmarshaller.unmarshal(new StringBufferInputStream(sb.toString()));
		httpClient.getConnectionManager().shutdown();
		return result;

	}
	public loudnessVO getloudness(String genre) throws Exception {
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpGet getRequest = new HttpGet(SERVICE_URL + "/music" +"/" + genre);
		getRequest.addHeader("accept", "application/XML");
		HttpResponse response = httpClient.execute(getRequest);
		if (response.getStatusLine().getStatusCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
		}
		BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
		String output;
		StringBuffer sb = new StringBuffer();
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
			sb.append(output);
		}
		JAXBContext jaxbContext = JAXBContext.newInstance(loudnessVO.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		loudnessVO lvo = (loudnessVO) jaxbUnmarshaller.unmarshal(new StringBufferInputStream(sb.toString()));
		httpClient.getConnectionManager().shutdown();
		return lvo;

	}
}
