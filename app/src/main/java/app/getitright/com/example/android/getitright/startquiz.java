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
import android.widget.TextView;
import android.widget.Toast;

public class startquiz extends AppCompatActivity {

    // Variables
    int finalScore = 0;
    int questionNumber = 1;
    LinearLayout lltRadio, lltCheck, lltEdt, lltQuest, lltScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startquiz);
        //Initiating Layouts
        lltRadio = (LinearLayout) findViewById(R.id.layout_radio_buttons);
        lltCheck = (LinearLayout) findViewById(R.id.layout_check_buttons);
        lltEdt = (LinearLayout) findViewById(R.id.layout_editable_text);
        lltQuest = (LinearLayout) findViewById(R.id.layout_questions);
        lltScore = (LinearLayout) findViewById(R.id.layout_score);
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
        //If they are NOT correct, a toats saying 'Wrong' is shown.
        if (questionNumber == 1) {
            if (answerNumberOne && answerNumberThree && answerNumberFour) {
                finalScore = finalScore + 1;
            } else {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, "Wrong", duration).show();
            }
        }
        if (questionNumber == 2) {
            if (answerNumberOne && answerNumberThree) {
                finalScore = finalScore + 1;
            } else {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, "Wrong", duration).show();
            }
        }
        if (questionNumber == 3) {
            if (answerNumberTwo && answerNumberFour) {
                finalScore = finalScore + 1;
            } else {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, "Wrong", duration).show();
            }
        }
        //This is the last question of the first level
        if (questionNumber == 4) {
            if (answerNumberOne && answerNumberTwo && answerNumberFour) {
                finalScore = finalScore + 1;
            } else {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, "Wrong", duration).show();
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
                Toast.makeText(context, "Wrong", duration).show();
            }
        }
        if (questionNumber == 6) {
            if (answerNumberFour2) {
                finalScore = finalScore + 1;
            } else {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, "Wrong", duration).show();
            }
        }
        if (questionNumber == 7) {
            if (answerNumberOne2) {
                finalScore = finalScore + 1;
            } else {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, "Wrong", duration).show();
            }
        }
        //This is the last question of the second level
        if (questionNumber == 8) {
            if (answerNumberThree2) {
                finalScore = finalScore + 1;
            } else {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, "Wrong", duration).show();
            }
        }
        if (questionNumber == 9) {
            String correctAnswer = "Moonlight ";
            if (answerEditableText.toString().equals(correctAnswer)) {
                finalScore = finalScore + 1;
            } else {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, "Wrong", duration).show();
            }
        }
        if (questionNumber == 10) {
            String correctAnswer = "The Godfather ";
            if (answerEditableText.toString().equals(correctAnswer)) {
                finalScore = finalScore + 1;
            } else {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(context, "Wrong", duration).show();
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
            questionText.setText("Which of these directors were nominated as The Best Director in the 89th Academy Awards(2017)");
            firstAnswer.setText("Denis Villeneuve");
            secondAnswer.setText("Steven Spielberg");
            thirdAnswer.setText("Mel Gibson");
            forthAnswer.setText("Robson Chazelle");
            questionNumberText.setText("2");
        }
        if (questionNumber == 3) {
            questionText.setText("Who has won two consecutive awards?");
            firstAnswer.setText("Daniel Day-Lewis");
            secondAnswer.setText("Spencer Tracy");
            thirdAnswer.setText("Jack Nicholson");
            forthAnswer.setText("Tom Hanks");
            questionNumberText.setText("3");
        }
        if (questionNumber == 4) {
            questionText.setText("For which films has Meryl Streep won The Academy Awards?");
            firstAnswer.setText("Sophie's Choice");
            secondAnswer.setText("The Iron Lady");
            thirdAnswer.setText("It's Complicated");
            forthAnswer.setText("Kramer vs. Kramer");
            questionNumberText.setText("4");
        }
        //Beginning of the second level, a toast saying 'Second Level' will appear
        if (questionNumber == 5) {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast.makeText(context, "Level 2", duration).show();
            questionText.setText("Who won the First Academy Award for Best Director?");
            firstAnswer2.setText("Clarence Brown");
            secondAnswer2.setText("Frank Borzage");
            thirdAnswer2.setText("King Vidor");
            forthAnswer2.setText("Alfred Hitchcock");
            questionNumberText.setText("1");
            phaseNumberText.setText("2");
        }
        if (questionNumber == 6) {
            questionText.setText("Which of these films did not win a record 11 Oscars?");
            firstAnswer2.setText("Titanic");
            secondAnswer2.setText("Ben-Hur");
            thirdAnswer2.setText("Lord of the Rings: The Return of the King");
            forthAnswer2.setText("West Side Story");
            questionNumberText.setText("2");
        }
        if (questionNumber == 7) {
            questionText.setText("Who has hosted the most Academy Awards?");
            firstAnswer2.setText("Bob Hope");
            secondAnswer2.setText("Billy Crystal");
            thirdAnswer2.setText("Whoopi Goldberg");
            forthAnswer2.setText("Johnny Carson");
            questionNumberText.setText("3");
        }
        if (questionNumber == 8) {
            questionText.setText("Who was the first African American to win an Academy Award?");
            firstAnswer2.setText("James Baskett");
            secondAnswer2.setText("Dorothy Dandridge");
            thirdAnswer2.setText(" Hattie McDaniel");
            forthAnswer2.setText("Sidney Poitier");
            questionNumberText.setText("4");
        }
        //Beginning of the third level, a toast saying 'Third Level' will appear
        if (questionNumber == 9) {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast.makeText(context, "Level 3", duration).show();
            questionText.setText("Which film won the 89th Academy Awards(2017)for Best Picture?");
            questionNumberText.setText("1");
            phaseNumberText.setText("3");
        }
        if (questionNumber == 10) {
            questionText.setText("Which film series has won more than one Academy Award for Best Picture?");
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
                resultShow.setText("You need to practise more!");
            }
            if (finalScore >= 3 && finalScore < 7) {
                resultShow.setText("You really know about The Academy Awards!");
            }
            if (finalScore >= 7 && finalScore <= 9) {
                resultShow.setText("Congratulations, you are an expert!");
            }
            if (finalScore == 10) {
                resultShow.setText("WOW! You've just mastered it!");
            }
        }
    }

    //Restart button will start activity_main
    public void restart(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

