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
public class Answer {
    // the text of the answer
        private String text;

        // the attribute to determine if the answer is correct of not
        private boolean correctAnswer;

        /**
         * Constructs an answer setting the attribute to determine the correct
         * answer to false.
         * 
         * @param answerText
         *            the text of the answer
         */
        public Answer(String answerText) {
                this.text = answerText;
                this.correctAnswer = false;
        }

        /**
         * Constructs and answer setting the answer text as well as the attribute to
         * determine correctness of the answer.
         * 
         * @param answerText
         *            the text of the answer
         * @param correctAnswer
         *            the attribute to determine if the answer is correct or not
         */
        public Answer(String answerText, boolean correctAnswer) {
                this.text = answerText;
                this.correctAnswer = correctAnswer;
        }

        /**
         * 
         * @return the text of the answer
         */
        public String getText() {
                return text;
        }

        /**
         * 
         * @return if the answer is correct or not
         */
        public boolean isCorrectAnswer() {
                return correctAnswer;
        }

}
