package Part02_JavaBasics_JavaRefresherCourse;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRefresherMain {
    public static void main(String[] args){

        //Java Basic APIs - String - Immutable
        //String st = new String("mynameismohtadi");
        //System.out.println(st.length());

        //Java Basic APIs - StringBuilder - Mutable
        //StringBuilder sb = new StringBuilder("Mohtadi ");
        //sb.insert(0, "Good Morning ");
        //System.out.println(sb.toString());
        //int length = sb.length();
        //System.out.println(length);
        //sb.setCharAt(20,'!');
        //System.out.println(sb.toString());

       JavaRefresher javaRefresher = new JavaRefresher();
       //String vowelsOutput = javaRefresher.vowelOnly("Hello World");
       //System.out.println(vowelsOutput);

        //int index = javaRefresher.findTarget();
        //System.out.println(index);

        //Java Refresher - Collection List
        //List is an interface and ArrayList and LinkedList are the implementation
        ArrayList<String> list = new ArrayList<String>() ;
        list.add( "Andy" );
        list.add( "Bart" );
        list.add( "Carl" );
        list.add( "Doug" );
        list.add( "Elmo" );
        list.add(4, "Oscar");
        System.out.println(list);


    }
}
