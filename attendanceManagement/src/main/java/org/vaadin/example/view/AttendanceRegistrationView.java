package org.vaadin.example.view;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.timepicker.TimePicker;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.*;
import com.vaadin.flow.server.VaadinSession;
import com.vaadin.flow.theme.lumo.LumoUtility;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Route("AttendanceRegistration")
public class AttendanceRegistrationView extends Composite<VerticalLayout> {

    private String data;

    public AttendanceRegistrationView() {

        data = "琴木";

        HorizontalLayout layoutRow = new HorizontalLayout();
        H1 h1 = new H1();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        H2 h2 = new H2();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        Select select = new Select();
        HorizontalLayout layoutRow4 = new HorizontalLayout();
        H2 h22 = new H2();
        HorizontalLayout layoutRow5 = new HorizontalLayout();
        TimePicker timePicker = new TimePicker();
        TimePicker timePicker2 = new TimePicker();
        HorizontalLayout layoutRow6 = new HorizontalLayout();
        Button buttonPrimary = new Button();
        Button buttonPrimary2 = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.addClassName(LumoUtility.Padding.XLARGE);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        layoutRow.setAlignItems(Alignment.CENTER);
        layoutRow.setJustifyContentMode(JustifyContentMode.CENTER);
        h1.setText(data + "さん お疲れ様でした");
        layoutRow.setAlignSelf(FlexComponent.Alignment.CENTER, h1);
        h1.setWidth("max-content");
        layoutRow2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        layoutRow2.setAlignItems(Alignment.CENTER);
        layoutRow2.setJustifyContentMode(JustifyContentMode.CENTER);
        h2.setText("業務種別");
        h2.setWidth("max-content");
        layoutRow3.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.getStyle().set("flex-grow", "1");
        layoutRow3.setAlignItems(Alignment.CENTER);
        layoutRow3.setJustifyContentMode(JustifyContentMode.CENTER);
        select.setLabel("Select");
        select.setWidth("min-content");
        setSelectSampleData(select);
        layoutRow4.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow4);
        layoutRow4.addClassName(Gap.MEDIUM);
        layoutRow4.setWidth("100%");
        layoutRow4.getStyle().set("flex-grow", "1");
        layoutRow4.setAlignItems(Alignment.CENTER);
        layoutRow4.setJustifyContentMode(JustifyContentMode.CENTER);
        h22.setText("勤務時間");
        h22.setWidth("max-content");
        layoutRow5.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow5);
        layoutRow5.addClassName(Gap.XLARGE);
        layoutRow5.setWidth("100%");
        layoutRow5.getStyle().set("flex-grow", "1");
        layoutRow5.setAlignItems(Alignment.CENTER);
        layoutRow5.setJustifyContentMode(JustifyContentMode.CENTER);


        timePicker.setLabel("出勤時間");
        timePicker.setWidth("min-content");
        timePicker.setStep(Duration.ofMinutes(15));
        //データベースから
        timePicker.setMin(LocalTime.of(7, 0));
        timePicker.setMax(LocalTime.of(10, 0));
        timePicker.setMin(LocalTime.of(7, 0));
        timePicker.setMax(LocalTime.of(10, 0));
        timePicker.setValue(LocalTime.of(7, 0));
        layoutRow5.setAlignSelf(FlexComponent.Alignment.CENTER, timePicker);

        timePicker2.setLabel("退勤時間");
        timePicker2.setWidth("min-content");
        timePicker2.setStep(Duration.ofMinutes(15));
        //データベースから
        timePicker2.setMin(LocalTime.of(7, 0));
        timePicker2.setMax(LocalTime.of(10, 0));
        timePicker2.setMin(LocalTime.of(7, 0));
        timePicker2.setMax(LocalTime.of(10, 0));
        layoutRow5.setAlignSelf(FlexComponent.Alignment.CENTER, timePicker2);


        layoutRow6.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow6);
        layoutRow6.addClassName(Gap.MEDIUM);
        layoutRow6.setWidth("100%");
        layoutRow6.getStyle().set("flex-grow", "1");
        layoutRow6.setAlignItems(Alignment.CENTER);
        layoutRow6.setJustifyContentMode(JustifyContentMode.CENTER);
        buttonPrimary.setText("戻る");
        layoutRow6.setAlignSelf(FlexComponent.Alignment.CENTER, buttonPrimary);
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary2.setText("登録");
        layoutRow6.setAlignSelf(FlexComponent.Alignment.CENTER, buttonPrimary2);
        buttonPrimary2.setWidth("min-content");
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(layoutRow);
        layoutRow.add(h1);
        getContent().add(layoutRow2);
        layoutRow2.add(h2);
        getContent().add(layoutRow3);
        layoutRow3.add(select);
        getContent().add(layoutRow4);
        layoutRow4.add(h22);
        getContent().add(layoutRow5);
        layoutRow5.add(timePicker);
        layoutRow5.add(timePicker2);
        getContent().add(layoutRow6);
        layoutRow6.add(buttonPrimary);
        layoutRow6.add(buttonPrimary2);

        buttonPrimary2.addClickListener(buttonClickEvent -> {
            buttonPrimary2.getUI().ifPresent(ui -> ui.navigate(AttendanceRegistrationCompletedView.class));
        });
    }

    record SampleItem(String value, String label, Boolean disabled) {
    }

    private void setSelectSampleData(Select select) {
        List<SampleItem> sampleItems = new ArrayList<>();
        sampleItems.add(new SampleItem("first", "First", null));
        sampleItems.add(new SampleItem("second", "Second", null));
        sampleItems.add(new SampleItem("third", "Third", null));
        sampleItems.add(new SampleItem("fourth", "Fourth", null));
        select.setItems(sampleItems);
        select.setItemLabelGenerator(item -> ((SampleItem) item).label());
        select.setItemEnabledProvider(item -> !Boolean.TRUE.equals(((SampleItem) item).disabled()));
    }

}

