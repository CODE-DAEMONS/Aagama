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
                 text ="DESCRIPTION:\n" +
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
                    text = "DESCRIPTION:\n" +
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
                    text = "DESCRIPTION:\n" +
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
                    text="DESCRIPTION::\n" +
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
                    text="DESCRIPTION:\n" +
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
                    text=" DESCRIPTION:\n" +
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
                    text="DESCRIPTION: \n" +
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
                    text="DESCRIPTION:\n" +
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
                    text="DESCRIPTION:\n" +
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


                case "Tech Hunt_2":
                    text1="Tech Hunt";
                    text=" DESCRIPTION:\n" +
                            "\n" +
                            "An event which brings out the scavenger in you, where each team races against time through the daunting physical tasks to be the first in finding the hidden treasure.\n" +
                            "\n" +
                            "\n" +
                            "Event Outline:\n" +
                            "\n" +
                            "The event will consist of two rounds: The Preliminary round and The Finals. The strength of the team must be 3 members.\n" +
                            "\n" +
                            "\n" +
                            "Round 1(Preliminary round):\n" +
                            "\n" +
                            "This is the preliminary round which is a written test. The participants will have to answer a questionnaire based on topics related to science and mathematics. They will be given 30 minutes to answer the questions and the Top 30 teams will qualify for the next round.\n" +
                            "\n" +
                            "\n" +
                            "Round 2(Finals):\n" +
                            "\n" +
                            "In this round, the teams will be provided with their first clue simultaneously which when deciphered leads them to the next location in the campus where they have to perform a task revealed on spot to obtain the next clue. Following the series of clues, the first team to decipher all the clues will be adjudged as the winners of the event. Along with them will be a committee member to look at their time and tally the points.\n" +
                            "\n" +
                            "\n" +
                            "Rules and regulations:\n" +
                            "\n" +
                            "1. Any student within the age group of 14- 25 years can participate and each team should consist of not more than three members.\n" +
                            "2. Use of mobile phones or any other electronic or communication device is prohibited during the event.\n" +
                            "3. Participants should note that they must accompany the committee member assigned to them till the event ends.\n" +
                            "4. The clues are to be found in a particular order. Manipulation of the order of clues will lead to disqualification.\n" +
                            "5. During the event team members cannot split up to find different clues. The entire team must stay together during the competition.\n" +
                            "6. Participants should carry their college or school ID cards.\n" +
                            "7. Organizers reserve the right to disqualify teams on the grounds of misbehaviour and use of unfair means. Their decision is considered final and not subjected to dispute.\n" +
                            "\n" +
                            "\n" +
                            "STUDENT COORDINATORS:\n" +
                            "1. T.S.SHASHANK (8712853934)\n" +
                            "2. S.SRIJA (8019547606)\n";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;

