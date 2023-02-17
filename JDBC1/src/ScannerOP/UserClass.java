package ScannerOP;

import java.util.Scanner;
import java.util.*;
import HospitalCon.HospitalData;
import dboperation.DBcon;
import patientData.Patientclass;

public class UserClass {
	public static void main(String[] args) {
		
		int v=10;
		Scanner sc = new Scanner(System.in);
		HospitalData h = new HospitalData();
		System.out.println("Press 1 to insert doctorData\npress 2 to view doctorData\npress 3 to insert patientData\npress 4 to view patientDat\npress 5 to view all data");
		v=sc.nextInt();
		Patientclass pc = new Patientclass();
		
		switch(v)
		{
		case 1: System.out.println("Enter doctorID :  ");
		        h.setdoctorId(sc.nextInt());
		        System.out.println("Enter doctorName :   ");
		        h.setdoctorName(sc.next()+sc.nextLine());
		        System.out.println("Enter doctorCategory :  ");
		        h.setdoctorCategory(sc.next()+sc.nextLine());
		        System.out.println("Enter doctorcontactNO :  ");
		        h.setdoctorcontactNO(sc.nextDouble());
		        DBcon.insert(h);
		        break;
		case 2: DBcon.view();
		        break;
		case 3: System.out.println("Enter patientID :  ");
		        pc.setpatientID(sc.nextInt());
		        System.out.println("Enter patientName :  ");
		        pc.setpatientName(sc.next()+sc.nextLine());
		        System.out.println("Enter patientCategory :  ");
		        pc.setpatientCategory(sc.next()+sc.nextLine());
		        System.out.println("Enter patientNO :  ");
		        pc.setpatientcontactNO(sc.nextDouble());
		        DBcon.insert(pc);
		        break;	
		case 4: DBcon.show();
		        break;
		case 5: DBcon.view();
		        DBcon.show();
		        break;
		default : System.out.println("invalid choice");
		}
		
	}

}
