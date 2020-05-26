public class People { // People class for the different type of people

    private String _s;
    private Looks[] _l;

    public People(String s, Looks... l)
    { // Consturctor for the People
        _s = s;
        _l = l;
    }

    public String getName() { return _s; } // Getter method for the name of the person

    public Looks[] getLooks() { return _l; } // Getter method for the type of look
    
    
    // All the people in the game
    private static final People ANITA = new People("Anita", Looks.FEMALE, Looks.YELLOW );
    private static final People ANNE = new People("Anne", Looks.FEMALE, Looks.BLACK );
    private static final People BILL = new People("Bill", Looks.MALE, Looks.ORANGE );
    private static final People CHARLES = new People("Charles", Looks.MALE, Looks.YELLOW );
    private static final People CLAIRE = new People("Claire", Looks.FEMALE, Looks.ORANGE, Looks.GLASSES, Looks.HAT );
    private static final People DAVID = new People("David", Looks.MALE, Looks.YELLOW );
    private static final People ERIC = new People("Eric", Looks.MALE, Looks.YELLOW, Looks.HAT );
    private static final People SUSAN = new People("Susan", Looks.FEMALE, Looks.WHITE );
    private static final People TOM = new People("Tom", Looks.FEMALE, Looks.BLACK, Looks.GLASSES);
    private static final People FRANS = new People("Frans", Looks.MALE, Looks.ORANGE );
    private static final People HERMAN = new People("Herman", Looks.MALE, Looks.ORANGE);
    private static final People JOE = new People("Joe", Looks.MALE, Looks.YELLOW, Looks.GLASSES );
    private static final People MARIA = new People("Maria", Looks.FEMALE, Looks.BLACK, Looks.HAT);
    private static final People MAX = new People("Max", Looks.MALE, Looks.BLACK );
    private static final People PAUL = new People("Paul", Looks.MALE, Looks.WHITE, Looks.GLASSES );

    // The final array of people
    public static final People[] MY_PEOPLE = {ANITA, ANNE, BILL, CHARLES, CLAIRE, DAVID, ERIC,
                                SUSAN, TOM, FRANS, HERMAN, JOE, MARIA, MAX, PAUL};

    // This is to keep track of the player which is to be guessed 
    public static People curPlayer = MY_PEOPLE[(int)(Math.random() * MY_PEOPLE.length)];

    public static boolean isCorrect(String s)
    { // Method to check if the choice was correct
        return s.equals(curPlayer.getName());
    }

    public boolean hasLooks(Looks l)
    { // Method to check if the look chosen was correct
        for(int i = 0; i < _l.length; i++)
        {
            if(_l[i] == l)
                return true;
        }
        return false;
    }






}
