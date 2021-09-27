//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.srplab.www.starcore;

import java.util.Enumeration;
import java.util.Iterator;

public class StarObjectIteratorWrapClass {
    private Iterator iterator;
    private int TypeIsArray;
    private boolean[] BoolIterator;
    private short[] ShortIterator;
    private int[] IntIterator;
    private long[] LongIterator;
    private char[] CharIterator;
    private float[] FloatIterator;
    private double[] DoubleIterator;
    private Object[] ObjectIterator;
    private int IteratorIndex;
    private Enumeration enumeration;

    public StarObjectIteratorWrapClass(Iterator var1) {
        this.iterator = var1;
        this.TypeIsArray = 0;
    }

    public StarObjectIteratorWrapClass(boolean[] var1) {
        this.BoolIterator = var1;
        this.TypeIsArray = 1;
        this.IteratorIndex = 0;
    }

    public StarObjectIteratorWrapClass(short[] var1) {
        this.ShortIterator = var1;
        this.TypeIsArray = 2;
        this.IteratorIndex = 0;
    }

    public StarObjectIteratorWrapClass(int[] var1) {
        this.IntIterator = var1;
        this.TypeIsArray = 3;
        this.IteratorIndex = 0;
    }

    public StarObjectIteratorWrapClass(long[] var1) {
        this.LongIterator = var1;
        this.TypeIsArray = 4;
        this.IteratorIndex = 0;
    }

    public StarObjectIteratorWrapClass(char[] var1) {
        this.CharIterator = var1;
        this.TypeIsArray = 5;
        this.IteratorIndex = 0;
    }

    public StarObjectIteratorWrapClass(float[] var1) {
        this.FloatIterator = var1;
        this.TypeIsArray = 6;
        this.IteratorIndex = 0;
    }

    public StarObjectIteratorWrapClass(double[] var1) {
        this.DoubleIterator = var1;
        this.TypeIsArray = 7;
        this.IteratorIndex = 0;
    }

    public StarObjectIteratorWrapClass(Object[] var1) {
        this.ObjectIterator = var1;
        this.TypeIsArray = 8;
        this.IteratorIndex = 0;
    }

    public StarObjectIteratorWrapClass(Enumeration var1) {
        this.enumeration = var1;
        this.TypeIsArray = 9;
        this.IteratorIndex = 0;
    }

    public boolean _StarIteratorHasNext() {
        if (this.TypeIsArray == 0) {
            return this.iterator.hasNext();
        } else if (this.TypeIsArray == 1) {
            return this.IteratorIndex < this.BoolIterator.length;
        } else if (this.TypeIsArray == 2) {
            return this.IteratorIndex < this.ShortIterator.length;
        } else if (this.TypeIsArray == 3) {
            return this.IteratorIndex < this.IntIterator.length;
        } else if (this.TypeIsArray == 4) {
            return this.IteratorIndex < this.LongIterator.length;
        } else if (this.TypeIsArray == 5) {
            return this.IteratorIndex < this.CharIterator.length;
        } else if (this.TypeIsArray == 6) {
            return this.IteratorIndex < this.FloatIterator.length;
        } else if (this.TypeIsArray == 7) {
            return this.IteratorIndex < this.DoubleIterator.length;
        } else if (this.TypeIsArray == 8) {
            return this.IteratorIndex < this.ObjectIterator.length;
        } else {
            return this.TypeIsArray == 9 ? this.enumeration.hasMoreElements() : false;
        }
    }

    public Object _StarIteratorNext() {
        if (this.TypeIsArray == 0) {
            return this.iterator.next();
        } else if (this.TypeIsArray == 1) {
            Boolean var8 = this.BoolIterator[this.IteratorIndex];
            ++this.IteratorIndex;
            return var8;
        } else if (this.TypeIsArray == 2) {
            Short var7 = this.ShortIterator[this.IteratorIndex];
            ++this.IteratorIndex;
            return var7;
        } else if (this.TypeIsArray == 3) {
            Integer var6 = this.IntIterator[this.IteratorIndex];
            ++this.IteratorIndex;
            return var6;
        } else if (this.TypeIsArray == 4) {
            Long var5 = this.LongIterator[this.IteratorIndex];
            ++this.IteratorIndex;
            return var5;
        } else if (this.TypeIsArray == 5) {
            Character var4 = this.CharIterator[this.IteratorIndex];
            ++this.IteratorIndex;
            return var4;
        } else if (this.TypeIsArray == 6) {
            Float var3 = this.FloatIterator[this.IteratorIndex];
            ++this.IteratorIndex;
            return var3;
        } else if (this.TypeIsArray == 7) {
            Double var2 = this.DoubleIterator[this.IteratorIndex];
            ++this.IteratorIndex;
            return var2;
        } else if (this.TypeIsArray == 8) {
            Object var1 = this.ObjectIterator[this.IteratorIndex];
            ++this.IteratorIndex;
            return var1;
        } else {
            return this.TypeIsArray == 9 ? this.enumeration.nextElement() : null;
        }
    }
}
