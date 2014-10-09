package com.rs.jaxrs.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class RESTfulClient {

 /**
  * @param args
  */
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  String baseURI = "http://localhost:8080/Restful-Webservice";
  ClientConfig config = new DefaultClientConfig();
  Client client = Client.create(config);
  WebResource service = client.resource(baseURI);
  System.out.println("output for GET Service ");
  System.out.println(service.path("rest").path("getservice/devx.com")
    .get(ClientResponse.class).getEntity(String.class));
 }

}
