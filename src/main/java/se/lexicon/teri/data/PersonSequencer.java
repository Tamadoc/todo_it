package se.lexicon.teri.data;

public class PersonSequencer {
    private static int personId = 0;

    public static int nextPersonId(){
        return ++personId;
    }

    public static void resetPersonId(){
        personId = 0;
    }
}
