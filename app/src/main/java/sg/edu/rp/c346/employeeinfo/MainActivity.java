package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployee;
    ArrayList<EmployeeItem> alEmployeeList;
    CustomAdapter caEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.ListViewEmployee);

        alEmployeeList = new ArrayList<>();
        EmployeeItem item1 = new EmployeeItem("John", "Software Technical Engineer", "3400.00");
        EmployeeItem item2 = new EmployeeItem("Mary", "Programmer", "2200.00");
        EmployeeItem item3 = new EmployeeItem("May", "Designer", "2500.00");
        EmployeeItem item4 = new EmployeeItem("Max", "Engineer", "2200.00");
        EmployeeItem item5 = new EmployeeItem("Nappy", "Programmer", "2200.00");
        EmployeeItem item6 = new EmployeeItem("Shady", "Developer", "2200.00");
        EmployeeItem item7 = new EmployeeItem("Rachel", "Programmer", "2200.00");
        EmployeeItem item8 = new EmployeeItem("Jessie", "Programmer", "2200.00");
        EmployeeItem item9 = new EmployeeItem("Norman", "Programmer", "2200.00");
        EmployeeItem item10 = new EmployeeItem("Jess", "Programmer", "2200.00");
        EmployeeItem item11 = new EmployeeItem("Tim", "Programmer", "2200.00");
        EmployeeItem item12 = new EmployeeItem("Stephen", "Programmer", "2200.00");



        alEmployeeList.add(item1);
        alEmployeeList.add(item2);
        alEmployeeList.add(item3);
        alEmployeeList.add(item4);
        alEmployeeList.add(item5);
        alEmployeeList.add(item6);
        alEmployeeList.add(item7);
        alEmployeeList.add(item8);
        alEmployeeList.add(item9);
        alEmployeeList.add(item10);
        alEmployeeList.add(item11);
        alEmployeeList.add(item12);

        caEmployee = new CustomAdapter(this, R.layout.employee_item, alEmployeeList);
        lvEmployee.setAdapter(caEmployee);
    }
}
