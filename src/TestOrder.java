
public class TestOrder {
	
	
	
	public static void main(String[] args) {
		Runnable compte1=new CompteurEx2("TA ",100);
    	Runnable compte2=new CompteurEx2("TB ",200);
    	
         new Thread(compte1).start();  
        new Thread(compte2).start();
        
        System.out.println("Ouiii , L’affichage sur la sortie standard est déterministe");
		

	}

}
