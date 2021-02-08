package larry.lau.burp.ui;

import javax.swing.JOptionPane;

/**
 * 
 * @author mxcx@fosec.vn
 * The larry's original class have many other things. It is obfuscated, so I cannot understand all.
 * You can check the original class in /BurpLoaderClass/TestDisclaimer.class if you want.
 * 
 */

public class TestDisclaimer
{
    static boolean execute(final java.util.List<String> disclaim) throws Exception {
        JOptionPane.showMessageDialog(null, "This project is NOT intended to replace BurpLoader. It just EXTENDS BurpLoader's license!\n"
                + "Thank larry_lau@163.com for his BurpLoader. This tool is based on it.\n"
                + "This message replaces BurpLoader's because I'm not sure all things in its TestDisclaimer class.\n"
                + "And an important thing: \"Please try Free edition or buy Pro edition if you can!\"",
                "BurpUnlimited by mxcx@fosec.vn", 2);
        return true;
    }
}
