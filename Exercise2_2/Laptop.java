package Exercise2_2;

public class Laptop {
	String brand, model, color, type, RAM;
	int price, TotalPrice, units;
    double weight, discount;
    char fingerprint;
    
	void laptopType(String b,String m, String type) {
	  System.out.println("The Laptop type for :"+ b +" " + m + " is " + type);
	  System.out.println("-----------------------------");
	}
	
	void printSpec(String b,String m,int p,String c, double w, char f, String r) {
		System.out.println("Brand :"+ b);
		System.out.println("Model :"+ m);
		System.out.println("Price: "+ "RM" + p);
		System.out.println("Color: "+ c);
		System.out.println("Weight: "+ w + "gm");
		System.out.println("Fingerprint: "+ f);
		System.out.println("RAM: "+ r);
		System.out.println("-----------------------------");
	}
	
	void calcPrice(int p, int u) {
		int T = u * p;
		System.out.println("Total Price of " + u + " units :" + "RM"+ T);
		System.out.println("-----------------------------");
		}
	
   void discPrice(int p, int u, double d) {
	  int T = u * p;
	  double dp = d/100;
	  double disc = T - (T*dp);
		System.out.println("Total Price of " + u + " units :" + "RM"+ T);
		System.out.println("Discounted Price of " + u + " units :" + "RM"+ disc);
		System.out.println("-----------------------------");
   }
}
