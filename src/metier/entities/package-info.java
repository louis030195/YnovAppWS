/**
 * This file is used to fix specific type problems with JAX-B
 * like java.sql.date and java.sql.time
 * 
 * 
 * 
 */



@XmlJavaTypeAdapters({
    @XmlJavaTypeAdapter(type=Time.class, 
        value=TimeAdapter.class),
    @XmlJavaTypeAdapter(type=Date.class, 
        value=DateAdapter.class),
})

package metier.entities;

import java.sql.Date;
import java.sql.Time;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

import adapter.DateAdapter;
import adapter.TimeAdapter;
