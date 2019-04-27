package htmlelements;

import Model.html.HtmlJsonElement;
import languagewrite.Tag;

public class HtmlSpinner extends HTMLElement {

    private final String DIV_CLASS = "btn-group";
    private final String BUTTON_TYPE = "button" ;
    private final String BUTTON_CLASS = "btn btn-danger";
    private final String BUTTON2_TYPE = "button";
    private final String BUTTON2_CLASS = "btn btn-danger dropdown-toggle dropdown-toggle-split";
    private final String BUTTON2_DATA_TOGGLE = "dropdown";
    private final String BUTTON2_ARIA_HASPOPUP = "true";
    private final String BUTTON2_ARIA_EXPANDED = "false";
    private final String SPAN_CLASS = "sr-only";

    public HtmlSpinner(HtmlJsonElement jsonModel) {
                super( jsonModel.getView(),jsonModel.getId(), jsonModel.getTop(), jsonModel.getLeft(),  jsonModel.getWidth(),jsonModel.getHeight());
            }
    @Override
    public void draw(Tag root) {

        Tag button1 = new Tag("button");
        button1.setAttribute("type",this.BUTTON_TYPE);
        button1.setAttribute("name",this.BUTTON_CLASS);



        Tag button2 = new Tag("button");
        button2.setAttribute("type",this.BUTTON2_TYPE);
        button2.setAttribute("class",this.BUTTON2_CLASS);
        button2.setAttribute("data-toggle",this.BUTTON2_DATA_TOGGLE);
        button2.setAttribute("aria-haspopup",this.BUTTON2_ARIA_HASPOPUP);
        button2.setAttribute("aria-expanded",this.BUTTON2_ARIA_EXPANDED);


        Tag span = new Tag("span");
        span.setAttribute("class",this.SPAN_CLASS);
        span.setTagValue("Toggle Dropdown");

        Tag div = new Tag("div");
        div.setAttribute("class",this.DIV_CLASS);
        div.addChild(button1);
        div.addChild(button2);
        div.addChild(span);
        root.addChild(div);

    }
}
