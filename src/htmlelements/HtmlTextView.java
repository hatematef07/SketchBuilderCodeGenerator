package htmlelements;

import Model.html.HtmlJsonElement;
import languagewrite.Tag;

public class HtmlTextView extends HTMLElement {

    private final String P_CLASS ="text-justify";

    public HtmlTextView(HtmlJsonElement jsonModel) {
        super( jsonModel.getView(),jsonModel.getId(), jsonModel.getTop(), jsonModel.getLeft(), jsonModel.getWidth(),jsonModel.getHeight());
    }




    @Override
    public void draw(Tag root) {
        Tag p = new Tag("p");
        p.setAttribute("class",this.P_CLASS);
        p.setTagValue("this is text");
        root.addChild(p);
    }
}
