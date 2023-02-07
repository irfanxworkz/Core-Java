public class Address {
	
	String name;
	int population;
	String district;
	String state;
	String country;
	
	public Address()
	{
		System.out.println("0 argument Constructer");
	}
	public Address(String name)
	{
		this();
		this.name=name;
		System.out.println("1 argument Constructer: "+name);
	}
	public Address(String name,int population)
	{
		this(name);
		this.population=population;
		System.out.println("2 argument Constructer: "+name+" "+population);
	}
	public Address(String name,int population,String district)
	{
		this(name, population);
		this.district=district;
		System.out.println("3 argument Constructer: "+name+" "+population+" "+district);
	}
	public Address(String name,int population,String district,String state)
	{
		this(name, population, district);
		this.state=state;
		System.out.println("4 argument Constructer: "+name+" "+population+" "+district+" "+state);
	}
	public Address(String name,int population,String district,String state,String country)
	{
		this(name, population, district, state);
		this.country=country;
		System.out.println("5 argument Constructer: "+name+" "+population+" "+district+" "+state+" "+country);
	}
	
	public static void main(String args[])
	{
		new Address("Raipur",2200,"Bharatpur","Rajasthan","India");
	}
}

