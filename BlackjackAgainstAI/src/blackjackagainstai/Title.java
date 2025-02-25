/*
The Title class uses Ascii art to display headlines
and titles and card values

@author Khaled Almansour 18021460
@author Prajwal Bhagath 18039504
 */
package blackjackagainstai;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Title {
    Scanner scanner = new Scanner(System.in);//setting up the scanner object

    /*
    The welcomeTitle displays the blackjack title


     */

    public void welcomeTitle(){
        System.out.println("\n" +
                "          _____                    _____            _____                    _____                    _____                    _____                    _____                    _____                    _____          \n" +
                "         /\\    \\                  /\\    \\          /\\    \\                  /\\    \\                  /\\    \\                  /\\    \\                  /\\    \\                  /\\    \\                  /\\    \\         \n" +
                "        /::\\    \\                /::\\____\\        /::\\    \\                /::\\    \\                /::\\____\\                /::\\    \\                /::\\    \\                /::\\    \\                /::\\____\\        \n" +
                "       /::::\\    \\              /:::/    /       /::::\\    \\              /::::\\    \\              /:::/    /                \\:::\\    \\              /::::\\    \\              /::::\\    \\              /:::/    /        \n" +
                "      /::::::\\    \\            /:::/    /       /::::::\\    \\            /::::::\\    \\            /:::/    /                  \\:::\\    \\            /::::::\\    \\            /::::::\\    \\            /:::/    /         \n" +
                "     /:::/\\:::\\    \\          /:::/    /       /:::/\\:::\\    \\          /:::/\\:::\\    \\          /:::/    /                    \\:::\\    \\          /:::/\\:::\\    \\          /:::/\\:::\\    \\          /:::/    /          \n" +
                "    /:::/__\\:::\\    \\        /:::/    /       /:::/__\\:::\\    \\        /:::/  \\:::\\    \\        /:::/____/                      \\:::\\    \\        /:::/__\\:::\\    \\        /:::/  \\:::\\    \\        /:::/____/           \n" +
                "   /::::\\   \\:::\\    \\      /:::/    /       /::::\\   \\:::\\    \\      /:::/    \\:::\\    \\      /::::\\    \\                      /::::\\    \\      /::::\\   \\:::\\    \\      /:::/    \\:::\\    \\      /::::\\    \\           \n" +
                "  /::::::\\   \\:::\\    \\    /:::/    /       /::::::\\   \\:::\\    \\    /:::/    / \\:::\\    \\    /::::::\\____\\________    _____   /::::::\\    \\    /::::::\\   \\:::\\    \\    /:::/    / \\:::\\    \\    /::::::\\____\\________  \n" +
                " /:::/\\:::\\   \\:::\\ ___\\  /:::/    /       /:::/\\:::\\   \\:::\\    \\  /:::/    /   \\:::\\    \\  /:::/\\:::::::::::\\    \\  /\\    \\ /:::/\\:::\\    \\  /:::/\\:::\\   \\:::\\    \\  /:::/    /   \\:::\\    \\  /:::/\\:::::::::::\\    \\ \n" +
                "/:::/__\\:::\\   \\:::|    |/:::/____/       /:::/  \\:::\\   \\:::\\____\\/:::/____/     \\:::\\____\\/:::/  |:::::::::::\\____\\/::\\    /:::/  \\:::\\____\\/:::/  \\:::\\   \\:::\\____\\/:::/____/     \\:::\\____\\/:::/  |:::::::::::\\____\\\n" +
                "\\:::\\   \\:::\\  /:::|____|\\:::\\    \\       \\::/    \\:::\\  /:::/    /\\:::\\    \\      \\::/    /\\::/   |::|~~~|~~~~~     \\:::\\  /:::/    \\::/    /\\::/    \\:::\\  /:::/    /\\:::\\    \\      \\::/    /\\::/   |::|~~~|~~~~~     \n" +
                " \\:::\\   \\:::\\/:::/    /  \\:::\\    \\       \\/____/ \\:::\\/:::/    /  \\:::\\    \\      \\/____/  \\/____|::|   |           \\:::\\/:::/    / \\/____/  \\/____/ \\:::\\/:::/    /  \\:::\\    \\      \\/____/  \\/____|::|   |          \n" +
                "  \\:::\\   \\::::::/    /    \\:::\\    \\               \\::::::/    /    \\:::\\    \\                    |::|   |            \\::::::/    /                    \\::::::/    /    \\:::\\    \\                    |::|   |          \n" +
                "   \\:::\\   \\::::/    /      \\:::\\    \\               \\::::/    /      \\:::\\    \\                   |::|   |             \\::::/    /                      \\::::/    /      \\:::\\    \\                   |::|   |          \n" +
                "    \\:::\\  /:::/    /        \\:::\\    \\              /:::/    /        \\:::\\    \\                  |::|   |              \\::/    /                       /:::/    /        \\:::\\    \\                  |::|   |          \n" +
                "     \\:::\\/:::/    /          \\:::\\    \\            /:::/    /          \\:::\\    \\                 |::|   |               \\/____/                       /:::/    /          \\:::\\    \\                 |::|   |          \n" +
                "      \\::::::/    /            \\:::\\    \\          /:::/    /            \\:::\\    \\                |::|   |                                            /:::/    /            \\:::\\    \\                |::|   |          \n" +
                "       \\::::/    /              \\:::\\____\\        /:::/    /              \\:::\\____\\               \\::|   |                                           /:::/    /              \\:::\\____\\               \\::|   |          \n" +
                "        \\::/____/                \\::/    /        \\::/    /                \\::/    /                \\:|   |                                           \\::/    /                \\::/    /                \\:|   |          \n" +
                "         ~~                       \\/____/          \\/____/                  \\/____/                  \\|___|                                            \\/____/                  \\/____/                  \\|___|          \n" +
                "                                                                                                                                                                                                                         \n");


    }

    /*
    The intro method welcomes the player to the game and allows them
    to continue or exit the game.

    @returns int
     */
    public int intro(){
        System.out.println("\n" +
                " _   _      _ _                       _                            _         ______ _            _      ___            _      \n" +
                "| | | |    | | |                     | |                          | |        | ___ \\ |          | |    |_  |          | |     \n" +
                "| |_| | ___| | | ___    __      _____| | ___ ___  _ __ ___   ___  | |_ ___   | |_/ / | __ _  ___| | __   | | __ _  ___| | __  \n" +
                "|  _  |/ _ \\ | |/ _ \\   \\ \\ /\\ / / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\  | ___ \\ |/ _` |/ __| |/ /   | |/ _` |/ __| |/ /  \n" +
                "| | | |  __/ | | (_) |   \\ V  V /  __/ | (_| (_) | | | | | |  __/ | || (_) | | |_/ / | (_| | (__|   </\\__/ / (_| | (__|   < _ \n" +
                "\\_| |_/\\___|_|_|\\___( )   \\_/\\_/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/  \\____/|_|\\__,_|\\___|_|\\_\\____/ \\__,_|\\___|_|\\_(_)\n" +
                "                    |/                                                                                                        \n" +
                "                                                                                                                              \n");
System.out.println("\n" +
        " _____      _                  __        _                _              \n" +
        "|  ___|    | |                /  |      | |              | |             \n" +
        "| |__ _ __ | |_ ___ _ __      `| |      | |_ ___    _ __ | | __ _ _   _  \n" +
        "|  __| '_ \\| __/ _ \\ '__|      | |      | __/ _ \\  | '_ \\| |/ _` | | | | \n" +
        "| |__| | | | ||  __/ |        _| |_     | || (_) | | |_) | | (_| | |_| | \n" +
        "\\____/_| |_|\\__\\___|_|        \\___/      \\__\\___/  | .__/|_|\\__,_|\\__, | \n" +
        "                                                   | |             __/ | \n" +
        "                                                   |_|            |___/  \n" +
        " _____      _                 _____         _                    _ _     \n" +
        "|  ___|    | |               / __  \\       | |                  (_) |    \n" +
        "| |__ _ __ | |_ ___ _ __     `' / /'       | |_ ___     _____  ___| |_   \n" +
        "|  __| '_ \\| __/ _ \\ '__|      / /         | __/ _ \\   / _ \\ \\/ / | __|  \n" +
        "| |__| | | | ||  __/ |       ./ /___       | || (_) | |  __/>  <| | |_ _ \n" +
        "\\____/_| |_|\\__\\___|_|       \\_____/        \\__\\___/   \\___/_/\\_\\_|\\__(_)\n" +
        "                                                                         \n" +
        "                                                                         \n");

        boolean loop = false;
        int entry = 0;

        do {
            try {
                entry = scanner.nextInt();
                if (entry < 1 || entry > 2) {
                    throw new InputMismatchException();
                } else if (entry == 1) {
                    loop = true;
                } else if (entry == 2) {
                    loop = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("\n" +
                        " _____                              _                   _      _        _                 _ _     _   \n" +
                        "/  ___|                            (_)                 | |    (_)      (_)               | (_)   | |  \n" +
                        "\\ `--.  ___  _ __ _ __ _   _        _ _ __  _ __  _   _| |_    _ ___    _ _ ____   ____ _| |_  __| |  \n" +
                        " `--. \\/ _ \\| '__| '__| | | |      | | '_ \\| '_ \\| | | | __|  | / __|  | | '_ \\ \\ / / _` | | |/ _` |  \n" +
                        "/\\__/ / (_) | |  | |  | |_| |  _   | | | | | |_) | |_| | |_   | \\__ \\  | | | | \\ V / (_| | | | (_| |_ \n" +
                        "\\____/ \\___/|_|  |_|   \\__, | ( )  |_|_| |_| .__/ \\__,_|\\__|  |_|___/  |_|_| |_|\\_/ \\__,_|_|_|\\__,_(_)\n" +
                        "                        __/ | |/           | |                                                        \n" +
                        "                       |___/               |_|                                                        \n" +
                        "______ _                        _____                                _       _                        \n" +
                        "| ___ \\ |                      |_   _|                              (_)     | |                       \n" +
                        "| |_/ / | ___  __ _ ___  ___     | |_ __ _   _      __ _  __ _  __ _ _ _ __ | |                       \n" +
                        "|  __/| |/ _ \\/ _` / __|/ _ \\    | | '__| | | |    / _` |/ _` |/ _` | | '_ \\| |                       \n" +
                        "| |   | |  __/ (_| \\__ \\  __/    | | |  | |_| |   | (_| | (_| | (_| | | | | |_|                       \n" +
                        "\\_|   |_|\\___|\\__,_|___/\\___|    \\_/_|   \\__, |    \\__,_|\\__, |\\__,_|_|_| |_(_)                       \n" +
                        "                                          __/ |           __/ |                                       \n" +
                        "                                         |___/           |___/                                        \n");
                scanner.nextLine();
            }
        } while (!loop);

        return entry;
    }

    /*
    The Lets play method displays the message to start playing
    and message asking users to enter their name
     */
    public void LetsPlay(){
        String name = null;
System.out.println("\n" +
        "   ____   _         _        _   _              _                _ \n" +
        "  / __ \\ | |       | |      | | ( )            | |              | |\n" +
        " | |  | || | __    | |  ___ | |_|/ ___   _ __  | |  __ _  _   _ | |\n" +
        " | |  | || |/ /    | | / _ \\| __| / __| | '_ \\ | | / _` || | | || |\n" +
        " | |__| ||   <  _  | ||  __/| |_  \\__ \\ | |_) || || (_| || |_| ||_|\n" +
        "  \\____/ |_|\\_\\( ) |_| \\___| \\__| |___/ | .__/ |_| \\__,_| \\__, |(_)\n" +
        "               |/                       | |                __/ |   \n" +
        "                                        |_|               |___/    \n");

System.out.println("\n" +
        "  _____   _                            ______         _                __     __                    _   _                          _ \n" +
        " |  __ \\ | |                          |  ____|       | |               \\ \\   / /                   | \\ | |                        | |\n" +
        " | |__) || |  ___   __ _  ___   ___   | |__    _ __  | |_  ___  _ __    \\ \\_/ /___   _   _  _ __   |  \\| |  __ _  _ __ ___    ___ | |\n" +
        " |  ___/ | | / _ \\ / _` |/ __| / _ \\  |  __|  | '_ \\ | __|/ _ \\| '__|    \\   // _ \\ | | | || '__|  | . ` | / _` || '_ ` _ \\  / _ \\| |\n" +
        " | |     | ||  __/| (_| |\\__ \\|  __/  | |____ | | | || |_|  __/| |        | || (_) || |_| || |     | |\\  || (_| || | | | | ||  __/|_|\n" +
        " |_|     |_| \\___| \\__,_||___/ \\___|  |______||_| |_| \\__|\\___||_|        |_| \\___/  \\__,_||_|     |_| \\_| \\__,_||_| |_| |_| \\___|(_)\n" +
        "                                                                                                                                     \n" +
        "                                                                                                                                     \n");

    }

    /*
    The AICards method displays an unknown
    card, since the player cannot see the value of the card.

    @returns String
     */

    public String AICards(){
        String cards =("\n" +
                ".------.\n" +
                "|?.--. |\n" +
                "| :(): |\n" +
                "| ()() |\n" +
                "| '--'?|\n" +
                "`------'\n");
        return cards;
    }
/*
The players card displays the ascii art of the
card with the value of the card that is drawn
 */
    public String PlayerCard(int num){
        String card = ("\n" +
                ".------.\n" +
                "|"+num+".--. |\n" +
                "| :(): |\n" +
                "| ()() |\n" +
                "| '--'"+num+"|\n" +
                "`------'\n");
        return card;
    }
/*
Game over title card
 */
    public void GameEnded(){
        System.err.println("\n" +
                "                                                                                                                                                                                                        \n" +
                "                                                                                                                                                                                                        \n" +
                "        GGGGGGGGGGGGG               AAA               MMMMMMMM               MMMMMMMMEEEEEEEEEEEEEEEEEEEEEE          OOOOOOOOO     VVVVVVVV           VVVVVVVVEEEEEEEEEEEEEEEEEEEEEERRRRRRRRRRRRRRRRR   \n" +
                "     GGG::::::::::::G              A:::A              M:::::::M             M:::::::ME::::::::::::::::::::E        OO:::::::::OO   V::::::V           V::::::VE::::::::::::::::::::ER::::::::::::::::R  \n" +
                "   GG:::::::::::::::G             A:::::A             M::::::::M           M::::::::ME::::::::::::::::::::E      OO:::::::::::::OO V::::::V           V::::::VE::::::::::::::::::::ER::::::RRRRRR:::::R \n" +
                "  G:::::GGGGGGGG::::G            A:::::::A            M:::::::::M         M:::::::::MEE::::::EEEEEEEEE::::E     O:::::::OOO:::::::OV::::::V           V::::::VEE::::::EEEEEEEEE::::ERR:::::R     R:::::R\n" +
                " G:::::G       GGGGGG           A:::::::::A           M::::::::::M       M::::::::::M  E:::::E       EEEEEE     O::::::O   O::::::O V:::::V           V:::::V   E:::::E       EEEEEE  R::::R     R:::::R\n" +
                "G:::::G                        A:::::A:::::A          M:::::::::::M     M:::::::::::M  E:::::E                  O:::::O     O:::::O  V:::::V         V:::::V    E:::::E               R::::R     R:::::R\n" +
                "G:::::G                       A:::::A A:::::A         M:::::::M::::M   M::::M:::::::M  E::::::EEEEEEEEEE        O:::::O     O:::::O   V:::::V       V:::::V     E::::::EEEEEEEEEE     R::::RRRRRR:::::R \n" +
                "G:::::G    GGGGGGGGGG        A:::::A   A:::::A        M::::::M M::::M M::::M M::::::M  E:::::::::::::::E        O:::::O     O:::::O    V:::::V     V:::::V      E:::::::::::::::E     R:::::::::::::RR  \n" +
                "G:::::G    G::::::::G       A:::::A     A:::::A       M::::::M  M::::M::::M  M::::::M  E:::::::::::::::E        O:::::O     O:::::O     V:::::V   V:::::V       E:::::::::::::::E     R::::RRRRRR:::::R \n" +
                "G:::::G    GGGGG::::G      A:::::AAAAAAAAA:::::A      M::::::M   M:::::::M   M::::::M  E::::::EEEEEEEEEE        O:::::O     O:::::O      V:::::V V:::::V        E::::::EEEEEEEEEE     R::::R     R:::::R\n" +
                "G:::::G        G::::G     A:::::::::::::::::::::A     M::::::M    M:::::M    M::::::M  E:::::E                  O:::::O     O:::::O       V:::::V:::::V         E:::::E               R::::R     R:::::R\n" +
                " G:::::G       G::::G    A:::::AAAAAAAAAAAAA:::::A    M::::::M     MMMMM     M::::::M  E:::::E       EEEEEE     O::::::O   O::::::O        V:::::::::V          E:::::E       EEEEEE  R::::R     R:::::R\n" +
                "  G:::::GGGGGGGG::::G   A:::::A             A:::::A   M::::::M               M::::::MEE::::::EEEEEEEE:::::E     O:::::::OOO:::::::O         V:::::::V         EE::::::EEEEEEEE:::::ERR:::::R     R:::::R\n" +
                "   GG:::::::::::::::G  A:::::A               A:::::A  M::::::M               M::::::ME::::::::::::::::::::E      OO:::::::::::::OO           V:::::V          E::::::::::::::::::::ER::::::R     R:::::R\n" +
                "     GGG::::::GGG:::G A:::::A                 A:::::A M::::::M               M::::::ME::::::::::::::::::::E        OO:::::::::OO              V:::V           E::::::::::::::::::::ER::::::R     R:::::R\n" +
                "        GGGGGG   GGGGAAAAAAA                   AAAAAAAMMMMMMMM               MMMMMMMMEEEEEEEEEEEEEEEEEEEEEE          OOOOOOOOO                 VVV            EEEEEEEEEEEEEEEEEEEEEERRRRRRRR     RRRRRRR\n" +
                "                                                                                                                                                                                                        \n" +
                "                                                                                                                                                                                                        \n" +
                "                                                                                                                                                                                                        \n" +
                "                                                                                                                                                                                                        \n" +
                "                                                                                                                                                                                                        \n" +
                "                                                                                                                                                                                                        \n" +
                "                                                                                                                                                                                                        \n");
    }
}
