package htmlelements;

import Model.html.HtmlJsonElement;
import languagewrite.Tag;

public class HtmlEditText extends HTMLElement {



    private final String INPUT_CLASS ="form-control";


    public HtmlEditText(HtmlJsonElement jsonModel) {
        super( jsonModel.getView(),jsonModel.getId(), jsonModel.getTop(), jsonModel.getLeft(), jsonModel.getWidth(),jsonModel.getHeight());
    }





    @Override
    public void draw(Tag root) {
        Tag input = new Tag("input");
        input.setAttribute("class",this.INPUT_CLASS);
        root.addChild(input);
    }
}
