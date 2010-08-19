package net.timandersen;

import junit.framework.TestCase;


public class ModuleAPrinterTest extends TestCase {

    public void testApp() {
        assertEquals("Hello_World!", ModuleAPrinter.print("Hello World!"));
        ModuleATestHelper.assertNoSpaces(ModuleAPrinter.print("Hello World!"));
    }
}
