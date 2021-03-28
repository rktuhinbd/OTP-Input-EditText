package com.rktuhinbd.advancededittext;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText et_1;
    private EditText et_2;
    private EditText et_3;
    private EditText et_4;
    private EditText et_5;
    private EditText et_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViewProperties();

        inputActionEditText1();
        inputActionEditText2();
        inputActionEditText3();
        inputActionEditText4();
        inputActionEditText5();
        inputActionEditText6();

        backFunctionEditText2();
        backFunctionEditText3();
        backFunctionEditText4();
        backFunctionEditText5();
        backFunctionEditText6();

        generateRandomNumber();
    }

    private void generateRandomNumber() {
        Random rand = new Random();
        int n = rand.nextInt(5);
        n += 1;

        Log.e("Random number", n + "");

        switch (n) {
            case 1:
                et_1.setHint("?");
                et_2.setHint("?");

                et_1.setEnabled(true);
                et_2.setEnabled(true);
                et_3.setEnabled(false);
                et_4.setEnabled(false);
                et_5.setEnabled(false);
                et_6.setEnabled(false);

                break;

            case 2:
                et_2.setHint("?");
                et_3.setHint("?");

                et_1.setEnabled(false);
                et_2.setEnabled(true);
                et_3.setEnabled(true);
                et_4.setEnabled(false);
                et_5.setEnabled(false);
                et_6.setEnabled(false);

                break;

            case 3:
                et_3.setHint("?");
                et_4.setHint("?");

                et_1.setEnabled(false);
                et_2.setEnabled(false);
                et_3.setEnabled(true);
                et_4.setEnabled(true);
                et_5.setEnabled(false);
                et_6.setEnabled(false);

                break;

            case 4:
                et_4.setHint("?");
                et_5.setHint("?");

                et_1.setEnabled(false);
                et_2.setEnabled(false);
                et_3.setEnabled(false);
                et_4.setEnabled(true);
                et_5.setEnabled(true);
                et_6.setEnabled(false);

                break;

            case 5:
                et_5.setHint("?");
                et_6.setHint("?");

                et_1.setEnabled(false);
                et_2.setEnabled(false);
                et_3.setEnabled(false);
                et_4.setEnabled(false);
                et_5.setEnabled(true);
                et_6.setEnabled(true);

                break;
        }
    }

    private void initViewProperties() {
        et_1 = findViewById(R.id.et_1);
        et_2 = findViewById(R.id.et_2);
        et_3 = findViewById(R.id.et_3);
        et_4 = findViewById(R.id.et_4);
        et_5 = findViewById(R.id.et_5);
        et_6 = findViewById(R.id.et_6);
    }

    private void inputActionEditText1() {
        et_1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 1) {
                    et_2.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void inputActionEditText2() {
        et_2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 1) {
                    et_3.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void inputActionEditText3() {
        et_3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 1) {
                    et_4.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void inputActionEditText4() {
        et_4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 1) {
                    et_5.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void inputActionEditText5() {
        et_5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 1) {
                    et_6.requestFocus();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void inputActionEditText6() {
        et_6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() == 1) {
                    String input1 = et_1.getText().toString();
                    String input2 = et_2.getText().toString();
                    String input3 = et_3.getText().toString();
                    String input4 = et_4.getText().toString();
                    String input5 = et_5.getText().toString();
                    String input6 = et_6.getText().toString();

                    Toast.makeText(getApplicationContext(), "Your input: " + input1 + input2 + input3
                            + input4 + input5 + input6, Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void backFunctionEditText2() {
        et_2.setOnKeyListener((v, keyCode, event) -> {
            if (event.getAction() == KeyEvent.ACTION_DOWN) {
                if (keyCode == KeyEvent.KEYCODE_DEL) {
                    et_2.setText(null);
                    et_1.requestFocus();
                }
            }
            return false;
        });
    }

    private void backFunctionEditText3() {
        et_3.setOnKeyListener((v, keyCode, event) -> {
            if (event.getAction() == KeyEvent.ACTION_DOWN) {
                if (keyCode == KeyEvent.KEYCODE_DEL) {
                    et_3.setText(null);
                    et_2.requestFocus();
                }
            }
            return false;
        });
    }

    private void backFunctionEditText4() {
        et_4.setOnKeyListener((v, keyCode, event) -> {
            if (event.getAction() == KeyEvent.ACTION_DOWN) {
                if (keyCode == KeyEvent.KEYCODE_DEL) {
                    et_4.setText(null);
                    et_3.requestFocus();
                }
            }
            return false;
        });
    }

    private void backFunctionEditText5() {
        et_5.setOnKeyListener((v, keyCode, event) -> {
            if (event.getAction() == KeyEvent.ACTION_DOWN) {
                if (keyCode == KeyEvent.KEYCODE_DEL) {
                    et_5.setText(null);
                    et_4.requestFocus();
                }
            }
            return false;
        });
    }

    private void backFunctionEditText6() {
        et_6.setOnKeyListener((v, keyCode, event) -> {
            if (event.getAction() == KeyEvent.ACTION_DOWN) {
                if (keyCode == KeyEvent.KEYCODE_DEL) {
                    et_6.setText(null);
                    et_5.requestFocus();
                }
            }
            return false;
        });
    }
}