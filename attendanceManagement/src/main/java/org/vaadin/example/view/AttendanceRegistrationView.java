package org.vaadin.example.view;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.router.Route;

@Route("AttendanceRegistration")
public class AttendanceRegistrationView extends Div {

    public AttendanceRegistrationView() {
        add(new H1("出勤登録ページ"));
    }
}
