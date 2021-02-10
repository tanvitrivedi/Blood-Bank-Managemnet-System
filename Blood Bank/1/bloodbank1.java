import java.io.*;

import java.util.*;

import java.util.Calendar;

import java.text.SimpleDateFormat;

import java.util.Date;




class patient

{

 String p_name,pblg,padd,rbg4,psex;
 int quan,i,pid;
 void new_patient()

 {

  Scanner input = new Scanner(System.in);
  
  System.out.print("Patient id:-");
  pid = input.nextInt();

  System.out.print("Patient name:-");
  p_name = input.next();

  System.out.print("Address:-");
  padd = input.next();

  System.out.print("sex:-");
  psex = input.next();

  System.out.print("Blood Group of patient:-");
  pblg = input.next();
  
  //System.out.print("Required Blood Group of patient:-");
  //rbg4 = input.next();

  System.out.print("Quantity of Blood Group :-");
  quan = input.nextInt();
  
  }
 void patient_info()

 {
  
  System.out.println(pid + "\t" + p_name + "\t" + psex + "\t" + padd + "\t" + pblg + "\t" + quan);

 }
}
class donor
{
 String don_name,en_date,bg5,hc_name,dsex;

 int id_don,qua5;
	
 void new_donor()

 {

  Scanner input = new Scanner(System.in);

  System.out.print("Donor id:-");
  id_don = input.nextInt();

  System.out.print("Donor name:-");
  don_name = input.next();

  System.out.print("Date of Donation:-");
  en_date = input.next();

  System.out.print("sex:-");
  dsex = input.next();

  System.out.print("Blood Group of donor:-");
  bg5 = input.next();
  
  System.out.print("Quantity of Blood donated:-");
  qua5 = input.nextInt();

  System.out.print("Hospital or camp name :-");
  hc_name = input.next();
 }

void donor_info()

 {

  System.out.println(id_don + "\t" + don_name + "\t" + dsex + "\t" + en_date + "\t" + bg5 + "\t" + qua5 +"\t" + hc_name);

 }
}
class blood_stock
{
void blood_stockk()

 {
   String bg2,en_date,ex_date2,vald2;

 

  Scanner input = new Scanner(System.in);

  System.out.print("blood groups in stock:-");
  bg2 = input.next();

  System.out.print("entry date of blood:-");
  en_date = input.next();

  System.out.print("expiry Date of blood:-");
  ex_date2 = input.next();

  //System.out.print("validity of blood usage in days:-");
  //vald2 = input.nextInt();
 }
}
class order
{
void orderr()

