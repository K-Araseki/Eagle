package org.vaadin.example.view;

import com.vaadin.base.devserver.BrowserLauncher;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.internal.BrowserLiveReload;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.server.VaadinSession;

@Route("readQR")
//@JsModule("https://cdn.jsdelivr.net/npm/jsqr@1.4.0/dist/jsQR.min.js")
public class ReadQRcodeView extends Div {

    private TextField textField;
    private Button button;

    public ReadQRcodeView() {

        textField = new TextField("社員ID");
        button = new Button("送信");

        HorizontalLayout horizontalLayout =new HorizontalLayout(textField, button);
        horizontalLayout.setSizeFull();
        horizontalLayout.setPadding(true);
        horizontalLayout.setAlignItems(FlexComponent.Alignment.END);
        horizontalLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        add(horizontalLayout);

        button.addClickListener(e -> {
            if(textField.getValue().equals("A001")){
                System.out.println("A001です");
                VaadinSession.getCurrent().setAttribute("inputData", "前のページデータです");
                getUI().ifPresent(ui -> ui.navigate("AttendanceRegistration"));
                //getUI().ifPresent(ui -> ui.navigate(AttendanceRegistrationView.class));

            }
            else {
                System.out.println("その他です");
            }
        });


    }
}
