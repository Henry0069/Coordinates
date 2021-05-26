import java.util.Scanner;

public class CoordenadasTeste
{
	static double x1,x2,y1,y2,a,b;
	
	public static void main (String args[])
	{
	Coordenadas coo = new Coordenadas();	
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite qual o tipo de coordenada (1- B1 -> Canonica, 2- Canonica -> B1, 3- B1 -> Canonica -> B2");
	int pergunta = input.nextInt();
	
	
	 switch(pergunta)
	 {
	 case 1:
		 //B1 -> CANONICA
		System.out.println("Digite o primeiro X da nova coordenada:"); 
		x1 = input.nextDouble(); 
		System.out.println("Digite o segundo X da nova coordenada:"); 
		x2 = input.nextDouble(); 
		System.out.println("Digite o primeiro Y da nova coordenada:"); 
		y1 = input.nextDouble(); 
		System.out.println("Digite o segundo Y da nova coordenada:"); 
		y2 = input.nextDouble();
		System.out.println("Digite o alpha:"); 
		a = input.nextDouble(); 
		System.out.println("Digite o beta:"); 
		b = input.nextDouble(); 
		 
		coo.BCanonica(x1, y1, x2, y2, a, b);
	 break;
	 
	 case 2:
	    double x,y;
	
	    //CANONICA -> B1
	    System.out.println("Digite o X da Coordenada Canonica:");
	    x = input.nextDouble();
	    System.out.println("Digite o Y da Coordenada Canonica:");
	    y = input.nextDouble();
	    System.out.println("Digite o primeiro X da nova coordenada:"); 
	    x1 = input.nextDouble(); 
	    System.out.println("Digite o segundo X da nova coordenada:"); 
	    x2 = input.nextDouble(); 
	    System.out.println("Digite o primeiro Y da nova coordenada:"); 
	    y1 = input.nextDouble(); 
	    System.out.println("Digite o segundo Y da nova coordenada:"); 
	    y2 = input.nextDouble();
	    
	    coo.CanonicaB(x1, y1, x2, y2, x, y);
		 
	 break;
	 
	 case 3:
		 double x3,x4,y3,y4;
		 
		// B1 -> Canonica. 
		 a = input.nextDouble(); 
		 System.out.println("Digite o beta:"); 
		 b = input.nextDouble();
	     System.out.println("Digite o primeiro X da nova coordenada:"); 
		 x1 = input.nextDouble(); 
		 System.out.println("Digite o segundo X da nova coordenada:"); 
		 x2 = input.nextDouble(); 
		 System.out.println("Digite o primeiro Y da nova coordenada:"); 
		 y1 = input.nextDouble(); 
		 System.out.println("Digite o segundo Y da nova coordenada:"); 
		 y2 = input.nextDouble();
		 
		 // Canonica -> B2.
		 System.out.println("Digite o primeiro X da nova coordenada:"); 
		 x3 = input.nextDouble(); 
		 System.out.println("Digite o segundo X da nova coordenada:"); 
		 x4 = input.nextDouble(); 
		 System.out.println("Digite o primeiro Y da nova coordenada:"); 
		 y3 = input.nextDouble(); 
		 System.out.println("Digite o segundo Y da nova coordenada:"); 
		 y4 = input.nextDouble();
		 
		 coo.BCanonicaB(x1, y1, x2, y2, x3, x4, y3, y4, a, b);
		 
		 
	 break;
	 
	 default:
		
		 System.out.print("Numero Invalido!");
	 }
   }
}
