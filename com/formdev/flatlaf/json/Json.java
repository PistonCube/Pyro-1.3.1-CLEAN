// 
// Decompiled by Procyon v0.5.36
// 

package com.formdev.flatlaf.json;

import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.io.IOException;
import java.io.Reader;

public class Json
{
    public static Object parse(final Reader reader) throws IOException, ParseException {
        final DefaultHandler handler = new DefaultHandler();
        new JsonParser(handler).parse(reader);
        return handler.getValue();
    }
    
    static class DefaultHandler extends JsonHandler<List<Object>, Map<String, Object>>
    {
        private Object value;
        
        @Override
        public List<Object> startArray() {
            return new ArrayList<Object>();
        }
        
        @Override
        public Map<String, Object> startObject() {
            return new LinkedHashMap<String, Object>();
        }
        
        @Override
        public void endNull() {
            this.value = "null";
        }
        
        @Override
        public void endBoolean(final boolean bool) {
            this.value = (bool ? "true" : "false");
        }
        
        @Override
        public void endString(final String string) {
            this.value = string;
        }
        
        @Override
        public void endNumber(final String string) {
            this.value = string;
        }
        
        @Override
        public void endArray(final List<Object> array) {
            this.value = array;
        }
        
        @Override
        public void endObject(final Map<String, Object> object) {
            this.value = object;
        }
        
        @Override
        public void endArrayValue(final List<Object> array) {
            array.add(this.value);
        }
        
        @Override
        public void endObjectValue(final Map<String, Object> object, final String name) {
            object.put(name, this.value);
        }
        
        Object getValue() {
            return this.value;
        }
    }
}
