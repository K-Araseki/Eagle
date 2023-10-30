package org.vaadin.example.view;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@Route("main")
@PageTitle("トータルサポート勤怠管理システム メインページ")
public class MainView extends AppLayout{

    public MainView() {
        DrawerToggle toggle = new DrawerToggle();

        H1 pleaseName = new H1("千歳店"); //ログインページから持ってくる
        pleaseName.getStyle().set("font-size", "var(--lumo-font-size-xl)")
                .set("margin", "0");

        Tabs tabs = getTabs();

        addToDrawer(tabs);
        addToNavbar(toggle, pleaseName);

        setPrimarySection(Section.DRAWER);


    }

    private Tabs getTabs() {
        Tabs tabs = new Tabs();
        tabs.add(createTab(VaadinIcon.HOME, "ホーム", HomeView.class),
                createTab(VaadinIcon.TIME_FORWARD, "出勤・退勤時間入力", SelectRegistrationOrModificationView.class),
                createTab(VaadinIcon.CLIPBOARD_USER, "従業員", HelloView.class),
                createTab(VaadinIcon.COG, "管理者設定", HelloView.class));
        tabs.setOrientation(Tabs.Orientation.VERTICAL);
        return tabs;
    }

    private Tab createTab(VaadinIcon viewIcon, String viewName, Class<? extends Component> view) {
        Icon icon = viewIcon.create();
        icon.getStyle().set("box-sizing", "border-box")
                .set("margin-inline-end", "var(--lumo-space-m)")
                .set("margin-inline-start", "var(--lumo-space-xs)")
                .set("padding", "var(--lumo-space-xs)");

        RouterLink link = new RouterLink();
        link.add(icon, new Span(viewName));
        // Demo has no routes
        link.setRoute(view);
        link.setTabIndex(-1);

        return new Tab(link);
    }

}

