package adapter;

import java.sql.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String, Date> {

    public Date unmarshal(String v) throws Exception {
        return new Date(Long.parseLong(v));
    }
 
    public String marshal(Date v) throws Exception {
        return v.toString();
    }
	
}
