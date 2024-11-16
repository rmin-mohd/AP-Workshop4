import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        ArrayList<String> choices = new ArrayList<String>();
        ArrayList<String> choices2 = new ArrayList<String>();

        Person person1 = new Person("Minhal", "Raza");
        Person person2 = new Person("Daniyal", "Abbas");
        Person person3 = new Person("Raza", "Abbas");
        Person person4 = new Person("Murteza", "Sadeqi");
        Person person5 = new Person("Mohammad", "Hakimiyan");

        choices.add("choice1");
        choices.add("choice2");
        choices.add("choice3");

        choices2.add("choice1");

        votingSystem.createVoting("question1", false , 0, choices);
        votingSystem.createVoting("question2", false, 0, choices);
        votingSystem.createVoting("question3", true, 1, choices);

        votingSystem.getVoting(0).vote(person2, choices);
        votingSystem.getVoting(1).vote(person3, choices);
        votingSystem.getVoting(1).vote(person4, choices);
        votingSystem.getVoting(0).vote(person5, choices);

        votingSystem.getVoting(0).vote(person1, choices2);
        votingSystem.getVoting(1).vote(person2, choices2);
        votingSystem.getVoting(2).vote(person1, choices2);
        votingSystem.getVoting(2).vote(person2, choices); // this voting is from type 1, so can't choice more than one choice

        votingSystem.printVoting(0);
        System.out.println();
        votingSystem.printVoting(1);
        System.out.println();
        votingSystem.printVoting(2);

        System.out.println();
        System.out.println();
        System.out.println();

        votingSystem.printResults(0);
        System.out.println();
        votingSystem.printResults(1);
        System.out.println();
        votingSystem.printResults(2);

        System.out.println();
        System.out.println();
        System.out.println();

        votingSystem.printVoters(0);
        System.out.println();
        votingSystem.printVoters(1);
        System.out.println();
        votingSystem.printVoters(2);
    }
}