// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.amazon.webservices.awsecommerceservice._2011_08_01;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;


@com.leansoft.nano.annotation.RootElement(name = "EditorialReviews", namespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
public class EditorialReviews implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "EditorialReview")    
	@Order(value=0)
	public List<EditorialReview> editorialReview;	
	
    
}