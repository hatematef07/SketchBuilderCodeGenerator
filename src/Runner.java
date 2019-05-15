import androidelements.WriteXML;
import csharp.WriteCSharp;
import htmlelements.WriteHtml;

public class Runner {
    private static String flag;
    public static void main(String [] args){
        if(args.length == 0) {
            System.out.println("There is no argument to generate");
            System.exit(1);
        }

        flag = args[0];

        if(flag.equalsIgnoreCase("--android")) {
            WriteXML xml = new WriteXML(args);
        } else if(flag.equalsIgnoreCase("--html")) {
            WriteHtml html = new WriteHtml(args);
        } else if(flag.equalsIgnoreCase("--csharp")) {
            WriteCSharp csharp = new WriteCSharp(args);
        } else {
            System.out.println("There is no output type specified");
            System.exit(1);
        }
    }
}