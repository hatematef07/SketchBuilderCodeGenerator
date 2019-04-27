
import androidelements.WriteXML;
import htmlelements.WriteHtml;


public class Runner {
    public static void main(String [] args){
        if(args.length == 0) {
            System.out.println("There is no argument to generate");
            System.exit(1);
        }
        //WriteXML xml = new WriteXML(args);

        WriteHtml html = new WriteHtml(args);
    }
}