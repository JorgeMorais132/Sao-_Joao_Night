package org.academiadecodigo.cunnilinux.multiplayergame.menus;

import org.academiadecodigo.cunnilinux.multiplayergame.Drinks;
import org.academiadecodigo.cunnilinux.multiplayergame.Foods;

public class Options {
    public static final int DEFAULT_PORT = 8000;
    public static final int MIN_PLAYERS = 2;
    public static final int MAX_PLAYERS = 100;
    //------------------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    // -------------         MENUS          -----------------
    public static final String[] GOBACK_OPT = new String[]{"Go back"};
    //-------------------------------------------------------------------------------
    // INTRO
    public static final String[] INTRO_OPT = new String[]{"Play","Rules","Quit"};
    public static final String INTRO_HEADER = "" +
            "   _____      _        /\\/|         _   _ _       _     _   \n" +
            "  / ____|    | |      |/\\/         | \\ | (_)     | |   | |  \n" +
            " | (___      | | ___   __ _  ___   |  \\| |_  __ _| |__ | |_ \n" +
            "  \\___ \\ _   | |/ _ \\ / _` |/ _ \\  | . ` | |/ _` | '_ \\| __|\n" +
            "  ____) | |__| | (_) | (_| | (_) | | |\\  | | (_| | | | | |_ \n" +
            " |_____(_)____/ \\___/ \\__,_|\\___/  |_| \\_|_|\\__, |_| |_|\\__|\n" +
            "                                             __/ |          \n" +
            "                                            |___/           ";


    public static final String PLAYERNAME_HEADER = "Write your name...";
    public static final String SETGROUPSIZE_HEADER = "With how many players you want to play?";
    public static final String WAITINGROOM_HEADER = "WAITING FOR THE OTHER PLAYERS...";
    //public static final String WAITINGROOM_OPT = ;

    //-------------------------------------------------------------------------------
    // RULES
    public static final String RULES_TEXT = "" +
            "In this open world role play we try to replicate the adventurous party in the longest night of the year, Noite de São João.\n" +
            "Every decision you make during the night will influence how your night ends and your final score. It's up to you to live through the night\n" +
            "and try to finnish it in the best way possible. But beware, the danger may lurk when least expected. Be safe and above all, HAVE FUN.\n" +
            "\n" +
            "        Name - The name you would like to be called.\n" +
            "\n" +
            "        Money - Takes track of all of your expenditures. Starts at 0 and every item you purchase will cost you money that will add to the final amount.\n" +
            "\n" +
            "        Health - Takes track of your Health points. Starts at 100 and goes up and down depending on your choices. Beware, 0 is game over.\n" +
            "\n" +
            "        Food count - Takes track of the things you eat during the night. Starts at 0 and only goes up depending on your choices.\n" +
            "\n" +
            "        Drunkenness - Takes track of your alcohol levels. Starts at 0 at the beginning of the night and goes up and down depending on your choices.\n" +
            "\n" +
            "        Love - Maybe you bump in the person of your life...";

    //-------------------------------------------------------------------------------
    // SAO JOAO STREET
    public static final String[] SJOAOSTREET_OPT = new String[]{"Jump over the fire", "Enter Tasca das Tias","Tasca", "Enter Classic Bar  10€","Try your luck", "Go back"};
    public static final String SJOAOSTREET_HEADER = "" +
            "   _____      _        /\\/|          _____ _                 _   \n" +
            "  / ____|    | |      |/\\/          / ____| |               | |  \n" +
            " | (___      | | ___   __ _  ___   | (___ | |_ _ __ ___  ___| |_ \n" +
            "  \\___ \\ _   | |/ _ \\ / _` |/ _ \\   \\___ \\| __| '__/ _ \\/ _ \\ __|\n" +
            "  ____) | |__| | (_) | (_| | (_) |  ____) | |_| | |  __/  __/ |_ \n" +
            " |_____(_)____/ \\___/ \\__,_|\\___/  |_____/ \\__|_|  \\___|\\___|\\__|";

    //-------------------------------------------------------------------------------
    // SALTAR A FOGUEIRA
    public static final String JUMPFIRE_HEADER =
            "⠀⠀⠀⠀⠀⠀⢱⣆⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠈⣿⣷⡀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⢸⣿⣿⣷⣧⠀⠀⠀\n" +
            "⠀⠀⠀⠀⡀⢠⣿⡟⣿⣿⣿⡇⠀⠀\n" +
            "⠀⠀⠀⠀⣳⣼⣿⡏⢸⣿⣿⣿⢀⠀\n" +
            "⠀⠀⠀⣰⣿⣿⡿⠁⢸⣿⣿⡟⣼⡆\n" +
            "⢰⢀⣾⣿⣿⠟⠀⠀⣾⢿⣿⣿⣿⣿\n" +
            "⢸⣿⣿⣿⡏⠀⠀⠀⠃⠸⣿⣿⣿⡿\n" +
            "⢳⣿⣿⣿⠀⠀⠀⠀⠀⠀⢹⣿⡿⡁\n" +
            "⠀⠹⣿⣿⡄⠀⠀⠀⠀⠀⢠⣿⡞⠁\n" +
            "⠀⠀⠈⠛⢿⣄⠀⠀⠀⣠⠞⠋⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠉⠀⠀⠀⠀⠀⠀⠀";

