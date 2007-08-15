/*
 * SimpleSerializer.java
 *
 * Created on May 23, 2007, 3:00 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.totsp.gwt.freezedry.server;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.server.rpc.impl.ServerSerializableTypeOracle;
import com.google.gwt.user.server.rpc.impl.ServerSerializableTypeOracleImpl;
import com.google.gwt.user.server.rpc.impl.ServerSerializationStreamWriter;
import java.util.Collection;

/**
 *
 * @author rcooper
 */
public class SimpleSerializer {
    /**
     * Oracle used in stream construction. Encapsulates a set of static,
     * synchronized caches.
     */
    private static ServerSerializableTypeOracle serializableTypeOracle;
    static{
        serializableTypeOracle = new ServerSerializableTypeOracleImpl(
                getPackagePaths());
    }
    
    
    /** Creates a new instance of SimpleSerializer */
    private  SimpleSerializer() {
    }
    public static String serializeObject(IsSerializable object) throws SerializationException {
        ServerSerializationStreamWriter stream = new ServerSerializationStreamWriter(
                serializableTypeOracle);
        stream.prepareToWrite();
        stream.serializeValue( object, object.getClass() );
        return stream.toString();
    }
    public static String serializeCollection(Collection object) throws SerializationException {
        ServerSerializationStreamWriter stream = new ServerSerializationStreamWriter(
                serializableTypeOracle);
        stream.prepareToWrite();
        stream.serializeValue( object, object.getClass() );
        return stream.toString();
    }
    
    /**
     * Obtain the special package-prefixes we use to check for custom serializers
     * that would like to live in a package that they cannot. For example,
     * "java.util.ArrayList" is in a sealed package, so instead we use this prefix
     * to check for a custom serializer in
     * "com.google.gwt.user.client.rpc.core.java.util.ArrayList". Right now, it's
     * hard-coded because we don't have a pressing need for this mechanism to be
     * extensible, but it is imaginable, which is why it's implemented this way.
     */
    private static String[] getPackagePaths() {
        return new String[] {"com.google.gwt.user.client.rpc.core"};
    }
    
}