//INFORMATION TECHNOLOGY

                case "Paper Presentation_3" :
                    text1="Paper Presentation";
                    text=" DESCRIPTION:\n" +
                            "\n" +
                            "“I am not, But I am trying to” the phrases of Winston Churchill chilled out hearts of many people. This is a platform to expose your talent and in-depth knowledge on your interested areas. Come chill out the hearts of people with your innovative presentation.\n" +
                            "\n" +
                            "\n" +
                            "Rules and Regulations \n" +
                            "\n" +
                            "•\tMaximum of 2 members per team are allowed\n" +
                            "•\tAbstract should be only 1 page and paper can be maximum 15 pages\n" +
                            "•\tAbstract should be mailed prior to the event\n" +
                            "•\tOnly technical topics related to Computer Science and Information Technology are permitted\n" +
                            "•\tHard copy should be submitted to the event co-ordinator at the time of event\n" +
                            "\n" +
                            "\n" +
                            "Structure of Paper Presentation\n" +
                            "\n" +
                            "•\tIntroduction\n" +
                            "•\tBody \n" +
                            "•\tConclusion\n" +
                            "\n" +
                            "\n" +
                            "Student Co-ordinators\n" +
                            "1. G. Sindhu Priya (919154365089)\n" +
                            "2. M. Geethanjali (+918977411412)\n" +
                            "3. A. Ajay Chandra Gopal (7396650607)\n";
                    tv1.setText(text1);
                    tv.setText(text);
                    break;


                case "Bug The Bug_3" :
                    text1="Bug The Bug";
                    text="DESCRIPTION:\n" +
                            "\n" +
                            "This event consists of questions on C++ and Logical Puzzles.\n" +
                            "\n" +
                            "RULES AND REGULATIONS\n" +
                            "\n" +
                            "1.\tThe participants are not allowed to use mobiles or electronic devices or internet.\n" +
                            "2.\tThe questions shall be in the form of multiple choices.\n" +
                            "3.\tOnly one participant can participate at a time.\n" +
                            "4.\tThe decision of the coordinator is final and shall not be subjected to any changes.\n" +
                            "5.\tThere are no penalties for incorrect answer and only your first response will be considered.\n" +
                            "6.\tAny participant found indulging in any forms of malpractice will be immediately disqualified.\n" +
                            "\n" +
                            "\n" +
                            "STRUCTURE OF THE EVENT\n" +
                            "\n" +
                            "•\tRound 1- A total of 15 questions are put forth to all the participants in which they need to find the bugs.\n" +
                            "•\tRound 2- Consists of four puzzles which should be answered logically.\n" +
                            "\n" +
                            "STUDENT COORDINATORS\n" +
                            "\n" +
                            "1. Sonali Ghatay (9705940142)\n" +
                            "2. Y.Snigdha (9542897884)\n" +
                            "3. Y.Mahitha (9704173828)\n";
                    tv1.setText(text1);
                    tv.setText(text);
                    break;


                case "Code Cracker_3" :
                    text1="Code cracker";
                    text=" Description\n" +
                            "\n" +
                            "You have the skills, you have the knowledge but do you have what it takes to crack our codes faster than others?\n" +
                            "\n" +
                            "The event consist questions on:\n" +
                            "\n" +
                            "•\tC Programming\n" +
                            "\n" +
                            "Rules and Regulations:\n" +
                            "\n" +
                            "1.\tThe participants will not be allowed to carry mobile phones or any other electronic devices\n" +
                            "2.\tThe participants will be given question papers and must execute the programs in their given system.\n" +
                            "3.\tThe decision of the coordinators will be final.\n" +
                            "\n" +
                            "Structure of event:\n" +
                            "\n" +
                            "The quiz consists of three rounds, the 5 participants who execute the code faster than others will proceed to the next round.\n" +
                            "•\tRound 1: Consists of  2 questions and the 5 fastest participants of each batch will move on to the next round. Each batch consists of a maximum of 30 participants.\n" +
                            "•\tRound 2: The winners of round 1 will be given one question and the 5 fastest participants will move on to round 3.\n" +
                            "•\tRound 3:The winners of round 2 will be given one question and the participant who executes the code the fastest will be crowned the winner of code cracker\n" +
                            "\n" +
                            "Student Coordinators:\n" +
                            "• C Sankeerth (9652101839)\n" +
                            "• B Rohit (8008747832)\n" +
                            "•\tTarun K +919248084017\n";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;

                case "Technical Quiz_3" :
                    text1="Technical Quiz";
                    text=" DESCRIPTION:\n"+
                            "\n" +
                            "You have the skills, you have the knowledge but do you have what it takes to crack our codes faster than others?\n" +
                            "\n" +
                            "The event consist questions on:\n" +
                            "\n" +
                            "•\tC Programming\n" +
                            "\n" +
                            "Rules and Regulations:\n" +
                            "\n" +
                            "1.\tThe participants will not be allowed to carry mobile phones or any other electronic devices\n" +
                            "2.\tThe participants will be given question papers and must execute the programs in their given system.\n" +
                            "3.\tThe decision of the coordinators will be final.\n" +
                            "\n" +
                            "Structure of event:\n" +
                            "\n" +
                            "The quiz consists of three rounds, the 5 participants who execute the code faster than others will proceed to the next round.\n" +
                            "•\tRound 1: Consists of  2 questions and the 5 fastest participants of each batch will move on to the next round. Each batch consists of a maximum of 30 participants.\n" +
                            "•\tRound 2: The winners of round 1 will be given one question and the 5 fastest participants will move on to round 3.\n" +
                            "•\tRound 3:The winners of round 2 will be given one question and the participant who executes the code the fastest will be crowned the winner of code cracker\n" +
                            "\n" +
                            "Student Coordinators:\n" +
                            "• C Sankeerth (9652101839)\n" +
                            "• B Rohit (8008747832)\n" +
                            "•\tTarun K +919248084017\n";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;







