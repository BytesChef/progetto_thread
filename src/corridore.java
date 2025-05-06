public class corridore extends Thread {
    private String nome;

    // COSTRUTTUORE
    public corridore(String nome) {
        this.nome = nome;
    }

    // GET E SET
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

 // to string
    @Override
    public String toString() {
        return "corridore [nome=" + nome + "]";
    }


    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println(nome +" -> "+ i + "metri"); 
            try {
                Thread.sleep(100);   
            } catch(Exception e) {}
        }
        System.out.println("Il corridore " + nome + " è arrivato");

       
    }


}
