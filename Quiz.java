import java.util.Scanner;
public class Quiz {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        
        while (true) {
            System.out.println("-----Quiz Bee-----");
            System.out.println("1) Superheroes Quiz\n2) Math Quiz\n3) General Information Quiz\n4) Exit");
            System.out.println("Enter number of your choice");
            String choice = s.nextLine();
   
            if (choice.equals("1")){
                superheroesQuiz();
                break;
            } else if (choice.equals("2")){
                mathQuiz();
                break;
            } else if (choice.equals("3")){
                giQuiz();
                break;
            } else if (choice.equals("4")){
                System.out.println("The system will exit...");
                break;
            } else {
                System.out.println("Invalid input! please try again...");
                continue;
            }

        }
        s.close();
             
    }

    public static void superheroesQuiz(){
        String [] questions = {
            "What group is Superman?",
            "What ability did Spider man have?",
            "What is the weakness of Superman",
            "What is the other name of Superman",
            "Batman protects what city?"
        };
        String [] options = {
            "a) Justice League\tb) Marvel\tc) Red Group",
            ") Spiders ability\tb) Invisibility\tc) Can bounce off",
            "a) Samsonite\tb) Kryptonite\tc) Plutonite",
            "a) Man of all things\tb)Man of all matter\tc) Man of steel",
            "a) Chicago City, b)Gotham City\tc) Metropolis City"
        };
        char [] keys = {'a','a','b','c','b'};
        System.out.println("----Superheroes Quiz----");    
        int totalScore = 0;
        
        
        for (int i = 0; i < questions.length; i++){
            System.out.println("Questions "+ (i+1) +": "+questions[i]);
            System.out.print("\nOptions "+ options[i]);
            System.out.print("\nEnter your answer: ");
            char ans = s.next().charAt(0);
            
            if (ans == (keys[i])){
                System.out.println("You got it!");
                totalScore++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + keys[i]);
            }
            
        }
        
        System.out.println("\nYou got a total score of "+totalScore+" out of 5");
        s.close();
        
    }
    public static void mathQuiz(){
        String [] questions = {
            "What is 25 x 10?",
            "What is the square root of 120?",
            "What is the formula of circle?",
            "What is 150 divided by 40?",
            "1567 minus 456?"
        };
        String [] options = {
            "a) 255\tb) 2500\tc) 250",
            "a) 10.95\tb) 11.95\tc) 12.95",
            "a) C = 2πr\tb) A = πr^2\tc) D = πr^2",
            "a) 5.67\tb) 3.75\tc) 7.1",
            "a) 1111, b)1211\tc) 1050"
        };
        char [] keys = {'c','a','b','b','a'};
        System.out.println("----Math Quiz----");    
        int totalScore = 0;

        for (int i = 0; i < questions.length; i++){
            System.out.println("Questions "+ (i+1) +": "+questions[i]);
            System.out.println("\nOptions "+ options[i]);
            System.out.print("\nEnter your answer: ");
            char ans = s.next().charAt(0);
            
            if (ans == (keys[i])){
                System.out.println("You got it!");
                totalScore++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + keys[i]);
            }
            
        }
        System.out.println("\nYou got a total score of "+totalScore+" out of 5");
        
        s.close();
        
        
       
    }

    public static void giQuiz() {
        String [] questions = {
            "What is capital of Australlia?",
            "What wrote the play Romeo and Juliet?",
            "What is the chemical symbol for water?",
            "What painted Mona Lisa?",
            "Where exactly is The Big Ben?"
        };
        String [] options = {
            "a) Canberra\tb) Sydney\tc) Melbourne",
            "a) James Austen\tb) William Shakespeare\tc) Mark Twain",
            "a) O2\tb) CO2\tc) D = H2O",
            "a) Leonardo da Vinci\tb) Michealangelo\tc) Vincent Van Gogh",
            "a) Tokyo Japan, b) London England\tc) Paris France"
        };
        char [] keys = {'a','b','c','a','b'};
        System.out.println("----General Information Quiz----");    
        int totalScore = 0;

        for (int i = 0; i < questions.length; i++){
            System.out.println("Questions "+ (i+1) +": "+questions[i]);
            System.out.println("\nOptions "+ options[i]);
            System.out.print("\nEnter your answer: ");
            char ans = s.next().charAt(0);

            if (ans == (keys[i])){
                System.out.println("You got it!");
                totalScore++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + keys[i]);
            }
            
        }
        
        System.out.println("\nYou got a total score of "+totalScore+" out of 5");
        s.close();
    }
}