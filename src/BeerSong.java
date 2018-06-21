public class BeerSong {
    public static void main(String[] args) {
        int beer = 99;
        String word;
        while (beer > 0) {
            if (beer % 10 == 1) {
                word = " sticla ";
            } else {
                word = "sticle";
            }

            System.out.println(beer + " " + word + " bere.");
            System.out.println(" Ia una transmiteo la toti ");

            beer = beer - 1;

            if (beer > 0) {
                System.out.println(beer + " " + word + " berea pe raft ");
            } else {
                System.out.println(" nu sunt sticle pe raft ");
            }
        }
    }
}


