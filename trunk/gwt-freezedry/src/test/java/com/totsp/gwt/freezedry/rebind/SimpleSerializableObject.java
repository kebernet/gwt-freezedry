/*
 * SimpleSerializableObject.java
 *
 * Created on May 21, 2007, 12:34 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.totsp.gwt.freezedry.rebind;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 *
 * @author rcooper
 */
public class SimpleSerializableObject implements IsSerializable{
    
    private long aLong = 1234L;
    private String aString = "This is my String, there are many like it, but this one is mine";
    
    /** Creates a new instance of SimpleSerializableObject */
    public SimpleSerializableObject() {
        super();
    }
    
}
