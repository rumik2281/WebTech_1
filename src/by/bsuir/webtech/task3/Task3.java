package by.bsuir.webtech.task3;

import by.bsuir.webtech.util.input.impl.ConsoleReader;
import by.bsuir.webtech.util.input.Reader;
import by.bsuir.webtech.util.output.impl.ConsoleWriter;
import by.bsuir.webtech.util.output.Writer;
import by.bsuir.webtech.task3.util.CalculatorUtils;

import java.util.Map;

public class Task3 {

    static Writer writer = new ConsoleWriter();

    public static void main(String[] args) {
        double h;
        double a;
        double b;
        Reader reader = new ConsoleReader();
        Map<Double, Double> result;

        writer.writeln("Input the left border of the range: ");
        a = reader.readDouble();
        writer.writeln("Input the right border of the range: ");
        b = reader.readDouble();
        writer.writeln("Input the step for calculations: ");
        h = reader.readDouble();
        result = CalculatorUtils.calculateFunctionInRange(a, b, h);
        printResultTable(result);
    }

    public static void printResultTable(Map<Double, Double> resultTable) {
        for (var i : resultTable.keySet()) {
            writer.writef("%10.2f | %f\n", i, resultTable.get(i));
        }
    }
}


