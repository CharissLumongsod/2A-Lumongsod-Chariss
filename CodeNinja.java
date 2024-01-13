import java.util.Scanner;
public class CodeNinja {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Option opt = new Option();

        Home homepage = new Home(
                "***************************************************************- H_O_M_E -***********************************************************\n*                                                                                                                                   *",
                "*            Welcome to CodeNinja, the ultimate coding battleground where programmers clash to prove their coding prowess!          *\n*           Challenge fellow coders to real-time coding duels, showcasing your skills, and mastering the art of algorithms.         *\n*   Whether you're a seasoned developer or a coding enthusiast, CodeNinja is your arena to compete, learn, and emerge victorious.   *\n*                         Get ready to code, clash and conquer in this thrilling world of competitive coding!                       *\n*                                                                                                                                   *\n*************************************************************************************************************************************");
        About aboutpage = new About(
                "*************************************************************************- A_B_O_U_T -*************************************************************************\n*                                                                                                                                                             *",
                "*                         In the digital realm of code warriors, CodeNinja emerges as the epicenter of collaborative coding adventures.                       *\n*              Born out of a shared passion for innovation and skill refinement, our platform transcends the conventional boundaries of coding.               *\n*      We believe in fostering a community that thrives on the dynamic exchange of ideas, where every challenge is an oppurtunity to learn and grow.          *\n*   At CodeNinja, we're not just about competitions we're architects of a coding ecosystem that values cammaraderie, creativity and continuous improvement.   *\n*                        Join us on a journey where coding transcends the solitary act and transforms into a collective expperience.                          *\n*                      Unleash your potential, forge connections, and let the lines of code tell stories of collaboration and triumph.                        *\n*                                                                                                                                                             *\n***************************************************************************************************************************************************************");
        Services servicespage = new Services(
                "***************************************************************- S_E_R_V_I_C_E_S -***********************************************************\n*                                                                                                                                           *",
                "*                                    ClashCode offers an unparalleled experience in programming competitions                                *\n*           Allowing users to sharpen their coding skills against other skilled developers in a thrilling real-time battle arena            *");
        Contacts contactpage = new Contacts(
                "***************************************************************- C_O_N_T_A_C_T_S -***********************************************************\n*                                                                                                                                           *",
                "*                                          Have a question, suggestion, or just want to say hello?                                          *\n*                                 we'd love to hear from you! Here are the ways you can reach out to CodeNinja team:                        *\n*                                                                                                                                           *");

        // object for developers
        Zynah zynah = new Zynah();
        Mavene mavene = new Mavene();
        Cassy cassy = new Cassy();
        Chariz chariz = new Chariz();

        // object login
        Login login = new Login();

        // Set the benefits of possible customer
        servicespage.setBenefits(
                "\n*                                                         < (1) REAL-TIME CODING DUELS >                                                    *\n*                                                                                                                                           *\n*                Engage in thrilling one-on-one coding battles, putting your skills to the test against fellow enthusiasts.                 *\n*                                                                                                                                           *\n*                                                        < (2) SKILL-BOOSTING CHALLENGES >                                                  *\n*                                                                                                                                           *\n*     Sharpen your coding prowess with a variety of challenges designed to enhance your abilities and broaden your programming horizons.    *\n*                                                                                                                                           *\n*                                                       < (3) COLLABORATIVE Coding Projects >                                               *\n*                                                                                                                                           *\n*             Team up with like-minded coders to work on exciting projects, fostering creativity and shared learning experiences.           *\n*                                                                                                                                           *\n*********************************************************************************************************************************************");
        // Set the Contact Information
        contactpage.setstaff(
                """
                        *-------------------------------------------------------------------------------------------------------------------------------------------*
                        *                            EMAIL                                  *                                SOCIAL MEDIA                           *
                        *-------------------------------------------------------------------*-----------------------------------------------------------------------*
                        *        General Inquiries: info@codeninja.com                      *                --Connect with us on your favorite platforms--         *
                        *        Support: support@codeninja.com                             *                        Twitter: CodeNinja Twitter                     *
                        *                                                                   *                       Facebook: CodeNinja Facebook                    *
                        *                                                                   *                      Instagram: CodeNinja Instagram                   *
                        *                                                                   *                                                                       *
                        *********************************************************************************************************************************************""");

