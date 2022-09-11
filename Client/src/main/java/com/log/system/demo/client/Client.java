package com.log.system.demo.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
  // 源码依赖 slf4j的LoggerFactory类，使用其获取日志器
  private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);
  public void send(String msg) {
    LOGGER.debug(msg);
  }
}
