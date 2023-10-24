package org.vaadin.example.view;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("select")
public class SelectRegistrationOrModificationView extends Div {

    public SelectRegistrationOrModificationView() {

//        VerticalLayout verticalLayout = new VerticalLayout();
//        setSizeFull();
//        verticalLayout.setAlignItems(Alignment.CENTER);
//        verticalLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
//
//
//        Button button1 = new Button("登録");
//        button1.addThemeVariants(ButtonVariant.LUMO_LARGE);
//        Button button2 = new Button("修正");
//        button2.addThemeVariants(ButtonVariant.LUMO_LARGE);
//
//        HorizontalLayout horizontalLayout1 = new HorizontalLayout(button1, button2);
//
//        H1 text = new H1("勤怠入力");
//        //verticalLayout.setPadding(true);
//
//        verticalLayout.add(text, horizontalLayout1);
//        add(verticalLayout);

//        setSizeFull();
//
//        VerticalLayout verticalLayout = new VerticalLayout();
//        verticalLayout.setAlignItems(Alignment.CENTER);
//        verticalLayout.setSizeFull();
//        add(verticalLayout);
//
//        H1 text = new H1("勤怠入力");
//        verticalLayout.add(text);
//
//        Button button1 = new Button("登録");
//        button1.addThemeVariants(ButtonVariant.LUMO_LARGE);
//
//        Button button2 = new Button("修正");
//        button2.addThemeVariants(ButtonVariant.LUMO_LARGE);
//
//        HorizontalLayout horizontalLayout1 = new HorizontalLayout(button1, button2);
//        horizontalLayout1.setAlignItems(Alignment.CENTER);
//        verticalLayout.add(horizontalLayout1);

        setSizeFull();

        H1 text = new H1("勤怠入力");

        Button button1 = new Button("登録");
        button1.addThemeVariants(ButtonVariant.LUMO_LARGE);

        Button button2 = new Button("修正");
        button2.addThemeVariants(ButtonVariant.LUMO_LARGE);

        HorizontalLayout horizontalLayout = new HorizontalLayout(button1, button2);
        horizontalLayout.setSizeFull();
        horizontalLayout.setPadding(true);
        //垂直方向のセンタリング
        horizontalLayout.setAlignItems(Alignment.CENTER);
        //水平方向のセンタリング
        horizontalLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);

        add(text, horizontalLayout);

    }
}
