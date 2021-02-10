//Importing all the relevant packages and their classes 
import java.io.*;
import java.util.*;

class blood_stock
{
	//Method to show blood stock

	static int qua1=0,qua2=0,qua3=0,qua4=0,qua5=0,qua6=0,qua7=0,qua8=0;
	void blood_stockk()
	{		
		System.out.println("\nBlood Stocks");
		System.out.println("Blood Group : A+ \nStock :" + qua1 + " ml");
		System.out.println("Blood Group : A- \nStock :" + qua2 + " ml");
		System.out.println("Blood Group : B+ \nStock :" + qua3 + " ml");
		System.out.println("Blood Group : B- \nStock :" + qua4 + " ml");
		System.out.println("Blood Group : O+ \nStock :" + qua5 + " ml");
		System.out.println("Blood Group : O- \nStock :" + qua6 + " ml");
		System.out.println("Blood Group : AB+ \nStock :" + qua7 + " ml");
		System.out.println("Blood Group : AB- \nStock :" + qua8 + " ml");
	}
}
class blood_cell extends blood_stock
{
	void blood_stockk()
	{		
		System.out.println("\nBlood Stocks");
		System.out.println("Blood Group : A+ \nStock :" + (qua1*5000) + " units");
		System.out.println("Blood Group : A- \nStock :" + (qua2*5000) + " units");
		System.out.println("Blood Group : B+ \nStock :" + (qua3*5000) + " units");
		System.out.println("Blood Group : B- \nStock :" + (qua4*5000) + " units");
		System.out.println("Blood Group : O+ \nStock :" + (qua5*5000) + " units");
		System.out.println("Blood Group : O- \nStock :" + (qua6*5000) + " units");
		System.out.println("Blood Group : AB+ \nStock :" + (qua7*5000) + " units");
		System.out.println("Blood Group : AB- \nStock :" + (qua8*5000) + " units");
	}
}
class patient
{
	//Declaring variables.

	String p_name,pblg,padd,rbg4,psex;
	int quan,i,pid;

	//Method to get patient details

	void new_patient()
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Patient id : ");
		pid = input.nextInt();

		System.out.print("Patient name : ");
		p_name = input.next();

		System.out.print("Address : ");
		padd = input.next();

		do{
		System.out.print("Gender : ");
		psex = input.next();
		if(!(psex.equals("F") ||psex.equals("M")||psex.equals("f")||psex.equals("m")))
		{
			System.out.println("Wrong input please try again");
		}
		else
		{
			break;
		}
		}while(true);

		do{
		System.out.print("Blood Group of patient : ");
		pblg = input.next();
		if(!(pblg.equals("A+")||pblg.equals("B+")||pblg.equals("AB+")||pblg.equals("O+")||pblg.equals("A-")||pblg.equals("B-")||pblg.equals("AB-")||pblg.equals("O-")||pblg.equals("a+")||pblg.equals("b+")||pblg.equals("ab+")||pblg.equals("o+")||pblg.equals("a-")||pblg.equals("b-")||pblg.equals("ab-")||pblg.equals("o-")))
		{
			System.out.println("Input you entered is not a blood group. Please try again");
		}
		else
		{
			break;
		}
		}while(true);}

	//Method to show patient's details

	void patient_info()
	{
		System.out.println("ID" + "\t" + "Name" + "\t" + "Gender" + "\t" + "Address" + "\t" + "Blg_grp");
		System.out.println(pid + "\t" + p_name + "\t" + psex + "\t" + padd + "\t" + pblg);
	}
}
class donor extends blood_stock
{
	//Declaring variables

	String don_name,en_date,bg5,hc_name,dsex;
	int id_don,qua;

	//Method to get donor's details

	void new_donor()
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Donor id : ");
		id_don = input.nextInt();

		System.out.print("Donor name : ");
		don_name = input.next();

		System.out.print("Date of Donation : ");
		en_date = input.next();

		do{
		System.out.print("Gender : ");
		dsex = input.next();
		if(!(dsex.equals("F") ||dsex.equals("M")||dsex.equals("f")||dsex.equals("m")))
		{
			System.out.println("Wrong input please try again");
		}
		else
		{
			break;
		}
		}while(true);
		

		do{
			System.out.print("Blood Group of donor : ");
			bg5 = input.next();
			if(!(bg5.equals("A+")||bg5.equals("B+")||bg5.equals("AB+")||bg5.equals("O+")||bg5.equals("A-")||bg5.equals("B-")||bg5.equals("AB-")||bg5.equals("O-")||bg5.equals("a+")||bg5.equals("b+")||bg5.equals("ab+")||bg5.equals("o+")||bg5.equals("a-")||bg5.equals("b-")||bg5.equals("ab-")||bg5.equals("o-")))
			{
				System.out.println("Input you entered is not a blood group. Please try again");
			}
			else
			{
				break;
			}
		}while(true);
		

		System.out.print("Quantity of Blood donated : ");
		qua = input.nextInt();

