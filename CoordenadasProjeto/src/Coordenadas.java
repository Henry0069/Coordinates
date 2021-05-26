
public class Coordenadas 
{
	private double resultado,c1,c2;
	
	public void BCanonica(double x1, double y1, double x2, double y2, double a, double b)
	{
		c1 = (a * x1) + (b * y1);
		c2 = (a * x2) + (b * y2);		
		
		System.out.println("As novas coordenadas são ("+ c1 + "," + c2 + ")");
	}
	
	public void CanonicaB(double x1, double y1, double x2, double y2, double x, double y)
	{
		double d,dX,dY,resultadoA,resultadoB;
		
		System.out.println("Expressão atual da Solução: ("+x+","+y+") = a ("+x1+","+x2+") + b ("+y1+","+y2+")");
		
		d = (x1*y2) + ((x2*y1)*-1);
		dX = (y*y1) + ((y2*x)*-1);
		dY = (x1*y) + ((x2*x)*-1);
		
		resultadoA = d/dX;
		resultadoB = d/dY;
		
		System.out.println("As novas coordenadas são: ("+ resultadoA + "," + resultadoB + ")");
		
	}
	
	public void BCanonicaB(double x1, double y1, double x2, double y2, double x3, double x4, double y3, double y4, double a, double b)
	{
		double d,dX,dY,resultadoA,resultadoB,x,y;
		
		c1 = (a * x1) + (b * y1);
		c2 = (a * x2) + (b * y2);
		
		System.out.println("As coordenadas da base Canonica são ("+ c1 + "," + c2 + ")");
		
		x = c1;
		y = c2;
		
		d = (x3*y4) + ((x4*y3)*-1);
		dX = (y*y3) + ((y4*x)*-1);
		dY = (x3*y) + ((x4*x)*-1);
		
		resultadoA = d/dX;
		resultadoB = d/dY;
		
		System.out.println("As novas coordenadas da Base2 são ("+ resultadoA + "," + resultadoB + ")");
		
	}
}
