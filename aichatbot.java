import java.util.Scanner;

public class aichatbot {

    public static String getResponse(String input) {

        input = input.toLowerCase();

        if (input.contains("hello") || input.contains("hi") ||
            input.contains("hey")) {
            return "Hello! How can I help you?";
        }

        else if (input.contains("your name") ||
                 input.contains("who are you")) {
            return "I am JavaBot, a simple AI chatbot.";
        }

        else if (input.contains("how are you")) {
            return "I am fine! Thanks for asking.";
        }

        else if (input.contains("java")) {
            return "Java is a popular object-oriented programming language.";
        }

        else if (input.contains("npl") || input.contains("nlp")) {
            return "NLP stands for Natural Language Processing.";
        }

        else if (input.contains("thank")) {
            return "You're welcome!";
        }

        else if (input.contains("bye") || input.contains("exit")) {
            return "Goodbye! Have a nice day.";
        }

        else {
            return "Sorry, I don't understand that question.";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("       AI CHATBOT - JavaBot     ");
        System.out.println("================================");
        System.out.println("Type 'bye' or 'exit' to stop.");
        System.out.println();

        while (true) {

            System.out.print("You: ");
            String input = sc.nextLine();

            String response = getResponse(input);

            System.out.println("Bot: " + response);

            if (input.toLowerCase().contains("bye") ||
                input.toLowerCase().contains("exit")) {
                break;
            }
        }

        sc.close();
    }
}
