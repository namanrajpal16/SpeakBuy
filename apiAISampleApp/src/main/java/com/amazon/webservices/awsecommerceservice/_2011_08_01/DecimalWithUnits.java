// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.amazon.webservices.awsecommerceservice._2011_08_01;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.math.BigDecimal;


public class DecimalWithUnits implements Serializable {

    private static final long serialVersionUID = -1L;

	@Value
	@Order(value=0)
	public BigDecimal value;	
	
	@Attribute(name = "Units")
	@Order(value=1)
	public String units;	
	
    
}