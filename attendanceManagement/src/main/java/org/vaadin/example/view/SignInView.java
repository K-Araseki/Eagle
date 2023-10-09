package org.vaadin.example.view;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.login.LoginI18n;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

//このクラスは後でloginに名前変更する
@Route("login")
@PageTitle("トータルサポート勤怠管理システム ログイン")
@AnonymousAllowed
public class SignInView extends VerticalLayout{

    private LoginForm loginForm = new LoginForm();
    public SignInView(){

        LoginI18n i18n = LoginI18n.createDefault();

        LoginI18n.Form i18nForm = i18n.getForm();
        i18nForm.setTitle("店舗ログイン");
        i18nForm.setUsername("店舗ID");
        i18nForm.setPassword("パスワード");
        i18nForm.setSubmit("ログイン");
        i18nForm.setForgotPassword("パスワードを忘れた場合(不必要？)");
        i18n.setForm(i18nForm);

        LoginI18n.ErrorMessage i18nErrorMessage = i18n.getErrorMessage();
        i18nErrorMessage.setUsername("店舗IDは必須入力です");
        i18nErrorMessage.setPassword("パスワードは必須入力です");
        i18n.setErrorMessage(i18nErrorMessage);

        loginForm.setI18n(i18n);

        //addClassNameメソッドは、VaadinコンポーネントにCSSクラスを追加するための機能
        addClassName("login-view");
        setSizeFull();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);

        add(new H1("トータルサポート　勤怠管理システム"), loginForm);

    }




}
