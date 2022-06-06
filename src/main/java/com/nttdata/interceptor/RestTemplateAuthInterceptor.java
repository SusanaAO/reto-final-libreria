package com.nttdata.interceptor;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

public class RestTemplateAuthInterceptor implements ClientHttpRequestInterceptor{ 
	
	@Autowired
	AuthRequestInterceptor authRequestInterceptor;
	
	@Override
    public ClientHttpResponse intercept(
      HttpRequest request, 
      byte[] body, 
      ClientHttpRequestExecution execution) throws IOException {
 
        ClientHttpResponse response = execution.execute(request, body);
        response.getHeaders().add(AuthRequestInterceptor.AUTHORIZATION_HEADER, authRequestInterceptor.addAutHeader());
        return response;
    }

}