    public static final String[] JUMPFIRE_OPT = {"Jump again","Go back"};

    //-------------------------------------------------------------------------------
    // TASCA DAS TIAS
    public static final String[] TTIAS_OPT = new String[]{"Go to bar", "Go back"};
    public static final String TTIAS_HEADER = "" +
            "  _______                        _             _______ _           \n" +
            " |__   __|                      | |           |__   __(_)          \n" +
            "    | | __ _ ___  ___ __ _    __| | __ _ ___     | |   _  __ _ ___ \n" +
            "    | |/ _` / __|/ __/ _` |  / _` |/ _` / __|    | |  | |/ _` / __|\n" +
            "    | | (_| \\__ \\ (_| (_| | | (_| | (_| \\__ \\    | |  | | (_| \\__ \\\n" +
            "    |_|\\__,_|___/\\___\\__,_|  \\__,_|\\__,_|___/    |_|  |_|\\__,_|___/";

    public static final String[] TTIAS_BAR_OPT = new String[]{"Order food", "Order drink", "Go back"};
    public static final String TTIAS_BAR_HEADER = "WHAT DO YOU WANT TO ORDER?";
    public static final String[] TTIAS_DRINKS_OPT = getDrinkNamePrices(1);

    public static final String TTIAS_DRINKS_HEADER = "O que vai ser para beber?";

    public static final String TTIAS_FOODS_HEADER = "Quié que vai comer?";

    public static final String[] TTIAS_FOOD_OPT = getFoodNamePrices(1);



    //-------------------------------------------------------------------------------
    // CLASSIC
    public static final String[] CLASSIC_OPT = new String[]{"Go to bar", "Watch the show", "Ask for lap dance  40€","Talk to people","Go back"};
    public static final String CLASSIC_HEADER = "" +
            "   _____ _               _        ____             \n" +
            "  / ____| |             (_)      |  _ \\            \n" +
            " | |    | | __ _ ___ ___ _  ___  | |_) | __ _ _ __ \n" +
            " | |    | |/ _` / __/ __| |/ __| |  _ < / _` | '__|\n" +
            " | |____| | (_| \\__ \\__ \\ | (__  | |_) | (_| | |   \n" +
            "  \\_____|_|\\__,_|___/___/_|\\___| |____/ \\__,_|_|  ";

    public static final String CLASSIC_BAR_HEADER = "Choose your poison!";
    public static final String[] CLASSIC_BAR_OPT = getDrinkNamePrices(2);


    public static final String CLASSIC_SHOW_HEADER =
            "                                                                                          \n" +
            "        .........                                                                         \n" +
            "     ...............                                                                      \n" +
            "   ..................                                                                     \n" +
            "   .................,.                                                                    \n" +
            "   ................./                                                                     \n" +
            "      ...............                                                                     \n" +
            "       . ........                                                                         \n" +
            "         ...........                                                                      \n" +
            "       . ............                    ......                                           \n" +
            "       ....................             ........                                          \n" +
            "         ....................         ..........                                          \n" +
            "         .................          ............                                          \n" +
            "          .................       ..............                                          \n" +
            "           .................    ................    . ..                                  \n" +
            "            ..., ...........   .................  ......... ,                             \n" +
            "           .....    ......... .................................. .                        \n" +
            "            ....     ................................................                     \n" +
            "           ......    .................................         ,.......*                  \n" +
            "           .....     .............................                . ...........           \n" +
            "            ...      ............................                    .,.........          \n" +
            "            ..,.     ..................   ..........                   ... ........,...,  \n" +
            "        .  ...       .............         ..........                   ,. /...........,. \n" +
            "     /........         ....... .           ...  ..........              ..  ........... . \n" +
            "                                           ,..   .........                                \n" +
            "                                           ...   .........                                \n" +
            "                                                    . ..                                  \n" +
            "                                                                             ";

