package org.aplas.basicappx;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import javax.xml.transform.stream.StreamResult;

public class MainActivity extends AppCompatActivity {
    private AlertDialog startDialog;
    protected void onStart() {

        super.onStart();
        startDialog = new AlertDialog.Builder(MainActivity.this).create();
        startDialog.setTitle("Application started");
        startDialog.setMessage("This app can use to convert any units");
        startDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        convertBtn = (Button)findViewById(R.id.convertButton);
        inputTxt = (EditText)findViewById(R.id.inputText);
        outputTxt = (EditText)findViewById(R.id.outputText);
        unitOri = (Spinner)findViewById(R.id.oriList);
        unitConv = (Spinner)findViewById(R.id.convList);
        unitType = (RadioGroup)findViewById(R.id.radioGroup);
        roundBox = (CheckBox)findViewById(R.id.chkRounded);
        formBox = (CheckBox)findViewById(R.id.chkFormula);
        imgView = (ImageView)findViewById(R.id.imgFormula);

        unitType.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        RadioButton xx = (RadioButton) findViewById(checkedId);
                        ArrayAdapter<CharSequence> zz = new ArrayAdapter<CharSequence>(this , android.R.layout.simple_list_item_1,);

                        ArrayAdapter.createFromResource(unitType.getContext(),R.array.distList, android.R.layout.simple_spinner_item);
                        ArrayAdapter.createFromResource(unitType.getContext(),R.array.weightList, android.R.layout.simple_spinner_item);

                        imgView.setImageResource(R.drawable.weight);
                        imgView.setImageResource(R.drawable.distance);
                        imgView.setImageResource(R.drawable.temperature);

                        zz.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                        unitOri.setAdapter(zz);
                        unitConv.setAdapter(zz);

                    }
                });
        convertBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                doConvert();

                unitOri.setOnItemSelectedListener(){
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        doConvert();
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        doConvert();
                    }
                };
                unitConv.setOnItemSelectedListener(){
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        doConvert();
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        doConvert();
                    }
                };
                roundBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
…
                    }
                });
                roundBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
…
                    }
                });

            }
        });
    }
    private Distance dist;
    private Weight weight;
    private Temperature temp;

    private Button convertBtn;
    private EditText inputText;
    private EditText outputText;
    private Spinner unitOri;
    private Spinner unitConv;
    private RadioGroup unitType;
    private CheckBox roundBox;
    private CheckBox formBox;
    private ImageView imgView;

    protected double convertUnit(String x , String y , String z , double a){
        if(x.equalsIgnoreCase("Temperature")){
            if(y.equalsIgnoreCase("C")){
                if(z.equalsIgnoreCase("F")){

                }
                if(z.equalsIgnoreCase("F")){

                }
            }
            if(y.equalsIgnoreCase("F")){
                if(z.equalsIgnoreCase("C")){

                }
                if(z.equalsIgnoreCase("K")){

                }
            }
            if(y.equalsIgnoreCase("K")){
                if(z.equalsIgnoreCase("C")){

                }
                if(z.equalsIgnoreCase("F")){

                }
            }
        }
        if(x.equalsIgnoreCase("Distance")){
            if(y.equalsIgnoreCase("Mtr")){
                if(z.equalsIgnoreCase("Inc")){

                }
                if(z.equalsIgnoreCase("Mil")){

                }
                if(z.equalsIgnoreCase("Ft")){

                }
            }
            if(y.equalsIgnoreCase("Inc")){
                if(z.equalsIgnoreCase("Mtr")){

                }
                if(z.equalsIgnoreCase("Mil")){

                }
                if(z.equalsIgnoreCase("Ft")){

                }
            }
            if(y.equalsIgnoreCase("Mil")){
                if(z.equalsIgnoreCase("Mtr")){

                }
                if(z.equalsIgnoreCase("Inc")){

                }
                if(z.equalsIgnoreCase("Ft")){

                }
            }
            if(y.equalsIgnoreCase("Ft")){
                if(z.equalsIgnoreCase("Mtr")){

                }
                if(z.equalsIgnoreCase("Inc")){

                }
                if(z.equalsIgnoreCase("Mil")){

                }
            }

        }
        if(x.equalsIgnoreCase("Weight")){
            if(y.equalsIgnoreCase("Grm")){
                if(z.equalsIgnoreCase("Pnd")){

                }
                if(z.equalsIgnoreCase("Onc")){

                }
            }
            if(y.equalsIgnoreCase("Pnd")){
                if(z.equalsIgnoreCase("Grm")){

                }
                if(z.equalsIgnoreCase("Onc")){

                }
            }
            if(y.equalsIgnoreCase("Onc")){
                if(z.equalsIgnoreCase("Grm")){

                }
                if(z.equalsIgnoreCase("Pnd")){

                }
            }
        }
        return 0;
    }
    protected String strResult(double x , boolean z){
        if(x)
        String val = String.valueOf(x)
        return null;
    }

    void doConvert(){

        convertUnit();

        RadioButton varName = (RadioButton);

        findViewById(varName.getCheckedRadioButtonId());

        Double.parseDouble();

        StreamResult();

        roundBox.isChecked();
        formBox.isChecked();


    }



}