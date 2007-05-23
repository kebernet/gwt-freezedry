/*
 * DictionaryFreezer.java
 *
 * Created on May 23, 2007, 2:42 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.totsp.freezedry.example.client;

import com.totsp.gwt.freezedry.client.Freezer;

/**
 *
 * @author rcooper
 */
public interface DictionaryFreezer extends Freezer{
    
     public ExampleObject getObject();
}
