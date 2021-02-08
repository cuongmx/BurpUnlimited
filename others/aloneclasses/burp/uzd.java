package burp;

import java.util.*;

/**
 * 
 * @author mxcx@fosec.vn
 * This class patches BurpSuite's original class to modify license information.
 * 2 changed lines, no code inserted more.
 * 
 */

public class uzd
{
    public final String e;
    public final String f;
    public final String a;
    public final long h;
    public final int g;
    public final ttb c;
    public final int d;
    public final String b;
    
    private uzd(final String e, final String f, final String a, final long h, final int g, final ttb c, final int d, final String b) {
        this.e = e;
        this.f = f;
        this.a = a + " - Unlimited by mxcx@fosec.vn";   // added more text by mxcx
        this.h = 253391846400000L;                      // change time to extend license
        this.g = g;
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    public static uzd a(final String s, final Object[] array) {
        int f = bgb.f;
        final uzd uzd = new uzd(s, (String)array[0], (String)array[1], (long)array[2], (int)array[3], ttb.typeFor((array.length > 4) ? ((String)array[4]) : null), (array.length > 5) ? Integer.parseInt((String)array[5]) : 0, (array.length > 6) ? ((String)array[6]) : null);
        if (vuf.a != 0) {
            bgb.f = ++f;
        }
        return uzd;
    }
    
    public Date a() {
        return new Date(this.h);
    }
}
