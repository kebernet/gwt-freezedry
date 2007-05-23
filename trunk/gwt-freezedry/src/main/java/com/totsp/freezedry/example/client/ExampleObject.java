/*
 * ExampleObject.java
 *
 * Created on May 21, 2007, 1:00 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.totsp.freezedry.example.client;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 *
 * @author rcooper
 */
public class ExampleObject implements IsSerializable{
    
    
    private String myString;
    private Long myLong;
    
    /** Creates a new instance of ExampleObject */
    public ExampleObject() {
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    public Long getMyLong() {
        return myLong;
    }

    public void setMyLong(Long myLong) {
        this.myLong = myLong;
    }
    
}
