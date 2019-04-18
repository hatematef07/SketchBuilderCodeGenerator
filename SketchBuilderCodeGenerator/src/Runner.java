import Model.JSONModel;
import androidelements.AppKeys;
import androidelements.WriteXML;
import com.google.gson.Gson;
import languagewrite.Attribute;
import languagewrite.Tag;
import languagewrite.WriteMarkup;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Runner {

    public static void main(String [] args){

        WriteXML xml = new WriteXML(args);
//        Tag html = new Tag("html");
//        Tag head = new Tag("head");
//        Tag title = new Tag("title");
//        title.setTagValue("markup language writer test");
//        head.addChild(title);
//
//        Tag body = new Tag("body");
//        Tag h1 = new Tag("h1");
//        h1.setTagValue("h1 test write");
//        body.addChild(h1);
//
//        html.addChild(head);
//        html.addChild(body);
//
//        WriteMarkup writeMarkup = new WriteMarkup(html);
//        writeMarkup.setDocumentDeclaration("<!DOCTYPE html>");
//        writeMarkup.writeMarkupFile("test.html", WriteMarkup.MarkupFormat.HTML);
    }
}