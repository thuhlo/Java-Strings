import java.util.Scanner;

public class CMDRunner
{

    public static void main(String[] args)
    {
        String userInput  = "x";
        Scanner keyBoard = new Scanner(System.in);

        while(!userInput.equalsIgnoreCase("quit"))
        {
            String cmdPart = "",  param1 = "", param2 = "";

            String[] dataLine;
            System.out.println("please enter a command");
            userInput = keyBoard.nextLine();
            dataLine = userInput.split(" ");

            cmdPart = dataLine[0];
            if(dataLine.length -1  == 1)
            {
                param1 = dataLine[1];
            }

            if(dataLine.length -1  == 2)
            {
               param2 = dataLine[2];
            }

            if(dataLine.length -1 == 1)
            {
                switch (cmdPart)
                {
                    case "odd":
                        getOdd(Integer.parseInt(dataLine[1]));
                        break;
                    case "even":
                        getEven(Integer.parseInt(dataLine[1]));
                        break;
                    case "square":
                        getSquare(Integer.parseInt(dataLine[1]));
                        break;
                    case "show":
                        System.out.println(dataLine[1]);
                        break;
                }
            }
            else if(dataLine.length - 1 == 2)
            {
                switch (cmdPart)
                {
                    case "concat":
                        getConcat(dataLine[1],dataLine[2]);
                        break;
                    case"range":
                        getRange(Integer.parseInt(dataLine[1]),Integer.parseInt(dataLine[2]));
                        break;
                }
            }
        }
    }



    public static void getOdd(int oddNumber)
    {
       if(oddNumber%2 == 0)
       {
           System.out.println("Odd Number : No");
       }
       else if(oddNumber%2<=1)
       {
           System.out.println("Odd Number : Yes");
       }
    }

    public static void getEven(int evenNumbrt)
    {
        if(evenNumbrt % 2 == 0)
        {
            System.out.println("Even Number : YES");
        }
        else
        {
            System.out.println("Even Number : NO");
        }
    }

    public static void getSquare(int squareNumber)
    {
        System.out.println(Math.sqrt(squareNumber));
    }

    public static void show(String showWord)
    {
        System.out.println(showWord);
    }

    public static void getConcat(String word1, String word2)
    {
        String oneWord;
        oneWord = word1 + word2;
        System.out.println(oneWord.toLowerCase());
    }

    public static void getRange(int start, int end)
    {
        if(start > end)
        {
            System.out.println("Invalid Combination: Start > End : " + start + ":" + end);
        }
        else
        {
            System.out.print(start);
            for(int i = start; i < end;)
            {
                System.out.print(i + 1);
                i++;
            }
            System.out.println("\n");
        }
    }

}
