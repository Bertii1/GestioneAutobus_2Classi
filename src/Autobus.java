import java.util.Scanner;

public class Autobus {
    private String marca;
    private String modello;
    private int NumPosti;
    private String destinazione;
    private String provenienza;
    private float prezzoBiglietto;
    private posto[] posti;

    public Autobus(String marca, String modello, int numPosti, String destinazione, String provenienza, float prezzoBiglietto, posto[] posti) {
        this.marca = marca;
        this.modello = modello;
        NumPosti = numPosti;
        this.destinazione = destinazione;
        this.provenienza = provenienza;
        this.prezzoBiglietto = prezzoBiglietto;
        this.posti=new posto[NumPosti];
    }

    public void NuovoAutobus(){
        Scanner datiIn = new Scanner(System.in);
        System.out.println("inserisci la marca dell autobus\n" +
                "marca:");
        String marca=datiIn.nextLine();
        System.out.println("inserisci il modello dell autobus\n"+
                "modello:");
        String modello= datiIn.nextLine();
        System.out.println("inserisci il numero di posti che l'autobus ha\n" +
                "posti:");
        int posti = datiIn.nextInt();
        System.out.println("inserisci la destinazione dell' autobus\n" +
                "destinazione:");
        String arrivo = datiIn.nextLine();
        System.out.println("inserisci il luogo di partenza dell' autobus\n"+
                "partenza:");
        String partenza = datiIn.nextLine();
        System.out.println("inserisci il prezzo del biglietto\n"+
                "prezzo:");
        int prezzo = datiIn.nextInt();



        for(int i=0;i<posti;i++){

        }

    }

    public boolean OccupaPosto(){
        for(int i=0;i<NumPosti;i++){
            if(!posti[i].isOccupato()){
                posti[i].setOccupato(true);
                return true;
            }
        }
        return false;
    }

    public boolean PrenotaPosto(){
        for(int i= 0;i<NumPosti;i++){
            if(!posti[i].isOccupato() && !posti[i].isPrenotato()){
                posti[i].setPrenotato(true);
                return true;
            }
        }
        return false;
    }


    public int NumeroPostiLiberi(){
        int Numero = 0;
        for(int i=0;i<NumPosti;i++){
            if(!posti[i].isOccupato() && !posti[i].isPrenotato()){
                Numero++;
            }
        }
        return Numero;


    }

    public void Menu(){
        Scanner datiIn = new Scanner(System.in);
        int scelta = 0;
        System.out.println("inserisci il numero dell'opzione\n"+
                           "1:");
        scelta=datiIn.nextInt();

        switch (scelta){
            case 1:
                NumeroPostiLiberi();
                break;

                case 2:
                NumeroPostiOccupati();
                break;

            case 3:
                NumeroPostiPrenotati();
                break;
        }
    }
}
