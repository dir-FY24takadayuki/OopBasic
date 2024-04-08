package company;

public class LibraryApplication {
String a = new String("Hello");
String b = new String("Hello");
String c = a ;

//＝＝演算子の使用
System.out.println(a == b);
System.out.println(a == c);

System.out.println(a.equal(b));


Double d = 3.14;
System.out.println(d.toString());

System.out.println(d.hashCode());


}