    public static final String LAPDANCE_HEADER = "/*\n" +
            " *                       _..--''`-..._\n" +
            " *                     -'             `-.\n" +
            " *                  .-'                  `-.\n" +
            " *                 /   .-'''''''''--.       \\\n" +
            " *                 |  /__........_   `-.    |\n" +
            " *                  \\ / -. .--._  ``-._ |   /\n" +
            " *                   / /\\ V //  `--._ -`-  /\n" +
            " *                  / / || | |       \\\\ \\`/\n" +
            " *                   |  || |\\|        \\\\ \\\n" +
            " *                  /| // /-._   _... ||  \\\n" +
            " *                 //\\ \\ /      ||\\\\|   \\ \\\n" +
            " *                 /  \\//     /      // |\\\\    \n" +
            " *                 \\| \\\\_\\    ._/   // /|//\n" +
            " *                  |\\ //|\\  .__.   / / |//\n" +
            " *                   \\|/// \\ `=='  / / ///\n" +
            " *                    \\//  |\\    .' / // -.\n" +
            " *                        /-.`--' -'.' |   `------.\n" +
            " *                 _..---' \\ `-..-'   /            \\            .\n" +
            " *              .-'         \\  /@ \\  /              \\         . \\\\\n" +
            " *             |     .$.     \\/.--.\\/_               \\       /|#||\n" +
            " *             /     $$$  _-'         `-.       /     .    .'  #||\n" +
            " *            .   \\  `$' /               \\      |     |   :   _#/\n" +
            " *            |    |    /           /    /      \\     |   |  / #\n" +
            " *            |    /    `.     \\   /    /        \\    |   /  : 6\n" +
            " *            |   /       `-.      .   /          |   |  /   ' 9\n" +
            " *            |  |           `-/.___.-'           |.==\\.'   /.-6-.\n" +
            " *            |  |            /      \\            |   /    /((   ))\n" +
            " *            |`= \\        ..-    @   \\          /   /    :  `-.-'\n" +
            " *           |     `..___--            `--..__.-'  .'     :\n" +
            " *           '      |\\            @            /| /      /\n" +
            " *          /       :|___________...._________/ \\       /\n" +
            " *         .        /|                       /   \\     /\n" +
            " *         :       / /                      /     `._.'\n" +
            " *         |     .'./ \\                    /\n" +
            " *         |     :/    `.                 |\n" +
            " *         |    /'       `-.              |\n" +
            " *         :   /            `-.  c     _.'\\\n" +
            " *        /   /                `-..--''    \\\n" +
            " *       /   /       .                     |\n" +
            " *      /   /`-.       .       @           |\n" +
            " *     .-- \\    `-._    .             .    |\n" +
            " *   _/    \\\\_______\\______________________/____\n" +
            " * ((_\\\\\\\\\\|u((_________________________________)\n" +
            " *     `---|             \\       __..---''\n" +
            " *         \\              \\ _.--'        |\n" +
            " *                         /             /\n" +
            " *          \\             /\n" +
            " *                       |              /\n" +
            " *           \\           |\n" +
            " *            \\          |             /\n" +
            " *             \\         |            /\n" +
            " *              \\        |           /\n" +
            " */";







    //-------------------------------------------------------------------------------
    // TASCA
    public static final String TASCA_HEADER = "" +
            "  _______                  \n" +
            " |__   __|                 \n" +
            "    | | __ _ ___  ___ __ _ \n" +
            "    | |/ _` / __|/ __/ _` |\n" +
            "    | | (_| \\__ \\ (_| (_| |\n" +
            "    |_|\\__,_|___/\\___\\__,_|";
    public static final String[] TASCA_OPT = new String[]{"Order drinks", "Order food","Try your luck!!","Talk to people","Go back"};
    public static final String TASCA_DRINK_HEADER = "Whariuwana drink??";
    public static final String[] TASCA_DRINK_OPT = getDrinkNamePrices(3);
    public static final String TASCA_FOOD_HEADER = "Whariuwana eat??";
    public static final String[] TASCA_FOOD_OPT = getFoodNamePrices(3);

    //------------------------------------------------------------------------------------------------------------------
    // PIROPOS
    public static final String PIROPO1 = "Hi, my name's Microsoft. Can I crash at your place tonight?";
    public static final String PIROPO2 = "You are the html of myLife.com!";
    public static final String PIROPO3 = "Do you wanna be the server of my LAN?";
    public static final String PIROPO4 = "Here's my number: 0011 0011 1011 0001 0010 1000 0101";
    public static final String PIROPO5 = "You make my software turn hardware!!";
    public static final String PIROPO6 = "I am a Buffered Reader. You input meaning into my life!";
    public static final String[] PIROPO_OPT=new String[]{PIROPO1,PIROPO2,PIROPO3,PIROPO4,PIROPO5,PIROPO6,"Go back"};
    public static final String PIROPO_HEADER="Try your luck!!!";


    //_____________________FINAL_________________________________________________________________________

