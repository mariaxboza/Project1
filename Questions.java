public class Questions {
    // Class to create the questions able to ask

    String q1 = "Is the person a male?\n";
    String q2 = "Is the person a female?";
    String q3 = "Does the person have a hat?\n";
    String q4 = "Does the person have glasses?\n";
    String q5 = "Does the person have black hair?\n";
    String q6 = "Does the person have yellow hair?";
    String q7 = "Does the person have orange hair?\n";
    String q8 = "Does the person have white hair?\n";

    // Array of all the possible questions
    String[][] ques = {{q1, q2}, {q3, q4} , {q5, q6}, {q7, q8}};

    // Getter method for the question
    public String[][] getQues() { return ques;}

    // Constuctor that creates all the questions.
    public Questions(){}
}
