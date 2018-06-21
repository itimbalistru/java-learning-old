public class PhraseMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"non-stop", "destept", "dinamic"};
        String[] wordListTwo = {"central", "de firma", "focusat pe "};
        String[] wordLineThree = {" proces ", " talent ", " portal "};

        int oneLength = wordListOne.length;
        int twoLenght = wordListTwo.length;
        int threeLenght = wordLineThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLenght);
        int rand3 = (int) (Math.random() * threeLenght);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordLineThree[rand3];
        System.out.println("Tot ceea ce avem nevoie este " + phrase);
    }

}
