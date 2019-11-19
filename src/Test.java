
public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Valeur myVal=new Valeur(1);
    	Runnable job1=new Ajob(myVal,1);
    	Runnable job2=new Ajob(myVal,-1);
    	
        // new Thread(myVal).start();  
        new Thread(job1).start(); 
        new Thread(job2).start(); 
	

	}

}