		if(bg5.equals("A+") || bg5.equals("a+"))
			qua1 += qua;
		else if(bg5.equals("A-") || bg5.equals("a-"))
			qua2 += qua;
		else if(bg5.equals("B+") || bg5.equals("b+"))
			qua3 += qua;
		else if(bg5.equals("B-") || bg5.equals("b-"))
			qua4 += qua;
		else if(bg5.equals("O+") || bg5.equals("o+"))
			qua5 += qua;
		else if(bg5.equals("O-") || bg5.equals("o-"))
			qua6 += qua;
		else if(bg5.equals("AB+") || bg5.equals("ab+"))
			qua7 += qua;
		else if(bg5.equals("AB-") || bg5.equals("ab-"))
			qua8 += qua;	
		System.out.print("Hospital or camp name : ");
		hc_name = input.next();
	}

	//Method to show donor's details

	void donor_info()
	{
		System.out.println("ID" + "\t" + "Name" + "\t" + "Gender" + "\t" + "Entry_date" + "\t" + "Bld_grp" + "\t" + "   Quantity" +"\t" + "Hospital_name");
		System.out.println(id_don + "\t" + don_name + "\t" + dsex + "\t" + en_date + "\t\t" + bg5 + "\t\t" + qua5 +"\t" + hc_name);
	}
}   
class order extends blood_stock
{
	//Method to show order details

	void orderr()
	{
		String p_name,pblg,date3,avl;
		int quan,eml3;
		Scanner input = new Scanner(System.in);
		System.out.print("Patient name : "); 
		p_name = input.next();
	
		do{
		System.out.print("Ordered blood group : ");
		pblg = input.next();
		if(!(pblg.equals("A+")||pblg.equals("B+")||pblg.equals("AB+")||pblg.equals("O+")||pblg.equals("A-")||pblg.equals("B-")||pblg.equals("AB-")||pblg.equals("O-")||pblg.equals("a+")||pblg.equals("b+")||pblg.equals("ab+")||pblg.equals("o+")||pblg.equals("a-")||pblg.equals("b-")||pblg.equals("ab-")||pblg.equals("o-")))
		{
			System.out.println("Input you entered is not a blood group. Please try again");
		}
		else
		{
			System.out.print("Quantity of Blood Group : ");
			quan = input.nextInt();
			if(pblg.equals("A+") || pblg.equals("a+"))
			{
				if(quan>qua1)
				{
					System.out.println("Sorry the quantity exceeds the stock.");
				}
				else 
				{
					qua1 -= quan;
					break;
				}
			}
			else if(pblg.equals("A-") || pblg.equals("a-"))
			{
				if(quan>qua2)
				{
					System.out.println("Sorry the quantity exceeds the stock.");
				}
				else 
				{
					qua2 -= quan;
					break;
				}
			}
			else if(pblg.equals("B+") || pblg.equals("b+"))
			{
				if(quan>qua3)
				{
					System.out.println("Sorry the quantity exceeds the stock.");
				}
				else 
				{
					qua3 -= quan;
					break;
				}
			}
			else if(pblg.equals("B-") || pblg.equals("b-"))
			{
				if(quan>qua4)
				{
					System.out.println("Sorry the quantity exceeds the stock.");
				}
				else 
				{
					qua4 -= quan;
					break;
				}
			}
			else if(pblg.equals("O+") || pblg.equals("o+"))
			{
				if(quan>qua5)
				{
					System.out.println("Sorry the quantity exceeds the stock.");
				}
				else 
				{
					qua5 -= quan;
					break;
				}
			}
			else if(pblg.equals("O-") || pblg.equals("o-"))
			{
				if(quan>qua6)
				{
					System.out.println("Sorry the quantity exceeds the stock.");
				}
				else 
				{
					qua6 -= quan;
					break;
				}
			}
			else if(pblg.equals("AB+") || pblg.equals("ab+"))
			{
				if(quan>qua7)
				{
					System.out.println("Sorry the quantity exceeds the stock.");
				}
				else 
				{
					qua7 -= quan;
					break;
				}
			}
			else if(pblg.equals("AB-") || pblg.equals("ab-"))
			{	
				if(quan>qua8)
				{
					System.out.println("Sorry the quantity exceeds the stock.");
				}
				else 
				{
					qua8 -= quan;
					break;
				}
			}
//			break;
		}		
		}while(true);
	
		
		System.out.print("Emergency level(1 to 5) : ");
		eml3 = input.nextInt();

	}
	} 


class total
{
	public static void main(String[] args)
	{


		Scanner input=new Scanner(System.in);
		patient[] p=new patient[25];
		donor d=new donor();
		blood_stock bd=new blood_stock();
		blood_cell bc=new blood_cell();
		order o=new order();
		int choice,c1,s1,count1=0,j=0,status=1;
		s:
		while(status==1)
		{
			System.out.println("\n                                    MAIN MENU");
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("1.DONOR  2. BLOOD STOCK  3.PATIENT  4.ORDER  5.BLOOD CELL  6.EXIT");
			System.out.println("--------------------------------------------------------------------------------");
			System.out.print("                                    Enter choice : ");
			choice = input.nextInt();
			switch (choice)
			{
				case 3:
				{
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println("                      **PATIENT SECTION**");
					System.out.println("--------------------------------------------------------------------------------");
					s1=1; 
					while(s1==1)
					{
						System.out.println("\n                                    MAIN MENU");
						System.out.println("--------------------------------------------------------------------------------");
						System.out.println("1.Add a new data 2.Display 3.EXIT");
						System.out.println("--------------------------------------------------------------------------------");

						c1=input.nextInt(); 
						//switch(c1)
						if(c1==1)
						{
							//case 1:
							p[count1] = new patient();			
							p[count1].new_patient();
							count1++;
							//break;
						}
						//case 2:
						else if(c1==2)
						{
							for(j=0;j<count1;j++)
							{
								System.out.println("The patient's details : ");
								System.out.println();
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
					break;
				}		
				case 1:
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println("                      **DONOR SECTION**");
					System.out.println("--------------------------------------------------------------------------------");
					d.new_donor();
					System.out.println("The donor's details : ");
					d.donor_info();
					break;
				case 2:
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
					bc.blood_stockk();
					break;
				case 6: break s;
			}
		}
	}
}