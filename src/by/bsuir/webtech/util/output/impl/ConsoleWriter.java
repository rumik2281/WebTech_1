package by.bsuir.webtech.util.output.impl;

import by.bsuir.webtech.util.output.Writer;

public class ConsoleWriter implements Writer {
    @Override
    public void write(String s) {
        System.out.print(s);
    }

    @Override
    public void writeln(String s) {
        System.out.println(s);
    }

    @Override
    public void writef(String format, Object... args) {
        System.out.printf(format, args);
    }
}
