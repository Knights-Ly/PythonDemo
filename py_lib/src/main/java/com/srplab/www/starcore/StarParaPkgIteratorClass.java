//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.srplab.www.starcore;

import java.util.Iterator;

public class StarParaPkgIteratorClass implements Iterator {
    private StarParaPkgClass ParaPkg;
    private int Index;

    public StarParaPkgIteratorClass(StarParaPkgClass var1) {
        this.ParaPkg = var1;
        this.Index = 0;
    }

    public boolean hasNext() {
        return this.Index >= 0 && this.Index < this.ParaPkg._Getint("_Number");
    }

    public Object next() {
        if (this.Index >= 0 && this.Index < this.ParaPkg._Getint("_Number")) {
            Object var1 = this.ParaPkg._Get(this.Index);
            ++this.Index;
            return var1;
        } else {
            return null;
        }
    }

    public void remove() throws UnsupportedOperationException {
        UnsupportedOperationException var1 = new UnsupportedOperationException();
        throw var1;
    }
}
