package vaadinFrame;

import com.vaadin.server.ThemeResource;
import com.vaadin.ui.*;

/**
 * Created by uck1 on 14.05.2016.
 */
public class HealthVisitor extends CustomComponent {

    Image picture = new Image(null, new ThemeResource("icons/Guy.png"));
    Label name = new Label("Name: ");
    Label age = new Label("Age: ");
    TextField address = new TextField("Address: ");
    TextField city = new TextField("City: ");
    Component birthday = new PopupDateField("Birthday");
    CheckBox checkbox = new CheckBox("Free");
    Button ok = new Button("OK");

    public HealthVisitor() {

        configureComponents();
        buildLayout();
    }

    private void configureComponents() {

    }

    private void buildLayout() {

        Panel entryPanel = new Panel("Health Visitor");
//        entryPanel.setHeight(20, Unit.CM);
        entryPanel.setSizeFull();
        //hsplit.setSizeUndefined();
        HorizontalSplitPanel hsplit = new HorizontalSplitPanel();
        hsplit.setHeight(24, Unit.CM);
        hsplit.setSplitPosition(45, Unit.PERCENTAGE);

        VerticalLayout left = new VerticalLayout();
//        HorizontalLayout leftOben = new HorizontalLayout();
        left.addComponent(picture);
//        leftOben.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        left.setMargin(true);

        left.addComponent(name);
        left.addComponent(age);
        hsplit.setFirstComponent(left);

        VerticalLayout right = new VerticalLayout();
        right.addComponent(address);
        right.addComponent(city);
        right.addComponent(birthday);
        right.addComponent(checkbox);
        right.addComponent(ok);
//        right.setMargin(true);
        hsplit.setSecondComponent(right);

        entryPanel.setContent(hsplit);
        setCompositionRoot(entryPanel);
    }

}
