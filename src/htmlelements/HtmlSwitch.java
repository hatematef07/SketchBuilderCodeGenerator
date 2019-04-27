package htmlelements;

import Model.html.HtmlJsonElement;
import languagewrite.Tag;

public class HtmlSwitch extends HTMLElement {
    private final String DIV_CLASS ="custom-control custom-switch";
    private final String INPUT_TYPE = "checkbox";
    private final String INPUT_CLASS = "custom-control-input";
    private final String INPUT_ID ="customSwitch1";
    private final String LABEL_CLASS ="custom-control-label";
    private final String LABEL_FOR = "customSwitch1";

    public HtmlSwitch(HtmlJsonElement jsonModel) {
        super( jsonModel.getView(),jsonModel.getId(), jsonModel.getTop(), jsonModel.getLeft(), jsonModel.getWidth(),jsonModel.getHeight());
    }
    @Override
    public void draw(Tag root) {

        Tag input = new Tag("input");
        input.setAttribute("type",this.INPUT_TYPE);
        input.setAttribute("class",this.INPUT_CLASS);
        input.setAttribute("id",this.INPUT_ID);



        Tag label = new Tag("label");
        label.setAttribute("class",this.LABEL_CLASS);
        label.setAttribute("for",this.LABEL_FOR);
        label.setTagValue("Toggle this switch element");


        Tag div = new Tag("div");
        div.setAttribute("class",this.DIV_CLASS);
        div.addChild(input);
        div.addChild(label);
        root.addChild(div);

    }
}
