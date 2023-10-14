package org.vaadin.example.view;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@PageTitle("ホーム")
@Route(value = "home", layout = MainView.class)
public class HomeView extends Div {


    public HomeView(){

        HorizontalLayout horizontalLayout = new HorizontalLayout();
        horizontalLayout.setSizeFull();

        LocalDateTime nowDate = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日(E)");
        String formatNowDate = dtf.format(nowDate);

        horizontalLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);

        H1 text = new H1(formatNowDate + "の出勤者");
        text.addClassName("align-self-center");

        horizontalLayout.add(text);
        horizontalLayout.setPadding(true);

        add(horizontalLayout);

        List<Person> people = new ArrayList(Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 22)
        ));

        Grid<Person> grid = new Grid<>(Person.class);
        //grid.addColumn(Person::getName).setHeader("名前");
        //grid.addColumn(Person::getEdg).setHeader("年齢");
        grid.setItems(people);

        grid.setColumns("name", "age");
        grid.getColumnByKey("name").setHeader("名前");
        grid.getColumnByKey("age").setHeader("年齢");
        add(grid);
    }

}
