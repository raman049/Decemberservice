package com.client.rest;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.http.HttpResponse;

public class XMLUtil {
//	public static Object getEntityFromXMLString(HttpResponse response, Class clz) {
//		JAXBContext jaxbContext = null;
//		try {
//			jaxbContext = JAXBContext.newInstance(clz);
//			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//			return jaxbUnmarshaller.unmarshal(response.getEntity().getContent());
//		} catch (JAXBException | IllegalStateException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//	}
//
//	public String getXMLFromEntity(HttpResponse response, Object obj, Class clz) {
//		try {
//			File file = new File("C:\\file.xml");
//			JAXBContext jaxbContext = JAXBContext.newInstance(clz);
//			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//			// output pretty printed
//			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//			jaxbMarshaller.marshal(obj, file);
//			// jaxbMarshaller.marshal(obj, System.out);
//		} catch (JAXBException e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
}
