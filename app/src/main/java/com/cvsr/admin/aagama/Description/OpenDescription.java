package com.cvsr.admin.aagama.Description;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.cvsr.admin.aagama.R;

/**
 * Created by ADMIN on 3/6/2017.
 */

public class OpenDescription extends Activity{
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


            case "App Challenge":
                text1="App Challenge";
                text="DESCRIPTION:\n" +
                        "\n" +
                        "In this event the participants must provide a solution to the real time problems. Prototype should be given for the application that they want to develop. Their idea can be presented using Microsoft power-point (2007,2010). \n" +
                        "Coding knowledge is not required.\n" +
                        "\n" +
                        "RULES:\n" +
                        "\n" +
                        "1. The prototype should not contain any content that is inappropriate.\n" +
                        "2. The content must not be copied from any websites and any false information leads to team elimination.\n" +
                        "3. The idea and prototype should not be modified once it is presented.\n" +
                        "4. Come along with your abstract (hard and soft copy).\n" +
                        "5. Presentation is to be carried in pendrives only.\n" +
                        "6. There can be 1 or 2 members per team.\n" +
                        "7. Best idea presented will be awarded.\n" +
                        "\n" +
                        "COST: \n" +
                        "\n" +
                        "50/- per head\n" +
                        "\n" +
                        "STUDENT COORDINATOR:\n" +
                        "\n" +
                        "1. K.Yamini -9490667411\n" +
                        "2. M.Pravalika-8008421764\n" +
                        "3. A.Arundhathi-9553832037\n" +
                        "\n" +
                        "FACULTY COORDINATORS:\n" +
                        "\n" +
                        "1. Mr.B.Ravinder Reddy\n" +
                        "2. Mrs.S.Deepika\n";
                tv1.setText(text1);
                tv.setText(text);
                break;

