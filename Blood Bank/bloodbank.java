import java.io.*;

import java.util.*;

import java.util.Calendar;

class patient

{

 String p_name,pblg,padd,rbg4,psex;

 int quan,pid;

 void new_patient()

 {

  Scanner input = new Scanner(System.in);

  System.out.print("Patient id:-");
  pid = input.nextInt();

  System.out.print("Patient name:-");
  p_name = input.nextLine();

  System.out.print("Address:-");
  padd = input.nextLine();

  System.out.print("sex:-");
  psex = input.nextLine();

  System.out.print("Blood Group of patient:-");
  pblg = input.nextLine();
  
  System.out.print("Required Blood Group of patient:-");
  rbg4 = input.nextLine();

  System.out.print("Quantity of Blood Group :-");
  quan = input.nextInt();
 }
 void patient_info()

 {

  System.out.println(pid + "\t" + p_name + "\t" + psex + "\t" + padd + "\t" + pblg + "\t" + rbg4 +"\t" + quan);

 }
}
class Donor
{
 String don_name,bg5,hc_name,dsex;

 int id_don,qua5,en_date;
	
 void new_donor()

 {

  Scanner input = new Scanner(System.in);

  System.out.print("Donor id:-");
  id_don = input.nextInt();

  System.out.print("Donor name:-");
  don_name = input.nextLine();

  System.out.print("Date of Donation:-");
  en_date = input.nextInt();

  System.out.print("sex:-");
  dsex = input.nextLine();

  System.out.print("Blood Group of donor:-");
  bg5 = input.nextLine();
  
  System.out.print("Quantity of Blood donated:-");
  qua5 = input.nextInt();

  System.out.print("Hospital or camp name :-");
  hc_name = input.nextLine();
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
   String bg2;

 int en_date,ex_date2,vald2;

  Scanner input = new Scanner(System.in);

  System.out.print("blood groups in stock:-");
  bg2 = input.nextLine();

  System.out.print("entry date of blood:-");
  en_date = input.nextInt();

  System.out.print("expiry Date of blood:-");
  ex_date2 = input.nextInt();

  System.out.print("validity of blood usage in days:-");
  vald2 = input.nextInt();
 }
}
class order
{
void orderr()

 {
  String p_name,pblg,avl;

 int quan,date3,eml3;

  Scanner input = new Scanner(System.in);

  System.out.print("patient name:-");
  p_name = input.nextLine();

  System.out.print("ordered blood group:-");
  pblg = input.nextLine();

  System.out.print("quantity of blood(ml):-");
  quan = input.nextInt();

  System.out.print("date of order:-");
  date3 = input.nextInt();
  
  System.out.print("emergency level(1 to 5):-");
  eml3 = input.nextInt();
  
  System.out.print("blood group available or not (Y/N):-");
  avl = input.nextLine();
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
