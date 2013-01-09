package com.voghan.sample.rest.client;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.xml.MarshallingHttpMessageConverter;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.client.RestTemplate;

import com.voghan.sample.rest.model.Schedules;

public class SampleRestClient {
    static Logger log = Logger.getLogger(SampleRestClient.class);

    public Schedules requestSchedules(String uri) {

	log.info(uri);

	HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();

	RestTemplate restTemplate = new RestTemplate(requestFactory);

	List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();

	Jaxb2Marshaller jaxb2 = new Jaxb2Marshaller();
	jaxb2.setClassesToBeBound(com.voghan.sample.rest.model.Schedules.class);
	messageConverters.add(new MarshallingHttpMessageConverter(jaxb2));

	restTemplate.setMessageConverters(messageConverters);

	Schedules result = restTemplate.getForObject(uri, Schedules.class);

	return result;
    }
    
    public String requestStringSchedules(String uri) {

	log.info(uri);

	HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();

	RestTemplate restTemplate = new RestTemplate(requestFactory);

	List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
	messageConverters.add(new FormHttpMessageConverter());
	messageConverters.add(new StringHttpMessageConverter());

	restTemplate.setMessageConverters(messageConverters);

	String result = restTemplate.getForObject(uri, String.class);

	return result;
     }
    

}
