package com.tutorial;

class Hero{
      // att
      String nama;
      float exp;
      float health;

   }

   class HeroTank extends Hero {
      
   }

public class Main {
 public static void main(String[] args) {
   //instansiasi objek
   Hero hero_1 = new Hero();
   hero_1.nama ="dea";

   System.out.println(hero_1.nama);

   HeroTank hero_2 = new HeroTank();
   hero_2.nama ="ivan";
    
   System.out.println(hero_2.nama);
 }   
}
