package partA.ex01;

import static java.lang.Integer.parseInt;

public class Player {
    public String variable, height, name, yearsInLeague, playerNum;

    public static String player() {
        String response = "";
        /**
         * Your code goes here
         */
        Player playerOne = new Player();
        playerOne.playerNum = "Player 1: ";
        playerOne.variable = "variable: Stephen Curry";
        playerOne.name = "Name: Stephen Curry";
        playerOne.height = "Height: 6'2";
        playerOne.yearsInLeague = "Years in the League: 13 years";

        Player playerTwo = new Player();
        playerTwo.playerNum = "Player 2:";
        playerTwo.variable = "variable: Michael Jordan ";
        playerTwo.name = "Name: Michael Jordan";
        playerTwo.height = "Height: 6'6";
        playerTwo.yearsInLeague = "Years in the League: 15 years";

         response = playerOne.playerNum + "\n" + playerOne.variable +"\n" +
                playerOne.name +"\n" + playerOne.height +"\n" +
                playerOne.yearsInLeague +"\n\n" + playerTwo.playerNum +"\n" +
                playerTwo.variable+"\n"+ playerTwo.name + "\n" + playerTwo.height +"\n" +
                playerTwo.yearsInLeague;

        return response;

    }

    public static void main(String[] args) {
        String playerOutput = player();
        System.out.print(playerOutput);
    }
}