            case "All Round Quiz":
            text1="All Round Quiz";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "It’s high time to get into real time world awareness of what happening around you...come on test your general knowledge skills !!!\n" +
                    "This quiz consists of questions on \n" +
                    "1. General Knowledge\n" +
                    "2. Current Affairs\n" +
                    "3. Science & Technology\n" +
                    "4. Movies, Music & Pop Cultures\n" +
                    "5. Riddles & Brain Teasers                 \n" +
                    "\n" +
                    "RULES:\n" +
                    "\n" +
                    "1. A team shall consist of max two persons or min one person\n" +
                    "2. The decision of the quiz-master will be final and will not be subjected to any change.\n" +
                    "3. The participants shall not be allowed to use mobile or other electronic instruments.\n" +
                    "4. The questions shall be in the form of multiple choice or Specific-answer question etc.\n" +
                    "5. Audience shall not give any hints or clues to the competitors.\n" +
                    "\n" +
                    "STRUCTURE OF THE QUIZ:\n" +
                    "\n" +
                    "Initial Screening : A Total of 15 questions are put forth to all the participants in which the top 4 high performed teams will be qualified to the further Stage Round. \n" +
                    "Stage Rounds : Stage Rounds consists of total 4 Rounds.\n" +
                    "Round 1  (General knowledge, Current affairs)\n" +
                    "Round 2  (Movies, Music & Pop culture)\n" +
                    "Round 3  (Science & Technology and Riddles)\n" +
                    "Final round (Team choice)\n" +
                    "\n" +
                    "STUDENT COORDINATORS:\n" +
                    "\n" +
                    "1. Nithin-8179956201\n" +
                    "2. Preeti Padal-9704105197\n" +
                    "3. R.Ramu-9640216151\n" +
                    "\n" +
                    "FACULTY COORDINATORS:\n" +
                    "\n" +
                    "1. Mrs.V.Jyothi\n" +
                    "2. Mr.Ravindra naik\n";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "4-Pics-1-Word":
            text1="4-Pics-1-Word";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "Minimum: 2 per team\n" +
                    "Event Description: There are 3 levels\n" +
                    "\n" +
                    "Level 1:\n" +
                    "1. Once you start the game, you will be shown a screen with 4 pictures\n" +
                    "2. These 4 pictures, each have something in common\n" +
                    "3. The participant has to guess the word from the pictures\n" +
                    "Number of Questions: 10\n" +
                    "Time Limit: 30 seconds (for each)\n" +
                    "\n" +
                    "Level 2:\n" +
                    "1. It is just like a crossword puzzle.\n" +
                    "2. A sentence or question will be given and the answer is hidden within the puzzle.\n" +
                    "3. The participant needs to know the answer and find the answer within the stipulated time.\n" +
                    "Number of Questions: 5\n" +
                    "Time Limit: 45 seconds (for each)\n" +
                    "\n" +
                    "Level 3:\n" +
                    "1. It is about finding out the missing letters using the hint provided.\n" +
                    "2. The participant needs to complete the given word within the time.\n" +
                    "Number of Questions: 3\n" +
                    "Time Limit: 1 minute (for each)\n" +
                    "\n" +
                    "NOTE:\n" +
                    " \n" +
                    "1. Upon the completion of first level, only the shortlisted candidates will be promoted to next level and so on. \n" +
                    "2. Winners will be decided based on the scores and certificates are provided to them\n" +
                    "\n" +
                    "REGISTRATION FEE: \n" +
                    "\n" +
                    "40/-\n" +
                    "\n" +
                    "STUDENT COORDINATORS:\n" +
                    "\n" +
                    "1. E.Usha-7893569140\n" +
                    "2. P.Deepika-8179850690\n" +
                    "3. P.Swetha-7659074331\n" +
                    "\n" +
                    "FACULTY COORDINATORS:\n" +
                    "\n" +
                    "1. Mrs.G.Sudeepthi\n" +
                    "2. Mr.K.Raghavendra rao\n";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Minute  To Win It":
            text1="Minute  To Win It";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "It’s a time to show your hidden talent in technical (coding) and non-technical (game zone) through which you can have fun and win exclusive prizes.\n" +
                    "The quiz consists of \n" +
                    "1. Technical (coding)\n" +
                    "2. Non-technical (game zone)\n" +
                    "\n" +
                    "RULES:\n" +
                    "\n" +
                    "1. A team shall consist of two members.\n" +
                    "2. Once the team members are finalized no changes will be made further.\n" +
                    "3. The participants will not be allowed to use mobile phones.\n" +
                    "4. Complexity of questions will increase level by level.\n" +
                    "\n" +
                    "Structure of the game:\n" +
                    "The game consists of 5 levels of Technical and Non-Technical Levels\n" +
                    "1. Simple\n" +
                    "2. Easy\n" +
                    "3. Medium\n" +
                    "4. Tough\n" +
                    "5. Complex\n" +
                    "\n" +
                    "STUDENT COORDINATORS:\n" +
                    "\n" +
                    "1. R.Roja Romani- 9700819970\n" +
                    "2. A.Kaveri -7729091462\n" +
                    "3. P.umeshchandra-9866239639\n" +
                    "\n" +
                    "FACULTY COORDINATORS:\n" +
                    "\n" +
                    "1. Mrs.G.Lavanya\n" +
                    "2. Mr.A.Jeeshitha\n";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Cyber Chase":
            text1="Cyber Chase";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "My dear amigos and amigas,fortune awaits you.. Come and grab at this wonderful fiesta \n" +
                    "CYBER CHASE has: Exciting gifts waiting for the WINNER!! \n" +
                    "\n" +
                    "RULES: \n" +
                    "\n" +
                    "1. Each contestant will be provided a computer. \n" +
                    "2. Contestant, once sets out to start the event, is not permitted to leave the premises until his task is finished. \n" +
                    "\n" +
                    "STRUCTURE OF THE EVENT :\n" +
                    "\n" +
                    "1. Each contestant is given a computer where file folders are to be examined. \n" +
                    "2. Each folder may have sub folders depending upon the complexity of the level. \n" +
                    "3. Upon rummaging, he finds a text file that has the actual question, a hint for that question and the key to the question.\n" +
                    "4. The key is the path for the solution.\n" +
                    "5. Following those constraints participants are selected for the final round. \n" +
                    "\n" +
                    "STUDENT COORDINATORS:\n" +
                    "\n" +
                    "1. Ch.Harika – 8801122029\n" +
                    "2. A.Sanjana- 8121502639\n" +
                    "3. K.Shamanthaka Mani-9063748493\n" +
                    "4. J.Reena reddy-9440682159\n" +
                    "\n" +
                    "FACULTY COORDINATORS:\n" +
                    "\n" +
                    "1. Mrs.P.Rajeswhari\n" +
                    "2. Mrs.P.Vinay sree\n";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Check Your IQ":
            text1="Check Your IQ";
            text="STUDENT COORDINATORS:\n" +
                    "\n" +
                    "K.Ramya-9490827927\n" +
                    "\n" +
                    "FACULTY COORDINATORS:\n" +
                    "\n" +
                    "1. Mr.A.Obulesh\n" +
                    "2. Mr.A.Mallikarjuna Reddy\n";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "R.C.Racing":
            text1="R.C.Racing";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "Create your remote vehicles, customize them and race your remote vehicles to the finish line. Get ready for the action to beat your opponents and set track records. Remote control your vehicles and monitor their progress on a field track. Add custom components to your vehicle and raise your game. Speed, throttle, smash, dash, crash and still make it to the finish line ahead of everyone.\n" +
                    "This game requires technical knowledge, engineering, customization, equipment and racing skill on different tarmacs. If you have what it takes to be a remote vehicles race, here are tracks for you to set afire!\n" +
                    "\n" +
                    "RULES:\n" +
                    "\n" +
                    "1. The teams will get to use the track only during the time of their practice slot. \n" +
                    "2. Any team that is not ready at the time slot given to them will be eliminated from the competition automatically.\n" +
                    "3. The Maximum voltage input to the car at any point of race should not exceed more than 12Volts\n" +
                    "5. Only Electronic (Battery powered) cars are allowed.   \n" +
                    "6. Assembled cars are more preferred than ready-made cars \n" +
                    "7. No re-match will be held for the second time.\n" +
                    "8. The cars should not leave any loose parts or debris on any part of the circuit. Any car or part falling apart during the race will be disqualified.\n" +
                    "9. Teams are not allowed to damage the opponent's car on purpose. If found doing so on track (while racing), the concerned team will be disqualified.\n" +
                    "10. Touch Penalty: Each time the car gets struck or gets repaired - A team is allowed to touch the car 2 times without touch penalty. If the car is touched by the team members more than 2 times - A touch penalty of 3 seconds will be booked.\n" +
                    "11. The organizing committee reserves all the rights to change the rules and formats at any time during the event\n" +
                    "\n" +
                    "NO OF DAYS:\n" +
                    "\n" +
                    "1\n" +
                    "\n" +
                    "STUDENT COORDINATORS:\n" +
                    "\n" +
                    "1. Abhijit Kartik\n" +
                    "9493811800\n" +
                    "\n" +
                    "2. Durga Pradeep\n" +
                    "9908426081\n" +
                    " \n" +
                    "3. Pravalika\n" +
                    "9505213099\n" +
                    "\n" +
                    "4. Sandeep Reddy\n" +
                    "9133704945";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Junk Yard":
            text1="Junk Yard";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "Do you believe that fun can be found from junk? Funk From Junk gives an opportunity to CRAZ'C student to showcase their technical wackiness combined with the old fashioned tricks to strengthen their understanding with their teammates..!!!\n" +
                    "\n" +
                    "RULES:\n" +
                    "\n" +
                    "1. A team shall consist of max two persons or min one person.\n" +
                    "2. The decision of the quiz master will be the final and will not be subjected to any changes.\n" +
                    "3. The participants shall not be allowed to use mobile or other electronic instruments.\n" +
                    "4. The questions will be in the form of circuit diagram pictures.\n" +
                    "5. Audience shall not give any hints or clues to the competitors.\n" +
                    "\n" +
                    "NO OF DAYS:\n" +
                    "\n" +
                    "2\n" +
                    "\n" +
                    "STUDENT COORDINATORS:\n" +
                    "\n" +
                    "1. Lalithya-8019375085\n" +
                    "2. Kavya-78422422423\n" +
                    "3. Karuna-9160358553";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Ram and Rom":
            text1="Ram and Rom";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "Guys interested to test your memory with lots of fun and enjoyment!! Then hurry-up,its time to take part in this event- RAM AND ROM.Its a challenging event where you can test your knowledge and improve your technical skills…!!!\n" +
                    "\n" +
                    "RULES:\n" +
                    "\n" +
                    "1. A team shall consist of maximum two or minimum one person.\n" +
                    "2. The participants shall not be allowed to use mobile phones or any other electronic gadgets.\n" +
                    "3. Audience shall not give any hints or clues to the competitors.\n" +
                    "\n" +
                    "NO OF DAYS:\n" +
                    "\n" +
                    "2\n" +
                    "\n" +
                    "STUDENT COORDINATORS:\n" +
                    "\n" +
                    "1.    P.Manasa-9573557348\n" +
                    "2.    K.Rajkumar-8523858566\n" +
                    "3.    P.Naveen-7730836742";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Puzzle":
            text1="Puzzle";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "Are you a technical person as well as passionate about solving a puzzle with fun, then it’s your time.\n" +
                    "Come join us and find your way to solve the puzzle..!! \n" +
                    "\n" +
                    "STRUCTURE OF THE PUZZLE:\n" +
                    "\n" +
                    "The event will consist of three rounds: The initial round, the preliminary round and The Finals. The strength of the team must be 2 members.\n" +
                    "\n" +
                    "Round 1(Initial round):\n" +
                    "This is the initial round where you will be shown symbols of some electrical and electronics components . The participants will have to answer the symbols shown to them. They will be given 20 minutes to answer the questions and the teams who reach the target will qualify for the next round.\n" +
                    "\n" +
                    "Round 2(Preliminary round):\n" +
                    "This is a buzzer round .In this round, teams will be shown pictorial representations which will have some missing blanks as well as jumbled pictures .Participants should answer these questions as fast as possible. If a team fails to tell the answer, the question is moved to next team. Participants will have 20 minutes in their hand. Qualified teams will move to final round.\n" +
                    "\n" +
                    "Round 3(Finals):\n" +
                    "This is the final round where selected teams will be given a set of jumbled circuit. Team should arrange the circuit correctly. Teams will have exactly a time limit of 5 minutes. Teams who shows the corrected circuit as well as output are winners.\n" +
                    "\n" +
                    "RULES:\n" +
                    "\n" +
                    "1. Any student within the age group of 14- 25 years can participate and each team should consist of not more than two members.\n" +
                    "2. Use of mobile phones or any other electronic or communication device is prohibited during the event.\n" +
                    "3. Participants should carry their college or school ID cards.\n" +
                    "4. Organizers reserve the right to disqualify teams on the grounds of misbehavior and use of unfair means. Their decision is considered final and not subjected to dispute.\n" +
                    "\n" +
                    "FACULTY COORDINATOR:\n" +
                    "\n" +
                    "1. M.SREEKAR  -8978250125\n" +
                    "2. YAKUB ALI    \n" +
                    "\n" +
                    "STUDENT COORDINATORS:\n" +
                    "\n" +
                    "1. A.SINDHURI (9396515834)\n" +
                    "2. P.SUMAN (8186572714)\n";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "JAM":
            text1="JAM";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "An event which drives out Stage fear as well as brings out Leadership skills with fun and knowledge..!! .\n" +
                    "\n" +
                    "STRUCTURE OF THE GAME:\n" +
                    "\n" +
                    "The event will consist of two rounds: The Preliminary round and The Finals. The strength of the team must be 2 members.\n" +
                    "Round 1(Preliminary round):\n" +
                    "In this round, team needs to pitch on the topic which is selected by them in just one minute. \n" +
                    "Teams who reached the benchmark of judges will be moved to next round.\n" +
                    "Round 2(Finals):\n" +
                    "In this round, teams need to pick one chit from group of chits. Team will be given 10 minutes to discuss about the topic about the topic. Team needs to pitch about the topic in just one minute. Team which performs good and meets the requirements are winners. \n" +
                    "\n" +
                    "RULES:\n" +
                    "\n" +
                    "1. Any student within the age group of 14- 25 years can participate and each team should consist of not more than three members.\n" +
                    "2. Use of mobile phones or any other electronic or communication device is prohibited during the event.\n" +
                    "3. Participants should carry their college or school ID cards.\n" +
                    "4. Organizers reserve the right to disqualify teams on the grounds of misbehavior and use of unfair means. Their decision is considered final and not subjected to dispute.                              5. Teams exceeding the time limit are liable for disqualification.\n" +
                    "\n" +
                    "FACULTY COORDINATOR:\n" +
                    "\n" +
                    "1. MD.YASEEN (9866432512)\n" +
                    "2. K.CHAITANYA KUMARB (9390632732)\n" +
                    "\n" +
                    "STUDENT COORDINATORS:\n" +
                    "\n" +
                    "1. P.MOUNIKA (9160266700)\n" +
                    "2. G.SRAVAN (9666281505)\n";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Innovatia":
            text1="Innovatia";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "This event consists of total 3 rounds.\n" +
                    "\n" +
                    "ROUND 1:\n" +
                    "1. The students are divided into groups of 3 or 4, depending on their convenience.\n" +
                    "2. Each team is given a prop of their own and they are supposed to write 5 best ideas.\n" +
                    "\n" +
                    "ROUND 2:\n" +
                    "1. In this round their papers are interchanged with other teams\n" +
                    "2. They have to find flaws in one of the ideas of the papers they received, and justify the mistake.\n" +
                    "\n" +
                    "ROUND 3:\n" +
                    "1. The students now get back their papers and they should rectify and improve the flaw.\n" +
                    "\n" +
                    "RULES:\n" +
                    "\n" +
                    "1. Any student within the age group of 14- 25 years can participate and each team should consist of not more than three members.\n" +
                    "2. Use of mobile phones or any other electronic or communication device is prohibited during the event.\n" +
                    "3. Participants should carry their college or school ID cards.\n" +
                    "4. Organizers reserve the right to disqualify teams on the grounds of misbehavior and use of unfair means. Their decision is considered final and not subjected to dispute.\n" +
                    "5. Teams exceeding the time limit are liable for disqualification.\n" +
                    "\n" +
                    "FACULTY COORDINATORS:\n" +
                    "\n" +
                    "1. B.NAGESHWAR RAO - 8978138142\n" +
                    "2. K.BHADRAJI - 9618041897\n" +
                    "\n" +
                    "STUDENT COORDINATORS:\n" +
                    "\n" +
                    "1. T.AKANKSHA             -8309409710\n" +
                    "2. M.BHARATH REDDY- 7093754865";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Virtual Job Fair":
            text1="Virtual Job Fair";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "This is a platform where you can experience and improve your knowledge and skills.\n" +
                    "This event consists of 3 rounds\n" +
                    "1. Aptitude Test\n" +
                    "2. Group Discussion\n" +
                    "3. HR Round\n" +
                    "\n" +
                    "RULES:\n" +
                    "\n" +
                    "1. A person should individually participate.\n" +
                    "2. The Participant will not be allowed to use mobile or other electronic instruments.\n" +
                    "3. The Questions will be in the form of multiple choice questions.\n" +
                    "\n" +
                    "STRUCTURE OF VIRTUAL JOB FAIR:\n" +
                    "\n" +
                    "1. Round 1 (Aptitude test)-A total of 30 aptitude questions are given. The top 40% members will be qualified to the next round.\n" +
                    "2. Round 2 (Group Discussion)-Conducted by the HR. The selected candidates will be qualified for next round.  \n" +
                    "3. Round 3(HR round)-personal interview with HR. \n" +
                    "\n" +
                    "STUDENT COORDINATORS:\n" +
                    "\n" +
                    "1. R.Yogitha:9866660636\n" +
                    "2. K.Sanjay: 8686863359\n" +
                    "3. G.Adithya: 9618031208\n" +
                    "4. Praneeth:9505724742\n";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Model Making":
            text1="Model Making";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "In this Event , All the participants  have to prepare  any civil structure of their own wish with in a stipulated time period . It is an ultimate opportunity for everyone to exhibit their architectural skills. \n" +
                    "\n" +
                    "RULES AND REGULATIONS:\n" +
                    "\n" +
                    "1. COLLEGE ID IS MANDATORY.\n" +
                    "2. MATERIAL WILL BE PROVIDED.\n" +
                    "3. EACH TEAM COMPRISES MAXIMUM OF 3 MEMBERS.\n" +
                    "4. TIME LIMIT WILL BE GIVEN AND MUST BE PREPARED WITHIN THE LIMIT.\n" +
                    "5. OTHER MATERIALS WILL NOT BE ALLOWED.\n" +
                    "6. BEST MODELS AMONG ALL WILL BE AWARDED.\n" +
                    "\n" +
                    "STRUCTURE :\n" +
                    "\n" +
                    "Straws  and use and thrown  glass material will be given  to make their model.\n" +
                    "\n" +
                    "STUDENT CO-ORDINATORS:\n" +
                    "\n" +
                    "1. SPANDANA  - 8341803439\n" +
                    "2. AIJAZ KHAN  -9160255129";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Memory Game":
            text1="Memory Game";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "In this event ,all the technical and general things are displayed  one by one infront of participants and they have to list out the same as per their memory thereafter .\n" +
                    "\n" +
                    "RULES AND REGULATIONS:\n" +
                    "\n" +
                    "1. 5 minutes to observe the displayed things.\n" +
                    "2. 5 minutes to list  out   the displayed things.\n" +
                    "3. No audience.\n" +
                    "4. Individual performance.\n" +
                    "5. Malpractice is strictly prohibited.\n" +
                    "\n" +
                    "STRUCTURE:\n" +
                    "\n" +
                    "The things will be displayed and participant have to list out the maximum number of things displayed.\n" +
                    "\n" +
                    "STUDENT CO-ORDINATORS:\n" +
                    "\n" +
                    "1. MAMATHA.E-965250252\n" +
                    "2. C.DEEPTHI     -950591643";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Poster Presentation":
            text1="Poster Presentation";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "THE POSTER –A Special form of presentation which speaks itself. The poster should be able to stand on its own as a clear, without any explanation from you.\n" +
                    "THEME:  BEST OUT OF WASTE\n" +
                    "\n" +
                    "RULES AND REGULATIONS:\n" +
                    "\n" +
                    "1. COLLEGE ID IS MANDATORY\n" +
                    "2. EACH POSTER SHOULD be made according to the theme.\n" +
                    "3. Participants should only convey the message visually.\n" +
                    "4. ALL POSTER PRESENTERS SHOULD BE PRESENT ON THE FIRST DAY\n" +
                    "5. EACH TEAM COMPRISES OF MAXIMUM 2 MEMBERS\n" +
                    "\n" +
                    "STRUCTURE:\n" +
                    "\n" +
                    "Poster should be presented according to the theme given.\n" +
                    "\n" +
                    "STUDENT CO-ORDINATOR:\n" +
                    "\n" +
                    "1. R.SHARATH REDDY-8464805147\n" +
                    "2. NAVEEN KUMAR-8790305229";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Sketch Up":
            text1="Sketch Up";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "The people who  shape  the physical world\n" +
                    "\n" +
                    "RULES AND REGULATIONS\n" +
                    "\n" +
                    "1. Team must be 2 participants\n" +
                    "2. Time limit will be there\n" +
                    "3. Skill should be needed\n" +
                    "4. Accuracy of sketch\n" +
                    "\n" +
                    "STRUCTURE:\n" +
                    "\n" +
                    "One member should be  given instructions other member should be sketchup the given theme\n" +
                    "\n" +
                    "STUDENT CO-ORDINATERS:\n" +
                    "\n" +
                    "1. K VINAY BABU-8143309392\n" +
                    "2. N SHRAVYA-7032678236";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Invasion":
            text1="Invasion";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "Come on everyone let's Invest our time in making a memorable day. Let's get into deep awareness about our surroundings... \n" +
                    "Come on let's test our General knowledge skills...! and crank each level with anxiety and more fun.\n" +
                    "\n" +
                    "The levels goes like this\n" +
                    "Level 1\t:-  Quixotic questions based on General knowledge and latest news around the world\n" +
                    "                    (Multiple choice and some direct answering)\n" +
                    "Level 2 :-  Dumb charades based on physical components, science,things(or) objects and shapes\n" +
                    "Level 3 :-  Identifying blurred images which may include logos, Brand names etc\n" +
                    "Final Round :- Surprise quest\n" +
                    "\n" +
                    "RULES:\n" +
                    "\n" +
                    "• A team shall consist of maximum two persons and minimum one person\n" +
                    "• Participants are not allowed to use mobiles and electronic devices in between\n" +
                    "• Dumb charades have time limit of 5 minutes\n" +
                    "Note:-  Fees and registration can be applied on spot (for visitors )\n" +
                    "\t\n" +
                    "NO OF DAYS OF EVENT:\n" +
                    "\n" +
                    "2 DAYS\n" +
                    "\n" +
                    "STUDENT COORDINATORS:\n" +
                    "\n" +
                    "1. CHINNA SRINIVAS RAO\n" +
                    "Aagama2k17mech@cvsr.ac.in\n" +
                    "8886167028\n" +
                    "\n" +
                    "2. G VARUN\n" +
                    "Aagama2k17mech@cvsr.ac.in\n" +
                    "9849910824\n" +
                    "\n" +
                    "3. SWATHI PRIYA\n" +
                    "4. SAI SUMA\n" +
                    "5. SHIVA KUMAR\n" +
                    "6. TARUN\n" +
                    "\n" +
                    "EXPECTED PARTICIPANTS:\n" +
                    "\n" +
                    "50\n" +
                    "\n" +
                    "COST PER TEAM:\n" +
                    "\n" +
                    "NA";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Velocity":
            text1="Velocity";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "This is a technical event which is based on assembly and disassembly of  mechanical  components  which will be provided. It is a time based event.                        \n" +
                    "\n" +
                    "RULES:\n" +
                    "\n" +
                    "· Two persons per each team.\n" +
                    "· Minimum of two levels.\n" +
                    "· Complexity of components will increase as level increases.\n" +
                    "· Entry fee of 40 for each team.\n" +
                    "\n" +
                    "NO OF DAYS:\n" +
                    "\n" +
                    "2 Days\n" +
                    "\n" +
                    "STUDENT COORDINATORS:\n" +
                    "\n" +
                    "1. CHAITANYA KRISHNA\n" +
                    "Aagama2k17mech@cvsr.ac.in\n" +
                    "9502102774\n" +
                    "\n" +
                    "2. BHANU PRAKASH\n" +
                    "Aagama2k17mech@cvsr.ac.in\n" +
                    "9848638898\n" +
                    "\n" +
                    "3. MANOHAR\n" +
                    "4. ISMAIL\n" +
                    "5. ASIF\n" +
                    "6. THIRMAL RAO\n" +
                    "7. SANKEERTHAN SHARMA\n" +
                    "8. R.AKHIL\n" +
                    "9. V.SHARANYA\n" +
                    "\n" +
                    "EXPECTED PARTICIPANTS:\n" +
                    "\n" +
                    "50 TEAMS\n" +
                    "\n" +
                    "COST:\n" +
                    "\n" +
                    "40/- PER TEAM OF 2\n";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Minute To Win It":
            text1="Minute To Win It";
            text="RULES:\n" +
                    "\n" +
                    "1. All decisions by the judges and sponsors are final.                                           \n" +
                    "2. Each team of 2will be given 2 lifes\t\t\t\t\t\t\t                                   \n" +
                    "3. Cash prizes will be awarded to the winner\n" +
                    "4. For individual challenges, any member of the team can be selected to\n" +
                    "complete the challenge. If they fail and the team has a life left, then the\n" +
                    "same person or any other team member can be selected for the next attempt.  5) If a team is found to be cheating in any way to complete a challenge, they will be automatically eliminated from the entire competition.  6) “You have a Minute to win it.” Have fun and good luck.\n" +
                    "        \n" +
                    "CONTACT THROUGH GMAIL:\n" +
                    "\n" +
                    "aagama2k17pharmacy@cvsr.ac.in\n" +
                    "\n" +
                    "STUDENT CO- ORDINATOR:\n" +
                    "\n" +
                    "1. LALITHA- 8143255829 \n" +
                    "2. MAHESH -9441705148\n";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Second To Say":
            text1="Second To Say";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "It is a fun zone where you have to be very spontaneous , alert . \n" +
                    "\n" +
                    "NUMBER OF DAYS OF EVENT: \n" +
                    "\n" +
                    "One day: 17 March 2017\n" +
                    "\n" +
                    "STUDENT COORDINATOR:\n" +
                    "\n" +
                    "Sowjanya: 8106560181\n";
            tv1.setText(text1);
            tv.setText(text);
            break;


