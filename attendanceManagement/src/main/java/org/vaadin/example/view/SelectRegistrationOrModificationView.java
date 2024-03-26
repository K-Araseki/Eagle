package org.vaadin.example.view;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;

@Route(value = "SelectRegistrationOrModification", layout = MainView.class)
public class SelectRegistrationOrModificationView extends Composite<VerticalLayout> {

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
/*
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

        add(text, horizontalLayout);*/

        H1 h1 = new H1();
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button buttonPrimary = new Button();
        Button buttonPrimary2 = new Button();
        getContent().addClassName(Padding.XLARGE);
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        getContent().setJustifyContentMode(JustifyContentMode.START);
        getContent().setAlignItems(Alignment.CENTER);
        h1.setText("勤怠入力");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, h1);
        h1.setWidth("max-content");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.XLARGE);
        layoutRow.addClassName(Padding.XLARGE);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        layoutRow.setAlignItems(Alignment.START);
        layoutRow.setJustifyContentMode(JustifyContentMode.CENTER);
        buttonPrimary.setText("登録");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary2.setText("修正");
        buttonPrimary2.setWidth("min-content");
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(h1);
        getContent().add(layoutRow);
        layoutRow.add(buttonPrimary);
        layoutRow.add(buttonPrimary2);

        buttonPrimary.addClickListener(buttonClickEvent -> {
            buttonPrimary.getUI().ifPresent(ui -> ui.navigate(ReadQRcodeView.class));
        });

    }
}
