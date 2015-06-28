package com.welovecoding.webapp.markdown;

import org.markdown4j.Markdown4jProcessor;

public class HelloWorld {

  public static void main(String[] args) throws Exception {
    String html = new Markdown4jProcessor().process("This is a **bold** text");
    System.out.println(html);
  }

}
