import java.util.Scanner;
class eightBall {

    public static void main(String[] args) {
        String[] responses = {
            "It is certain.", "It is decidedly so.", "Without a doubt.", "Yes definitely.",
            "You may rely on it.", 
    
            "As I see it, yes.", "Most likely.", "Outlook good.", "Yes.", "Signs point to yes.",
    
            "Reply hazy, try again.", "Ask again later.", "Better not tell you now.", 
            "Cannot predict now.", "Concentrate and ask again.",
    
            "Don't count on it.", "My reply is no.", "My sources say no.",
            "Outlook not so good", "Very doubtful"};
        print8b();
        System.out.println("Write your question to the magestic 8-Ball.");
        Scanner in = new Scanner(System.in);
        in.nextLine();
        in.close();
        
        int rng = (int) (Math.random() * responses.length);
        System.out.println(responses[rng]);

    }
    private static void print8b(){
        String[] eightball = {
        "        ____",
        "    ,dP9CGG88@b,",
        "  ,IP  _   Y888@@b,",
        " dIi  (_)   G8888@b",
        "dCII  (_)   G8888@@b",
        "GCCIi     ,GG8888@@@",
        "GGCCCCCCCGGG88888@@@",
        "GGGGCCCGGGG88888@@@@...",
        "Y8GGGGGG8888888@@@@P.....",
        " Y88888888888@@@@@P......",
        " `Y8888888@@@@@@@P'......",
        "    `@@@@@@@@@P'.......",
        "        \"\"\"\"........"
        };
        for (int i = 0; i<eightball.length; i++){
            System.out.println(eightball[i]);
        }

    }

}
