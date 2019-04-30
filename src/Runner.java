
import androidelements.WriteXML;
import csharp.WriteCSharp;


public class Runner {
    public static void main(String [] args){
        if(args.length == 0) {
            System.out.println("There is no argument to generate");
            System.exit(1);
        }
        //WriteXML xml = new WriteXML(args);
        WriteCSharp cs = new WriteCSharp(args);
    }
}