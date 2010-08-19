package net.timandersen;

import junit.framework.Assert;


public class ModuleATestHelper {

    public static void assertNoSpaces(String s) {
        Assert.assertFalse(s + " contains spaces", s.contains(" "));
    }
}
