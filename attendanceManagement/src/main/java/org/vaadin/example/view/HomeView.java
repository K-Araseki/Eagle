package org.vaadin.example.view;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.messages.MessageInput;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.example.data.出勤者;
import org.vaadin.example.data.出勤者リスト;
import org.vaadin.example.service.AttendantsFinderService;

import java.time.LocalDate;
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



        MessageInput input = new MessageInput();

        input.addSubmitListener(submitEvent -> {
            if(submitEvent.getValue().equals("abc")){
//                List<Person> people = new ArrayList(Arrays.asList(
//                        new Person("Alice", 25),
//                        new Person("Bob", 30),
//                        new Person("Charlie", 22)
//                ));
                AttendantsFinderService attendantsFinderService = new AttendantsFinderService();
                var 出勤者リスト = attendantsFinderService.find(LocalDate.parse("2023-10-01"), 100L);
                ArrayList<出勤者1> list = new ArrayList<>();
                for(出勤者 出勤者 : 出勤者リスト.values()){
                    var 出勤者1 = new 出勤者1(出勤者.lastName().value(), 出勤者.firstName().value());
                    list.add(出勤者1);
                }

//                Grid<Person> grid = new Grid<>(Person.class);
//                //grid.addColumn(Person::getName).setHeader("名前");
//                //grid.addColumn(Person::getEdg).setHeader("年齢");
//                grid.setItems(people);
//
//                grid.setColumns("name", "age");
//                grid.getColumnByKey("name").setHeader("名前");
//                grid.getColumnByKey("age").setHeader("年齢");
//                add(grid);

                // TODO recordに対応できるようにする
                Grid<出勤者1> grid = new Grid<>(出勤者1.class);
                //grid.addColumn(Person::getName).setHeader("名前");
                //grid.addColumn(Person::getEdg).setHeader("年齢");
                grid.setItems(list);

                grid.setColumns("shi", "mei");
                grid.getColumnByKey("shi").setHeader("氏");
                grid.getColumnByKey("mei").setHeader("名");
                add(grid);

//                Grid<出勤者> grid = new Grid<>(出勤者.class);
//                //grid.addColumn(Person::getName).setHeader("名前");
//                //grid.addColumn(Person::getEdg).setHeader("年齢");
//                grid.setItems(出勤者リスト.values());
//
//                grid.setColumns("lastName.value()", "firstName.value()");
//                grid.getColumnByKey("lastName.value()").setHeader("氏");
//                grid.getColumnByKey("firstName.value()").setHeader("名");
//                add(grid);

            }
        });
        add(input);






    }
    public class 出勤者1{
        private String shi;
        private String mei;

        public 出勤者1(String shi, String mei) {
            this.shi = shi;
            this.mei = mei;
        }

        public String getShi() {
            return shi;
        }

        public String getMei() {
            return mei;
        }
    }

}
