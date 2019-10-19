import java.security.SecureRandom;
import java.util.Scanner;
import java.lang.Math;
public class Problem_1 {

        public static double QuestionGenerator(int level, int arithmetic)
        {
            SecureRandom randomNumbers = new SecureRandom();
            double correctAnswer=0;
            int num1, num2;
            int randomarithmetic;

            if(level == 1)
            {
                num1 = randomNumbers.nextInt(10);
                num2 = randomNumbers.nextInt(9)+1;
            }

            else if(level == 2)
            {
                num1 = randomNumbers.nextInt(100);
                num2 = randomNumbers.nextInt(100);
            }


            else if(level == 3)
            {
                num1 = randomNumbers.nextInt(1000);
                num2 = randomNumbers.nextInt(1000);
            }


            else
            {
                num1 = randomNumbers.nextInt(10000);
                num2 = randomNumbers.nextInt(10000);
            }


            if(arithmetic == 1)
            {
                correctAnswer = (num1 + num2);
                System.out.println("How much is " + num1 + " + " + num2);
                System.out.println("You only get one attempt");
            }

            else if(arithmetic == 2)
            {
                correctAnswer = (num1 * num2);
                System.out.println("How much is " + num1 + " * " + num2);
                System.out.println("You only get one attempt");

            }

            else if(arithmetic == 3)
            {
                correctAnswer = (num1 - num2);
                System.out.println("How much is " + num1 + " - " + num2);
                System.out.println("You only get one attempt");
            }

            else if (arithmetic == 4)
            {
                correctAnswer = ((double)num1 / num2);
                System.out.println("How much is " + num1 + " / " + num2);
                System.out.println("You only get one attempt");


            }

            else
            {
                randomarithmetic = randomNumbers.nextInt(4)+1;
                if(randomarithmetic == 1)
                {
                    correctAnswer = (num1 + num2);
                    System.out.println("How much is " + num1 + " + " + num2);
                    System.out.println("You only get one attempt");
                }
                else if(randomarithmetic == 2)
                {
                    correctAnswer = (num1 * num2);
                    System.out.println("How much is " + num1 + " * " + num2);
                    System.out.println("You only get one attempt");
                }

                else if(randomarithmetic == 3)
                {
                    correctAnswer = (num1 - num2);
                    System.out.println("How much is " + num1 + " - " + num2);
                    System.out.println("You only get one attempt");

                }

                else if (randomarithmetic == 4)
                {
                    correctAnswer = ((double)num1 / num2);
                    System.out.println("How much is " + num1 + " / " + num2);
                    System.out.println("You only get one attempt");

                }
            }

            return correctAnswer;
        }



        public static int Response(double Answer, double correctAnswer)
        {
            SecureRandom randomNumbers = new SecureRandom();
            int Correct = 1, Incorrect = 0;
            int respond =randomNumbers.nextInt(4)+1;
            switch(respond)
            {
                case 1:
                    System.out.println((Answer == correctAnswer || (Math.abs(Answer - correctAnswer) < 0.01)) ? "Very Good!" : "Sorry Wrong Answer.\nThe correct answer:" + correctAnswer);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println((Answer == correctAnswer || (Math.abs(Answer - correctAnswer) < 0.01)) ? "Excellent!" : "Incorrect Answer.\nThe correct answer:" + correctAnswer);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println((Answer == correctAnswer || (Math.abs(Answer - correctAnswer) < 0.01)) ? "Nice work!" : "Don’t give up!\nThe correct answer:" + correctAnswer);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println((Answer == correctAnswer || (Math.abs(Answer - correctAnswer) < 0.01)) ? "Keep up the good work!" : "No. Keep trying.\n The correct answer:" + correctAnswer);
                    System.out.println("");
                    break;
            }
            return ((Answer == correctAnswer) || ((Math.abs(Answer - correctAnswer) < 0.01)) ? Correct: Incorrect);
        }

        public static int Difficultylevel(Scanner input)
        {
            int level;
            System.out.println("What level of difficulty would you like?");
            System.out.println("Type 1 for 1 digits\nType 2 for 2 digits\nType 3 for 3 digits\nType 4 for 4 digits.");
            System.out.print("Type your level of difficultly here is is:");
            level = input.nextInt();
            System.out.println("");

            return level;
        }

        public static int AritmaticProblem(Scanner input)
        {
            int typeofArithmetic;
            System.out.println("What type of arithmetic problem would you like?");

            System.out.println("Type 1 for addition\nType 2 for multiplication\nType 3 for subtraction\nType 4 for division\nType 5 for a random mixture of Types 1-4");

            System.out.print("Type your type of arithmetic here:");

            typeofArithmetic = input.nextInt();

            System.out.println("");

            return typeofArithmetic;
        }


        public static void main(String [] args)
        {
            int i, levelDifficulty, typeofArithmetic;
            int correct,incorrect,CorrectOrIncorrect,total,loop=1;


            double correctAnswer, Answer;
            SecureRandom randomNumbers = new SecureRandom();
            Scanner input = new Scanner(System.in);

            while(loop == 1)
            {
                correct=0;
                incorrect=0;
                levelDifficulty = Difficultylevel(input);
                typeofArithmetic = AritmaticProblem(input);

                for(i=1;i<=10;i++)
                {
                    System.out.println("Question #" + i);
                    correctAnswer = QuestionGenerator(levelDifficulty, typeofArithmetic);
                    System.out.print("Type your answer here:");
                    Answer = input.nextDouble();
                    CorrectOrIncorrect = Response(Answer,correctAnswer);

                    if( CorrectOrIncorrect == 1)
                    {
                        correct++;
                    }

                    else
                    {
                        incorrect++;
                    }

                }

                System.out.println("The number of answers you got correct: " + correct);
                System.out.println("The number you answers you got incorrect: " + incorrect);
                total = (correct*10);

                if((total)>=70)
                {
                    System.out.println("Your percentage is " + (total) + "%");
                    System.out.println("Congratulations, you are ready to go to the next level!\n");
                }

                else
                {
                    System.out.println("Your percentage is " + (total) + "% ");
                    System.out.println("Not ready to advance to the next level. Please ask your teacher for extra help.\n");
                }

                System.out.println("Would you like to start another session?\nType 1 for yes\nType 0 for no");
                System.out.print("Type your response here:");
                loop = input.nextInt();
                System.out.println("");
            }
        }

    }