    public static final String GAME_OVER_HEADER="GAME OVER!!!!!!!!!!!\n" +
            "[0;37;5;47;107m                                                                                                    \u001B[0m\n" +
            "\u001B[0;37;5;47;107m  .  . .  .  . .  .  . .  .  . .  .  . .  .  . .  .  . .  .  . .  .  . .  .  . .  .  . .  .  . .  . \u001B[0m\n" +
            "\u001B[0;37;5;47;107m   .       .       .       .       .       .       .       .       .       .       .       .        \u001B[0m\n" +
            "\u001B[0;37;5;47;107m     .  .    .  .    .  .    .  .    .  .    .  .    .  .    .  .    .  .    .  .    .  .    .  . . \u001B[0m\n" +
            "\u001B[0;37;5;47;107m .       .       .       .       .       .       .       .       .       ..;X@@888t      .          \u001B[0m\n" +
            "\u001B[0;37;5;47;107m   .  .    .  .    .  .    .  .    .  .    .  .    .  .    .  . ..:%%;....t\u001B[0;1;30;90;47mS\u001B[0;37;5;40;100mSSX@88\u001B[0;1;30;90;47mS\u001B[0;1;37;97;47m8\u001B[0;37;5;47;107m  .    .  . .  .\u001B[0m\n" +
            "\u001B[0;37;5;47;107m  .    .  .    .  .    .  .    .  .    .  .    .  .    .  .    S88S;:.::;@\u001B[0;1;37;97;47m \u001B[0;1;30;90;47m8\u001B[0;37;5;40;100mX\u001B[0;1;30;90;47m8\u001B[0;37;5;40;100mX\u001B[0;1;30;90;47m8\u001B[0;37;5;40;100m@88\u001B[0;1;30;90;47m%\u001B[0;37;5;47;107mt  .  .         \u001B[0m\n" +
            "\u001B[0;37;5;47;107m    .       .       .       .       .       .       .       .tXSt;;tS8\u001B[0;1;37;97;47mt \u001B[0;1;30;90;47mtX888\u001B[0;37;5;40;100m%\u001B[0;1;30;90;47m8\u001B[0;37;5;40;100mS\u001B[0;1;30;90;47m8\u001B[0;37;5;40;100mS88\u001B[0;1;37;97;47m;\u001B[0;37;5;47;107m   .   . .  .  \u001B[0m\n" +
            "\u001B[0;37;5;47;107m  .   . .    .  .    .  .    .  .    .  .    .  .   .%8\u001B[0;1;37;97;47m8@888St8\u001B[0;37;5;47;107mXX8\u001B[0;1;37;97;47m:\u001B[0;1;30;90;47mS888\u001B[0;37;5;40;100mX\u001B[0;1;30;90;47m8\u001B[0;37;5;40;100mSS%%\u001B[0;1;30;90;47m8\u001B[0;36;5;40;100m:\u001B[0;1;30;90;47m8\u001B[0;36;5;40;100m:\u001B[0;1;30;90;47m8\u001B[0;36;5;40;100m:\u001B[0;37;5;40;100m8\u001B[0;1;30;90;47mS\u001B[0;37;5;47;107mX.         .  .\u001B[0m\n" +
            "\u001B[0;37;5;47;107m    .     .    .  .    .  .    .  .    .  .    .  .%\u001B[0;1;37;97;47m:\u001B[0;1;30;90;47mS;.: \u001B[0;1;37;97;47m;;\u001B[0;1;30;90;47m \u001B[0;1;37;97;47mt;%8\u001B[0;37;5;47;107mtt\u001B[0;1;37;97;47m%\u001B[0;1;30;90;47m8\u001B[0;36;5;40;100m \u001B[0;1;30;90;47m8\u001B[0;36;5;40;100m \u001B[0;1;30;90;47m8\u001B[0;36;5;40;100m \u001B[0;1;30;90;47m8\u001B[0;36;5;40;100m \u001B[0;1;30;90;47m8\u001B[0;36;5;40;100m;\u001B[0;1;30;90;47m8\u001B[0;36;5;40;100m;\u001B[0;1;30;90;47m8\u001B[0;36;5;40;100m;\u001B[0;37;5;40;100mt\u001B[0;36;5;40;100m \u001B[0;37;5;40;100m88\u001B[0;1;37;97;47m.\u001B[0;37;5;47;107m;  .  .      \u001B[0m\n" +
            "\u001B[0;37;5;47;107m  .    .   .       .       .       .       .   .X\u001B[0;1;37;97;47mS:\u001B[0;1;30;90;47m:: \u001B[0;33;47mX\u001B[0;1;37;97;47m:\u001B[0;33;47mX\u001B[0;1;37;97;47m;\u001B[0;33;47m@\u001B[0;1;37;97;47m%\u001B[0;1;33;93;47mS\u001B[0;1;37;97;47m::\u001B[0;1;30;90;47m \u001B[0;1;37;97;47m:t\u001B[0;37;5;47;107mX:8\u001B[0;1;30;90;47m8\u001B[0;37;5;40;100m;\u001B[0;1;30;90;47m8\u001B[0;36;5;40;100m.\u001B[0;1;30;90;47m8\u001B[0;36;5;40;100m:\u001B[0;1;30;90;47m8\u001B[0;36;5;40;100mt\u001B[0;37;5;40;100m;\u001B[0;36;5;40;100m \u001B[0;1;30;90;47m8\u001B[0;36;5;40;100mt\u001B[0;37;5;40;100m;t\u001B[0;36;5;40;100m   \u001B[0;37;5;40;100m8\u001B[0;1;30;90;47m;\u001B[0;37;5;47;107mt      .  . \u001B[0m\n" +
            "\u001B[0;37;5;47;107m     .   .   .  .    .  .    .  .    .  ..t@\u001B[0;1;37;97;47mXtt:\u001B[0;1;30;90;47m:..\u001B[0;33;47mX\u001B[0;1;30;90;47m \u001B[0;33;47mX\u001B[0;1;30;90;47m.\u001B[0;33;47mX\u001B[0;1;37;97;47m \u001B[0;33;47mX\u001B[0;1;37;97;47m:\u001B[0;1;33;93;47mX\u001B[0;1;30;90;47m:.\u001B[0;33;47mX\u001B[0;1;37;97;47m:\u001B[0;1;30;90;47m...\u001B[0;37;5;47;107m88\u001B[0;1;37;97;47m \u001B[0;35;5;40;100m \u001B[0;37;5;40;100mt\u001B[0;1;30;90;47m8\u001B[0;36;5;40;100m:\u001B[0;1;30;90;47m8\u001B[0;36;5;40;100mt\u001B[0;37;5;40;100m;\u001B[0;1;30;90;47m8\u001B[0;36;5;40;100m;\u001B[0;35;5;40;100m \u001B[0;1;30;90;47m8\u001B[0;36;5;40;100m. \u001B[0;37;5;40;100mS\u001B[0;36;5;40;100m.  \u001B[0;37;5;40;100m8\u001B[0;1;37;97;47mS\u001B[0;37;5;47;107m  . .      \u001B[0m\n" +
            "\u001B[0;37;5;47;107m  .    .      .   .   .   .   .   .   .%8\u001B[0;1;37;97;47mS\u001B[0;1;30;90;47m .;St \u001B[0;33;47mSS\u001B[0;1;30;90;47m \u001B[0;33;47mS\u001B[0;1;30;90;47m \u001B[0;33;47m@\u001B[0;1;30;90;47mt\u001B[0;33;47mX\u001B[0;1;30;90;47m;\u001B[0;33;47mX\u001B[0;1;30;90;47m;;\u001B[0;1;33;93;47mS\u001B[0;1;30;90;47mt:\u001B[0;33;47m@\u001B[0;1;30;90;47m:\u001B[0;33;47mX\u001B[0;1;30;90;47mt\u001B[0;1;37;97;47mt;t\u001B[0;1;30;90;47m8\u001B[0;35;5;40;100m \u001B[0;36;5;40;100m \u001B[0;1;30;90;47m8\u001B[0;36;5;40;100m;\u001B[0;37;5;40;100m;.\u001B[0;36;5;40;100m \u001B[0;1;30;90;47m8\u001B[0;36;5;40;100m:\u001B[0;35;5;40;100m \u001B[0;1;30;90;47m8\u001B[0;36;5;40;100m%\u001B[0;35;5;40;100m:\u001B[0;36;5;40;100m    \u001B[0;1;37;97;47mX\u001B[0;37;5;47;107m      . .  \u001B[0m\n" +
            "\u001B[0;37;5;47;107m    .     . .   .   .   .   .   .  ;8\u001B[0;1;37;97;47m%.\u001B[0;1;30;90;47m   \u001B[0;1;33;93;47m%\u001B[0;1;37;97;47m.\u001B[0;1;30;90;47m.\u001B[0;33;47m8\u001B[0;1;30;90;47m%\u001B[0;33;47m@\u001B[0;1;37;97;47m:\u001B[0;1;30;90;47m:\u001B[0;33;47mX\u001B[0;1;30;90;47m.\u001B[0;33;47m@\u001B[0;1;30;90;47mS\u001B[0;33;47mX\u001B[0;1;30;90;47mS\u001B[0;33;47mX\u001B[0;1;30;90;47mt\u001B[0;33;47mX\u001B[0;1;37;97;47m \u001B[0;1;30;90;47mS\u001B[0;33;47mS\u001B[0;1;30;90;47m%\u001B[0;33;47mX\u001B[0;1;30;90;47m%%%\u001B[0;1;37;97;47m.:\u001B[0;1;30;90;47m%%\u001B[0;35;5;40;100m \u001B[0;1;30;90;47m8\u001B[0;36;5;40;100m:\u001B[0;1;30;90;47m8\u001B[0;35;5;40;100m.\u001B[0;1;30;90;47m8\u001B[0;36;5;40;100m;\u001B[0;35;5;40;100m.\u001B[0;1;30;90;47m8\u001B[0;36;5;40;100m:\u001B[0;35;5;40;100mt\u001B[0;36;5;40;100mt \u001B[0;37;5;40;100m%SX8\u001B[0;1;37;97;47mS\u001B[0;37;5;47;107m  . .     .\u001B[0m\n" +
            "\u001B[0;37;5;47;107m  .   .           .       .      .\u001B[0;1;37;97;47m@\u001B[0;1;30;90;47mSX%;\u001B[0;33;47m@\u001B[0;1;30;90;47m.\u001B[0;33;47mX\u001B[0;1;37;97;47m \u001B[0;33;47mS\u001B[0;1;37;97;47m.\u001B[0;1;30;90;47m.\u001B[0;33;47m@\u001B[0;1;30;90;47m%\u001B[0;33;47m8\u001B[0;1;30;90;47mS%\u001B[0;33;47m@\u001B[0;1;30;90;47m@@X\u001B[0;33;47mX\u001B[0;1;30;90;47mS\u001B[0;33;47mS\u001B[0;1;30;90;47m%\u001B[0;33;47mS\u001B[0;1;30;90;47mt%\u001B[0;33;47m@\u001B[0;1;30;90;47m8S\u001B[0;33;47m@\u001B[0;1;30;90;47mX\u001B[0;1;33;93;47mX\u001B[0;1;30;90;47m@8;\u001B[0;35;5;40;100m  \u001B[0;37;5;40;100m;\u001B[0;36;5;40;100m \u001B[0;37;5;40;100m;\u001B[0;36;5;40;100m.\u001B[0;1;30;90;47m8\u001B[0;36;5;40;100m;\u001B[0;35;5;40;100m.\u001B[0;36;5;40;100m \u001B[0;37;5;40;100mt\u001B[0;1;30;90;47m88\u001B[0;1;37;97;47m :\u001B[0;37;5;47;107m8%.       .   \u001B[0m\n" +
            "\u001B[0;37;5;47;107m    .   . .  . .     . .     . :t\u001B[0;1;37;97;47m%\u001B[0;1;30;90;47m%SX\u001B[0;33;5;40;100m:\u001B[0;1;30;90;47m@\u001B[0;33;5;40;100m;\u001B[0;1;30;90;47mS\u001B[0;33;47m@\u001B[0;1;30;90;47mt:\u001B[0;33;47m8\u001B[0;1;30;90;47m%SXS\u001B[0;33;47m8\u001B[0;1;30;90;47m88\u001B[0;33;47m8\u001B[0;1;30;90;47m8\u001B[0;33;47mX\u001B[0;1;30;90;47mSSS\u001B[0;33;47mS\u001B[0;1;37;97;47m \u001B[0;33;47mX\u001B[0;1;30;90;47m@8\u001B[0;33;47m@\u001B[0;1;30;90;47m@88888t8\u001B[0;35;5;40;100m \u001B[0;1;30;90;47m8\u001B[0;36;5;40;100m.\u001B[0;1;30;90;47m8\u001B[0;36;5;40;100mt\u001B[0;35;5;40;100m:\u001B[0;1;30;90;47m8\u001B[0;1;37;97;47m \u001B[0;37;5;47;107m8t;:...   .  .    . \u001B[0m\n" +
            "\u001B[0;37;5;47;107m  .         .    .       .   .X\u001B[0;1;37;97;47m:\u001B[0;1;30;90;47m.;;\u001B[0;33;47m@\u001B[0;1;30;90;47m;\u001B[0;33;47m8\u001B[0;1;30;90;47mX\u001B[0;33;47m8\u001B[0;1;30;90;47m88\u001B[0;33;47m8\u001B[0;1;30;90;47m8@\u001B[0;33;47m8\u001B[0;1;30;90;47m8\u001B[0;37;43m8\u001B[0;37;5;40;100mX\u001B[0;1;30;90;47m8\u001B[0;37;5;40;100m@\u001B[0;1;30;90;47m88\u001B[0;33;47mX\u001B[0;1;30;90;47mX\u001B[0;33;47mX\u001B[0;1;30;90;47m@\u001B[0;33;47mS\u001B[0;1;30;90;47mX@8\u001B[0;33;47m@\u001B[0;1;30;90;47m888\u001B[0;33;47m8\u001B[0;1;30;90;47m8\u001B[0;1;33;93;47mS\u001B[0;1;30;90;47m8\u001B[0;37;5;40;100m;\u001B[0;1;30;90;47m:@\u001B[0;35;5;40;100m.\u001B[0;37;5;40;100m:\u001B[0;36;5;40;100m  \u001B[0;1;30;90;47m8\u001B[0;1;37;97;47m \u001B[0;37;5;47;107m8;        .     .     \u001B[0m\n" +
            "\u001B[0;37;5;47;107m     . .  .    .   . .     .t\u001B[0;1;37;97;47mX\u001B[0;1;30;90;47m   \u001B[0;33;47mX\u001B[0;1;30;90;47m:X\u001B[0;33;47m8\u001B[0;1;30;90;47mXX@\u001B[0;33;47m8\u001B[0;1;30;90;47m88\u001B[0;33;47m8\u001B[0;37;5;40;100mX\u001B[0;33;5;40;100m \u001B[0;1;30;90;47m8\u001B[0;37;5;40;100mS\u001B[0;1;30;90;47m8\u001B[0;1;30;90;43m8\u001B[0;1;30;90;47m88\u001B[0;37;43m8\u001B[0;1;30;90;47m888\u001B[0;33;47mX\u001B[0;1;30;90;47m88\u001B[0;33;47m8\u001B[0;1;30;90;47m8@X\u001B[0;33;47m@\u001B[0;1;30;90;47m@X8888S\u001B[0;35;5;40;100m \u001B[0;1;30;90;47m@\u001B[0;1;37;97;47m \u001B[0;37;5;47;107m8S:..  . .  .    .    . . \u001B[0m\n" +
            "\u001B[0;37;5;47;107m  .          .         . :8\u001B[0;1;37;97;47m%\u001B[0;1;30;90;47m  \u001B[0;1;33;93;47m%\u001B[0;1;30;90;47m \u001B[0;33;47mS\u001B[0;1;37;97;47m.\u001B[0;33;47m@\u001B[0;1;30;90;47m88@\u001B[0;33;47m8\u001B[0;1;30;90;47m88\u001B[0;33;5;40;100m.\u001B[0;1;30;90;47m8\u001B[0;33;5;40;100mt\u001B[0;37;5;40;100mX\u001B[0;1;30;90;47m8\u001B[0;1;30;90;43m8\u001B[0;1;30;90;47m888\u001B[0;33;5;40;100m;.\u001B[0;1;30;90;47m88888\u001B[0;33;47m8\u001B[0;1;30;90;47m8@S\u001B[0;33;47mX\u001B[0;1;30;90;47mSXS\u001B[0;33;47mX\u001B[0;1;30;90;47m8X\u001B[0;1;37;97;47m :t8\u001B[0;37;5;47;107m;...             .   .      \u001B[0m\n" +
            "\u001B[0;37;5;47;107m    .  . . .    . .  . %\u001B[0;1;37;97;47m8;\u001B[0;1;30;90;47m. \u001B[0;33;47mS\u001B[0;1;37;97;47m;\u001B[0;1;30;90;47m.\u001B[0;33;47mS\u001B[0;1;37;97;47m.\u001B[0;33;47mX\u001B[0;1;30;90;47m@\u001B[0;33;5;40;100m;\u001B[0;1;30;90;47m8\u001B[0;1;30;90;43m8\u001B[0;37;5;40;100mS\u001B[0;33;5;40;100m.\u001B[0;1;30;90;47m8\u001B[0;37;43m8\u001B[0;1;30;90;47m88\u001B[0;33;47m8\u001B[0;1;30;90;47m8X88888\u001B[0;33;5;40;100m \u001B[0;33;47m8\u001B[0;37;5;40;100m%\u001B[0;1;30;90;43m8\u001B[0;1;30;90;47m888\u001B[0;33;47m@\u001B[0;1;30;90;47m88\u001B[0;33;47m@\u001B[0;1;30;90;47m888\u001B[0;1;37;97;47m \u001B[0;37;5;47;107m;..      .  .  . .  .   .   .  . \u001B[0m\n" +
            "\u001B[0;37;5;47;107m  .           .     :8\u001B[0;1;37;97;47m;.\u001B[0;1;30;90;47m :\u001B[0;33;47mX\u001B[0;1;30;90;47m \u001B[0;33;47mSS\u001B[0;1;30;90;47m.\u001B[0;33;47mS\u001B[0;1;30;90;47m%@\u001B[0;33;47m8\u001B[0;1;30;90;47m@X@@\u001B[0;33;47m@\u001B[0;1;30;90;47m888\u001B[0;33;47m@\u001B[0;1;30;90;47m8X\u001B[0;33;47mX\u001B[0;1;30;90;47m8\u001B[0;33;47m8\u001B[0;1;30;90;47m8\u001B[0;33;47m8\u001B[0;1;30;90;47m88\u001B[0;37;5;40;100mS\u001B[0;1;30;90;47m88888@\u001B[0;33;47mS\u001B[0;1;30;90;47mX\u001B[0;1;37;97;47m  \u001B[0;37;5;47;107m8@. ..                .         .   \u001B[0m\n" +
            "\u001B[0;37;5;47;107m    . .  .  .   ..t\u001B[0;1;37;97;47m@\u001B[0;1;30;90;47mtX%t\u001B[0;33;47m8\u001B[0;1;30;90;47m:.\u001B[0;33;47mX\u001B[0;1;37;97;47m \u001B[0;1;30;90;47m:\u001B[0;33;47mX\u001B[0;1;30;90;47mt\u001B[0;33;47mX\u001B[0;1;37;97;47m \u001B[0;1;30;90;47m;\u001B[0;1;33;93;47mS\u001B[0;1;30;90;47mSS\u001B[0;33;47m@\u001B[0;1;30;90;47m88\u001B[0;33;47m8\u001B[0;1;30;90;47m8888888XX%\u001B[0;1;37;97;47m  :S\u001B[0;37;5;47;107m8@%t;...:    .       . .  .     . . . .    .\u001B[0m\n" +
            "\u001B[0;37;5;47;107m  .       .   .%\u001B[0;1;30;90;47m;t8\u001B[0;37;5;40;100m8\u001B[0;1;30;90;47mS@@\u001B[0;33;47m8\u001B[0;1;30;90;47m8\u001B[0;33;47m@\u001B[0;1;30;90;47m::\u001B[0;33;47m@\u001B[0;1;30;90;47m;\u001B[0;1;37;97;47m \u001B[0;1;33;93;47m%\u001B[0;1;37;97;47m .  \u001B[0;1;33;93;47mS\u001B[0;1;30;90;47m@88\u001B[0;33;5;40;100m;\u001B[0;1;30;90;47m8\u001B[0;33;5;40;100m.\u001B[0;1;30;90;47mS\u001B[0;1;37;97;47m X\u001B[0;37;5;47;107m8%.  ..  ..     .   .  .              .            .  \u001B[0m\n" +
            "\u001B[0;37;5;47;107m     . .:;;ttS8\u001B[0;1;37;97;47m \u001B[0;37;5;40;100m@@8\u001B[0;1;30;90;47m@X@SSX8S::\u001B[0;1;33;93;47mX\u001B[0;1;30;90;47mX\u001B[0;1;37;97;47m \u001B[0;1;33;93;47mS\u001B[0;1;37;97;47m \u001B[0;1;33;93;47mS\u001B[0;1;30;90;47m@\u001B[0;1;37;97;47m \u001B[0;1;30;90;47mS\u001B[0;1;37;97;47m :\u001B[0;37;5;47;107m88S:     .       .  .       .         . .    . .  .   .     \u001B[0m\n" +
            "\u001B[0;37;5;47;107m  . S\u001B[0;1;37;97;47m@\u001B[0;1;30;90;47m:@8\u001B[0;37;5;40;100m8\u001B[0;1;30;90;47m888\u001B[0;37;5;40;100m8\u001B[0;1;30;90;47m@@@@@\u001B[0;37;5;40;100m88888888\u001B[0;1;30;90;47mXS@;@8SX%\u001B[0;1;37;97;47m.\u001B[0;37;5;47;107m@:.;:    .     . .    .   . .   .            .         .   . . \u001B[0m\n" +
            "\u001B[0;37;5;47;107m   S\u001B[0;37;5;40;100m8\u001B[0;36;5;40;100m       \u001B[0;37;5;40;100m8\u001B[0;36;5;40;100m \u001B[0;37;5;40;100m8\u001B[0;36;5;40;100m \u001B[0;1;30;90;47m8\u001B[0;36;5;40;100m.\u001B[0;1;30;90;47m8\u001B[0;37;5;40;100m8\u001B[0;1;30;90;47m8\u001B[0;37;5;40;100m8888888\u001B[0;1;30;90;47m@\u001B[0;37;5;40;100m@\u001B[0;1;30;90;47m88\u001B[0;37;5;40;100mX\u001B[0;1;30;90;47m8\u001B[0;1;37;97;47m:\u001B[0;37;5;47;107m%        .   . .     .    .     .  .       . .   .  . .          \u001B[0m\n" +
            "\u001B[0;37;5;47;107m   8\u001B[0;33;5;40;100m \u001B[0;37;5;40;100mS\u001B[0;36;5;40;100m \u001B[0;37;5;40;100m8\u001B[0;36;5;40;100m \u001B[0;37;5;40;100m8\u001B[0;36;5;40;100m \u001B[0;1;30;90;47mS\u001B[0;36;5;40;100m \u001B[0;1;30;90;47m%\u001B[0;36;5;40;100m \u001B[0;1;30;90;47mS\u001B[0;36;5;40;100m.\u001B[0;1;30;90;47mS\u001B[0;36;5;40;100m:\u001B[0;1;30;90;47m@\u001B[0;37;5;40;100m888\u001B[0;36;5;40;100m \u001B[0;1;30;90;47mX\u001B[0;37;5;40;100m8888\u001B[0;1;30;90;47m8@\u001B[0;1;37;97;47m X\u001B[0;37;5;47;107m%. .  .  .         .     .     .      .          .        .  .  .  \u001B[0m\n" +
            "\u001B[0;37;5;47;107m . .\u001B[0;1;37;97;47mS\u001B[0;37;5;40;100mS\u001B[0;36;5;40;100m  \u001B[0;37;5;40;100m8\u001B[0;36;5;40;100m; \u001B[0;1;30;90;47mX\u001B[0;36;5;40;100m \u001B[0;1;30;90;47mX\u001B[0;36;5;40;100m.\u001B[0;1;30;90;47mX\u001B[0;36;5;40;100m \u001B[0;1;30;90;47mS\u001B[0;37;5;40;100m88\u001B[0;1;30;90;47mXt. . \u001B[0;1;37;97;47m@\u001B[0;37;5;47;107m%:  .            . .  .    . .   .  .  . .          .     .  .      .   .\u001B[0m\n" +
            "\u001B[0;37;5;47;107m    .%\u001B[0;1;37;97;47m8t\u001B[0;1;30;90;47m  ;\u001B[0;36;5;40;100m.\u001B[0;1;30;90;47m:\u001B[0;36;5;40;100m \u001B[0;1;30;90;47m %  \u001B[0;1;37;97;47m8\u001B[0;37;5;47;107mX;       .    .  . . . .    .   .      .          . .         .        .  .      \u001B[0m\n" +
            "\u001B[0;37;5;47;107m     .      . ;:.       .    .    .          .       .  .    .  .  .    .     .   . . .         . . \u001B[0m\n" +
            "\u001B[0;37;5;47;107m .  .              . .    .    .     .  .  .    . .    .   .   .      .   .     .       .  .  .     \u001B[0m\n" +
            "\u001B[0;37;5;47;107m                 .     .    .    .  .         .     .        .   .  .    .   .    .   .         .  .\u001B[0m\n" +
            "\u001B[0;37;5;47;107m  .  . .      .     .    .   .     .   . .  .    .    .  . .       .   .   .    .   .    .  . .     \u001B[0m\n" +
            "\u001B[0;37;5;47;107m         .  .   . .   .    .  .  .    .    .   .   .    .     . .             .        .        . . \u001B[0m\n" +
            "\u001B[0;37;5;47;107m  . . .        .    .   .      .    .    .   .   .   .     .      .  .  . .      . .      .  .      \u001B[0m\n";



    public static final String[] GAME_OVER_OPT={"Go to final score"};

    public static final String FINAL_SCORE_MENU_HEADER="*** Final Score ***\n" +
            "";


    public static final String[] FINAL_SCORE_MENU_OPT = {"Quit"};


    //------------------------------------------------------------------------------------------------------------------
    //
    public static String[] getDrinkNamePrices(int menuNum) {
        String[] namePrices = new String[Drinks.values().length + 1];
        int i;
        for (Drinks drink : Drinks.values()) {
            i = drink.ordinal();
            namePrices[i] = drink.getName() + " " + drink.getPrice(menuNum) + " €";
        }
        namePrices[Foods.values().length + 1] = "Go back";
        return namePrices;
    }

    public static String[] getFoodNamePrices(int menuNum) {
        String[] namePrices = new String[Foods.values().length + 1];
        int i;
        for (Foods food : Foods.values()) {
            i = food.ordinal();
            namePrices[i] = food.getName() + " " + food.getPrice(menuNum) + " €";
        }
        namePrices[Foods.values().length] = "Go back";
        return namePrices;
    }




}