public class Main {

    public static void main( String[] args ) {
//        GameOver Challenge
        System.out.println("GameOver exercise of Java Masterclass");
        System.out.println(" ");
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        String name = "Joshua";
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        displayHighScorePosition(name, calculateHighScorePosition(highScore));

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        displayHighScorePosition(name, calculateHighScorePosition(highScore));

        displayHighScorePosition(name, calculateHighScorePosition(1500));
        displayHighScorePosition(name, calculateHighScorePosition(900));
        displayHighScorePosition(name, calculateHighScorePosition(400));
        displayHighScorePosition(name, calculateHighScorePosition(50));
        System.out.println(" ");
//        Overloading Methods Challenge
        System.out.println("Feet and inches to centimeters and back calculation exercise");
        System.out.println(" ");
        double centimeters = calcFeetAndInchesToCentimeters(72);
        System.out.println("72 inches to Centimeters: " + centimeters);
        centimeters = calcFeetAndInchesToCentimeters(6, 2);
        System.out.println("6 feet 2 inches to centimeters: " + centimeters);
        String reverse = calcCentimetersToFeetAndInches(centimeters);
        System.out.println(centimeters + " cm to: " + reverse);
        System.out.println(" ");
//
    }

    private static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

    private static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }

    private static int calculateHighScorePosition(int score){
        if(score >= 1000){
            return 1;
        }
        else if(score >= 500){
            return 2;
        }
        else if(score >= 100){
            return 3;
        }
        return 4;
    }

    private static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (validate(feet, inches)){
            inches += (feet * 12);
            return 2.54 * inches;
        } else {
            return -1;
        }
    }

    private static double calcFeetAndInchesToCentimeters(double inches){
        if (validate(inches)){
            double feet = Math.floor(inches / 12);
            inches = inches % 12;
            return calcFeetAndInchesToCentimeters(feet, inches);
        } else {
            return -1;
        }
    }

    private static String calcCentimetersToFeetAndInches(double centimeters){
        if(centimeters > 0){
            double inches = centimeters / 2.54;
            double feet = Math.floor(inches / 12);
            inches = inches % 12;
            return feet + " feet and " + inches + " inches";
        } else {
            return "-1";
        }
    }

    private static boolean validate(double feet, double inches){
        if(feet >= 0 && inches >= 0 && inches <= 12){
            return true;
        }
        return false;
    }

    private static boolean validate(double inches){
        if(inches >= 0){
            return true;
        }
        return false;
    }
}
