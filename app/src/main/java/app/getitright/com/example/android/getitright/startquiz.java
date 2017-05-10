package app.getitright.com.example.android.getitright;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class startquiz extends AppCompatActivity {

    // Variables
    int finalScore = 0;
    int questionNumber = 1;
    String correctAnswer = "";
    LinearLayout lltRadio, lltCheck, lltEdt, lltQuest;
    ScrollView lltScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startquiz);
        //Initiating Layouts
        lltRadio = (LinearLayout) findViewById(R.id.layout_radio_buttons);
        lltCheck = (LinearLayout) findViewById(R.id.layout_check_buttons);
        lltEdt = (LinearLayout) findViewById(R.id.layout_editable_text);
        lltQuest = (LinearLayout) findViewById(R.id.layout_questions);
        lltScore = (ScrollView) findViewById(R.id.layout_score);
        //Toast to show the Level
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast.makeText(context, "Level 1", duration).show();
    }


    public void checkAnswer(View view) {
        //Initiating views (CheckBox, RadioButton, TextView)
        CheckBox firstAnswer = (CheckBox) findViewById(R.id.answer_number_one);
        CheckBox secondAnswer = (CheckBox) findViewById(R.id.answer_number_two);
        CheckBox thirdAnswer = (CheckBox) findViewById(R.id.answer_number_three);
        CheckBox forthAnswer = (CheckBox) findViewById(R.id.answer_number_four);
        RadioButton firstAnswer2 = (RadioButton) findViewById(R.id.answer_number_one2);
        RadioButton secondAnswer2 = (RadioButton) findViewById(R.id.answer_number_two2);
        RadioButton thirdAnswer2 = (RadioButton) findViewById(R.id.answer_number_three2);
        RadioButton forthAnswer2 = (RadioButton) findViewById(R.id.answer_number_four2);
        EditText answerEditable = (EditText) findViewById(R.id.answer_editable);
        //Checking if the checkboxs and radiobutton are selected.
        boolean answerNumberOne = firstAnswer.isChecked();
        boolean answerNumberTwo = secondAnswer.isChecked();
        boolean answerNumberThree = thirdAnswer.isChecked();
        boolean answerNumberFour = forthAnswer.isChecked();
        boolean answerNumberOne2 = firstAnswer2.isChecked();
        boolean answerNumberTwo2 = secondAnswer2.isChecked();
        boolean answerNumberThree2 = thirdAnswer2.isChecked();
        boolean answerNumberFour2 = forthAnswer2.isChecked();
        Editable answerEditableText = answerEditable.getText();
        // From question Number 1 to 10, check if each one of them is correct
        //If they are correct, the score is implemented by one
        //If they are NOT correct, a toats saying 'Wrong' is shown and a string is implemented to be shown later
        if (questionNumber == 1) {
            if (answerNumberOne && answerNumberThree && answerNumberFour && !answerNumberTwo) {
                finalScore = finalScore + 1;
            } else {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, R.string.wrong_toast, duration).show();
                correctAnswer = correctAnswer + "\n" + getString(R.string.correctAnswer1);
            }
        }
        if (questionNumber == 2) {
            if (answerNumberOne && answerNumberThree && !answerNumberFour && !answerNumberTwo) {
                finalScore = finalScore + 1;
            } else {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, R.string.wrong_toast, duration).show();
                correctAnswer = correctAnswer + "\n" + getString(R.string.correctAnswer2);
            }
        }
        if (questionNumber == 3) {
            if (answerNumberTwo && answerNumberFour && !answerNumberOne && !answerNumberThree) {
                finalScore = finalScore + 1;
            } else {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, R.string.wrong_toast, duration).show();
                correctAnswer = correctAnswer + "\n" + getString(R.string.correctAnswer3);
            }
        }
        //This is the last question of the first level
        if (questionNumber == 4) {
            if (answerNumberOne && answerNumberTwo && answerNumberFour && !answerNumberThree) {
                finalScore = finalScore + 1;
            } else {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, R.string.wrong_toast, duration).show();
                correctAnswer = correctAnswer + "\n" + getString(R.string.correctAnswer4);
            }
            lltCheck.setVisibility(View.GONE);
            lltEdt.setVisibility(View.GONE);
            lltRadio.setVisibility(View.VISIBLE);
        }

        if (questionNumber == 5) {
            if (answerNumberTwo2) {
                finalScore = finalScore + 1;
            } else {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, R.string.wrong_toast, duration).show();
                correctAnswer = correctAnswer + "\n" + getString(R.string.correctAnswer5);
            }
        }
        if (questionNumber == 6) {
            if (answerNumberFour2) {
                finalScore = finalScore + 1;
            } else {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, R.string.wrong_toast, duration).show();
                correctAnswer = correctAnswer + "\n" + getString(R.string.correctAnswer6);
            }
        }
        if (questionNumber == 7) {
            if (answerNumberOne2) {
                finalScore = finalScore + 1;
            } else {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, R.string.wrong_toast, duration).show();
                correctAnswer = correctAnswer + "\n" + getString(R.string.correctAnswer7);
            }
        }
        //This is the last question of the second level
        if (questionNumber == 8) {
            if (answerNumberThree2) {
                finalScore = finalScore + 1;
            } else {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, R.string.wrong_toast, duration).show();
                correctAnswer = correctAnswer + "\n" + getString(R.string.correctAnswer8);
            }
        }
        if (questionNumber == 9) {
            String correctAnswerEdt = "Moonlight ";
            if (answerEditableText.toString().equals(correctAnswerEdt)) {
                finalScore = finalScore + 1;
            } else {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, R.string.wrong_toast, duration).show();
                correctAnswer = correctAnswer + "\n" + getString(R.string.correctAnswer9);
            }
        }
        if (questionNumber == 10) {
            String correctAnswerEdt = "The Godfather ";
            if (answerEditableText.toString().equals(correctAnswerEdt)) {
                finalScore = finalScore + 1;
            } else {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, R.string.wrong_toast, duration).show();
                correctAnswer = correctAnswer + "\n" + getString(R.string.correctAnswer10);
            }
        }
        //Method to change the question
        nextQuestion();
    }

    //Button Skip
    public void skipQuestion(View view) {
        nextQuestion();
    }

    //It is a method to change the text from the questions and answer
    public void nextQuestion() {
        questionNumber = questionNumber + 1;
        //Change the visibility of the layouts
        //From the fifth question to the eight question
        //The layout with RadioButtons will be visible
        if (questionNumber > 4 && questionNumber < 9) {
            lltCheck.setVisibility(View.GONE);
            lltEdt.setVisibility(View.GONE);
            lltRadio.setVisibility(View.VISIBLE);
        }
        //Change the visibility of the layouts
        //From the ninth question to the tenth question
        //The layout with EditText will be visible
        if (questionNumber >= 9) {
            lltCheck.setVisibility(View.GONE);
            lltRadio.setVisibility(View.GONE);
            lltEdt.setVisibility(View.VISIBLE);
        }
        //Initiating the views
        TextView questionNumberText = (TextView) findViewById(R.id.question_number);
        TextView phaseNumberText = (TextView) findViewById(R.id.phase_number);
        TextView questionText = (TextView) findViewById(R.id.question_text_view);
        CheckBox firstAnswer = (CheckBox) findViewById(R.id.answer_number_one);
        CheckBox secondAnswer = (CheckBox) findViewById(R.id.answer_number_two);
        CheckBox thirdAnswer = (CheckBox) findViewById(R.id.answer_number_three);
        CheckBox forthAnswer = (CheckBox) findViewById(R.id.answer_number_four);
        RadioButton firstAnswer2 = (RadioButton) findViewById(R.id.answer_number_one2);
        RadioButton secondAnswer2 = (RadioButton) findViewById(R.id.answer_number_two2);
        RadioButton thirdAnswer2 = (RadioButton) findViewById(R.id.answer_number_three2);
        RadioButton forthAnswer2 = (RadioButton) findViewById(R.id.answer_number_four2);
        EditText answerEditable = (EditText) findViewById(R.id.answer_editable);
        //Cleaning checkboxes, radiobuttons and editable text filds
        firstAnswer.setChecked(false);
        secondAnswer.setChecked(false);
        thirdAnswer.setChecked(false);
        forthAnswer.setChecked(false);
        firstAnswer2.setChecked(false);
        secondAnswer2.setChecked(false);
        thirdAnswer2.setChecked(false);
        forthAnswer2.setChecked(false);
        answerEditable.setText("");
        //From the second question to the tenth
        //The text from the question and answers will change
        //According to its number
        if (questionNumber == 2) {
            questionText.setText(R.string.question2);
            firstAnswer.setText(R.string.Answer2A);
            secondAnswer.setText(R.string.Answer2B);
            thirdAnswer.setText(R.string.Answer2C);
            forthAnswer.setText(R.string.Answer2D);
            questionNumberText.setText("2");
        }
        if (questionNumber == 3) {
            questionText.setText(R.string.question3);
            firstAnswer.setText(R.string.Answer3A);
            secondAnswer.setText(R.string.Answer3B);
            thirdAnswer.setText(R.string.Answer3C);
            forthAnswer.setText(R.string.Answer3D);
            questionNumberText.setText("3");
        }
        if (questionNumber == 4) {
            questionText.setText(R.string.question4);
            firstAnswer.setText(R.string.Answer4A);
            secondAnswer.setText(R.string.Answer4B);
            thirdAnswer.setText(R.string.Answer4C);
            forthAnswer.setText(R.string.Answer4D);
            questionNumberText.setText("4");
        }
        //Beginning of the second level, a toast saying 'Second Level' will appear
        if (questionNumber == 5) {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast.makeText(context, R.string.level_2_toast, duration).show();
            questionText.setText(R.string.question5);
            firstAnswer2.setText(R.string.Answer5A);
            secondAnswer2.setText(R.string.Answer5B);
            thirdAnswer2.setText(R.string.Answer5C);
            forthAnswer2.setText(R.string.Answer5D);
            questionNumberText.setText("1");
            phaseNumberText.setText("2");
        }
        if (questionNumber == 6) {
            questionText.setText(R.string.question6);
            firstAnswer2.setText(R.string.Answer6A);
            secondAnswer2.setText(R.string.Answer6B);
            thirdAnswer2.setText(R.string.Answer6C);
            forthAnswer2.setText(R.string.Answer6D);
            questionNumberText.setText("2");
        }
        if (questionNumber == 7) {
            questionText.setText(R.string.question7);
            firstAnswer2.setText(R.string.Answer7A);
            secondAnswer2.setText(R.string.Answer7B);
            thirdAnswer2.setText(R.string.Answer7C);
            forthAnswer2.setText(R.string.Answer7D);
            questionNumberText.setText("3");
        }
        if (questionNumber == 8) {
            questionText.setText(R.string.question8);
            firstAnswer2.setText(R.string.Answer8A);
            secondAnswer2.setText(R.string.Answer8B);
            thirdAnswer2.setText(R.string.Answer8C);
            forthAnswer2.setText(R.string.Answer8D);
            questionNumberText.setText("4");
        }
        //Beginning of the third level, a toast saying 'Third Level' will appear
        if (questionNumber == 9) {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast.makeText(context, R.string.level_3_toast, duration).show();
            questionText.setText(R.string.question9);
            questionNumberText.setText("1");
            phaseNumberText.setText("3");
        }
        if (questionNumber == 10) {
            questionText.setText(R.string.question10);
            questionNumberText.setText("2");
        }
        //Quiz ends, the layout with the score will replace the current one
        if (questionNumber >= 11) {
            lltQuest.setVisibility(View.GONE);
            lltScore.setVisibility(View.VISIBLE);
            TextView scoreShow = (TextView) findViewById(R.id.score_text);
            TextView resultShow = (TextView) findViewById(R.id.result);
            scoreShow.setText("" + finalScore + "");
            if (finalScore < 3) {
                resultShow.setText(R.string.less3_message);
            }
            if (finalScore >= 3 && finalScore < 7) {
                resultShow.setText(R.string.more3_message);
            }
            if (finalScore >= 7 && finalScore <= 9) {
                resultShow.setText(R.string.more7_message);
            }
            if (finalScore == 10) {
                resultShow.setText(R.string.all_message);
            }
        }
    }

    //Restart button will start activity_main
    public void restart(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    //Answer Button set new text to the textview and make it visible
    public void showCorrectAnswer(View view) {
        TextView showAnswers = (TextView) findViewById(R.id.show_answer);
        showAnswers.setVisibility(View.VISIBLE);
        showAnswers.setText(correctAnswer);
    }
}

