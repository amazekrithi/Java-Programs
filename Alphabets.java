import java.io.*;
import java.util.Scanner;


public class Alphabets {
	public static void main(String[] args){
		String str;
		int n=0;
		int h=0;
		int w=1;
		int p=0;
		System.out.println(" enter a string");
		Scanner in= new Scanner(System.in);
		str=in.nextLine();
		int l=str.length();
		String a[]=new String[l];
		int b[]=new int[l];
		char c[]=new char[l];
		int l1,ladig,m;
		for(int i=0;i<l;i++){
			c[i]=str.charAt(i);
			a[i]=str.substring(i, (i+1));
			b[i]=c[i];
		}
		for(int j=0;j<l;j++)
		{
			if(((c[j]>='a' && c[j]<='z') || (c[j]>='A' && c[j]<='Z'))&&(c[j]!=32)){
				n=n+1;
				}
		}
		if(n==l){
			System.out.println("It contains alphabets");
		}else
		{
			System.out.println("It also contains other than alphabets");
		}
		char last=str.charAt(l-1);
		 l1=(int)last;
		 char ab='a';	
			for(int i=0;i<l;i++){
			char ch=str.charAt(i);
			while(i<=26){
			if(ch==ab){
		      p=w;     
			}
			w++;
			ab++;
			}System.out.println(p);
		if(l1>=65&&l1<=90){
			ladig=l1-64;
			m=p-ladig;
			 if(m<0){
				  m=m+64;
			 }
		}
		else{
			ladig=l1-89;
			m=p-ladig;
			 if(m<0){
				 
				  m=m+89;
			 }
		}
		char letter=(char)m;
		System.out.println(letter);
	}
			in.close();
	}
}
	

