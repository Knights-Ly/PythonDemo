//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.srplab.www.starcore;

import java.util.Iterator;

public class StarObjectIteratorClass implements Iterator {
    private StarObjectClass object;

    public StarObjectIteratorClass(StarObjectClass var1) {
        this.object = var1;
    }

    public boolean hasNext() {
        if (!this.object._IsValid()) {
            return false;
        } else {
            Object var1 = this.object._RawCall(Object.class, "_StarIteratorHasNext", new Object[0]);
            return this.object._Tobool(var1);
        }
    }

    public Object next() {
        return !this.object._IsValid() ? null : this.object._RawCall(Object.class, "_StarIteratorNext", new Object[0]);
    }

    public void remove() throws UnsupportedOperationException {
        UnsupportedOperationException var1 = new UnsupportedOperationException();
        throw var1;
    }
}