//civil department


                case "Project Presentation_4" :
                    text1="Pariyojana Prastuti";
                    text=   "DESCRIPTION:\n" +
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
                            "\n" +
                            "STRUCTURE:\n" +
                            "\n" +
                            "Poster should be presented according to the theme given.\n" +
                            "\n" +
                            "\n" +
                            "STUDENT CO-ORDINATOR:\n" +
                            "\n" +
                            "R.SHARATH REDDY-8464805147\n" +
                            "NAVEEN KUMAR-8790305229\n";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;



                case "Paper Presentation_4" :
                    text1="PAPER PRASTUTI";
                    text="DESCRIPTION:\n" +
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
                    text="  DESCRIPTION:\n" +
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
                    text="  DESCRIPTION:\n" +
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
                    text=" DESCRIPTION:\n" +
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
                    text=" DESCRIPTION:\n" +
                            "\n" +
                            "Paper Presentation is all about how you put your topic or present your topic in front of the audience. They see the way you present your topic, he way you put your point, your presentation style, your language and how promptly and effectively you answer their questions. Then you have to prepare the ‘Abstract’\n" +
                            "\n" +
                            "\n" +
                            "Structure of the event :\n" +
                            "\n" +
                            "•\tSelect a Thesis and create suitable Abstract. \n" +
                            "•\tSubmission of Abstract (in a IEEE formatted Word document) for not more than 300 words before review date and mail to aagama.mech2k17@gmail.com ( MS word 2010 is recommended).\n" +
                            "•\tSelected Participants should submit a Hard copy of the paper with Abstract in IEEE format.\n" +
                            "•\tWinner is decided by a Selected Delegate invited from respective Head Of Department.\n" +
                            "\n" +
                            "\n" +
                            "Rules and Regulations :\n" +
                            "\n" +
                            "•\tMaximum of Two Authors.\n" +
                            "•\tPresentation should be a maximum of 7 to 10 minutes.\n" +
                            "•\tBased on the peering review of the abstract, few papers will be selected for presenting the paper.\n" +
                            "•\tThe oral presentation should be in form of Microsoft Power Point slides to the maximum of 8 to 10 slides.\n" +
                            "•\tThe presentation is strictly confined to only Technical topics.\n" +
                            "\n" +
                            "NUMBER OF DAYS OF EVENT:  2  DAYS \n" +
                            "\n" +
                            "\n" +
                            " \n" +
                            "Faculty Coordinators:\n" +
                            "1. P.Saritha (9949672656)    \n" +
                            "   Aagama2k17mech@cvsr.ac.in\n" +
                            "       \n" +
                            "2. PRIYA DARSHAN (8897725758)\n" +
                            "   Aagama2k17mech@cvsr.ac.in\n" +
                            "     \n" +
                            "\n" +
                            "Student Coordinators:\n" +
                            "SADANA \n" +
                            "E.SRIKANTH\n" +
                            "\n" +
                            "\n" +
                            "\n";
                    tv1.setText(text1);
                    tv.setText(text);
                    break;






//CHEMICAL ENGINEERING
/*
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
*/
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
                    text="DESCRIPTION:\n" +
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


                case "Anurag Talent Hunt_7" :
                    text1="Anurag Talent Hunt";
                    text="DESCRIPTION:\n" +
                            "\n" +
                            "1.\tThe Event is a Talent Hunt Competition where various people showcase their talents individually or in pairs or in groups. Each Participant(s) competes against the other Participant(s) and a qualifying Participant(s) shall proceed to the next levels of the competition of the Event, as per the format of the Event.\n" +
                            "2.\tThis registration process shall be open for the Participant(s) from 1st March 2017  to 16th March 2017.  \n" +
                            "          \n" +
                            "\n" +
                            "NUMBER OF DAYS OF EVENT: One day: 18 March 2017\n" +
                            "\n" +
                            "Student Coordinator:\n" +
                            "1. Anagha (9963003617)\n" +
                            "2. Shruthi reddy (8341741851)\n" +
                            "\n  ";

                    tv1.setText(text1);
                    tv.setText(text);
                    break;


//MBA DEPARTMENT

                case "Paper Presentation_8" :
                    text1="Paper Presentation";
                    text="  DESCRIPTION:\n" +
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
                    text="  DESCRIPTION:\n" +
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
                    text="  DESCRIPTION:\n" +
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
                    text="  DESCRIPTION:\n" +
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

