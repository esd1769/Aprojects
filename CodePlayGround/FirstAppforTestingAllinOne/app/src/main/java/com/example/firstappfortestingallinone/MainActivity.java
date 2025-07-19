/////////////////////////////////
//package com.example.firstappfortestingallinone;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;
//
//public class MainActivity extends AppCompatActivity {
//    /*
//    TextView textViewVariableforSum=null;
//    Button buttonVar=null;     will work
//    EditText num2=null;
//    */
//    TextView textViewVariableforSum;
//            Button buttonVar;
//            EditText num2;
////EditText num1, num2; will work
//
//@Override
//protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        Toast.makeText(this, "Good Day", Toast.LENGTH_SHORT).show();
//
//        //SO,(MANUAL)CHANGES ON JAVA FILE GETS PRIORITY THAN XML FILES
//        //LETS PROOF:
//
//
//        //manual text change
//
//
//        TextView text;
//        text = findViewById(R.id.text);
//        text.setText("Manual text set");
//
//
//        //manual text Size change
//
//
//        TextView textviewvariable;
//        textviewvariable = findViewById(R.id.textviewidmanual);
//        textviewvariable.setText("+");
//        //textviewvariable-VARIABLE,textviewidmanual-ID,set from xml file
//        textviewvariable.setTextSize(30); // Size in sp
//
//
//        //app for sum
//
//
//        EditText num1 ;
//        num1 = findViewById(R.id.n1);
//        num2 = findViewById(R.id.n2);
//        textViewVariableforSum=findViewById(R.id.textView);
//        /*
//        initialize textViewVariableforSum,num1,num2 variable
//        TextView textViewVariableforSum;
//        EditText num2;//trying as global var
//
//        ####################################################################################################################################################################################
//        EditText num1=null ;//WILL NOT WORK
//        EditText num1='0';..error as type is not char or int,it is EditText
//
//
//        #########################################################################################################################################################################################
//        int sum = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
//        textViewVariableforSum.setText("SUM:"+sum);//error
//        error cause first time before taking input num1,num2
//        code is working for sum which has num1,num2
//        so empty something/variable with no value+var no value=error
//        null+null=error
//
//         */
//        buttonVar = findViewById(R.id.buttonGo);
//        buttonVar.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {
//        int sum = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
//        //Integer.parseInt(num1.getText().toString())--convert num1 string to int for calculation
//        //TWO STEPS:
//        //edittext to string--.getText().toString()
//        //string to int --Integer.parseInt(num1.getText().toString())
//        //convert num1 string to int for calculation
//        textViewVariableforSum.setText("sum: " + sum);
//
//        }
//        });
//
//
//        //(=-/* )universal calcu
//
//
//        EditText ucinput;//name for string edit text
//        TextView ucoutput;
//        Button button2nd;
//        button2nd=findViewById(R.id.button);
//        ucinput=findViewById(R.id.editTextTextPersonName);
//        ucoutput=findViewById(R.id.textView2);
//        button2nd.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {
//        int a = 0;
//        int b = 0;
//        char operator = ' ';
//        int i = 0;
//        String input=ucinput.getText().toString();
//        // Parse 'a' until the first comma
//        while (input.charAt(i) != ',') {
//        a = a * 10 + (input.charAt(i) - '0');
//        i++;
//        }
//
//        // Set operator to the character after the first comma
//        operator = input.charAt(++i);
//
//        // Parse 'b' after the second comma
//        i += 2;
//        while (i < input.length()) {
//        b = b * 10 + (input.charAt(i) - '0');
//        i++;
//        }
//        int result=0;
//        if (operator == '+') {
//        result = a + b;
//        } else if (operator == '-') {
//        result = a - b;
//        } else if (operator == '*') {
//        result = a * b;
//        } else if (operator == '/') {
//        if (b != 0) {
//        if (a>b){
//        result = a / b;
//        }
//        else{
//        result =b/a;
//        //return double not possible from result
//        //for that ,you need double doubleResult = 0.0;
//        //boolean isDouble = false;
//        }}
//        else {
//        result=-1;
//        }
//        }
//        ucoutput.setText("Result: " + result);
//
//        }
//
//        });
//        }
//        }
/////////////////////////////////
//package com.example.firstappfortestingallinone;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;
//
//public class MainActivity extends AppCompatActivity {
//    /*
//    TextView textViewVariableforSum=null;
//    Button buttonVar=null;     will work
//    EditText num2=null;
//    */
//    TextView textViewVariableforSum;
//            Button buttonVar;
//            EditText num2;
////EditText num1, num2; will work
//
//@Override
//protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        Toast.makeText(this, "Good Day", Toast.LENGTH_SHORT).show();
//
//        //SO,(MANUAL)CHANGES ON JAVA FILE GETS PRIORITY THAN XML FILES
//        //LETS PROOF:
//
//
//        //manual text change
//
//
//        TextView text;
//        text = findViewById(R.id.text);
//        text.setText("Manual text set");
//
//
//        //manual text Size change
//
//
//        TextView textviewvariable;
//        textviewvariable = findViewById(R.id.textviewidmanual);
//        textviewvariable.setText("+");
//        //textviewvariable-VARIABLE,textviewidmanual-ID,set from xml file
//        textviewvariable.setTextSize(30); // Size in sp
//
//
//        //app for sum
//
//
//        EditText num1 ;
//        num1 = findViewById(R.id.n1);
//        num2 = findViewById(R.id.n2);
//        textViewVariableforSum=findViewById(R.id.textView);
//        /*
//        initialize textViewVariableforSum,num1,num2 variable
//        TextView textViewVariableforSum;
//        EditText num2;//trying as global var
//
//        ####################################################################################################################################################################################
//        EditText num1=null ;//WILL NOT WORK
//        EditText num1='0';..error as type is not char or int,it is EditText
//
//
//        #########################################################################################################################################################################################
//        int sum = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
//        textViewVariableforSum.setText("SUM:"+sum);//error
//        error cause first time before taking input num1,num2
//        code is working for sum which has num1,num2
//        so empty something/variable with no value+var no value=error
//        null+null=error
//
//         */
//        buttonVar = findViewById(R.id.buttonGo);
//        buttonVar.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {
//        int sum = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
//        //Integer.parseInt(num1.getText().toString())--convert num1 string to int for calculation
//        //TWO STEPS:
//        //edittext to string--.getText().toString()
//        //string to int --Integer.parseInt(num1.getText().toString())
//        //convert num1 string to int for calculation
//        textViewVariableforSum.setText("sum: " + sum);
//
//        }
//        });
//
//
//        //(=-/* )universal calcu
//
//
//        EditText ucinput;//name for string edit text
//        TextView ucoutput;
//        Button button2nd;
//        button2nd=findViewById(R.id.button);
//        ucinput=findViewById(R.id.editTextTextPersonName);
//        ucoutput=findViewById(R.id.textView2);
//        button2nd.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {
//        int a = 0;
//        int b = 0;
//        char operator = ' ';
//        int i = 0;
//        String input=ucinput.getText().toString();
//        // Parse 'a' until the first comma
//        while (input.charAt(i) != ',') {
//        a = a * 10 + (input.charAt(i) - '0');
//        i++;
//        }
//
//        // Set operator to the character after the first comma
//        operator = input.charAt(++i);
//
//        // Parse 'b' after the second comma
//        i += 2;
//        while (i < input.length()) {
//        b = b * 10 + (input.charAt(i) - '0');
//        i++;
//        }
//        int result=0;
//        if (operator == '+') {
//        result = a + b;
//        } else if (operator == '-') {
//        result = a - b;
//        } else if (operator == '*') {
//        result = a * b;
//        } else if (operator == '/') {
//        if (b != 0) {
//        if (a>b){
//        result = a / b;
//        }
//        else{
//        result =b/a;
//        //return double not possible from result
//        //for that ,you need double doubleResult = 0.0;
//        //boolean isDouble = false;
//        }}
//        else {
//        result=-1;
//        }
//        }
//        ucoutput.setText("Result: " + result);
//
//        }
//
//        });
//        }
//        }
//        //////////////////////////////////////cd C:\Users\llllllllllll\AppData\Local\Android\Sdk\emulator
//        ///////////////////////////////////////emulator -avd LASTtry

