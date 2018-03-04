package com.client.rest;

import org.apache.http.HttpResponse;
import org.codehaus.jackson.map.ObjectMapper;

import com.client.vo.SurveyAVO;



public class JSONUtil {

	public SurveyAVO getEntityFromJsonString(HttpResponse response, Class clz) {
		ObjectMapper mapper = new ObjectMapper();

		// try {
		// String staff1 = mapper.readValue(response.getEntity().getContent(),
		// clz);
		// // jaxbContext = JAXBContext.newInstance(clz);
		// // Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		// return mapper.readValue(staff1, clz);
		// } catch (IllegalStateException | IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		return null;
	}

	public String getJSONFromEntity(Object obj, Class clz) {
		ObjectMapper mapper = new ObjectMapper();
		return null;
	}
}
