package nokia;

import java.util.Scanner;

public class Nokia2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("List of menu functions -\n" +
                    "Press 1: for Phonebook \n" +
                    "Press 2: for Messages \n" +
                    "Press 3: for Chat \n" +
                    "Press 4: for call register \n" +
                    "Press 5: Tone" +
                    "\nPress 6: Settings \n" +
                    "Press 9: to switch off phone" +
                    "\nPress 99: to go back to main menu" +
                    "\nPress 80: to continue ");


            int phone = input.nextInt();
            switch (phone) {
                case 1:
                    System.out.println(" 1: Search\n 2: Service Nos. \n 3: Add name " +
                            "\n 4: Erase \n 5: Edit \n 6: Assign tone \n 7: Send b'card" +
                            "\n 8: Options \n 1: Type of view \n 2: Memory status \n 9: Speed dials \n 10: Voice tags");
                    int press = input.nextInt();
                    if (press == 80) {
                        continue;
                    } else if (press == 99) {
                        break;
                    }

                    int messages = input.nextInt();
                    switch (messages) {

                        case 2:
                            System.out.println("1: Write messages\n 2:inbox \n 3: Outbox \n 4: Picture messages \n 5: Templates" +
                                    " \n 6: Smileys \n 7: Message settings \n 1:Set 1 \n 1:Message centre number \n 2:Messages sent as" +
                                    " \n 3:Message validity \n 2: Common \n 1:Delivery reports \n 2:Reply via same centre \n" +
                                    "3:Character support \n 8:Info service \n 9:Voice mailbox number \n 10:Service command editor");
                            int click = input.nextInt();
                            if (click == 80) {
                                continue;
                            } else if (click == 99) {
                                break;

                            }
                    }
                    int chat = input.nextInt();
                    switch (chat) {

                        case 3:
                            System.out.println("chat");
                            int punch = input.nextInt();
                            if (punch == 80) {
                                continue;
                            } else if (punch == 99) {
                                break;
                            }

                            int callRegister = input.nextInt();
                            switch (callRegister) {

                                case 4:
                                    System.out.println("1:Missed calls \n 2:Received calls \n 3:Dialled numbers \n 4:Erase recent call lists \n" +
                                            "5:Show call duration \n 1:Last call duration 2:All calls' duration \n 3:Received calls' duration \n" +
                                            "4:Dialled calls' \n 5:Clear timers \n 6:Show call costs \n 1:Last call cost \n 2:All calls' cost" +
                                            " \n 3:Clear timers \n 6:Show call costs \n 1:Last call cost \n 2:All calls' cost \n 3:Clear counters" +
                                            " \n 7:Call cost settings \n 1:Call cost settings \n 2:Show costs in \n 8:Prepaid credit");
                                    int kponkpon = input.nextInt();
                                    if (kponkpon == 80) {
                                        continue;
                                    } else if (kponkpon == 99) {
                                        break;
                                    }
                            }
                            int tones = input.nextInt();
                            switch (tones) {

                                case 5:
                                    System.out.println("1:Ringing tone \n 2:Ringing volume \n 3:Incoming call alert \n" +
                                            "4:Composer \n 5:Message alert tone \n 6:Keypad tones \n 7:Warning and game tones \n" +
                                            "8:Vibrating alert \n 9:Screen saver");
                                    int press2 = input.nextInt();
                                    if (press2 == 80) {
                                        continue;
                                    } else if (press2 == 99) {
                                        break;
                                    }
                            }
                            int settings = input.nextInt();
                            switch (settings) {

                                case 6:
                                    System.out.println("1:Call settings \n 1:Automatic redial \n 2:Speed dialing \n 3:Call waiting" +
                                            "options \n 4:Own number sending \n 5:Phone line in use \n 6:Automatic answer \n" +
                                            "2:Phone settings \n 1:Language \n 2:Cell info display \n 3:Welcome note \n 4:Network selection" +
                                            "\n 5:Lights \n 6:Confirm SIM service actions \n 3:Security settings \n 1:PIN code request \n" +
                                            "2:Call barring service \n 3:Fixed dialing \n 4:Closed user group \n 5:Phone security \n" +
                                            "6:Change access codes \n 4:Restore factory settings \n 7:Call divert \n 8:Games \n 9:Calculator \n" +
                                            "10:Remainders \n 11:Clock \n 1:Alarm clock \n 2:Clock settings \n 3:Date setting \n 4:Stopwatch \n" +
                                            " 5:Countdown timer \n 6:Auto update of date and time \n 12:Profiles \n 13:SIM services");
                                    int press3 = input.nextInt();
                                    if (press3 == 80) {
                                        continue;
                                    } else if (press3 == 99) {
                                        break;
                                    }


                            }
                    }

            }
        }
    }
}
