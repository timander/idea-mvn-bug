package net.timandersen;

public class ModuleAPrinter {

    public static String print(String s) {
        return utilMethod(s);
    }


    public static String utilMethod(String s) {
        return s.replace(" ", "_");
    }
}
