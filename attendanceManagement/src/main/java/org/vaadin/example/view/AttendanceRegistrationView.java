package org.vaadin.example.view;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.router.*;
import com.vaadin.flow.server.VaadinSession;

@Route("AttendanceRegistration")
public class AttendanceRegistrationView extends Div implements BeforeEnterObserver {
//HasUrlParameter<T>はLong、Integer、String、およびBoolean型の型引数のみをサポート

    private String text;

    @Override
    public void  beforeEnter(BeforeEnterEvent event){
        String data = (String) VaadinSession.getCurrent().getAttribute("inputData");
        if (data != null) {
            setText("入力データ: " + data);
            this.text = data;
        } else {
            setText("データがありません");
        }
    }

    public AttendanceRegistrationView() {
        System.out.println(text);
        add(new H1("出勤登録ページ"), new H1(text));
    }
}
