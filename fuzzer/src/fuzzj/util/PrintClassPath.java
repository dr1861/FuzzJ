package fuzzj.util;
 
import java.net.URL;
import java.net.URLClassLoader;
 
public class PrintClassPath
{
 
   public PrintClassPath() 
   {
	System.out.println("Current Classpath:\n");
 
        ClassLoader cl = ClassLoader.getSystemClassLoader();
 
        URL[] urls = ((URLClassLoader)cl).getURLs();
 
        for(URL url: urls){
        	System.out.println("\t"+url.getFile());
        }
 
   }
}