        for (;;) {

            // Table for Option
            System.out.println();
            System.out.println("**************C-O-D-E-N-I-N-J-A***************");
            System.out.println("*                                            *");
            System.out.println("*          Welcome Our Dear User......       *");
            System.out.println("*  CodeNinja & friends are waiting for you.  *");
            System.out.println("*   To discover more please choose below:    *");
            System.out.println("*                                            *");
            System.out.println("*           -------1.HOME-------             *");
            System.out.println("*          -------2.ABOUT-------             *");
            System.out.println("*         -------3.SERVICES-------           *");
            System.out.println("*         -------4.CONTACT-------            *");
            System.out.println("*        -------5.DEVELOPERS-------          *");
            System.out.println("*            ------6.LOGIN-----              *");
            System.out.println("*           -------0.EXIT-------             *");
            System.out.println("*                                            *");
            System.out.println("**********************************************");
            System.out.print(">>E>N>T>E>R>>>: ");
            int choice = input.nextInt();
            System.out.println();

            // A condition for choice entered by user
            if (choice == 1) {
                homepage.display();
            } else if (choice == 2) {
                aboutpage.display();
            } else if (choice == 3) {
                servicespage.display();
            } else if (choice == 4) {
                contactpage.display();
            } else if (choice == 5) {
                // table for developers
                System.out.println("*************Enter Choice**************");
                System.out.println("*                                     *");
                System.out.println("*        --(1)Lead Developer--        *");
                System.out.println("*        --(2)UX?UI Designer--        *");
                System.out.println("*       --(3)Backend Engineer--       *");
                System.out.println("*       --(4)Community Manager--      *");
                System.out.println("*                                     *");
                System.out.println("***************************************");
                System.out.print(">>E>N>T>E>R>>>: ");
                int num = input.nextInt();

                // A condition for num entered
                switch (num) {
                    case 1:
                        zynah.Developer();
                        zynah.Greetings();
                        zynah.Info();
                        break;

                    case 2:
                        cassy.Developer();
                        cassy.Greetings();
                        cassy.Info();
                        break;

                    case 3:
                        mavene.Developer();
                        mavene.Greetings();
                        mavene.Info();
                        break;

                    case 4:
                        chariz.Developer();
                        chariz.Greetings();
                        chariz.Info();
                        break;

                    default:
                        System.out.println("*---------------------------------------------------*");
                        System.out.println("*                                                   *");
                        System.out.println("*      Sorry!I think that's a wrong choice :(       *");
                        System.out.println("*                                                   *");
                        System.out.println("*---------------------------------------------------*");

                }
            } else if (choice == 6) {
                System.out.println("******************-L_O_G_I_N-************************");
                System.out.println("*                                                   *");
                System.out.println("*    Enter Email:                                   *");
                System.out.print("* >>E>N>T>E>R>>>: ");
                login.setuseremail(input.nextLine());
                login.setuseremail(input.nextLine());
                System.out.println("*    Enter Passcode:                                *");
                System.out.print("* >>E>N>T>E>R>>>: ");
                login.setpasscode(input.nextInt());
                System.out.println("*    Please check before you proceed                *");
                login.email();
                login.Pass();
                System.out.println("*     Data information you enterned is right?       *");
                System.out.println("*                                                   *");
                System.out.println("*          <1>Agree        <2>DisAgree              *");
                System.out.println("*                                                   *");
                System.out.println("*****************************************************");
                System.out.print(">>E>N>T>E>R>>>: ");
                int answer = input.nextInt();
                System.out.println();

                switch (answer) {
                    case 1:
                        System.out.println("*---------------------------------------------------*");
                        System.out.println("*                                                   *");
                        System.out.println("*               Login Succesfull....:)              *");
                        System.out.println("*                                                   *");
                        System.out.println("*---------------------------------------------------*");
                        break;

                    case 2:
                        System.out.println("*---------------------------------------------------*");
                        System.out.println("*                                                   *");
                        System.out.println("*        Please make it correct next time! :)       *");
                        System.out.println("*                                                   *");
                        System.out.println("*---------------------------------------------------*");
                        break;

                    default:
                        System.out.println("*---------------------------------------------------*");
                        System.out.println("*                                                   *");
                        System.out.println("*      Sorry!I think that's a wrong choice :(       *");
                        System.out.println("*                                                   *");
                        System.out.println("*---------------------------------------------------*");
                }

            } else if (choice == 0) {
                System.out.println("*---------------------------------------------------*");
                System.out.println("*                                                   *");
                System.out.println("*              Thank you!Goodbye.....:)             *");
                System.out.println("*                                                   *");
                System.out.println("*---------------------------------------------------*");
                System.exit(0);
            } else {
                System.out.println("*---------------------------------------------------*");
                System.out.println("*                                                   *");
                System.out.println("*      Sorry!I think that's a wrong choice :(       *");
                System.out.println("*                                                   *");
                System.out.println("*---------------------------------------------------*");
            }
            opt.EnterKey();
        }

    }
}
