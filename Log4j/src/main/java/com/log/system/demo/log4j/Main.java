package com.log.system.demo.log4j;

import com.log.system.demo.client.Client;

public class Main {

  public static void main(String args[]){
    Client client = new Client();
    client.send("hello world");
  }
}
