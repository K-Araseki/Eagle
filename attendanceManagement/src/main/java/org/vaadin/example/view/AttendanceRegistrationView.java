package org.vaadin.example.view;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.OptionalParameter;
import com.vaadin.flow.router.Route;

@Route("AttendanceRegistration")
public class AttendanceRegistrationView extends Div implements HasUrlParameter<String> {
//HasUrlParameter<T>はLong、Integer、String、およびBoolean型の型引数のみをサポート

    private String text;

    @Override
    public void setParameter(BeforeEvent event, @OptionalParameter String parameter){
        setText(String.format("Hello, %s!", parameter));
        this.text = parameter;
    }

    public AttendanceRegistrationView() {
        System.out.println(text);
        add(new H1("出勤登録ページ"), new H1(text));
    }
}
