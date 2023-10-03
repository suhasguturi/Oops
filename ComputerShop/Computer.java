package assigment_1;

public class Computer {
	
	private static int computerCount = 0;
	
	private String brand;
	private String model;
	private long SN;
	private double price;
	
	public Computer()
	{
		 System.out.println("Defalt construct"); 
		 brand = "Dell";
		 model = "XPX";
		 SN = 1111111;
		 price = 2000.50;
		 computerCount++;
		 
		}
	public Computer(String bd, String md, long sn, double pr)
	{
		 System.out.println("Parameter construct"); 
		 brand = bd;
		 model = md;
		 SN = sn;
		 price = pr;
		 computerCount++;
	}
	public Computer(Computer cm)
	{
		 System.out.println("Copy constructor"); 
		 brand = cm.brand;
		 model = cm.model;
		 SN = cm.SN;
		 price = cm.price;
		 computerCount++;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String br) {
		brand = br;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String md) {
		model = md;
	}
	public long getSN() {
		return SN;
	}
	public void setSN(long sN) {
		SN = sN;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double pr) {
		price = pr;
	}
	@Override
	public String toString() {
		return "Computer is brand=" + brand + ", model=" + model + ", SN=" + SN + " and price=" + price ;
	}
	
	public static String findNumberOfCreatedComputers() {
		return "There are  " + computerCount + " computers created";
		
	}
	
	
	
	

}
