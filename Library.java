abstract class Publication{
	public int noOfPages;
	public double price;
	public String publisherName;
	public void printDetails(){
		System.out.println("The number of pages : "+noOfPages);
		System.out.println("The price of book : "+price);
		System.out.println("The Publisher Name of book : "+publisherName);
	}
}
class Book extends Publication{
	Book(){
		
	}
	public void setDetails(int noOfPages,double price, String publisherName){
		this.noOfPages = noOfPages;
		this.price = price;
		this.publisherName = publisherName;
		this.printDetails();
	}
}
class Journal extends Publication{
	Journal(){
		
	}
	
	public void setDetails(int noOfPages,double price, String publisherName){
		this.noOfPages = noOfPages;
		this.price = price;
		this.publisherName = publisherName;
		this.printDetails();
	}
}
class Library{
	public static void main(String [] args){
		Book b1 = new Book();
		b1.setDetails(100,250,"ABC");
		Book b2 = new Book();
		b2.setDetails(150,250,"DEF");
		Book b3 = new Book();
		b3.setDetails(200,250,"IJK");
		Journal j1 = new Journal();
		j1.setDetails(300,250,"QRS");
		Journal j2 = new Journal();
		j2.setDetails(300,250,"QRS");
	}
}
