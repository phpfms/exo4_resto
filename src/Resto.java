import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Resto {

        private int numero;
        private String entree;
        private String plat;
        private String accompagnement;
        private String boisson;
        private String dessert;

        public Resto (int numero, String entree, String plat, String accompagnement, String boisson, String dessert) {
            this.numero = numero;
            this.entree = entree;
            this.plat = plat;
            this.accompagnement = accompagnement;
            this.boisson = boisson;
            this.dessert = dessert;
        }
        
        public int getNumero () {
        	return this.numero;
        }
        
        public String getEntree () {
        	return this.entree;
        }
        
        public String getPlat () {
        	return this.plat;
        }
        
        public String getAccompagnement () {
        	return this.accompagnement;
        }
        
        public String getBoisson () {
        	return this.boisson;
        }
        
        public String getDessert () {
        	return this.dessert;
        }
        
        public void ecrireCommande(PrintWriter pw) {

		pw.println("**************** Résumé de la commande N°" + getNumero() + " ****************");
		pw.println(getEntree());
		pw.println(getPlat());
		pw.println(getAccompagnement());
		pw.println(getBoisson());
		pw.println(getDessert());
		pw.println();
		}

    
    public static void main(String[] args) {
    	
        try (PrintWriter pw = new PrintWriter(new FileWriter("commandes.txt"))) {

        	Resto com1 = new Resto(
                    1,
                    "quiche",
                    "poulet",
                    "légumes",
                    "eau plate",
                    "mousse au chocolat");

            Resto com2 = new Resto(
                    2,
                    "salade",
                    "steak",
                    "frites",
                    "coca",
                    "tarte aux pommes");

            com1.ecrireCommande(pw);
            com2.ecrireCommande(pw);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}