package com.example.firstappfortestingallinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /*
    TextView textViewVariableforSum=null;
    Button buttonVar=null;     will work
    EditText num2=null;
    */
    TextView textViewVariableforSum;
    Button buttonVar;
    EditText num2;
    //EditText num1, num2; will work

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toast.makeText(this, "Good Day", Toast.LENGTH_SHORT).show();


        //SO,(MANUAL)CHANGES ON JAVA FILE GETS PRIORITY THAN XML FILES
        //LETS PROOF:


        //manual text change


        TextView text;
        text = findViewById(R.id.text);
        text.setText("Manual text set");


        //manual text Size change


        TextView textviewvariable;
        textviewvariable = findViewById(R.id.textviewidmanual);
        textviewvariable.setText("+");
        //textviewvariable-VARIABLE,textviewidmanual-ID,set from xml file
        textviewvariable.setTextSize(30); // Size in sp


        //app for sum


        EditText num1;
        num1 = findViewById(R.id.n1);
        num2 = findViewById(R.id.n2);
        textViewVariableforSum = findViewById(R.id.textView);
        /*
        initialize textViewVariableforSum,num1,num2 variable
        TextView textViewVariableforSum;
        EditText num2;//trying as global var

        ####################################################################################################################################################################################
        EditText num1=null ;//WILL NOT WORK
        EditText num1='0';..error as type is not char or int,it is EditText


        #########################################################################################################################################################################################
        int sum = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
        textViewVariableforSum.setText("SUM:"+sum);//error
        error cause first time before taking input num1,num2
        code is working for sum which has num1,num2
        so empty something/variable with no value+var no value=error
        null+null=error

         */
        buttonVar = findViewById(R.id.buttonGo);
        buttonVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
                //Integer.parseInt(num1.getText().toString())--convert num1 string to int for calculation
                //TWO STEPS:
                //edittext to string--.getText().toString()
                //string to int --Integer.parseInt(num1.getText().toString())
                //convert num1 string to int for calculation
                textViewVariableforSum.setText("sum: " + sum);

            }
        });


        //(=-/* )universal calcu


        EditText ucinput;//name for string edit text
        TextView ucoutput;
        Button button2nd;
        button2nd = findViewById(R.id.button);
        ucinput = findViewById(R.id.editTextTextPersonName);
        ucoutput = findViewById(R.id.textView2);
        button2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = 0;
                int b = 0;
                char operator = ' ';
                int i = 0;
                String input = ucinput.getText().toString();
                // Parse 'a' until the first comma
                while (input.charAt(i) != ',') {
                    a = a * 10 + (input.charAt(i) - '0');
                    i++;
                }

                // Set operator to the character after the first comma
                operator = input.charAt(++i);

                // Parse 'b' after the second comma
                i += 2;
                while (i < input.length()) {
                    b = b * 10 + (input.charAt(i) - '0');
                    i++;
                }
                int result = 0;
                if (operator == '+') {
                    result = a + b;
                } else if (operator == '-') {
                    result = a - b;
                } else if (operator == '*') {
                    result = a * b;
                } else if (operator == '/') {
                    if (b != 0) {
                        if (a > b) {
                            result = a / b;
                        } else {
                            result = b / a;
                            //return double not possible from result
                            //for that ,you need double doubleResult = 0.0;
                            //boolean isDouble = false;
                        }
                    } else {
                        result = -1;
                    }
                }
                ucoutput.setText("Result: " + result);

            }

        });
    }
    public void openActivity(View v) {
        // Show a toast message to indicate the method is running
        Toast.makeText(this, "Second activity running", Toast.LENGTH_SHORT).show();

        // Create an Intent to launch the second activity
        Intent i = new Intent(this, MainActivity2.class);

        // Start the second activity
        startActivity(i);
    }

}


