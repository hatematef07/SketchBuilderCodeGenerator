package htmlelements;

import Model.html.HtmlJsonElement;
import languagewrite.Tag;

public class HtmlImageView extends HTMLElement {


    private final String IMG_SRC ="images/image.png";
    private final String IMG_CLASS ="img-fluid" ;
    private final String IMG_ALT ="Responsive image";


    public HtmlImageView(HtmlJsonElement jsonModel) {
        super( jsonModel.getView(),jsonModel.getId(), jsonModel.getTop(), jsonModel.getLeft(),  jsonModel.getWidth(),jsonModel.getHeight());
    }



    @Override
    public void draw(Tag root) {
        Tag img = new Tag("img");



        img.setAttribute("src",this.IMG_SRC);
        img.setAttribute("class",this.IMG_CLASS);
        img.setAttribute("alt",this.IMG_ALT);
        img.setAttribute("width", this.getWidth());
        img.setAttribute("height", this.getHeight());



        root.addChild(img);

    }
}
