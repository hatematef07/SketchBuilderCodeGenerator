package htmlelements;

import Model.JSONModel;
import Model.JSONModelHTML;
import com.google.gson.Gson;
import languagewrite.Tag;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteHTML {

    private static String path;
    private static String inputPath;
    private static String outputPath;
    private static String filename;
    private static File outputFile;
    private static String mainDesign = "design";
    private static String guideDesign = "guideline";
    private static String OS = System.getProperty("os.name").toLowerCase();

    private static final String charset="utf-8";
    private static final String name="viewport";
    private static final String content="width=device-width, initial-scale=1, shrink-to-fit=no";
    private static final String rel="stylesheet";
    private static final String href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css";
    private static final String integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T";
    private static final String crossorigin="anonymous";
    private static final String src="https://code.jquery.com/jquery-3.3.1.slim.min.js";
    private static final String integrity2="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo";
    private static final String src2="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js";
    private static final String integrity3="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1";
    private static final String  src3="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js";
    private static final String  integrity4="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM";
    private static final String clss = "container";




    private static void folderMiner(File file) {
        for (File fileEntry : file.listFiles()) {
            if (fileEntry.isDirectory()) {
                folderMiner(fileEntry);
            } else {
                fileMiner(fileEntry);
            }
        }
    }

    private static void fileMiner(File file) {
        path = file.getPath();
        int index = 0;
        if (OS.contains("win")) {
            index = path.lastIndexOf("\\");
        } else if (OS.contains("nix") || OS.contains("nux") || OS.contains("aix")) {
            index = path.lastIndexOf("/");
        }
        filename = path.substring(index + 1).replaceAll(".json", "");
        if (path != null) {
            try {
                // Read json file content into a string
                String content = new String(Files.readAllBytes(Paths.get(path)));

                if (content.contains("\"rows\": [")) {
                    // Convert json content to java object
                    Gson gson = new Gson();
                    JSONModelHTML children = gson.fromJson(content, JSONModelHTML.class);

                    JSONModelHTML[] rows = children.getChildren();
                    JSONModelHTML[] columns = children.getColumns();


//                    buildXML(children, false);
//                    buildXML(children, true);
                }
            } catch (IOException e) {
                System.out.println(e);
                System.exit(1);
            }
        }
    }

    public static void buildHTML(JSONModelHTML[] rows, JSONModelHTML[] columns) {

        Tag meta = new Tag("meta");
        meta.setAttribute("charset", charset);

        Tag meta2 = new Tag("meta");
        meta2.setAttribute("name", name);
        meta2.setAttribute("content", content);

        Tag link = new Tag("link");
        link.setAttribute("rel", rel);
        link.setAttribute("href", href);
        link.setAttribute("integrity", integrity);
        link.setAttribute("crossorigin", crossorigin);

        Tag head = new Tag("head");

        head.addChild(meta);
        head.addChild(meta2);
        head.addChild(link);

        Tag script = new Tag("script");
        script.setAttribute("src", src);
        script.setAttribute("integrity", integrity2);
        script.setAttribute("crossorigin", crossorigin);

        Tag script2 = new Tag("script");
        script2.setAttribute("src", src2);
        script2.setAttribute("integrity", integrity3);
        script2.setAttribute("crossorigin", crossorigin);

        Tag script3 = new Tag("script");
        script3.setAttribute("src", src3);
        script3.setAttribute("integrity", integrity4);
        script3.setAttribute("crossorigin", crossorigin);

        Tag div = new Tag("div");
        div.setAttribute("class", clss);


        Tag body = new Tag("body");
        body.addChild(script);
        body.addChild(script2);
        body.addChild(script3);
        body.addChild(div);


        for (JSONModelHTML row:rows) {
            Row rowTag = new Row("div");
            for (JSONModelHTML column:columns) {
                Column columnTag = new Column("div");
                rowTag.addChild(columnTag);
            }
            body.addChild(rowTag);
        }
    }


}
