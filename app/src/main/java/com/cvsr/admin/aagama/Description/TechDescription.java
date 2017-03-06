package com.cvsr.admin.aagama.Description;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.cvsr.admin.aagama.R;
import com.cvsr.admin.aagama.Registration.TechRegistration;

/**
 * Created by ADMIN on 2/22/2016.
 */
public class TechDescription extends TechRegistration {
    TextView tv1,tv;
    String text1,text;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description);
        tv1=(TextView)findViewById(R.id.header);
        tv = (TextView) findViewById(R.id.rules);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.launch1);

        Intent in = getIntent();
        String s = in.getStringExtra("event");
            switch(s) {
//COMPUTER SCIENCE AND ENGINEERING
                case "Paper Presentation":
                 text1="Paper Presentation";
                 text ="Description:\n" +
                         "\n" +
                         "“I am not ,but m trying to” the phrases of Winston Churchill chilled out the hearts of many people. This platform is to expose your talent and in depth knowledge on your interested area. Come, chill out the hearts of the people with your innovative presentation.\n" +
                         "\n" +
                         "Rules and regulations:\n" +
                         "\n" +
                         "1. Maximum of 2 people per team are allowed.\n" +
                         "2. Abstract should be of only 1 page and the paper can be maximum of 15 pages.\n" +
                         "3. Abstract should be mailed prior to the event.\n" +
                         "4. Only technical topics related to computer science and information technology permitted.\n" +
                         "5. Hard copy should be submitted to the event coordinator at the time of event.\n" +
                         "6. College ID card must be carried.\n" +
                         "\n" +
                         "Event coordinators:\n" +
                         "\n" +
                         "1. Aishwarya venkatraman  8008118565\n" +
                         "2. B.Manasa               8500305408\n";

                // Finally stick the string into the text view.
                tv1.setText(text1);
                tv.setText(text);
                    break;
                case "Poster Presentation":
                    text1="Poster Presentation";
                    text = "Description:\n" +
                            "\n" +
                            "In this event, we are looking for a potential and creative designer who has the ability to design a poster and has an eye for art. Don’t miss this onground contest to showoff your skills in designing.\n" +
                            "\n" +
                            "Rules and regulations:\n" +
                            "\n" +
                            "1.College ID card must be carried.\n" +
                            "2.Maximum of 2 members per team are allowed.\n" +
                            "3.Design can be made using any type of art.\n" +
                            "4.Time limit of 1 hour will be given for the event.\n" +
                            "5.Selection of the best poster will be adjudged by guest.\n" +
                            "\n" +
                            "Event coordinators:\n" +
                            "\n" +
                            "1.Preeti Mandal 8142458738\n";

                    // Finally stick the string into the text view.
                    tv1.setText(text1);
                    tv.setText(text);
                    break;

                case "Hunt The Code":
                    text1= "Hunt The Code";
                    text = "Description:\n" +
                            "\n" +
                            "This event is all about finding the treasure by hunting the code in an innovative way.\n" +
                            "This event follows 2 stages\n" +
                            "First stage:\n" +
                            "Here treasurer has to find the errors in a set of questions, by which participants are sorted to the next round by the number of errors they find.\n" +
                            "Second stage:\n" +
                            "After clearing the first stage, here the treasurer needs to debug (hunt)  in respective systems. For example If he/she excecuted code correctly  then he will get the output which intern leads to the clue of treasure which will be found in the next corresponding systems. This procedure  follows till he goes to the system where the treasure is found within a limited time span.\n" +
                            "\n" +
                            "Rules to be followed :\n" +
                            "\n" +
                            "1.Firstly , the participants must clear the first stage to enter into the second one.\n" +
                            "2.In second stage, a team of 2 members will be made who cleared the first stage. \n" +
                            "3.The participants should not use their mobile phones.\n" +
                            "4.There is no need to write programs just have to debug the existing programs.\n" +
                            "5.Time limit should not be exceeded.\n" +
                            "6.Entry fees is ₹30.\n" +
                            "7.Prizes are given to winners and runners and certificates are provided.\n" +
                            "\n" +
                            "Student co-ordinators:\n" +
                            "\n" +
                            "1.Y.Rachana Chowdary : 9640865075\n" +
                            "2.S.Sreekar : 8686282267\n" +
                            "3.K.Sai Prakash Kiran: 8106364751\n";

                    // Finally stick the string into the text view.
                    tv1.setText(text1);
                    tv.setText(text);
                    break;
                case "Webpage Design":
                    text1="Webpage Design";
                    text="Description:\n" +
                            "\n" +
                            "Any enterprise in online portal is rated by the creativity involved in its website. So here is a chance to showcase your creativity!\n" +
                            "\n" +
                            "Rules & Regulations:\n" +
                            "\n" +
                            "1.Maximum of 2 participants.\n" +
                            "2.No rounds i.e open contest.\n" +
                            "3.Any website, based on participant interest.\n" +
                            "4.Contest time is 1 hour.\n" +
                            "5.Best website will be evaluated by faculty.\n" +
                            "6.Participants can use any programming language.\n" +
                            "7.College ID card must be carried.\n" +
                            "\n" +
                            "Event coordinators:\n" +
                            "\n" +
                            "1.J.Aishwarya  7702833277\n";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;

                case "Dumb Charades":
                    text1="Dumb Charades";
                    text="Description:\n" +
                            "\n" +
                            "Come on! Let’s learn technical words adding some more fun. The game goes like this…..\n" +
                            "\n" +
                            "RULES:\n" +
                            "\n" +
                            "•Each team consists of 3 members.\n" +
                            "•The game will have three levels.\n" +
                            "•The participants are not allowed to use any electronic gadgets.\n" +
                            "\n" +
                            "STRUCTURE:\n" +
                            "\n" +
                            "LEVEL 1:They need to pickup one slip and enact the word within the time limit.\n" +
                            "LEVEL 2:In this level they can enact how many words they can.\n" +
                            "LEVEL 3:In this level in given time they should enact one word and  should tell application on that particular word.\n" +
                            "Based on this teams are selected and will be awarded the prize money.\n" +
                            "\n" +
                            "EVENT CO-ORDINATORS:\n" +
                            "\n"+
                            "CH.MAMATHA   7396509393\n"+
                            "B.SOWMYA     9951830016\n";
                    tv1.setText(text1);
                    tv.setText(text);
                    break;








//ELECTRONICS AND COMMUNICATION ENGINEERING
                case "Paper Presentation_1":
                    text1="Paper Presentation";
                    text=" Description:\n" +
                            "\n" +
                            "Grab this opportunity to publish your paper and get regarded as one of the best papers ever published!!\n" +
                            "\n" +
                            "TOPIC:  Recent development in technology in the field of Electronics and Communication engineering\n" +
                            "Abstracts should be mailed to paperpresentation2k17.ece@gmail.com\n" +
                            "\n" +
                            "\n" +
                            "RULES AND REGULATIONS:\n" +
                            "\n" +
                            "1)Abstract should be not more than a paper ( 2 sides ) and it should be in IEEE format.\n" +
                            "2) A minimum of 3 copies of short notes (paper) and 3 copies of abstract is mandatory.\n" +
                            "3)Students must carry their own pendrives and the presentation must be in .pptx  format only. \n" +
                            "4)Paper must not exceed 15 pages .\n" +
                            "5)Respective college ID cards are mandatory.\n" +
                            "6)You will be notified based on the structure and details in your abstract.\n" +
                            "\n" +
                            "Student Coordinators:\n" +
                            "1. Koushik (9505105466)\n" +
                            "2. Vishnu (9603249690)\n";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;


                case "Poster Presentation_1":
                    text1="Poster Presentation";
                    text="Description \n" +
                            "\n" +
                            "Get a chance to win the best poster presentation award in AAGAMA 2k17 !!\n" +
                            "Topic: Recent development in technology in the field of electronics and communication engineering.\n" +
                            "Mail us your poster abstract to posterpresentation.ece@gmail.com\n" +
                            "\n" +
                            "RULES AND REGULATIONS:\n" +
                            "\n" +
                            "1)The board must be oriented in the “landscape” position (long dimension is horizontal).\n" +
                            "2) A banner displaying your poster title, name, and department (or class, if appropriate) should be positioned at top-center of the board.\n" +
                            "3)Text should be readable from five feet away.\n" +
                            "4)Maximum limit- 2 charts\n" +
                            "5) Respective college ID cards are mandatory.\n" +
                            "6)Abstracts should be mailed as soon as possible and you will be notified further soon upon mailing of your abstract.\n" +
                            "\n" +
                            "Student coordinators: \n" +
                            "1. Srilakshmi (9505105466)\n" +
                            "2. Divya (9010074469)\n" ;


                    tv1.setText(text1);
                    tv.setText(text);
                    break;

                case "Project Presentation_1":
                    text1="Project Presentation";
                    text="Description:\n" +
                            "\n" +
                            "Hello Engineers! Rise up in your field by exhibiting your project in AAGAMA 2k17 and grab a chance to win the prize!\n" +
                            "\n" +
                            "RULES AND REGULATIONS:\n" +
                            "\n" +
                            "1)Students are responsible for their own kits\n" +
                            "2)Working prototype is mandatory\n" +
                            "3)A short document describing their project is to be submitted.\n" +
                            "4)Students must sit in their allotted places only.\n" +
                            "5)Respective college ID cards are mandatory.\n" +
                            "\n" +
                            "\n" +
                            "Student coordinators:\n" +
                            "1. Akhil (8886017327)\n" +
                            "2. Yadagiri (7799819329)\n";


                    tv1.setText(text1);
                    tv.setText(text);
                    break;

                case "Technical Quiz_1":
                    text1="Technical Quiz ";
                    text="Description:\n" +
                            "\n" +
                            "Hello everyone! The budding engineers of the world! The time has come where you have an opportunity to stand high among everyone! The place where you can analyze and improve your knowledge towards your core!! \n" +
                            "\n" +
                            "QUIZ TOPICS:\n" +
                            "\n" +
                            "1)\tBasic Engineering\n" +
                            "2)\tBasic electronics\n" +
                            "3)\tLogical reasoning\n" +
                            "4)\tVLSI\n" +
                            "5)\tEmbedded systems\n" +
                            "\n" +
                            "RULES AND REGULATIONS:\n" +
                            "\n" +
                            "1)Quiz consists of three levels\n" +
                            "•\tBasic engineering and aptitude\n" +
                            "•\tBasic electronics \n" +
                            "•\tAdvanced electronics and communication\n" +
                            "2)Each team can consist a maximum of 2 and a minimum of 1 person.\n" +
                            "3)No hints or clues will be given.\n" +
                            "4)No mobile phones or any kind of books are allowed.\n" +
                            "5)The decision of the judge will be the final and cannot be changed.\n" +
                            "\n" +
                            "\n" +
                            "Student co-ordinators-\n" +
                            "1. Sudha (7382057416)\n" +
                            "2. Ashwitha \n";


                    tv1.setText(text1);
                    tv.setText(text);
                    break;

                case "Circuitrix_1":
                    text1="Circuitrix";
                    text=" About:\n" +
                            "\n" +
                            "An event which tests the very basics of electronics, this is an on the spot event which gives you the opportunity to showcase your skills at designing and implementing electronic circuits. And a little simulation never hurt anybody. All you are required to do is to brush up on your concepts and get ready to unleash your designing skills in the 'CIRCUITRIX' battlefield.\n" +
                            "\n" +
                            "The event consists of:\n" +
                            "\n" +
                            "•\tQuestions on Analog Communications\n" +
                            "•\tQuestions on Digital Communications\n" +
                            "•\tCircuit analyzing\n" +
                            "•\tCircuit building \n" +
                            "•\tMultisim software\n" +
                            "\n" +
                            "Rules:\n" +
                            "\n" +
                            "•\tA team shall consists of max two persons.\n" +
                            "•\tThe participants shall not use any mobile or other electronic instruments.\n" +
                            "•\tThe questions shall be in the form of puzzles, analyzing circuits and building circuits.\n" +
                            "•\tThere is time limit for every round. \n" +
                            "•\tAudience shall not give any hints or clues to the competitors.\n" +
                            "\n" +
                            "Stage Rounds:\n" +
                            "\n" +
                            "•\tFirst Round:\n" +
                            "              This round is the aptitude test, which tests the basics of digital and analog knowledge of the participants. The questions will be in form of puzzles. The participants should come in teams of two. \n" +
                            "The best teams will be promoted to the second round. \n" +
                            "•\tSecond Round:\n" +
                            "          The selected teams will be tested on their simulation skills. The participants will be given a circuit which they need to simulate using software like MULTISIM. \n" +
                            "Based on the performance teams will be promoted to the final round. \n" +
                            "•\tThird Round: \n" +
                            "        A problem statement will be provided. The third round is about building a circuit based on the given problem statement. The accuracy and the approach in building the circuit is observed. \n" +
                            "The best teams will be awarded \n" +
                            "\n" +
                            "Student coordinators:\n" +
                            "\n" +
                            "1. R.Sai Alekhya              +919704686459\n" +
                            "2. Akhila                          +919063779509\n";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;

//ELECTRICAL AND ELECTRONICS ENGINEERING
                case "Paper Presentation_2":
                    text1="Paper Presentation";
                    text="Rules and regulations:\n" +
                            "\n" +
                            "1.Team should consist of maximum of 2 members.\n" +
                            "2. Topics which are to be presented should be related to Electrical and Electronics Engineering.\n" +
                            "3. Abstract should be sent to                                  on or before march 12th,2017.\n" +
                            "4. Abstract should be of only 1 page and in IEEE format.\n" +
                            "5. Presentation  should be given a POWERPOINT PRESENTATION which should consist not more than 10 slides.\n" +
                            "6.Please bring your Power point presentation in CD or Pen drive.\n" +
                            "7.Please bring 2 Hardcopies of abstract  on the day of event.\n" +
                            "8.Please carry respected college ID cards.\n" +
                            "\n" +
                            "\n" +
                            "STUDENT COORDINATORS:\n" +
                            "1. P.LIKITHA    (9848159262)\n" +
                            "2. A.SAIKRISHNA (9550966202)\n";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;


                case "Poster Presentation_2":
                    text1="Poster Presentation";
                    text=" Rules and regulations:\n" +
                            "\n" +
                            "1. Team should consist of maximum of 2 members.\n" +
                            "2. Topics which are to be presented should be related to Electrical and Electronics Engineering.\n" +
                            "3. All decision of judges and event coordinators shall be treated as final.\n" +
                            "4. Any malpractice is strictly treated and is submitted to the AAGAMA disciplinary committee.\n" +
                            "5.Spot registrations are available.\n" +
                            "6.Please carry respected college ID cards.\n" +
                            "\n" +
                            "\n" +
                            "STUDENT COORDINATORS:\n" +
                            "1. A.SHRUTHI    - 9603838028\n" +
                            "2. A.AKHIL          - 8522965596\n";
                    tv1.setText(text1);
                    tv.setText(text);
                    break;


                case "Project Presentation_2":
                    text1="Project Presentation";
                    text=" Rules and regulations:\n" +
                            "\n" +
                            "1. Team should consist of maximum of 2 members.\n" +
                            "2. Topics which are to be presented should be related to Electrical and Electronics Engineering.\n" +
                            "3. Please carry respected college ID cards.\n" +
                            "4. Spot registrations are available.\n" +
                            "5. All decision of judges and event coordinators shall be treated as final and bring to   all.\n" +
                            "6. Any malpractice is strictly treated and is submitted to the AAGAMA disciplinary committee.\n" +
                            "\n" +
                            "STUDENT COORDINATORS:\n" +
                            "1. G.SANTHOSH     -9032893787\n" +
                            "2. R.MANASWINI   -7794971168\n";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;


                case "Circuitrix_2":
                    text1="Circuitrix";
                    text=" Event Outline:\n" +
                            "\n" +
                            "     In this event a single candidate or a group of 2 can participate. This event consists of total 3 rounds.\n" +
                            "\n" +
                            "\n" +
                            "Round 1: \n" +
                            "\n" +
                            "1.\tConnecting circuits, in these level contestants have to connect given circuits on a bread board within a stipulated time. \n" +
                            "2.\tQualifiers of this level will move to the next level. \n" +
                            "\n" +
                            "\n" +
                            "Round 2: \n" +
                            "\n" +
                            "1.\tFinding parameters, in this level contestants have to connect given circuit and find out parameters across the circuit elements (Ex: voltage, current) within stipulated time.\n" +
                            "2.\t Qualifiers of this level will move to the 3rd level which is the final level. \n" +
                            "\n" +
                            "Round 3: \n" +
                            "\n" +
                            "1.\tSolving circuits, in this level contestants have to connect given circuits and find out missing parameters (Ex: voltage, current, resistance, etc) theoretically and practically within stipulated time. \n" +
                            "2.\tTop 2 contestants who finish this level earliest will be declared winners of this event. \n" +
                            "\n" +
                            "Rules and Regulations:\n" +
                            "\n" +
                            "1.\tThe number of members for a team is limited to a maximum of 2.\n" +
                            "2.\tAll decision of judges and event coordinators shall be treated as final and bring to         all.\n" +
                            "3.\tAny malpractice is strictly treated and is submitted to the AAGAMA disciplinary committee.\n" +
                            "4.\tSpot registrations are available\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "Student Coordinators:\n" +
                            "B.RAMYASREE (8184926622)\n" +
                            "P.MAHESH (8142523093)\n";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;



                case "Technical Quiz_2":
                    text1="Technical Quiz";
                    text=" Event Outline:\n" +
                            "\n" +
                            "     This event consists of total 3 rounds.\n" +
                            "\n" +
                            "\n" +
                            "Round 1:\n" +
                            "\n" +
                            "1.\tParticipants should form a group of minimum two or maximum three students.\n" +
                            "2.\tParticipants must carry a valid identity card of their respective institutions.\n" +
                            "3.\tQuestions will be asked from the topics of electrical Engineering.\n" +
                            "\n" +
                            "\n" +
                            "Round 2:\n" +
                            "\n" +
                            "1.\tAfter Prelims, only 10 top scoring teams will be selected for next rounds.\n" +
                            "2.\tAfter Rapid Fire round only 6 teams will be selected for Final round.\n" +
                            "\n" +
                            "\n" +
                            "Round 3:\n" +
                            "\n" +
                            "1.\tAfter the final round 2 highest scoring teams will be declared as winners.\n" +
                            "\n" +
                            "\n" +
                            "Rules and regulations:\n" +
                            "\n" +
                            "1.\tAny student within the age group of 14- 25 years can participate and each team should consist of not more than three members.\n" +
                            "2.\t Use of mobile phones or any other electronic or communication device is prohibited during the event.\n" +
                            "3.\t Participants should carry their college or school ID cards.\n" +
                            "4.\tOrganizers reserve the right to disqualify teams on the grounds of misbehavior and use of unfair means. Their decision is considered final and not subjected to dispute.\n" +
                            "5.\t Teams exceeding the time limit are liable for disqualification.\n" +
                            "\n" +
                            "\n" +
                            "Student Coordinators:\n" +
                            "P.MURALI (9676932866)\n" +
                            "M.ABHIRAMI (8985194938)\n";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;


                case "JAM_2":
                    text1="Just A Minute";
                    text=" Description:\n" +
                            "\n" +
                            "An event which drives out Stage fear as well as brings out Leadership skills with fun and knowledge..!! .\n" +
                            "Event Outline:\n" +
                            "The event will consist of two rounds: The Preliminary round and The Finals. The strength of the team must be 2 members.\n" +
                            "\n" +
                            "\n" +
                            "Round 1(Preliminary round):\n" +
                            "\n" +
                            "In this round, team needs to pitch on the topic which is selected by them in just one minute. \n" +
                            "Teams who reached the benchmark of judges will be moved to next round.\n" +
                            "\n" +
                            "\n" +
                            "Round 2(Finals):\n" +
                            "\n" +
                            "In this round, teams need to pick one chit from group of chits. Team will be given 10 minutes to discuss about the topic about the topic. Team needs to pitch about the topic in just one minute. Team which performs good and meets the requirements are winners. \n" +
                            "\n" +
                            "\n" +
                            "Rules and regulations:\n" +
                            "\n" +
                            "1. Any student within the age group of 14- 25 years can participate and each team should consist of not more than three members.\n" +
                            "2. Use of mobile phones or any other electronic or communication device is prohibited during the event.\n" +
                            "3. Participants should carry their college or school ID cards.\n" +
                            "4. Organizers reserve the right to disqualify teams on the grounds of misbehavior and use of unfair means. Their decision is considered final and not subjected to dispute.                              5. Teams exceeding the time limit are liable for disqualification.\n" +
                            "\n" +
                            "\n" +
                            "STUDENT COORDINATORS:\n" +
                            "P.MOUNIKA (9160266700)\n" +
                            "G.SRAVAN (9666281505)\n";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;

//INFORMATION TECHNOLOGY

                case "Paper Presentation_3" :
                    text1="Paper Presentation";
                    text="  Description :\n" +
                            "\n" +
                            "“I am not, But M trying to” the phrases of Winston Churchill chilled out the hearts of many people. This platform a to expose your talent and in-depth knowledge on your interested areas. Come, chill out the hearts of the people with your innovative presentation.\n" +
                            "\n" +
                            "  TechDescription & Regulations\n" +
                            "\n" +
                            "Maximum of 2 members per layout_team1 are allowed\n" +
                            "\n" +
                            "Abstract should be of only 1 page and the paper can be maximum of 15 pages\n" +
                            "\n" +
                            "Abstract should be mailed prior to the event\n" +
                            "\n" +
                            "Only technical topics related to computer science and information technology are permitted\n" +
                            "\n" +
                            "Hard copy should be submitted to the event co-ordinator at the time of event\n" +
                            "\n" +
                            "Abstracts have to be sent to teh email Id:aagama2k16civil@it.ac.in before 12th march,2016\n" +
                            "\n" +
                            "The mail should contain participant’s name, title of the poster and the abstract.\n" +
                            "\n" +
                            "  Event Cordinators :\n" +
                            "\n" +
                            "K Sampath -9505550215\n" +
                            "B Swaroopa -9963298994";
                    tv1.setText(text1);
                    tv.setText(text);
                    break;


                case "Bug The Bug_3" :
                    text1="Bug The Bug";
                    text="Description :\n" +
                            "\n" +
                            "A code with errors (C Language) will be given to the teams, they should find the errors and rectify them. The rectified code should be executed without errors and warning\n" +
                            "\n" +
                            "  TechDescription & Regulations :\n" +
                            "\n" +
                            "Maximum of 2 member per layout_team1 are allowed\n" +
                            "\n" +
                            "Complier will be specified by the department\n" +
                            "\n" +
                            "The statement containing the error must be rectified only; removal of the statement will lead to disqualification\n" +
                            "\n" +
                            "Time limit may vary based on the code given\n" +
                            "\n" +
                            "  Event Cordinators :\n" +
                            "\n" +
                            "K SaiKiran-8712304666\n" +
                            "T Nivedita -9550623152";
                    tv1.setText(text1);
                    tv.setText(text);
                    break;


                case "Code Race_3" :
                    text1="Code Race";
                    text=" Description :\n" +
                            "\n" +
                            "Task with specified input and corresponding output will be given. Participants who completes the task first will be the winner\n" +
                            "\n" +
                            "  TechDescription & Regulations :\n" +
                            "\n" +
                            "A maximum of 3 members per layout_team1 are allowed\n" +
                            "\n" +
                            "10 minutes will be given for understanding the question and 35 minutes for execution\n" +
                            "\n" +
                            "If none of the teams are able to complete the task in the specified time them extra time will be given\n" +
                            "\n" +
                            "Any software language can be used\n" +
                            "\n" +
                            "Usage of internet is restricted and if found will be disqualified\n" +
                            "\n" +
                            "  Event Cordinators :\n" +
                            "\n" +
                            "S Parichay -8790350042\n" +
                            "T Akshitha-8520829359";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;
//CIVIL ENGINERING

                case "Paper Presentation_4" :
                    text1="PAPER PRASTUTI";
                    text=   "Description\n" +
                            "\n" +
                            " In this event students are going to give their innovative ideas or they are going to choose a topic and present that should be of technical one.\n" +
                            "\n" +
                            "RULES AND REGULATIONS:\n" +
                            "\n" +
                            "•\tHe/She should complete the presentation on time.\n" +
                            "•\tThere is no extra time was given to complete presentation.\n" +
                            "•\tIndividual was going to present the topic.\n" +
                            "•\tListen and respect while others ask questions at the end not to argue with them.\n" +
                            "•\tThere should be proper conclusion at the end of presentation.\n" +
                            "\n" +
                            "STRUCTURE:\n" +
                            "\n" +
                            " We are going to give only five minutes to students in that time he should able to complete his/her presentation.\n" +
                            "First minute - introduction part for the topic.\n" +
                            "Second and third minute- explanation about topic.\n" +
                            "Fourth minute- conclusion part.\n" +
                            "Fifth minute- questioning.\n" +
                            "\n" +
                            "STUDENT COORDINATORS:\n" +
                            "1. KRANTHI KUMAR (8096003472)\n" +
                            "2. SAI TEJ (9493369171)\n";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;


                case "Poster Presentation_4" :
                    text1="CARTEL PRESENTATION";
                    text="Description :\n" +
                            "\n" +
                            "THE POSTER –A Special form of presentation which speaks itself. The poster should be able to stand on its own as a clear, without any explanation from you.\n" +
                            "\n" +
                            "THEME:  BEST OUT OF WASTE\n" +
                            "\n" +
                            "RULES AND REGULATIONS:\n" +
                            "\n" +
                            "•\tCOLLEGE ID IS MANDATORY\n" +
                            "•\tEACH POSTER SHOULD be made according to the theme.\n" +
                            "•\tParticipants should only convey the message visually.\n" +
                            "•\tALL POSTER PRESENTERS SHOULD BE PRESENT ON THE FIRST DAY\n" +
                            "•\tEACH TEAM COMPRISES OF MAXIMUM 2 MEMBERS\n" +
                            "\n" +
                            "STRUCTURE:\n" +
                            "\n" +
                            "Poster should be presented according to the theme given.\n" +
                            "\n" +
                            "STUDENT CO-ORDINATOR:\n" +
                            "1. R.SHARATH REDDY-8464805147\n" +
                            "2. NAVEEN KUMAR-8790305229\n";
                    tv1.setText(text1);
                    tv.setText(text);
                    break;

                case "Project Presentation_4" :
                    text1="PARIYOJANA PRASTUTI";
                    text="Description\n" +
                            "\n" +
                            "It is description about the project which is either Power point presentation or model project presentation.\n" +
                            "\n" +
                            "Rules and Regulations:\n" +
                            "\n" +
                            "•\tOne should give clear description about the project in specified time.\n" +
                            "•\tNumber of participants: Individual or Maximum three.\n" +
                            "•\tTopic should not be related to caste, Gender and Religion.\n" +
                            "\n" +
                            "Structure:\n" +
                            "\n" +
                            "•\tHe/She should able to present the project with in the given time.\n" +
                            "\n" +
                            "Student Coordinators:\n" +
                            "1. Vinay Jain – 9505569683\n" +
                            "2. Indrakaran - 9676065034\n";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;







                case "CAD_4" :
                    text1="TVARITA CADD";
                    text="  Description :\n" +
                            "\n" +
                            "This  is a platform where participants are given hardcopy of a building plan which they have to digitalize using Auto CAD software.\n" +
                            "\n" +
                            "RULES AND REGULATIONS:\n" +
                            "\n" +
                            "•\tTime limit  is  30 min.\n" +
                            "•\tTeam consists of minimum of 1 participant .\n" +
                            "•\tNo audience participation.\n" +
                            "•\tNo extra time will be given.\n" +
                            "•\tAny malpractice like usage of internet or copying is strictly prohibited.\n" +
                            "\n" +
                            "STRUCTURE OF CADD :\n" +
                            "                      Based on time limit with given dimensional rules.\n" +
                            "\n" +
                            "STUDENT CO-ORDINATOR:-\n" +
                            "1. M.VANI -8341380536\n" +
                            "2. B.SARITHA-9010191374\n";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;



                case "Model Making_4" :
                    text1="PARIYOJANA PRASTUTI";
                    text="Description:\n" +
                            "\n" +
                            "In this Event , All the participants  have to prepare  any civil structure of their own wish with in a stipulated time period . It is an ultimate opportunity for everyone to exhibit their architectural skills. \n" +
                            "\n" +
                            "\n" +
                            "RULES AND REGULATIONS:\n" +
                            "\n" +
                            "•\tCOLLEGE ID IS MANDATORY.\n" +
                            "•\tMATERIAL WILL BE PROVIDED.\n" +
                            "•\tEACH TEAM COMPRISES MAXIMUM OF 3 MEMBERS.\n" +
                            "•\tTIME LIMIT WILL BE GIVEN AND MUST BE PREPARED WITHIN THE LIMIT.\n" +
                            "•\tOTHER MATERIALS WILL NOT BE ALLOWED.\n" +
                            "•\tBEST MODELS AMONG ALL WILL BE AWARDED.\n" +
                            "\n" +
                            "\n" +
                            "STRUCTURE :\n" +
                            "\n" +
                            "Straws  and use and thrown  glass material will be given  to make their model.\n" +
                            "\n" +
                            "\n" +
                            "STUDENT CO-ORDINATORS:\n" +
                            "SPANDANA (8341803439)\n" +
                            "AIJAZ KHAN (9160255129)\n";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;



                case "Technical Quiz_4" :
                    text1="TAKANEEKE PRASHNOTTAREE";
                    text="  Description :\n" +
                            "\n" +
                            "It’s  high time to get into real time world awareness of what happening around you…come on test your general knowledge skills.\n" +
                            " This quiz  consists of questions on \n" +
                            "      General knowledge\n" +
                            "      Science&Technology\n" +
                            "      Current Affairs\n" +
                            "\n" +
                            "RULES AND REGULATIONS:  \n" +
                            "\n" +
                            "•\tA team should  consists of participants maximum 2,min 1.\n" +
                            "•\tThe participants should  not  allowed to using of mobiles and other electronic  gadgets.\n" +
                            "•\tTime limit will be there.\n" +
                            "o\tMultiple options will be there.\n" +
                            "o\tNo audience are allowed.\n" +
                            "\n" +
                            "STRUCTURE  OF  QUIZ:\n" +
                            "\n" +
                            "Initial of the quiz:  A total 50 questions are given in which we are going to select top 10 members to second round.\n" +
                            "Final round for quiz: In this round we are going to ask questions to all participations.\n" +
                            "\n" +
                            "Student coordinators:\n" +
                            "1. VB.BHARANI-8522958844.  \n" +
                            "2. A.PRADHYUMNA-9652608092.\n";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;


                case "Truss Design_4" :
                    text1="TRUSS DESIGN";
                    text="  Description:\n" +
                            "\n" +
                            "This is the Event which brings out the in-depth understanding in all aspects of truss design. All the participants have to prepare  a Truss  with in the given time period . \n" +
                            "\n" +
                            "\n" +
                            "RULES AND REGULATIONS:\n" +
                            "\n" +
                            "•\tCOLLEGE ID IS MANDATORY.\n" +
                            "•\tMATERIAL WILL BE PROVIDED.\n" +
                            "•\tEACH TEAM COMPRISES MINIMUM OF 1 & MAXIMUM OF 2 MEMBERS.\n" +
                            "•\tTIME LIMIT WILL BE GIVEN AND MUST BE PREPARED WITHIN THE LIMIT.\n" +
                            "•\tDESIGN AND SPECIFICATIONS WILL BE GIVEN ON THE SPOT.\n" +
                            "•\tOTHER MATERIALS WILL NOT BE ALLOWED.\n" +
                            "•\tBEST MODELS AMONG ALL WILL BE AWARDED.\n" +
                            "\n" +
                            "\n" +
                            "Structure:\n" +
                            "\n" +
                            "For  given loads of truss software  ,the plan should be drawn.\n" +
                            "\n" +
                            "\n" +
                            "STUDENT CO-ORINATOR:\n" +
                            "1. M.VINEETH (9949584424)\n" +
                            "2. N.POOJITHA (9603653091)\n";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;


                case "Quick Survey_4" :
                    text1="TVARITA SAMIKSE";
                    text="  Description:\n" +
                            "\n" +
                            "This is an Event where simple tasks are given to the participants which in turn unveils their knowledge over basics of “SURVEYING” (leveling ,temporary adjustments  of instruments etc..).\n" +
                            "\n" +
                            "\n" +
                            "RULES AND REGULATIONS:\n" +
                            "\n" +
                            "•\tAny one task will be randomly given.\n" +
                            "•\tTime limit is different for different tasks.\n" +
                            "•\tMaximum of 3 participants.\n" +
                            "\n" +
                            "\n" +
                            "STRUCTURE:\n" +
                            "\n" +
                            "  The given task has to be accomplished with in time.\n" +
                            "\n" +
                            "\n" +
                            "STUDENT CO-ORDINATORS:\n" +
                            "1. B.VIHARIKA (9010717979)\n" +
                            "2. N.MOUNIKA (9052312310)\n";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;






//MECHANICAL ENGINEERING
                case "Paper Presentation_5" :
                    text1="Paper Presentation";
                    text="  TechDescription & Regulations\n" +
                            "\n" +
                            "Max of 2 participants will be allowed in a layout_team1.\n" +
                            "\n" +
                            "Abstracts containing not more than 200 words should be mailed to aagama2k16mech@cvsr.ac.in\n" +
                            "\n" +
                            "One soft copy and 2 hard copies of the full paper are to be submitted at the time of Event.\n" +
                            "\n" +
                            "Last date for registration is …..\n" +
                            "\n" +
                            "Selected paper will be intimated by …March, 2016 through e mail ONLY.\n" +
                            "\n" +
                            "No changes will be accepted once the paper has been submitted.\n" +
                            "\n" +
                            "Presentation should not exceed 8+2 min followed by question and answer session.\n" +
                            "\n" +
                            "Spot Registration can also be done at the registration desk in the Campus.\n" +
                            "\n" +
                            "The decision of the judges shall be final & binding.\n" +
                            "\n" +
                            "Blow the minds with excellent presentations.....";
                    tv1.setText(text1);
                    tv.setText(text);
                    break;


                case "Velocity_5" :
                    text1="Velocity";
                    text="  Description :\n" +
                            "\n" +
                            "Each layout_team1 is supposed to Assemble and dissemble the given component in short time of period\n" +
                            "\n" +
                            "  TechDescription & Regulations :\n" +
                            "\n" +
                            "each layout_team1 can have max of 2 members\n" +
                            "the presentation should not exceed given time";
                    tv1.setText(text1);
                    tv.setText(text);
                    break;



                case "Technical Quiz_5" :
                    text1="Technical Quiz";
                    text="Competing layout_team1 should comprise of 4 members\n" +
                            "\n" +
                            "The quiz consists of 3 rounds, preliminary, video, rapid fire.\n" +
                            "\n" +
                            "The questions will be from the listed streams of chemical engg and related subjects:\n" +
                            "\n" +
                            "  Mass transfer\n" +
                            "\n" +
                            "  Heat transfer\n" +
                            "\n" +
                            "  Mechanical unit operations\n" +
                            "\n" +
                            "  Momentum transfer\n" +
                            "\n" +
                            "  Thermodynamics\n" +
                            "\n" +
                            "  C.R.E\n" +
                            "\n" +
                            "On the basis of preliminary round 4 teams will be selected for final round\n" +
                            "\n" +
                            "Decision of the organizing & expert layout_team1 shall be final\n" +
                            "\n" +
                            "Additional description, if any, will be added in the problem set";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;

//CHEMICAL ENGINEERING

                case "Paper Presentation_6" :
                    text1="Paper Presentation";
                    text="  Description :\n" +
                            "\n" +
                            "Ignite the grey matter and explore the thousands of ideas within. We value what’s truly yours. Well, that’s what research is all about.\n" +
                            "\n" +
                            "  TechDescription & Regulations:\n" +
                            "\n" +
                            "1.Maximum number of participants in a layout_team1 is 2.\n" +
                            "\n" +
                            "2.Abstract should not exceed 1 page and paper should not exceed 15 pages.\n" +
                            "\n" +
                            "3.Soft copies of the submitted paper and PowerPoint presentation must be in .docx format.\n" +
                            "\n" +
                            "4.Please bring 2 hardcopies of the submitted paper on the day of the event.\n" +
                            "\n" +
                            "5.The layout_team1 will get 10 minutes for presentation followed by Queries (7+3).\n" +
                            "\n" +
                            "6.Persons from different institution can be a part of same layout_team1. However, one person may not be a part of multiple teams for the same event.\n" +
                            "\n" +
                            "7.Paper should be in one IEEE format.\n" +
                            "\n" +
                            "8.Abstracts must be sent in on or before 12/3/2016 to mailed :aagama2k16chemical@cvsr.ac.in.\n" +
                            "\n" +
                            "  Event Cordinators :\n" +
                            "\n" +
                            "Narasimha -9032022728\n" +
                            "Aravind     -9490099309";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;

                case "Poster Presentation_6" :
                    text1="Poster Presentation";
                    text="  Description :\n" +
                            "\n" +
                            "Show the world what wonder an engineer can do\n" +
                            "\n" +
                            "  TechDescription & Regulations :\n" +
                            "\n" +
                            "1.College ID card is mandatory.\n" +
                            "\n" +
                            "2.A poster related to chemical Engineering should be presented.\n" +
                            "\n" +
                            "3.Each layout_team1 comprises maximum of 4 members.\n" +
                            "\n" +
                            "4.Poster should be done and brought up to present.\n" +
                            "\n" +
                            "5.Poster should be innovative.\n" +
                            "\n" +
                            "6.Best poster will be awarded.\n" +
                            "\n" +
                            "  Event Cordinators :\n" +
                            "\n" +
                            "Bindu -7893311247\n" +
                            "Ganesh -9652239140";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;


                case "Compound Preparation_6" :
                    text1="Compound Preparation";
                    text="  Description :\n" +
                            "\n" +
                            "It is all about synthesis,purification,drying,weighing of compound with the help of given standard procedure.best yielding compound will be prized .\n" +
                            "\n" +
                            "  TechDescription & Regulations :\n" +
                            "\n" +
                            "1.College ID is mandatory.\n" +
                            "\n" +
                            "2.Standard procedure will be provided.\n" +
                            "\n" +
                            "3.Nav_Team consists of 2 members.\n" +
                            "\n" +
                            "4.No extra time is given.\n" +
                            "\n" +
                            "5.Any malpractices like using internet or other technology is strictly prohibited, in case students are eliminated on spot.\n" +
                            "\n" +
                            "  Event Cordinators :\n" +
                            "\n" +
                            "Dinesh -7306589436\n" +
                            "Janaki-9160821060";
                    tv1.setText(text1);
                    tv.setText(text);
                    break;


                case "Technical Quiz_6" :
                    text1="Technical Quiz";
                    text="  Description :\n" +
                            "\n" +
                            "Knock Knock? Whos there? A question.\n" +
                            "\n" +
                            "  TechDescription & Regulations :\n" +
                            "\n" +
                            "1.College ID card is mandatory.\n" +
                            "\n" +
                            "2.Each layout_team1 comprises maximum of 2 members.\n" +
                            "\n" +
                            "3.Number of Rounds will be decided on spot\n" +
                            "\n" +
                            "The layout_team1 which clears all the rounds will be the winner\n" +
                            "\n" +
                            "  Event Cordinators :\n" +
                            "\n" +
                            "Kalyan -7842224648\n";
                    tv1.setText(text1);
                    tv.setText(text);
                    break;

//PHARMACY DEPARTMENT



                case "Poster Presentation_7" :
                    text1="Poster Presentation";
                    text="Rules:\n" +
                            "\n" +
                            "1.\tA team should contain a maximum of 2 members.\n" +
                            "2.\tSubmit an abstract with not more than 200 words, on or before12:00PM  17th March, 2017.\n" +
                            "3.\t Send the abstract to aagama2k17pharmacy@cvsr.ac.in with the subject of format -‘Abstract –your id. no – your name’.\n" +
                            "4.\t Please include your complete details (i.e. name, email id) in the abstract.\n" +
                            "5.\t The size of the poster should be of 1*1.\n" +
                            "6.\tThe font size should be large enough, so that it can be readable from 1 meter distance.\n" +
                            "7.\t The font style should be Times New Roman or Calibri.\n" +
                            "8.\t The posters received after 12.00pm, 17th March, will not be considered in the\n" +
                            "competition.\n" +
                            "9.\tThe aspects considered in the competition are: Technical content of presenter,\n" +
                            "Presentation skills, Poster format and appearance.\n" +
                            "10.\tTopics are: Pharmaceutics, Pharmacology, Pharmaceutical analysis, Pharmaceutical Chemistry, Pharmacognosy, Regulatory affairs, Hospital Pharmcy,Industrial Pharmacy\n" +
                            "\n" +
                            "STUDENT CO-ORDINATORS:                                    \n" +
                            "SAI SRI-9705254606\n" +
                            "MANASWINI-9502496558\n";
                    tv1.setText(text1);
                    tv.setText(text);
                    break;


                case "Pharma Quiz_7" :
                    text1="Pharma Quiz";
                    text="  Rules:\n" +
                            "\n" +
                            "1.\tEach team will comprise of 3 candidates.\n" +
                            "2.\tThe quiz will have 1 Elimination round and 3 final rounds. \n" +
                            "3.\t4 teams will be selected for final round.\n" +
                            "4.\tThe last date of receiving the registration fee is 15th March  2017 with a Demand Draft of Rs.300/- (group of three students) in favour  of\n" +
                            "5.\tElimination : This will consist of 15 objective questions which have to be solved in 5 minutes. 4 highest scoring teams will compete in the finals. \n" +
                            "6.\tThe last 3 rounds will be played among 4 teams. \n" +
                            "7.\tFinals : Consists of 3 rounds\n" +
                            "                 1. First round: General questions and Visual Round\n" +
                            "                 2. Second round: Buzzer Round \n" +
                            "                 3. Third round: Rapid Fire Round\t\n" +
                            "\n" +
                            "STUDENT CO-ORDINATORS\n" +
                            "1. MEGHA-7416111995\n" +
                            "2. SUMMANDER-9177465513\n";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;

                case "JAM_7" :
                    text1="Just A Minute";
                    text="Description:\n" +
                            "\n" +
                            "1.\tA visual clip would be shown to the contestants one at a time.\n" +
                            "2.\t Thirty seconds would be provided to view the clip and plan accordingly in order to present your ideas in an effective and interesting manner. \n" +
                            "3.\tThe contestant is then given one minute by the moderator to speak on the topic. Marks will be deducted for exceeding the time limit. \n" +
                            "4.\tIn case of any dispute, the decision of the judges would be final and binding.\n" +
                            "5.\tThe organizers reserve the right to change and modify the rules and regulations without any prior notification.\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "STUDENT CO-ORDINATORS:\n" +
                            "SAI LAXMI (9642795278)\n" +
                            "REVATHI (032026648)\n  ";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;


//MBA DEPARTMENT

                case "Paper Presentation_8" :
                    text1="Paper Presentation";
                    text="  Description:\n" +
                            "Paper presentation will improve the thinking horizon of the students besides giving them presentation skills also remove the stage fear from the students and builds confidence.\n" +
                            "•\tNo registration fee \n" +
                            "•\tMaximum two members per team\n" +
                            "•\tPaper has to be submitted on or before to college email id\n" +
                            "•\tShort listed papers will be intimated through mail.\n" +
                            "•\tAny number of teams can participate from the same college\n" +
                            "•\t Max 7 min for presentation and 3 minutes for question and answer session.\n" +
                            "\n" +
                            "Topics:\n" +
                            "1. Digital India\n" +
                            "2. Implementation is the problem, not schemes\n" +
                            "3. Can CNG be the best alternative over petrol & diesel?\n" +
                            "\n" +
                            "STUDENT COORDINATORS \n" +
                            "1. Bhavani Chander (9494566944)\n" +
                            "2. Vinod (9989619984)\n";
                    tv1.setText(text1);
                    tv.setText(text);
                    break;

                case "Poster Presentation_8" :
                    text1="Poster Presentation";
                    text="  Description:\n" +
                            "\n" +
                            "Posters are used to share information that may be used to present quite complex material. The purposes of posters are to report findings, present an argument, and convince the audience.\n" +
                            "\n" +
                            "\n" +
                            "Topic: “Demonetizations -Its impact on Indian economy”\n" +
                            "\n" +
                            "1. Participants have to get their own materials and posters.\n" +
                            "2. Maximum of two participants per team.\n" +
                            "3. Time limit 15 minutes.\n" +
                            "\n" +
                            "\n" +
                            "STUDENT COORDINATORS:\n" +
                            "1. Vaidevi (9989619984)\n" +
                            "2. Sukumar (9704028293)\n" +
                            "\n";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;


                case "Group Discussion_8" :
                    text1="Connecting brains";
                    text="  Description:\n" +
                            "\n" +
                            "A topic is given to a group to bring up ideas and discussion to know candidate’s personality traits or skills to open up, leave fear, and express all his ideas. \n" +
                            "\n" +
                            "\n" +
                            "Topic for group discussion-\n" +
                            "•\tWill Trumps Leadership style help people perform at their Best?\n" +
                            "•\tSpace Missions are a Wastage of Resources for a Resource-Starved Nation like India\n" +
                            "•\tIs India a Soft Nation?\n" +
                            "\n" +
                            "\n" +
                            "1. Each team consists of 8 students.\n" +
                            "2. Students have to register in advance to participate in the event.\n" +
                            "3. Judges decision will be final \n" +
                            "\n" +
                            "\n" +
                            "STUDENT COORDINATORS \n" +
                            "1. Anusha (9676865781)\n" +
                            "2. Ashok (9849239868)";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;


                case "Business Plan_8" :
                    text1="Idea Execute";
                    text="  Description:\n" +
                            "\n" +
                            "Encourages student’s entrepreneurial skills.\n" +
                            "\n" +
                            "•\tThe business plan should briefly cover the Problem area to be addressed, solution offered, target customers, market strategy and estimated financials.\n" +
                            "•\tThe proposal has to be sent on or before 10th  March 2016 to aagama2k17mba@cvsr.ac.in\n" +
                            "•\tThe shortlisted candidates will be informed by e-mail.\n" +
                            "•\tThe maximum number of the students for each team is two.\n" +
                            "•\tThe participants are requested to bring the soft copy of power point presentation.\n" +
                            "\n" +
                            "\n" +
                            "STUDENT COORDINATORS \n" +
                            "1. Vishala (8501015884)\n" +
                            "2. Srinivas (9703021815)";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;





            }

        }
    }

