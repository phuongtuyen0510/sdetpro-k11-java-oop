package Lab_06;
import java.util.Arrays;
import java.util.function.DoubleToIntFunction;

public class lab_06_04 {
    public static void main(String[] args) {
        String url_name = "https://google.com";
        String HTTP_PROTOCOL = "http";
        String HTTPS_PROTOCOL = "https";
        String COM_DOMAIN = ".com";
        String NET_DOMAIN = ".net";

        String[] spLitStr = url_name.split("://");
        System.out.println(Arrays.toString(spLitStr));
        if(spLitStr[0].equals(HTTP_PROTOCOL)){
            System.out.println("Protocol is: "+HTTPS_PROTOCOL);
        }else if(spLitStr[0].equals(HTTPS_PROTOCOL)) {
            System.out.println("Protocol is: "+HTTPS_PROTOCOL);
        }else {
            System.out.println("Protocol is not http or https");
        }

        String myDomain = url_name.substring(url_name.indexOf(spLitStr[1]),url_name.indexOf("."));
        System.out.println("Domain name is: " +myDomain);

        String dotDomain = url_name.substring(url_name.indexOf("."));
        if(dotDomain.equals(COM_DOMAIN)){
            System.out.println("Domain is: "+COM_DOMAIN);
        }else if(dotDomain.equals(NET_DOMAIN)) {
            System.out.println("Domain is: "+NET_DOMAIN);
        }else {
            System.out.println("Domain is not .com or .net");
        }
    }
}