 {
  String p_name,pblg,date3,avl;

 int quan,eml3;

  Scanner input = new Scanner(System.in);

  System.out.print("patient name:-");
  p_name = input.next();

  System.out.print("ordered blood group:-");
  pblg = input.next();

  System.out.print("quantity of blood(ml):-");
  quan = input.nextInt();

  System.out.print("date of order:-");
  date3 = input.next();
  
  System.out.print("emergency level(1 to 5):-");
  eml3 = input.nextInt();
  
  System.out.print("blood group available or not (Y/N):-");
  avl = input.next();
 }
 
}
class blood_cell
{
	int add_new1,e_exist1,det_1,list_1;
	void blood_cells()
	{
		Scanner input = new Scanner(System.in);
     
        System.out.println("Add new blood cells:");
		add_new1 = input.nextInt();
		
		System.out.println("Edit the existing blood cells stocks:");
		e_exist1 = input.nextInt();
		
		System.out.println("View of details blood cells:");
		det_1 = input.nextInt();
		
		System.out.println("listing of all blood cells:");
		list_1 = input.nextInt();
	}
}
class total
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		patient[] p=new patient[25];
		donor[] d=new donor[25];
		blood_stock bd=new blood_stock();
		blood_cell	bc=new blood_cell();
		order o=new order();
		int i;
		for(i=0;i<25;i++)
		{
		p[i]=new patient();
		}
		for(i=0;i<25;i++)
		{
			d[i]=new donor();
		}
		int choice,c1,s1,s2,count1=1,count2=1,j,status=1;
		
		while(status==1)
		{
		System.out.println("\n                                    MAIN MENU");
   System.out.println("--------------------------------------------------------------------------------");

   System.out.println("1.PATIENT  2. DONOR  3.BLOOD STOCK  4.ORDER  5.BLOOD CELL  6.EXIT");

   System.out.println("--------------------------------------------------------------------------------");
   choice = input.nextInt();
   
   switch (choice)
   {

	case 1:
	{
	  System.out.println("--------------------------------------------------------------------------------");

      System.out.println("                      **PATIENT SECTION**");

      System.out.println("--------------------------------------------------------------------------------");
		s1=1; 
		while(s1==1)
	{
		
	System.out.println("\n                                    PATIENT MENU");
    System.out.println("--------------------------------------------------------------------------------");
	System.out.println("1.Add a new data 2.Display  3.EXIT");
    System.out.println("--------------------------------------------------------------------------------");
	//Scanner ab = new Scanner(System.in);
	c1=input.nextInt(); 
	//switch(c1)
	if(c1==1)
	{
		//case 1:
		p[count1].new_patient();
		count1++;
		//break;
	}
		//case 2:
	else if(c1==2)
	{
		
		System.out.println("the donor details:-");
		System.out.println("Pid\t Name \tSex Address blood group quantity");
		for(j=1;j<count1;j++)
		{
		p[j].patient_info();
		}
		//break;
	}
	else if(c1==3)
	{
	System.out.println("Return back press (1/0) for more");
	s1=input.nextInt();
	}
	else
	{
		System.out.print("default");
	}
	}
break;//case 5:System.exit(0);
	}		//break;
	
	case 2:
	{
	  System.out.println("--------------------------------------------------------------------------------");

      System.out.println("                      **DONOR SECTION**");

      System.out.println("--------------------------------------------------------------------------------");
	s2=1; 
		while(s2==1)
	{
		
	System.out.println("\n                                    DONOR MENU");
    System.out.println("--------------------------------------------------------------------------------");
	System.out.println("1.Add a new data 2.Display  3.EXIT");
    System.out.println("--------------------------------------------------------------------------------");
	//Scanner ac = new Scanner(System.in);
	c1=input.nextInt(); 
	//switch(c1)
	if(c1==1)
	{
		//case 1:
		d[count2].new_donor();
		count2++;
		//break;
	}
		//case 2:
	else if(c1==2)
	{
		
		System.out.println("the donor details:-");
		System.out.println("id_don\tdon_name dsex\ten_date\tbg5\tqua5\thc_name");
		for(j=1;j<count2;j++)
		{
		d[j].donor_info();
		}
		//break;
	}
	else if(c1==3)
	{
	System.out.println("Return back press (1/0) for more");
	s2=input.nextInt();
	}
	else
	{
		System.out.print("default");
	}
	}//case 5:System.exit(0);
	}		//br
		break;
	case 3:
	  System.out.println("--------------------------------------------------------------------------------");

      System.out.println("                      **BLOOD_STOCK SECTION**");

      System.out.println("--------------------------------------------------------------------------------");
	  
	  bd.blood_stockk();
		break;
	case 4:
	  System.out.println("--------------------------------------------------------------------------------");

      System.out.println("                      **ORDER SECTION**");

      System.out.println("--------------------------------------------------------------------------------");
	
		o.orderr();
		break;
	case 5:
	  System.out.println("--------------------------------------------------------------------------------");

      System.out.println("                      **BLOOD_CELL SECTION**");

      System.out.println("--------------------------------------------------------------------------------");
	
		bc.blood_cells();
		break;
	case 6: System.exit(0);
	}
   }
}

}