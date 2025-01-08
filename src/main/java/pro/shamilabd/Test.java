package pro.shamilabd;

import org.w3c.dom.xpath.XPathResult;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {


  public static void main(String[] args) {
    var t = new Random().ints().limit(5).max().getAsInt();
    System.out.println(t);
  }
}
