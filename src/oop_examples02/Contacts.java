package oop_examples02;

import java.util.Scanner;

public class Contacts {
 private String name;
 private String phoneNumber;
 private String emailAdress;
 Scanner input= new Scanner(System.in);

 public Contacts(String name,String phoneNumber,String emailAdress){
      this.name=name;
      this.phoneNumber=phoneNumber;
      this.emailAdress=emailAdress;
 }
 public Contacts(){

 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getPhoneNumber() {
  return phoneNumber;
 }

 public void setPhoneNumber(String phoneNumber) {
  this.phoneNumber = phoneNumber;
 }

 public String getEmailAdress() {
  return emailAdress;
 }

 public void setEmailAdress(String emailAdress) {
  this.emailAdress = emailAdress;
 }

 public void showInfo(){
  System.out.println();
  System.out.println("Name: "+this.name);
  System.out.println("Phone number "+this.phoneNumber);
  System.out.println("E-mail Adress: "+this.emailAdress);
 }

 public void sendMail(){

  System.out.print("Please write your message:");
  String message=input.nextLine();
  System.out.println("Sending e mail to "+this.name);
 }
 public void inputInfos(){
  System.out.print("Name: ");
  this.name=input.nextLine();
  System.out.print("Phone number: ");
  this.phoneNumber=input.nextLine();
  System.out.print("Email adress: ");
  this.emailAdress=input.nextLine();

 }

}
