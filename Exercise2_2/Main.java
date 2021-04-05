package Exercise2_2;

public class Main {

	public static void main(String[] args) {
		Laptop Acer = new Laptop();
		Laptop Asus = new Laptop();
		Laptop Lenovo = new Laptop();
		Laptop Dell = new Laptop();
		
		System.out.println("ACER SPECIFICATIONS");
		Acer.printSpec("Acer", "Aspire 3", 2500, "RED", 1500.5,'N',"8GB");
		Acer.laptopType("Acer","Aspire 3","Work & Production");
		Acer.calcPrice(2500, 2);
		Acer.discPrice(2500, 2, 50);
		
		System.out.println("ASUS SPECIFICATIONS");
		Asus.printSpec("Asus", "ProArt", 8276, "BLACK", 2900.5,'N',"64GB");
		Asus.laptopType("Asus","ProArt","Production");
		Asus.calcPrice(8276, 3);
		Asus.discPrice(8276, 3, 30);
		
		System.out.println("LENOVO SPECIFICATIONS");
		Lenovo.printSpec("Lenovo", "IdeaPad 1", 1196, "GREY, ORANGE, BLUE", 1400.45,'N',"4GB");
		Lenovo.laptopType("Lenovo","IdeaPad 1","Production");
		Lenovo.calcPrice(1196, 5);
		Lenovo.discPrice(1196, 5, 20);
		
		System.out.println("DELL SPECIFICATIONS");
		Dell.printSpec("Dell", "Inspiron 15", 2249, "SOFT MINT", 1830.5,'N',"8GB");
		Dell.laptopType("Dell","Inspiron 15","Production & Work");
		Dell.calcPrice(2249, 4);
		Dell.discPrice(2249, 4, 25);
	}

}
