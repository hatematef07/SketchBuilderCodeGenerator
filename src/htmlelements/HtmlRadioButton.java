package htmlelements;

import Model.html.HtmlJsonElement;
import languagewrite.Tag;

public class HtmlRadioButton extends HTMLElement {

    private final String DIV_CLASS ="custom-control custom-radio";
    private final String INPUT_TYPE ="radio";
    private final String INPUT_NAME ="radioDisabled";
    private final String INPUT_ID ="customRadioDisabled2";
    private final String INPUT_CLASS ="custom-control-input";
    private final String LABEL_CLASS ="custom-control-label";
    private final String LABEL_FOR ="customRadioDisabled2";


    public HtmlRadioButton(HtmlJsonElement jsonModel) {
        super( jsonModel.getView(),jsonModel.getId(), jsonModel.getTop(), jsonModel.getLeft(), jsonModel.getWidth(),jsonModel.getHeight());
    }




    @Override
    public void draw(Tag root) {
        Tag input = new Tag("input");
        input.setAttribute("type",this.INPUT_TYPE);
        input.setAttribute("name",this.INPUT_NAME);
        input.setAttribute("id",this.INPUT_ID);
        input.setAttribute("class",this.INPUT_CLASS);


        Tag label = new Tag("label");
        label.setAttribute("class",this.LABEL_CLASS);
        label.setAttribute("for",this.LABEL_FOR);
        label.setTagValue("Toggle this custom radio");


        Tag div = new Tag("div");
        div.setAttribute("class",this.DIV_CLASS);
        div.addChild(input);
        div.addChild(label);
        root.addChild(div);
    }
}
