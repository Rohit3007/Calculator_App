package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.view.animation.AccelerateDecelerateInterpolator;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    ImageView btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0;
    ImageView btn_dot,btn_equal,btn_ac,btn_module,btn_plus,btn_minus,btn_multiplication,btn_extra;

    TextView inputtext,textoutput;

    String data;
    private int currentNumber = 0;
    boolean operatorEntered = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoutput = findViewById(R.id.textoutput);
        inputtext = findViewById(R.id.inputtext);


        btn_0=findViewById(R.id.btn_0);
        btn_1=findViewById(R.id.btn_1);
        btn_2=findViewById(R.id.btn_2);
        btn_3=findViewById(R.id.btn_3);
        btn_4=findViewById(R.id.btn_4);
        btn_5=findViewById(R.id.btn_5);
        btn_6=findViewById(R.id.btn_6);
        btn_7=findViewById(R.id.btn_7);
        btn_8=findViewById(R.id.btn_8);
        btn_9=findViewById(R.id.btn_9);

        btn_dot=findViewById(R.id.btn_dot);
        btn_equal=findViewById(R.id.btn_equal);
        btn_ac=findViewById(R.id.btn_ac);
        btn_module=findViewById(R.id.btn_module);
        btn_plus=findViewById(R.id.btn_plus);
        btn_minus=findViewById(R.id.btn_minus);
        btn_multiplication=findViewById(R.id.btn_multiplication);
        btn_extra=findViewById(R.id.btn_extra);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                increaseNumber();
                inputtext.setText(data+"0");
                animateInputNumberSize(btn_0);
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                increaseNumber();
                inputtext.setText(data+"1");
                animateInputNumberSize(btn_1);
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                increaseNumber();
                inputtext.setText(data+"2");
                animateInputNumberSize(btn_2);
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                increaseNumber();
                animateInputNumberSize(btn_3);
                inputtext.setText(data+"3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                increaseNumber();

                inputtext.setText(data+"4");
                animateInputNumberSize(btn_4);
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                increaseNumber();

                inputtext.setText(data+"5");
                animateInputNumberSize(btn_5);
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                increaseNumber();

                inputtext.setText(data+"6");
                animateInputNumberSize(btn_6);
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                increaseNumber();

                inputtext.setText(data+"7");
                animateInputNumberSize(btn_7);
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                increaseNumber();

                inputtext.setText(data+"8");
                animateInputNumberSize(btn_8);
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                increaseNumber();

                inputtext.setText(data+"9");
                animateInputNumberSize(btn_9);
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                if (data.endsWith("-") || data.endsWith(".") || data.endsWith("+") || data.endsWith("%") || data.endsWith("×")) {
                    return;
                }
                inputtext.setText(data+".");
            }
        });

        btn_module.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                if (data.endsWith("-") || data.endsWith(".") || data.endsWith("+") || data.endsWith("%") || data.endsWith("×")) {
                    return;
                }
                inputtext.setText(data+"%");
            }
        });


        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputtext.setText((""));
                if (data.endsWith("-") || data.endsWith(".") || data.endsWith("+") || data.endsWith("%") || data.endsWith("×")) {
                    return;
                }
                textoutput.setText((""));
            }
        });

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();

                if (data.endsWith("-") || data.endsWith(".") || data.endsWith("+") || data.endsWith("%") || data.endsWith("×")) {
                    return;
                }
                inputtext.setText(data+"+");
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                if (data.endsWith("-") || data.endsWith(".") || data.endsWith("+") || data.endsWith("%") || data.endsWith("×")) {
                    return;
                }
                inputtext.setText(data+"-");
            }
        });

        btn_module.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                if (data.endsWith("-") || data.endsWith(".") || data.endsWith("+") || data.endsWith("%") || data.endsWith("×")) {
                    return;
                }
                inputtext.setText(data+"%");
            }
        });

        btn_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputtext.getText().toString();
                if (data.endsWith("-") || data.endsWith(".") || data.endsWith("+") || data.endsWith("%") || data.endsWith("×")) {
                    return;
                }
                inputtext.setText(data+"×");
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    data = inputtext.getText().toString();

                    // Check for consecutive operators
                    if (data.matches(".*[+\\-×%]{2,}.*")) {
                        Toast.makeText(MainActivity.this, "Consecutive operators are not allowed", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    // Split the input by operators
                    String[] parts = data.split("[+\\-×%]");

                    double result = Double.parseDouble(parts[0]);
                    char operator = ' ';

                    // Perform calculations iteratively
                    int operatorIndex = parts[0].length();
                    for (int i = 1; i < parts.length; i++) {
                        operator = data.charAt(operatorIndex);
                        double num = Double.parseDouble(parts[i]);

                        switch (operator) {
                            case '+':
                                result += num;
                                break;
                            case '-':
                                result -= num;
                                break;
                            case '×':
                                result *= num;
                                break;
                            case '%':
                                if (num == 0) {
                                    Toast.makeText(MainActivity.this, "Division by zero", Toast.LENGTH_SHORT).show();
                                    return;
                                }
                                result /= num;
                                break;
                        }

                        // Update the operator index for the next iteration
                        operatorIndex += parts[i].length() + 1; // +1 for the operator itself
                    }

                    textoutput.setText(formatResult(result));
                    animateResultSize();
                }
            });

        btn_extra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentInput = inputtext.getText().toString();
                if (!currentInput.isEmpty()) {
                    currentInput = currentInput.substring(0, currentInput.length() - 1);
                    inputtext.setText(currentInput);
                }
            }
        });
    }
    private String formatResult(double result) {
        if (result >= 1e9 || (result != 0 && Math.abs(result) <= 1e-8)) {
            return String.format("%.8e", result);
        } else {
            DecimalFormat decimalFormat = new DecimalFormat("#.########");
            return decimalFormat.format(result);
        }
    }


    private void animateNumberSize() {
        PropertyValuesHolder textSizeHolder = PropertyValuesHolder.ofFloat("textSize", 50, 30);
        ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(textoutput, textSizeHolder);
        animator.setDuration(500);
        animator.setInterpolator(new AccelerateDecelerateInterpolator());

        animator.start();
    }
    private void increaseNumber() {
        currentNumber++;
        animateNumberSize();
    }

    private void animateInputNumberSize(ImageView button) {
        @SuppressLint("ObjectAnimatorBinding") PropertyValuesHolder textSizeHolder = PropertyValuesHolder.ofFloat("textSize", 50, 30);
        ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(button, textSizeHolder);
        animator.setDuration(500);
        animator.setInterpolator(new AccelerateDecelerateInterpolator());

        animator.start();
    }
    private void animateResultSize() {
        PropertyValuesHolder textSizeHolder = PropertyValuesHolder.ofFloat("textSize", 30, 50);
        ObjectAnimator animator = ObjectAnimator.ofPropertyValuesHolder(textoutput, textSizeHolder);
        animator.setDuration(500);
        animator.setInterpolator(new AccelerateDecelerateInterpolator());

        animator.start();
    }


}