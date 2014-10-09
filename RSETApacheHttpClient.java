package com.rs.jaxrs.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class RSETApacheHttpClient {
 public static void main(String[] args) {

  try {
   DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
   HttpGet httpGet = new HttpGet(
     "http://localhost:8080/Restful-Webservice/rest/getservice/devx.com");

   HttpResponse httpResponse = defaultHttpClient.execute(httpGet);
   if (httpResponse.getStatusLine().getStatusCode() != 200) {

    throw new RuntimeException("Failed to connect service"
      + httpResponse.getStatusLine().getStatusCode());
   } else {
    BufferedReader bufferedReader = new BufferedReader(
      new InputStreamReader(httpResponse.getEntity()
        .getContent()));
    String response = null;
    while ((response = bufferedReader.readLine()) != null) {
     System.out.println(response);
    }

   }
   defaultHttpClient.getConnectionManager().shutdown();

  } catch (ClientProtocolException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }

 }

}
