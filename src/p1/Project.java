package p1;
import java.util.Scanner;

public class Project 
{
	
		
	public static void main(String[] args) {
		char r;
		 do {
           System.out.println("*************Library Management System******************");
           System.out.println("Press 1 to add Book");
           System.out.println("Press 2 to issue a Book");
           System.out.println("Press 3 to return a book");
           System.out.println("Press 4 to print complete issue details");
           System.out.println("press 5 to exit");
           Scanner obj1=new Scanner(System.in);
           System.out.println("Enter any number");
           int a=obj1.nextInt();
           switch(a)
           {
           case 1:
        	   Library aa=new Library();
        	   aa.add();
        	   break;
           case 2:
        	   Library bb=new Library();
        	   bb.issue();
        	   break;
           case 3:
        	   Library cc=new Library();
        	   cc.ret();
        	   break;
           case 4:
        	   Library dd=new Library();
        	   dd.detail();
        	   break;
           case 5:
        	   Library exi=new Library();
        	   exi.exit();
        	   break;
        	default:
        		System.out.println("Invalid Number pls choice valid number");
           }
		 
           System.out.println("you want to select next option Y/N");
           r=obj1.next().charAt(0);
		 }
           while(r=='y'||r=='Y');
           if(r=='n'||r=='N')
           {
        	   Library z=new Library();
        	   z.exit();
           }
		 }
	

}
	


class Library{
	 static String str,b,date;
	 static int a,c;
	
	void add()
	{
		System.out.println("Enter book Name,Price,Book_No");
		Scanner obj2=new Scanner(System.in);
		String str=obj2.nextLine();
		float price=obj2.nextInt();
		int bookno=obj2.nextInt();
		System.out.println("Your Details is "+str +price +bookno);
	}
	void issue()
	{
		Scanner obj3=new Scanner(System.in);
		System.out.println("Book Name");
		str=obj3.nextLine();
		System.out.println("Book id");
		a=obj3.nextInt();
		obj3.nextLine();
		System.out.println("issue date");
		b=obj3.nextLine();
		System.out.println("total Number of book issue");
		c=obj3.nextInt();
		obj3.nextLine(); 
		System.out.println("Return Book Date");
		date=obj3.nextLine();	
		
	}
	int getid()
	{
		return a;
	}
	void ret()
	{
		System.out.println("Enter Student name & book_id");
		Scanner c=new Scanner(System.in);
		String name=c.nextLine();
		int bookid=c.nextInt();
		if(a==bookid)
		{
			System.out.println("Total details");
			System.out.println("Book name:"+Library.str);
			System.out.println("book_id:"+Library.a);
			System.out.println("issue date"+Library.b);
			System.out.println("total number of book issue:"+Library.c);
			System.out.println("book return date:"+Library.date);
		}
		else
		{
			System.out.println("Wrong id pls Enter correct id");
		}		
		
	}
	void detail()
	{
		System.out.println("Book name:"+Library.str);
		System.out.println("book_id:"+Library.a);
		System.out.println("issue date"+Library.b);
		System.out.println("total number of book issue:"+Library.c);
		System.out.println("book return date:"+Library.date);
	}
	void exit()
	{
		System.exit(0);
	}
}

