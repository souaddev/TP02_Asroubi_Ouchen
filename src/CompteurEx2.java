
public class CompteurEx2 implements Runnable{

	 String nom;
	 int maxValue; 
	 public CompteurEx2(String nom, int maxValue) {
		   this.nom=nom;
		   this.maxValue=maxValue;	
	   }
	  public void run() {
	       int valeur=1;
	        try {
	            while(valeur <= maxValue) {
	                
	                System.out.println(nom+" => "+valeur);
	                valeur++;
	                Thread.sleep(10);
	            }
	        }
	        catch(Exception e) {
	            e.printStackTrace();
	        }
	  }


}
