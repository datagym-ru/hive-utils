package com.ermakovpetr.urldecoder;
 
import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;
 
import java.net.URLDecoder;
 
@Description(
    name="URLDecoderUDF",
    value="Decodes a URL String. If decoding is unsuccessful null is returned",
    extended="SELECT decode_url('https%3A%2F%2Flamoda.ru');"
)
public class URLDecoderUDF extends UDF {
 
    public String evaluate(String input) {
        if(input == null) return null;

        try {return URLDecoder.decode(input, "UTF-8");}
        catch (Exception e) {return null;}
    }
}
