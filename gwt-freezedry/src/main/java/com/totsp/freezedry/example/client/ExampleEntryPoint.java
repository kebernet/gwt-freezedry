/*
 * ExampleEntryPoint.java
 *
 * Created on May 21, 2007, 12:58 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.totsp.freezedry.example.client;

import com.google.gwt.core.client.EntryPoint;
    import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 *
 * @author rcooper
 */
public class ExampleEntryPoint implements EntryPoint{
    
    /** Creates a new instance of ExampleEntryPoint */
    public ExampleEntryPoint() {
    }

    public void onModuleLoad() {
        //Window.alert("Hello");
        final ExampleFreezer freezer = (ExampleFreezer) GWT.create( ExampleFreezer.class );
        final DictionaryFreezer dfreezer = (DictionaryFreezer) GWT.create( DictionaryFreezer.class );
        //Window.alert("FOO!");
        Button b = new Button("click", new ClickListener(){
            public void onClick(Widget sender) {
                try{
                    ExampleObject o = freezer.getObject();
                    Window.alert( o.getMyString() );
                    o = dfreezer.getObject();
                    Window.alert( o.getMyString() );
                } catch(RuntimeException e){
                    Window.alert( e.toString() );
                }
            }
            
        });
        RootPanel.get().add( b );
    }
    
}
