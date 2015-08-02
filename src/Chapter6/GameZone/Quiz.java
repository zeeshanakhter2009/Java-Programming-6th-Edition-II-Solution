/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6.GameZone;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ZA
 */
public class Quiz {
    public static void main(String[] args) {

                System.out.println("Photography quiz.\n");

                int correctAnswersNumber = 0;
                int incorrectAnswersNumber = 0;

                // Initialize the questions; each question will contain the answer list
                Question questions[] = initializeQuestions();

                Scanner userInput;
                int option;

                for (int i = 0; i < questions.length; i++) {

                        // display the question text
                        System.out.println(questions[i].getQuestionText());

                        // display the available answers for the question
                        questions[i].printAnswers();

                        userInput = new Scanner(System.in);
                        try {
                                option = userInput.nextInt();
                        } catch (InputMismatchException e) {
                                // user did not enter an integer
                                option = -99;
                        }

                        // display the appropriate message if the answer is correct or not.
                        if (option == questions[i].getCorrectAnswer()) {
                                System.out.println("Congratulations! That was the correct answer. \n");
                                correctAnswersNumber++;
                        } else {
                                System.out.println("Wrong answer. The correct one is: " + questions[i].getCorrectAnswer() + "\n");
                                incorrectAnswersNumber++;
                        }
                }

                System.out.println("Number of correct answers: " + correctAnswersNumber);
                System.out.println("Number of incorrect answers: " + incorrectAnswersNumber);
                System.out.println("Percentage of correct answers: " + ((100 * correctAnswersNumber) / (correctAnswersNumber + incorrectAnswersNumber)) + "%");

        }

        /**
         * Creates questions and adds to each question the list with answer.
         * 
         * @return array of <code>Question</code> type.
         */
        private static Question[] initializeQuestions() {
                Question questions[] = new Question[6];

                questions[0] = new Question("1. In photography, filters are used to:");
                questions[0].addAnswer(new Answer("keep dirt and grime away from the film surface "));
                questions[0].addAnswer(new Answer("modify light.", true));
                questions[0].addAnswer(new Answer("keep used photons from collecting inside the camera."));
                questions[0].addAnswer(new Answer("clean the air entering the camera through the PC terminal."));

                questions[1] = new Question("2. Depth of  field refers to:");
                questions[1].addAnswer(new Answer("the thickness of the film."));
                questions[1].addAnswer(new Answer("the distance from the rear nodal point of the lens and the film plane."));
                questions[1].addAnswer(new Answer("landscape photographs made with a wide angle lens."));
                questions[1].addAnswer(new Answer("the areas behind and in front of the point of focus that are also acceptably sharp.", true));

                questions[2] = new Question("3. An over-exposed slide will:");
                questions[2].addAnswer(new Answer("be too light.", true));
                questions[2].addAnswer(new Answer("be too dark."));
                questions[2].addAnswer(new Answer("be orange colored."));
                questions[2].addAnswer(new Answer("have a pronounced blue cast."));

                questions[3] = new Question("4. A zoom lens:");
                questions[3].addAnswer(new Answer("is faster than a regular lens."));
                questions[3].addAnswer(new Answer("is usually sharper than a non-zoom lens."));
                questions[3].addAnswer(new Answer("has a variable focal length.", true));
                questions[3].addAnswer(new Answer("should never be used with a filter."));

                questions[4] = new Question("5. Compared to a film with an ISO of 400, a film with an ISO of 100:");
                questions[4].addAnswer(new Answer("requires less exposure."));
                questions[4].addAnswer(new Answer("is better for action subjects."));
                questions[4].addAnswer(new Answer("will produce grainer prints."));
                questions[4].addAnswer(new Answer("requires more exposure.", true));

                questions[5] = new Question("6. Which of the following are especially suitable for use in low-light photography?");
                questions[5].addAnswer(new Answer("slow film (low ISO rating)"));
                questions[5].addAnswer(new Answer("fast shutter speed."));
                questions[5].addAnswer(new Answer("wide aperture.", true));
                questions[5].addAnswer(new Answer("polarizing filter."));
                questions[5].addAnswer(new Answer("zoom lens."));

                return questions;
        }


}
