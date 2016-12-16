import java.lang.Math;
class DNA {
    String target;
    float fitness;
    //random phrase
    char[] genes = new char[18];

    //create random phrase
    DNA(String tar) {
        target = tar;
        for (int i = 0; i < genes.length; i++) {
            genes[i] = (char) ((Math.random() * (128-32)) + 32) ;
        }
    }

    //calulate fitness
    void fitness() {
        int score = 0;
        for (int i = 0; i < genes.length; i++) {
            if (genes[i] == target.charAt(i)) {
                score++;
            }
        }
        fitness = (float)score/target.length();
    }
}
