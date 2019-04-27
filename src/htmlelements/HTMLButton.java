package htmlelements;

import Model.html.HtmlJsonElement;
import languagewrite.Tag;

public class HTMLButton extends HTMLElement {

    private final String  BUTTON_TYPE ="button" ;
    private final String BUTTON_CLASS ="btn btn-primary" ;

    public HTMLButton(HtmlJsonElement jsonModel) {
        super(  jsonModel.getView(),jsonModel.getId(), jsonModel.getTop(), jsonModel.getLeft(), jsonModel.getWidth(),jsonModel.getHeight());
    }





    @Override
    public void draw(Tag root) {
        Tag button = new Tag("button");
        button.setAttribute("type",this.BUTTON_TYPE);
        button.setAttribute("class",this.BUTTON_CLASS);
        button.setTagValue("Button");
        root.addChild(button);

    }
}
