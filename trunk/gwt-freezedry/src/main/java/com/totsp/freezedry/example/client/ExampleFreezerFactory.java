/*
 * ExampleFreezerFactory.java
 *
 * Created on May 21, 2007, 1:01 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.totsp.freezedry.example.client;

/**
 *
 * @author rcooper
 */
public class ExampleFreezerFactory implements ExampleFreezer {
    
    /** Creates a new instance of ExampleFreezerFactory */
    public ExampleFreezerFactory() {
    }

    public ExampleObject getObject() {
        ExampleObject o = new ExampleObject();
        o.setMyLong(new Long(-2));
        o.setMyString("This is a test.");
        return o;
    }
    
}