            case "Tug Of War":
            text1="Tug Of War";
            text="RULES:\n" +
                    "\n" +
                    "1. No inappropriate language will be tolerated.\n" +
                    "2. Please wear proper athletic shoes - NO CLEATS!\n" +
                    "3. Gloves may be worn.\n" +
                    "4. Players may only pull for one team.\n" +
                    "5. A single team may consist of minimum 5 players\n" +
                    "6. No wrapping the rope around any body part during pull.\n" +
                    "7. First team to pull mid-rope marker 6ft. beyond midline is the winner.\n" +
                    "8. Direction of pull will be decided by a coin toss.\n" +
                    "9. Starting cues : “Take the strain” (teams pick up rope, prepare)\n" +
                    "“Ready, Set, PULL!”\n" +
                    "\n" +
                    "CONTACT THROUGH GMAIL:\n" +
                    "\n" +
                    "aagama2k17pharmacy@cvsr.ac.in \n" +
                    "\n" +
                    "STUDENT COORDINATORS:\n" +
                    "\n" +
                    "1. G.GIRIPRASAD-7337076891\n" +
                    "2. MAHENDER-9989091838\n";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Spell Bee":
            text1="Spell Bee";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "A word challenge.\n" +
                    "spell bee is a competition in which contestants are asked to spell a broad selection of words, usually with a varying degree of difficulty.\n" +
                    "1. Single participant\n" +
                    "2. 50 seconds of time will be given to each participant\n" +
                    "\n" +
                    "RULES:\n" +
                    "\n" +
                    "1. Participants have to register in advance for all events\n" +
                    "2. Spot registrations will not be entertained\n" +
                    "3. There is no registration fee for any MBA events.\n" +
                    "\n" +
                    "STUDENT COORDINATORS:\n" +
                    "\n" +
                    "1. Mrs. C. Supriya- 9989240737\n" +
                    "2. Mrs. Seema Nazneen";
            tv1.setText(text1);
            tv.setText(text);
            break;




        }
    }


}
