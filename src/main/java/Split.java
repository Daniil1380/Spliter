
import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

import java.io.IOException;


public class Split {

    @Option(name = "-l", usage = "line separation", forbids = {"-c", "-n"})
    private int lines = 100;

    @Option(name = "-c", usage = "char separation", forbids = {"-n", "-l"})
    private int chars = -1;

    @Option(name = "-n", usage = "Indicates the number of files", forbids = {"-c", "-l"})
    private int files = -1;

    @Option(name = "-d", usage = "Number or English char")
    private boolean number;

    @Option(name = "-o", usage = "Output name")
    private String output;

    @Argument(required = true, usage = "Input name", index = 0)
    private String input;


    public static void main(String[] args) throws IOException {
        new Split().start(args);



    }

    public void start(String[] args) throws IOException {
        CmdLineParser parse = new CmdLineParser(this);
        try {
            parse.parseArgument(args);
        } catch (CmdLineException exc) {
            System.err.println(exc.getMessage());
            System.err.println("java -jar split.jar -d -l|-c|-n num -o basicOutputName inputFileName");
            parse.printUsage(System.err);
            return;
        }
        if (output == null) output = "x";
        else if (output.equals("-")) output = input;
        if (chars != -1) {
            Separator.c(input, chars, output, number);
        } else if (files != -1) {
            Separator.n(input, files, output, number);
        } else {
            Separator.l(input, lines, output, number);
        }

    }
}