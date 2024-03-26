package org.vaadin.example.view;

//ここでサイドバー出したい
//import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Hr;
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

@Route("AttendanceRegistrationCompletedView")
public class AttendanceRegistrationCompletedView extends Composite<VerticalLayout>{

    public AttendanceRegistrationCompletedView(){

        H1 h1 = new H1();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        H2 h2 = new H2();
        H2 h22 = new H2();
        H2 h23 = new H2();
        H2 h24 = new H2();
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button buttonPrimary = new Button();
        Button buttonPrimary2 = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        h1.setText("以下の内容で登録しました");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, h1);
        h1.setWidth("max-content");
        h1.setHeight("50px");
        layoutColumn2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.addClassName(Gap.XLARGE);
        layoutColumn2.addClassName(Padding.SMALL);
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        layoutColumn2.setJustifyContentMode(JustifyContentMode.START);
        layoutColumn2.setAlignItems(Alignment.CENTER);
        h2.setText("従業員名：○○○○");
        h2.setWidth("max-content");
        h22.setText("業務種別：○○○○");
        h22.setWidth("max-content");
        h23.setText("出勤時間：○○：○○");
        h23.setWidth("max-content");
        h24.setText("退勤時間：○○：○○");
        h24.setWidth("max-content");
        layoutRow.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.XLARGE);
        layoutRow.addClassName(Padding.XLARGE);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        layoutRow.setAlignItems(Alignment.CENTER);
        layoutRow.setJustifyContentMode(JustifyContentMode.CENTER);
        buttonPrimary.setText("ホーム画面へ");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary2.setText("次の出勤者登録");
        buttonPrimary2.setWidth("min-content");
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(h1);
        getContent().add(layoutColumn2);
        layoutColumn2.add(h2);
        layoutColumn2.add(h22);
        layoutColumn2.add(h23);
        layoutColumn2.add(h24);
        layoutColumn2.add(layoutRow);
        layoutRow.add(buttonPrimary);
        layoutRow.add(buttonPrimary2);

        buttonPrimary.addClickListener(buttonClickEvent -> {
            buttonPrimary.getUI().ifPresent(ui -> ui.navigate(HomeView.class));
        });

        buttonPrimary2.addClickListener(buttonClickEvent -> {
            buttonPrimary2.getUI().ifPresent(ui -> ui.navigate(ReadQRcodeView.class));
        });

    }

}

