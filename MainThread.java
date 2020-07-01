package com.refer.thread;
import java.io.FileReader;
import java.util.Scanner;
import java.io.*;
 class FileReading {
	 int i;
	 String s;
	 synchronized void reading(FileReader file) {
			try {  
				// System.out.println("file"currentThread()+"data:");
		          while((i=file.read())!=-1)    
		              System.out.print((char)i);    
		              file.close();		
			}
			
			 catch(Exception e) {
				 System.out.println(e);
			 }
		 }
		 
	 }
 class FileThread1 extends Thread{
	FileReading f;
	String s;
	FileReader f1;
	public FileThread1(FileReading f) {
	this.f=f;
	System.out.println("Enter file1 path:");
	Scanner sc=new Scanner(System.in);
	 s=sc.next();
	 //System.out.println("Enter file1 path:"+s);
	
	}
	public void run() {
		
		try {
			System.out.println("file1 data:");
		f1= new FileReader(s);
		}
		catch(FileNotFoundException e) {
		}
		
		f.reading(f1);
		}
 }
 class FileThread2 extends Thread{
	FileReading f;
	FileReader f2;
	String s1;
	public FileThread2(FileReading f) {
	this.f=f;
	System.out.println("Enter file2 path:");
	Scanner sc1=new Scanner(System.in);
	s1=sc1.next();
	}
	
	public void run() {
		//try {
		//Thread.sleep(1000);}
		//catch(InterruptedException e) {}
		
		//System.out.println("Enter file2 path:"+s1);
				try {
		f2=new FileReader(s1);
		}
		catch(FileNotFoundException e) {
		}
				System.out.println("file2 data:");	
		f.reading(f2);
		
				}
	

}
 public class MainThread{
	public static void main(String args[]) {
		FileReading a=new FileReading();
		FileThread1 t1=new FileThread1(a);
	    
	    FileThread2 t2=new FileThread2(a);
	    t1.start();
	    try {
	    Thread.sleep(500);}
	    catch(InterruptedException e) {}
	    t2.start();

	
}
}
