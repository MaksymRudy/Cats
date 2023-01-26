public class Main {
    public static void main(String[] args) {

        Doberman doberman= new Doberman();

        Tchautchau tchautchau= new Tchautchau();

        Shepherd shepherd = new Shepherd();

        Pitbull  pitbull = new Pitbull();

        System.out.println("Doberman Paws: " + doberman.getPaw() );
        System.out.println("Tchautchau Paws: " + tchautchau.getPaw());
        System.out.println("Shepherd Paws:  " + shepherd.getPaw());
        System.out.println("Pitbull Paws:  " + pitbull.getPaw());
        System.out.println("Doberman Head: " + doberman.getHead());
        System.out.println("Tchautchau Head: " + tchautchau.getHead());
        System.out.println("Shepherd Head: " + shepherd.getEye());
        System.out.println("Pitbull Eye: " + pitbull.getEye());
        System.out.println("Doberman Tail: " + doberman.getTail());
        System.out.println("Tchautchau Tail: " + tchautchau.getTail());
        System.out.println("Shepherd Tail: " + shepherd.getTail());
        System.out.println("Pitbull Tail: " + pitbull.getTail());
        System.out.println(doberman.maxSpeedOfRunningForRabbit);
        System.out.println(doberman.maxPower);
        System.out.println(doberman.maxHighOfJumpForSquirrel);
        System.out.println(doberman.maxNumOfFoodForOneDinner);
        System.out.println(tchautchau.maxHighOfJumpForSquirrel);
        System.out.println(tchautchau.maxPower);
        System.out.println(tchautchau.maxSpeedOfRunningForRabbit);
        System.out.println(tchautchau.maxNumOfFoodForOneDinner);
        System.out.println(shepherd.maxPower);
        System.out.println(shepherd.maxHighOfJumpForSquirrel);
        System.out.println(shepherd.maxNumOfFoodForOneDinner);
        System.out.println(shepherd.maxSpeedOfRunningForRabbit);
        System.out.println(pitbull.maxPower);
        System.out.println(pitbull.maxHighOfJumpForSqurrel);
        System.out.println(pitbull.maxNumOfFoodForOneDinner);
        System.out.println(pitbull.maxSpeedOfRunningForRabbit);
    }
}