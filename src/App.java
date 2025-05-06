public class App {
    static final int MAX = 4;
    public static void main(String[] args) throws Exception {
        String nomi[] = {"Marco", "Matteo", "Michele", "Giovanni"};
        corridore lista[] = new corridore[MAX];
        
        for (int i=0; i<4; i++) {
            lista[i] = new corridore(nomi[i]);
            lista[i].start();
        }        
/*        
        corridore c1 = new corridore("Marco");
        corridore c2 = new corridore("Matteo");
        corridore c3 = new corridore("Michele");
        corridore c4 = new corridore("Giovanni");

        c1.start();
        c2.start();
        c3.start();
        c4.start();
       
 */
    }
}
