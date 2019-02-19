package wordgame;

public class Words {

    String word;
    int random;
    int x;

    public Words(int random) {
        this.random = random;
        this.word = verdict();
    }

    public String getWord() {
        return word;
    }

    public int getVerdict() {
        return x;
    }

    public String verdict() {
        String term = "";
        int x = ((int) (Math.random() * 100) % 6 + 1);
        switch (this.random) {
            case (1):
                String[] terms1 = {"cat", "dog", "bird, fish, hamster", "lizard"};
                term = terms1[x - 1];
                break;
            case (2):
                String[] terms2 = {"what", "When", "where", "what", "why", "how"};
                term = terms2[x - 1];
                break;
            case (3):
                String[] terms3 = {"car", "boat", "plane", "train", "bus", "Wagon"};
                term = terms3[x - 1];
                break;
            case (4):
                String[] terms4 = {"blue", "red", "green", "orange", "purple", "yellow"};
                term = terms4[x - 1];
                break;
            case (5):
                String[] terms5 = {"running", "swimming", "biking", "dancing", "sleeping", "eating"};
        }

        this.x = x;

        return term;
    }
}
