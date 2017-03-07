package com.cvsr.admin.aagama.Description;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.cvsr.admin.aagama.R;

/**
 * Created by ADMIN on 3/7/2017.
 */

public class FunDescription extends Activity {
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

            case "Selfie Story":
            text1="Selfie Story";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "“It’s time to put your creative skills on forming a unique selfie  story with the help of hidden clues”\n" +
                    "\n" +
                    "RULES:\n" +
                    "\n" +
                    "1. A team shall consist of max 3 persons or min 2.\n" +
                    "2. The decision of the organizer will be the final and will not  be subjected to any  change.\n" +
                    "3. The participants should  carry a smartphone with front camera.\n" +
                    "4. The story should be related to the selfies along with the clues provided.\n" +
                    "5. The selfie must be of a participant.\n" +
                    "6. The time limit for completing the task is 30min,and the participants after the time limit aren’t  considered.\n" +
                    "7. The Judgment is done based  on task completion within the time and elegant way of representing the story. \n" +
                    "\n" +
                    "PROCEDURE:\n" +
                    "\n" +
                    "Round 1:Four groups compete at a time and the winning group competes \n" +
                    "Round 2:The winners of round 1 are eligible to round 2.\n" +
                    "Round 3:The winners of  round 2 compete and  the final winner  is selected and will be awarded with a  cash prize.\n" +
                    "\n" +
                    "STUDENT COORDINATORS:\n" +
                    "\n" +
                    "1. S.V.R.Prasad -9985603712\n" +
                    "2. S.Gautham raj- 9063777870\n" +
                    "3. J.Manish rao- 8179440275\n" +
                    "\n" +
                    "FACULTY COORDINATORS:\n" +
                    "\n" +
                    "1. Mr.Jayendra Kumar\n" +
                    "2. Mr.Shiva prashanth";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Pie Face Challenge":
            text1="Pie Face Challenge";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "Fest is all about coming out of technical zone and drowning in a world of laughter and fun.\n" +
                    "This is about challenging your buddy of thwarting your face with a pie.\n" +
                    "Structure: It’s a two player game where you spin the spinwheel to get a number. So that you have to spin the pie machine (with whip cream) the same number of times. Try your luck of not spoiling your face while you spin the pie machine. Among the two, the one who sustains longer without a pie on their face is declared the winner.\n" +
                    "\n" +
                    "RULES: \n" +
                    "\n" +
                    "A team should consists of 2 where one at a time is played.\n" +
                    "Players should handle the machine carefully. Whoso ever damages the machine should bear the amount of it.\n" +
                    "\n" +
                    "STUDENT COORDINATORS:\n" +
                    "\n" +
                    "1. Teja shree-9652356440\n" +
                    "2. Soundarya -8374884204\n" +
                    "3. M.Spandana -7702257527\n" +
                    "4. S.Phani Bhushan-9492933071\n" +
                    "\n" +
                    "FACULTY COORDINATORS:\n" +
                    "\n" +
                    "1. Mrs.K.Shailaja\n" +
                    "2. Mrs.T.Veda reddy";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Plan It":
            text1="Plan It";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "Time to put on your thinking caps!\n" +
                    "Plan it provides you an excellent opportunity to show your innovation skill designing. It doesn’t require any technical knowledge but  purely your imagination. \n" +
                    "\n" +
                    "RULES:\n" +
                    "\n" +
                    "1. A team shall consist of max 3 persons or min 1 person.\n" +
                    "2. Participants need to draw a blue print and write down the facilities that they would like to add\n" +
                    "3. The participant shall not be allowed to use mobile.\n" +
                    "4. Audience shall not give any hint or clues to the competitors.\n" +
                    "5. Judgement given by the Judges will be final.\n" +
                    "\n" +
                    "NO OF DAYS:\n" +
                    "\n" +
                    "2\n" +
                    "\n" +
                    "STUDENT COORDINATORS:\n" +
                    "\n" +
                    "1. Ashish-7039440177\n" +
                    "2. Abhishek-8341510311\n" +
                    "3. P.Rahul-9866503942\n" +
                    "\n";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Logo Quiz":
            text1="Logo Quiz";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "Are you good at identifying logos and movies? Then put your skills to test and see just how much you really know about logos and movies in this fun quiz game!\n" +
                    "\n" +
                    "RULES:\n" +
                    "\n" +
                    "1. A team shall consist of max two persons or min one person.\n" +
                    "2. The decision of the quiz master will be the final and will not be subjected to any changes.\n" +
                    "3. The participants shall not be allowed to use mobile or other electronic instruments.\n" +
                    "4. The questions will be in the form of pictures and fill in the blanks.\n" +
                    "5. Audience shall not give any hints or clues to the competitors.\n" +
                    "\n" +
                    "NO OF DAYS:\n" +
                    "\n" +
                    "2\n" +
                    "\n" +
                    "STUDENT COORDINATORS:\n" +
                    "\n" +
                    "1. S.SREEKALA – 9966990253\n" +
                    "2. SUNIL – 8886314327\n" +
                    "3. SIDDHAANTH – 8184911317\n" +
                    "4. SWATHI-";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Investments":
            text1="Investments";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "It’s a great fun time to move into present world awareness of what happening around you. At this Mind Boggling event come test your knowledge, memory power and strategies.\n" +
                    "This event consists of question on:\n" +
                    "1. General knowledge & Current affairs.\n" +
                    "2. Science and technology (Academic related).\n" +
                    "3. Movies, music.\n" +
                    "4. Brain teasers.\n" +
                    "\n" +
                    "RULES:\n" +
                    "\n" +
                    "1. A team shall consist of max two persons or min one person.\n" +
                    "2. The participants shall not be allowed to use mobile or other electronic instruments.\n" +
                    "3. The question can be asked in multiple choices, specific questions or by showing images.\n" +
                    "4. Audiences shall not give any hints or clues to the competitors.\n" +
                    "\n" +
                    "NO OF PARTICIPANTS:\n" +
                    "\n" +
                    "2\n" +
                    "\n" +
                    "STUDENT COORDINATORS:\n" +
                    "\n" +
                    "1. Mounika : 9951520129.\n" +
                    "2. Vinetha: 7386390197\n" +
                    "3. Sindhu: 7801015327";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Scary House":
            text1="Scary House";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "How is it about  the fear that we like ???\n" +
                    "A lot will happen once you  enter the  scary house .This is exclusively   for the one who wants to be scared.your heart will beat fast ,you will sweat and after a time you will  even get ready to run away.you will surely experience a lot of joy and excitement.\n" +
                    "\n" +
                    "RULES:\n" +
                    "\n" +
                    "1. Participants should not damage the setup.\n" +
                    "2. No limit for number of participants.\n" +
                    "3. Participants per head will be charged.\n" +
                    "4. For any type of misbehavior, action will be taken.\n" +
                    "\n" +
                    "STRUCTURE:\n" +
                    "\n" +
                    "Participants will experience a lot of joy and excitement.\n" +
                    "\n" +
                    "STUDENT CO-ORDINATOR:\n" +
                    "\n" +
                    "1. SUSHMA-8125692561\n" +
                    "2. B.AMULYA-9640473959\n";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Treasure Hunt":
            text1="Treasure Hunt";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "It is a game in which the players search for hidden objects by following a trail of clues\n" +
                    "\n" +
                    "RULES:\n" +
                    "\n" +
                    "1. Participation will be team or individual\n" +
                    "2. The seekers need to read each clue they find and figure out the next location\n" +
                    "3. It’s fun to play inside or outside\n" +
                    "4. Time limit will be there.\n" +
                    "\n" +
                    "STRUCTURE:\n" +
                    "\n" +
                    "By using clues we have to reach the destination.\n" +
                    "\n" +
                    "STUDENT COORDINATORS:\n" +
                    "\n" +
                    "1. G.Charuni - 9701587708\n" +
                    "2. T.sai Krishna - 8688388601\n";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Dubsmash":
            text1="Dubsmash";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "It is a game in which one will make action for the movie titles or dialogues\n" +
                    "\n" +
                    "RULES: \n" +
                    "\n" +
                    "1. Two chances will be given to the participant to make good dub.\n" +
                    "2. Time limit will be there.\n" +
                    "3. Good eye contact, lip sync.\n" +
                    "\n" +
                    "STRUCTURE OF THE GAME:\n" +
                    "\n" +
                    "Based on the action performance winner will be awarded.\n" +
                    "\n" +
                    "STUDENT COORDINATORS:\n" +
                    "\n" +
                    "1. M.Sirish – 8374308851\n" +
                    "2. N.Vijaya - 8801785919\n";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Brain Twister":
            text1="Brain Twister";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "This game consist of three round\n" +
                    "Word rush\n" +
                    "Quiz\n" +
                    "Master mind\n" +
                    "\n" +
                    "STRUCTURE OF THE GAME:\n" +
                    "\n" +
                    "Round (1) : word rush  \n" +
                    "In this round there will be a time limit who ever completes before time would proceed to 2nd  round\n" +
                    "\n" +
                    "Round(2): Quiz\n" +
                    "In this round there will be given a set of 10 questions and participants need    to complete the task in a given time limit and whoever completes before time proceed to 3rdround\n" +
                    "\n" +
                    "Round(3): Master mind \n" +
                    "coming to 3rd round it’s a final round, so the participants would be given a riddle and  need to solve it as soon as possible\n" +
                    "\n" +
                    "RULES:\n" +
                    "\n" +
                    "1. Registration fee per head 25/-\n" +
                    "2. There would be time limit for each level\n" +
                    "3. Price money would be there\n" +
                    "\n" +
                    "NO OF DAYS:\n" +
                    "\n" +
                    "2 DAYS\n" +
                    "\n" +
                    "STUDENT COORDINATORS:\n" +
                    "\n" +
                    "1. NEERAJA\n" +
                    "Aagama2k17mech@cvsr.ac.in\n" +
                    "9705817478\n" +
                    "\n" +
                    "2. K. RAMYA \n" +
                    "Aagama2k17mech@cvsr.ac.in\n" +
                    "9550830079\n" +
                    " \n" +
                    "3. N. SREEKANTH\n" +
                    "4. P. RAMYA\n" +
                    "5. J. MOUNIKA\n" +
                    "\n" +
                    "EXPECTED NO OF PARTICIPANTS:\n" +
                    "\n" +
                    "30\n" +
                    "\n" +
                    "COST:\n" +
                    "\n" +
                    "25/- ";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Minute To WIn It":
            text1="Minute To WIn It";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "CITRUS SPOON :\n" +
                    "· Participants have to hold spoon in their mouth and place lemon in that spoon.\n" +
                    "· Participants to cover the marked distance in quick possible time.\n" +
                    "· The Quickest wins the race.\n" +
                    "SHIFT’EM\n" +
                    "·  It’s a game of Thermocol Balls.\n" +
                    "·  When there are two coloured balls in two separate bowls, the participant have to classify them using straw.\n" +
                    "·  Quickest wins the race.\n" +
                    "MANNY THE MAMMOTH\n" +
                    "·  The competition of who drinks more water in give time period.\n" +
                    "·  Participant with huge space is the Manny The Mammoth.\n" +
                    "BAT 4 PAT\n" +
                    "·  Cricket fan participant have to keep tapping the ball to air.\n" +
                    "·  Player who holds ball in air for more time wins the price money.\n" +
                    "MATCH STICK MILE :\n" +
                    "·  Participant Have to measure certain distance using match stick from initial line for a given amount of time.\n" +
                    "·  Winner is the one who measures the long.\n" +
                    "DAILOGUE DRILL :\n" +
                    "·  This game is selected aptly for Movie buffs.\n" +
                    "·  The player has to utter any dialogue or a conversation from any scene without break in between.\n" +
                    "·  The buff with high intensity wins the game.\n" +
                    "CUP CAKE :\n" +
                    "·  Player initially has a cup pyramid in front of him, where he has to remove the cups one after other without causing any collapse in the pyramid.\n" +
                    "·  After dissembling of Pyramid, the player again has to rebuild using the same cups in the span of 1 minute.\n" +
                    "·  The player with best output is awarded.\n" +
                    "HOLD IT :\n" +
                    "·  Player has to hold a brick only with two finger without interruption.\n" +
                    "·  Such player with long span of time is rewarded.\n" +
                    "\n" +
                    "RULES:\n" +
                    "\n" +
                    "IT’S A TIME BASED EVENT\n" +
                    "\n" +
                    "NO OF DAYS:\n" +
                    "\n" +
                    "2 DAYS\n" +
                    "\n" +
                    "STUDENT COORDINATOS:\n" +
                    "\n" +
                    "1. POOJA\n" +
                    "Aagama2k17mech@cvsr.ac.in\n" +
                    "8886882433\n" +
                    "\n" +
                    "2. PRAVARAVYA\n" +
                    "Aagama2k17mech@cvsr.ac.in\n" +
                    "9581802767\n" +
                    "\n" +
                    "3. PRADEEP\n" +
                    "4. J. ROTITH\n" +
                    "5. K. ABHISHEK REDDY \n" +
                    "6. Y. VENKAT REDDY\n" +
                    "\n" +
                    "EXPECTED NO OF PARTICIPANTS:\n" +
                    "\n" +
                    "30\n" +
                    "\n" +
                    "COST:\n" +
                    "\n" +
                    "30/- ";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Crack It":
            text1="Crack It";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "This event consists of sub events which are as follows:\n" +
                    "1) GET ME THERE:                                                                                                                                                                                                                                                                      \n" +
                    "Every partcipant is given a maze who need to complete  in a specified time.\n" +
                    "Rule:Once game is started by a paticipant it should be  completed in single turn.Second chance will not be given.\n" +
                    "\n" +
                    "2) MISSING LETTERS:\n" +
                    "In this,participant should fill  the missing letters in appropriate spaces provided in the block  in a paper with in a specified time in which the words to be  filled words are known to co-ordinators.\n" +
                    "\n" +
                    "3) WORD BULIDING:\n" +
                    "This is a multiplayer event in which the participants have to form words by using random letters in a given block \n" +
                    "Note:Winner will be announced based on the no. of words  created by participant.\n" +
                    "\n" +
                    "4) SEARCH ME IF U CAN:\n" +
                    "Participant should search the announced no. with in a given time in the block of numbers given by us .\n" +
                    "Note: Number of no's to be announced  depends on participants.\n" +
                    "\n" +
                    "5) PYRAMID BULIDING:\n" +
                    "Pyramid should be made by playing cards provided by us on the table with in a specified time \n" +
                    "Note: The person who builds  fast will be daclared as winner and will be given price money based on participants we got enrolled\n" +
                    "\n" +
                    "RULES:\n" +
                    "\n" +
                    "IT’S A TIME BASED EVENT\n" +
                    "\n" +
                    "NO OF DAYS:\n" +
                    "\n" +
                    "2 DAYS\n" +
                    "\n" +
                    "STUDENT COORDINATOR:\n" +
                    "\n" +
                    "1. KALYANI \n" +
                    "Aagama2k17mech@cvsr.ac.in\n" +
                    "8978738799\n" +
                    "\n" +
                    "2. O. SAI KRISHNA \n" +
                    "Aagama2k17mech@cvsr.ac.in\n" +
                    "9533037101\n" +
                    "\n" +
                    "3. VARUN REDDY\n" +
                    "4. SANDEEP\n" +
                    "5. STEVEN\n" +
                    "6. RAVI KIRAN\n" +
                    "\n" +
                    "EXPECTED NO OF PARTICIPANTS:\n" +
                    "\n" +
                    "30\n" +
                    "\n" +
                    "COST:\n" +
                    "\n" +
                    "50/- \n";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Filmy Quiz":
            text1="Filmy Quiz";
            text="RULES:\n" +
                    "\n" +
                    "1. Each team will comprise of 3 candidates.\n" +
                    "2. The quiz will have 1 Elimination round and 3 final rounds. \n" +
                    "3. 4 teams will be selected for final round.\n" +
                    "4. The last date of receiving the registration fee (of Rs.300/- (group of three students) )is 15th March  2017 \n" +
                    "5. Elimination : This will consist of 15 objective questions which have to be solved in 5 minutes. 4 highest scoring teams will compete in the finals. \n" +
                    "6. The last 3 rounds will be played among 4 teams. \n" +
                    "7. Finals : Consists of 3 rounds\n" +
                    "- First round: General questions and Visual Round\n" +
                    "- Second round: Buzzer Round\n" +
                    "- Third round: Rapid Fire Round\n" +
                    "\n" +
                    "NUMBER OF DAYS OF EVENT: \n" +
                    "\n" +
                    "One day: 17 March 2017\n" +
                    "\n" +
                    "STUDENT COORDINATOR:\n" +
                    "\n" +
                    "Sri Harika: 9010265184";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Halloween":
            text1="Halloween";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "It is a zone where you can enjoy by taking selfies with funny goggles , masks or Halloween makeup.\n" +
                    "\n" +
                    "NUMBER OF DAYS OF EVENT: \n" +
                    "\n" +
                    "Two day: 17th & 18th March 2017\n" +
                    "\n" +
                    "STUDENT COORDINATOR:\n" +
                    "\n" +
                    "Ruksana: 9963079740";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Do Or  Die":
            text1="Do Or  Die";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "Dare accepting game\n" +
                    "Coordinator will be tricking the participant \n" +
                    "\n" +
                    "NO OF DAYS:\n" +
                    "\n" +
                    "2 days\n" +
                    "\n" +
                    "STUDENT COORDINATORS:\n" +
                    "\n" +
                    "1. R. Veena\n" +
                    "rekula.veena@gamil.com\n" +
                    "7032357249\n" +
                    "\n" +
                    "2. P. Venu gopal goud\n" +
                    "venugopalvgove@gmail.com\n" +
                    "8897206080\n" +
                    "\n" +
                    "3. D. Rohith reddy\n" +
                    "rreddydakuri@gmail.com\n" +
                    "9985858571 \n";
            tv1.setText(text1);
            tv.setText(text);
            break;

            case "Ulta Palta":
            text1="Ulta Palta";
            text="DESCRIPTION:\n" +
                    "\n" +
                    "Reverse number chasing \n" +
                    "No helping hands\n" +
                    "\n" +
                    "NO OF DAYS:\n" +
                    "\n" +
                    "2 days\n" +
                    "\n" +
                    "STUDENT COORDINATORS:\n" +
                    "\n" +
                    "1. D. Gayathri \n" +
                    "dudapgayathri@gmail.com\n" +
                    "9542636688\n" +
                    "\n" +
                    "2. D.Koushik\n" +
                    "rohithssnk@gmail.com\n" +
                    "9030000828\n";
            tv1.setText(text1);
            tv.setText(text);
            break;




        }
        }

        }
