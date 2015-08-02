/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6.GameZone;

/**
 *
 * @author ZA
 */
public class Question {
    // the question text
        private String questionText;

        // the answers
        private Answer[] answers = null;

        /**
         * Constructs a question with the question text.
         * 
         * @param questionText
         */
        public Question(String questionText) {
                this.questionText = questionText;
        }

        /**
         * Prints on the console the answers available for the question.
         */
        public void printAnswers() {
                if (answers != null && answers.length > 0) {
                        for (int i = 0; i < answers.length; i++) {
                                System.out.println("    [" + i + "] " + answers[i].getText());
                        }
                }
        }

        /**
         * Adds a new possible answer to the question.
         * 
         * @param answer
         */
        public void addAnswer(Answer answer) {
                if (answers == null) {
                        answers = new Answer[1];
                        answers[0] = answer;
                } else {
                        Answer[] temp = answers;
                        answers = new Answer[temp.length + 1];
                        for (int i = 0; i < temp.length; i++) {
                                answers[i] = temp[i];
                        }
                        answers[temp.length] = answer;
                }
        }

        /**
         * Returns the order of the correct answer to the question.
         * 
         * @return correct answer position
         */
        public int getCorrectAnswer() {
                for (int i = 0; i < answers.length; i++) {
                        if (answers[i].isCorrectAnswer()) {
                                return i;
                        }
                }
                return -1;
        }

        /**
         * Returns the text of the question.
         * 
         * @return
         */
        public String getQuestionText() {
                return questionText;
        }

}
