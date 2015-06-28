package com.welovecoding.webapp.markdown;

import java.io.InputStream;
import org.tautua.markdownpapers.ast.Document;
import org.tautua.markdownpapers.parser.Parser;

public class HelloWorld {

  public static void main(String[] args) throws Exception {
    ClassLoader classloader = Thread.currentThread().getContextClassLoader();
    InputStream in = classloader.getResourceAsStream("test.md");
    Parser parser = new Parser(in);
    Document doc = parser.parse();
    System.out.println("Nodes: " + doc.jjtGetNumChildren());
  }

}
