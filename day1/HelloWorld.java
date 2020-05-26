/*
  1. java 文件名称必须要和类名保持一致；
  2. 一个Java文件可以包含多个class，但是public class只能有一个；
  3. public static void main(String[] args) 是整个Java程序的入口，如果想要执行对应的Java代码，就必须要添加该方法，并且，格式是固定的；
  4. main 方法参数列表支持多种格式的书写，如String[] args, String [] args, String args[];
  5. main 方法中参数名称无所谓，但一般写作args;
  6. 
*/
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

class Test {

}
