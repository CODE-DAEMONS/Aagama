package com.cvsr.admin.aagama.Description;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.cvsr.admin.aagama.R;

/**
 * Created by ADMIN on 3/6/2017.
 */

public class SkillDescription extends Activity {

    TextView tv1,tv;
    String text1,text;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description);
        tv1=(TextView)findViewById(R.id.header);
        tv = (TextView) findViewById(R.id.rules);


        Intent in = getIntent();
        String s = in.getStringExtra("event");
        switch(s) {

            //SKILL ZONE

            case "lazer Trap":
                text1="lazer Trap";
                text="DESCRIPTION:\n" +
                        "\n" +
                        "Laser Trap is an interactive game in which players race against a maze of lasers to reach the end point as quickly as possible, scoring points for speed. The easiest way to understand it is to think of any bank/museum heist movie where the thief has to cross a field of lasers without breaking any of the beams. Same idea. No treasure. Sorry.\n" +
                        "\n" +
                        "RULES:\n" +
                        "\n" +
                        "1.ID card must be carried.\n" +
                        "2.Single player game\n" +
                        "3.Proper discipline should be maintained.\n" +
                        "4.Player should wear laser safety glasses if provided\n" +
                        "\n" +
                        "FEE    :  \n" +
                        "\n" +
                        "100/- Solo\n" +
                        "130/- Duo\n" +
                        "\n" +
                        "CAUTION:\n" +
                        "\n" +
                        "1.Extreme care should be taken while playing as lasers are harmful\n" +
                        "2.Player should not maintain direct eye contact with lasers\n" +
                        "\n" +
                        "STUDENT COORDINATORS:\n" +
                        "\n" +
                        "R.N.SAITEJA\t(7093142994)\tsaiteja.rangi0615@gmail.com\n" +
                        "MANIKANDAN\t(9704167184)\tv.mani1996@gmail.com\n" +
                        "TAFAZUL\t\t(7416246824)\ttafazul29@gmail.com\n" +
                        "RENO\t\t(8897167047)\trenors93@gmail.com\n" +
                        "\n" +
                        "FACULTY COORDINATORS:\n" +
                        "\n" +
                        "1. Mr.G.Balaram\n" +
                        "2. Mr.P.Rajashekhar Reddy\n";
                tv1.setText(text1);
                tv.setText(text);
                break;

            case "Lan Gaming":
                text1="Lan Gaming";
                text="DESCRIPTION:\n" +
                        "\n" +
                        "1.You are responsible for your actions and equipment. We are not liable for anything that happens to you and your equipment.\n" +
                        "2. Do not attempt to steal items from the events or anyone else. Legal cosequences will be there.\n" +
                        "3. Cheating is not tolerated.\n" +
                        "4. Do not bring any type of hacks/viruses to the event.\n" +
                        "5. Listen to those in charge.\n" +
                        "6. We reserve the right to remove anyone from premises for any reason we fit.\n" +
                        "\n" +
                        "STUDENT COORDINATORS:\n" +
                        "\n" +
                        "1. N.Harsha Vardhan-7793989595\n" +
                        "2. V.Vivek-8143567726\n" +
                        "\n" +
                        "FACULTY COORDINATORS:\n" +
                        "\n" +
                        "1. Mr.V.Amarnadh";
                tv1.setText(text1);
                tv.setText(text);
                break;

            case "Blank Coding":
                text1="Blank Coding";
                text="DESCRIPTION:\n" +
                        "\n" +
                        "Here is the time to have a little fun with coding! Participate, test your-selves, strengthen your skills even gain some knowledge and enjoy coding by your own…\n" +
                        "\n" +
                        "RULES:\n" +
                        "\n" +
                        "1. A team shall consist only one person.\n" +
                        "2. The decision of the code-master will be final and will not be subjected to any change.\n" +
                        "3. The participants are prohibited to use paper, pen, pencil, mobile and any other electronic instruments.\n" +
                        "4. The questions (code) will be in the form of basic MATLAB program and simple questions regarding MATLAB code.\n" +
                        "   Audience shall not give any hints or clues to the competitors\n" +
                        "\n" +
                        "NO OF DAYS:\n" +
                        "\n" +
                        "2\n" +
                        "\n" +
                        "STUDENT COORDINATORS:\n" +
                        "\n" +
                        "1. Deepika.G - +918897575827\n" +
                        "2. Raghuram - +919963093711\n" +
                        "3. Adithya.E - +918801508252\n" +
                        "\n";
                tv1.setText(text1);
                tv.setText(text);
                break;

            case "Ideation Contest":
                text1="Ideation Contest";
                text="DESCRIPTION:\n" +
                        "\n" +
                        "Hey guys, it’s time for the young budding engineers to grab the wonderful opportunity and to prove their real time problem solving skills. In this contest the teams participating in this contest are given a real time problem and need to solve the problem with their creative ideas.\n" +
                        "\n" +
                        "RULES:\n" +
                        "\n" +
                        "1. A team shall consist of minimum of two participants and maximum of three participants.\n" +
                        "2. Team members should come up with their own ideas and are not allowed to copy the implemented ideas.\n" +
                        "3. Each any every Participant in the team should need to speak up about their respective ideas.\n" +
                        "4. Mobiles and electronic gadgets are not to be used during this event\n" +
                        "5. Audience should not give their ideas to the participants\n" +
                        "\n" +
                        "NO OF DAYS:\n" +
                        "\n" +
                        "2\n" +
                        "\n" +
                        "STUDENT COORDINATORS:\n" +
                        "\n" +
                        "1. N.Rahul-9603584761\n" +
                        "2. Harshavardhini-9914041320\n" +
                        "3. Himaja-9533945704";
                tv1.setText(text1);
                tv.setText(text);
                break;

            case "Circuitrix":
                text1="Circuitrix";
                text="DESCRIPTION:\n" +
                        "\n" +
                        "An event which tests the very basics of electronics, this is an on the spot event which gives you the opportunity to showcase your skills at designing and implementing electronic circuits. And a little simulation never hurt anybody. All you are required to do is to brush up on your concepts and get ready to unleash your designing skills in the 'CIRCUITRIX' battlefield.\n" +
                        "\n" +
                        "RULES:\n" +
                        "\n" +
                        "· A team shall consists of max two persons.\n" +
                        "· The participants shall not use any mobile or other electronic instruments.\n" +
                        "· The questions shall be in the form of puzzles, analyzing circuits and building circuits.\n" +
                        "· There is time limit for every round. \n" +
                        "· Audience shall not give any hints or clues to the competitors.\n" +
                        "\n" +
                        "NO OF DAYS:\n" +
                        "\n" +
                        "2\n" +
                        "\n" +
                        "STUDENT COORDINATORS:\n" +
                        "\n" +
                        "1· R.Sai Alekhya\n" +
                        "+919704686459\n" +
                        "\n" +
                        "2· Akhila\n" +
                        "+919063779509\n" +
                        "\n" +
                        "3. M.Soumya\n" +
                        "+919640385367";
                tv1.setText(text1);
                tv.setText(text);
                break;

            case "DumbShell Electronics":
                text1="DumbShell Electronics";
                text="DESCRIPTION:\n" +
                        "\n" +
                        "Guys its time to test your electronics grip with lots of fun!! DUMBSHELL ELECTRONICS gives an opportunity to merge your art with electronics..!!\n" +
                        "\n" +
                        "RULES:\n" +
                        "\n" +
                        "1. A team shall consist of three persons.\n" +
                        "2. The participants shall not be allowed to use mobile phones or any other electronic gadgets.\n" +
                        "3. There is a time limit.\n" +
                        "4. Audience shall not give any hints or clues to the competitors.\n" +
                        "5. The decision of the quiz master will be the final and will not be subjected to any changes.\n" +
                        "\n" +
                        "NO OF DAYS:\n" +
                        "\n" +
                        "2\n" +
                        "\n" +
                        "STUDENT COORDINATORS:\n" +
                        "\n" +
                        "1. Ch satyaprasanna-8985419057\n" +
                        "2. Sirisha-7673966641\n" +
                        "3. Geetha-9515394181\n" +
                        "\n";
                tv1.setText(text1);
                tv.setText(text);
                break;

            case "Fastest Typing First":
                text1="Fastest Typing First";
                text="DESCRIPTION:\n" +
                        "\n" +
                        "Fastest typing first is a technique which would improve your accuracy, rhythm,practice.\n" +
                        "This consists of two rounds\n" +
                        "1. Accuracy testing\n" +
                        "2. Speed \n" +
                        "\n" +
                        "RULES:\n" +
                        "\n" +
                        "1. Each person should perform the task individually\n" +
                        "2. The given paragraph consists of punctuations,expression words.\n" +
                        "\n" +
                        "STRUCTURE OF FASTEST TYPING FIRST: \n" +
                        "\n" +
                        "Round 1 - A paragraph with punctuations will be give.\n" +
                        "The person with perfect accuracy will be selected\n" +
                        "\n" +
                        "Round 2-   A paragraph with punctuations and expression words will be given \n" +
                        "The person who types the given paragraph accurately and fastly will be selected\n" +
                        "\n" +
                        "STUDENT COORDINATORS:\n" +
                        "\n" +
                        "1. Sowmya  - 9652251041\n" +
                        "2. Akshita - 8143193479\n";
                tv1.setText(text1);
                tv.setText(text);
                break;

            case "Words Worth":
                text1="Words Worth";
                text="DESCRIPTION:\n" +
                        "\n" +
                        "It’s time to show our hidden talent through which we can have fun and win exclusive prizes. \n" +
                        "\n" +
                        "RULES:\n" +
                        "\n" +
                        "1. Individual participation.\n" +
                        "2. Personal things like mobile phones or any electronic instruments are not allowed.\n" +
                        "3. Time limit for the game is 5mins.\n" +
                        "\n" +
                        "STRUCTURE OF THE GAME:\n" +
                        "\n" +
                        "Game consists of 2 levels. We will give 5 big words on the cards the participants have 5mins time to write as many small words from those big words. This will be repeated for 2 rounds the one with highest word count of legitimate words  wins. The participants who score more number of words in first level they will be selected for next level.\n" +
                        "Levels\n" +
                        "Level 1 : Moderate\n" +
                        "Level 2 :Substantial\n" +
                        " \n" +
                        "STUDENT COORDINATORS:\n" +
                        "1. V. Tejasri :+918179759026\n" +
                        "2. B. Pavani :+919848552014\n" +
                        "\n";
                tv1.setText(text1);
                tv.setText(text);
                break;

            case "Quick CADD":
                text1="Quick CADD";
                text="DESCRIPTION:\n" +
                        "\n" +
                        "This  is a platform where participants are given hardcopy of a building plan which they have to digitalize using Auto CAD software.\n" +
                        "\n" +
                        "RULES AND REGULATIONS:\n" +
                        "\n" +
                        "1. Time limit  is  30 min.\n" +
                        "2. Team consists of minimum of 1 participant .\n" +
                        "3. No audience participation.\n" +
                        "4. No extra time will be given.\n" +
                        "5. Any malpractice like usage of internet or copying is strictly prohibited.\n" +
                        "\n" +
                        "STRUCTURE OF CADD:\n" +
                        "\n" +
                        "Based on time limit with given dimensional rules.\n" +
                        "\n" +
                        "STUDENT CO-ORDINATOR:\n" +
                        "\n" +
                        "1.M.VANI -8341380536\n" +
                        "2.B.SARITHA-9010191374\n";
                tv1.setText(text1);
                tv.setText(text);
                break;

            case "Model Making":
                text1="Model Making";
                text="DESCRIPTION:\n" +
                        "\n" +
                        "The art of model making is to show case your skills of assuming and creating a 3D model from a 2D design.The main aim of this event is to provide students with some general advice on how to produce informative and architectural models.The important thing is to start with a clear purpose to your architectural model and then work out on what sort of model will be the best to achieve your goal.\n" +
                        "\n" +
                        "RULES:\n" +
                        "\n" +
                        "1. Time based event.\n" +
                        "2. Two participants for team.\n" +
                        "3. Minimum of two levels.\n" +
                        "4. Charges apply.\n" +
                        "\n" +
                        "NO OF DAYS:\n" +
                        "\n" +
                        "2 DAYS\n" +
                        "\n" +
                        "STUDENT COORDINATORS:\n" +
                        "\n" +
                        "1. S JUSH KUMAR\n" +
                        "Aagama2k17mech@cvsr.ac.in\n" +
                        "9666335222\n" +
                        "\n" +
                        "2. ANUP KASHYAP \n" +
                        "Aagama2k17mech@cvsr.ac.in\n" +
                        "8179042167\n" +
                        "\n" +
                        "3. JAYESH\n" +
                        "4. ANUSHA\n" +
                        "5. SAHITHI\n" +
                        "6. RACHANA\n" +
                        "7. DEWANJAN\n" +
                        "8. CH. VINEETH\n" +
                        "\n" +
                        "NO OF TEAMS:\n" +
                        "\n" +
                        "50 TEAMS\n" +
                        "\n" +
                        "COST:\n" +
                        "\n" +
                        "60/- PER TEAM OF 2\n";
                tv1.setText(text1);
                tv.setText(text);
                break;

            case "Cosplay AD":
                text1="Cosplay AD";
                text="DESCRIPTION:\n" +
                        "\n" +
                        "Ever wanted to act and make an Ad ?\n" +
                        "Have a better idea on how attractive an AD could be ?\n" +
                        "Are you creative enough to make and break your Ad? Then this event is exclusively for you !\n" +
                        "\n" +
                        "STRUCTURE OF THE EVENT:\n" +
                        "\n" +
                        "Students are made to cosplay their favourite super heroes (some costumes will be provided, else students can get their own costumes if they want to). The Ads can be funny and creative(spoofs are also encouraged).\n" +
                        "\n" +
                        "RULES: \n" +
                        "\n" +
                        "1. A product is given to students of 4 per team.\n" +
                        "2. Concept and content should be decided for the Ad as per limits of time.\n" +
                        "3. The best add will be the winner and will be rewarded with complementary prizes aswell.\n" +
                        "4. Participants will be provided with certificate.\n" +
                        "\n" +
                        "NO OF DAYS:\n" +
                        "\n" +
                        "2 DAYS\n" +
                        "\n" +
                        "STUDENT COORDINATORS:\n" +
                        "\n" +
                        "1. SWETHA\n" +
                        "Aagama2k17mech@cvsr.ac.in\n" +
                        "8374143509\n" +
                        "\n" +
                        "2. VIKASA\n" +
                        "Aagama2k17mech@cvsr.ac.in\n" +
                        "7032396965\n" +
                        "\n" +
                        "3. MANISH\n" +
                        "4. SHRAVYA\n" +
                        "5. THARUN\n" +
                        "\n" +
                        "EXPECTED NO OF PARTICIPANTS:\n" +
                        "\n" +
                        "30 TEAMS\n" +
                        "\n" +
                        "COST:\n" +
                        "\n" +
                        "70/- PER HEAD \n";
                tv1.setText(text1);
                tv.setText(text);
                break;

            case "Arm Wrestling":
                text1="Arm Wrestling";
                text="RULES:\n" +
                        "\n" +
                        "1. Both players must be square to the arm wrestling table prior to the starting of a given match\n" +
                        "2. At the start of a game, both players’ shoulders should not be less than a fist distance apart from their hands\n" +
                        "3. Players must start after they hear ‘Ready and Go”\n" +
                        "4. You cannot touch your body with any of your hands during a competition\n" +
                        "5. If you commit a foul three times, you will be disqualified from the match\n" +
                        "6. For whatever reason the grip falls apart, the grip is placed in its right alignment again\n" +
                        "7. If any of the player’s position is such that his arm can hurt or break, the referee can stop the match right away and rule it as a foul\n" +
                        "8. The arm wrestling match should be started with one foot on ground. Once you hear ‘go’, you can lift your feet from the ground\n" +
                        "9. For any unsportsmanlike conduct, the referee can give a disciplinary foul\n" +
                        "10. False starting the match will result in a foul\n" +
                        "11. All decision made by the referee are final\n" +
                        "\n" +
                        "NUMBER OF DAYS OF EVENT: \n" +
                        "\n" +
                        "17 & 18 March 2017\n" +
                        "\n" +
                        "STUDENT COORDINATOR:\n" +
                        "\n" +
                        "1. Sai Nath: 7207124417\n" +
                        "2. Susheel: 8374505013\n";
                tv1.setText(text1);
                tv.setText(text);
                break;

            case "Treasure Hunt":
                text1="Treasure Hunt";
                text="RULES:\n" +
                        "\n" +
                        "1. The Treasure Hunt consists of number of clues, each one leading to one or more treasures.\n" +
                        "2. At each treasure location, except as noted in rule #3, there are four slips of paper –one of each team's color. Find your team's colored treasure and turn it in at yourteam's headquarters. Then turn in the treasure at Treasure Hunt headquarters and tell which clue led you to that treasure. If you correctly match treasure and clue, your team will be awarded the points for that clue. Each team is allowed only three guesses at which clue a given treasure matches; after the third incorrect guess, the treasure is discarded. All treasures have been marked for identification, but these markings are generally insignificant to teams. The treasures with significant markings, such as those for clue #30, will always be identified in the clues.\n" +
                        "3. The points awarded for clue #50 are not necessarily dependent on the handing in of\n" +
                        "colored pieces of paper. Treasures associated with clue #30 are marked with letters to be exchanged for the correspondingly-lettered word clues for the double crostic.\n" +
                        "4. Turn in all treasures as soon as possible. Your team may discover a paper from a previous year, which would be worthless. There may also be a number of spurious treasures planted in likely locations to discourage teams from hoarding treasures. Upon turning in a worthless treasure, your team will be told that it is worth no points. There is no penalty for this\n" +
                        "5 . Any treasure that is indistinct in marking may be exchanged for a new copy.\n" +
                        "6. The designated lifeguard from each team must supervise all swim periods.\n" +
                        "7. Never tamper with another team's treasure. When you pick up your own team's treasure at a location, leave the other treasures hidden there exactly as you found them. A violation of this rule could cost your team the Treasure Hunt.\n" +
                        "8. Do not search for clues in off-limit areas or at another team's headquarters. If you move anything to search an area, put it back the way it was before you leave. No clues have been hidden in woodpiles, rock walls, etc., and no structure should be dismantled. Team captains should make this very clear to their rookie searchers.\n" +
                        "9. In the interest of fairness to all teams, computers and IT devices of any kind must be\n" +
                        "strictly off limits during the Treasure Hunt. Consequently, camp and personal phones\n" +
                        "may not be used during the Hunt. You must rely on your team members only.\n" +
                        "10. Team captains are responsible for seeing that their headquarters are cleaned and\n" +
                        "restored to their original condition.\n" +
                        "\n" +
                        "NUMBER OF DAYS OF EVENT:\n" +
                        "\n" +
                        "One day: 17 March 2017\n" +
                        "\n" +
                        "STUDENT COORDINATOR:\n" +
                        "\n" +
                        "1. Naresh: 9951098411\n" +
                        "2. Vaishnavi: 9676684512\n";
                tv1.setText(text1);
                tv.setText(text);
                break;


        }
        }


}
