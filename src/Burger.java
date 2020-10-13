import java.util.Scanner;
import java.util.ArrayList;
public class Burger {
    private double price;
    private String meat;
    private String bread = "teraleivaga";
    public String name;
    private double total = 0;

    public void Burgers(){
        Scanner What = new Scanner(System.in);
        ArrayList<String> BurgerList = new ArrayList<String>();
        while (true){

            System.out.println("\n[1] - Chicken burger - kanalihaga, valge saiaga.  Lisandite valik koosneb juustust, salatist, tomatist, maioneesist. 10 €\n" +
                    "[2] - Old Fashioned Cheeseburger - loomalihaga, valge saiaga.  Lisandite valik koosneb peekonist, kurgist, sibulast ja pekooni kastest.12 €\n" +
                    "[3] - New York Burger - sealihaga, teraleivaga. Lisandite valik koosneb ananassist, tomatist, kurgist ja sibulast. 8 €\n"+
                    "[0] - Ei soovi burgerit \n"+
                    "Sisestage nr 0-4 vastavalt soovile");

            int WhatBurg = What.nextInt();

                if (WhatBurg==1){ // BURGER 1 Chicken burger
                    price=10;
                    bread = "valge saiaga";
                    meat = "kanaliha ";
                    name ="Chicken burger";
                    System.out.println("Valige lisandid:\n [1] juust 0.2€\n [2] salat 0.3€\n [3] tomat 0.2€\n [4] majonees 0.1€\n [0] Ei soovi lisandeid");
                    ArrayList<String> ExtraList = new ArrayList<String>();
                        while (true){

                            int Extra = What.nextInt();
                            if (Extra==1){ // LISA 1 juust
                                if (ExtraList.contains("juust")){
                                    System.out.println("Juba lisatud");
                                }else {
                                    ExtraList.add("juust");
                                    price +=0.2;
                                    System.out.println("Lisati juust. Hetkel kokku "+price+ ExtraList);
                                }
                            }else if (Extra==2){ // LISA 2 salat
                                if (ExtraList.contains("salat")){
                                    System.out.println("Juba lisatud");
                                }else {
                                    ExtraList.add("salat");
                                    price +=0.3;
                                    System.out.println("Lisati salat. Hetkel kokku "+price);
                                }
                            }else if (Extra==3){ // LISA 3 tomat
                                if (ExtraList.contains("tomat")){
                                    System.out.println("Juba lisatud");
                                }else {
                                    ExtraList.add("tomat");
                                    price +=0.2;
                                    System.out.println("Lisati tomat. Hetkel kokku "+price);
                                }
                            }else if (Extra==4){ // LISA 4 majonees
                                if (ExtraList.contains("majonees")){
                                    System.out.println("Juba lisatud");
                                }else {
                                    ExtraList.add("majonees");
                                    price +=0.1;
                                    System.out.println("Lisati majonees. Hetkel kokku "+price);
                                }

                            }else if (Extra==0){ // 1 BURGER VALMIS
                                BurgerList.add("Chicken burger "+price+"€");
                                total = total+price;
                                System.out.println("Burger "+meat+bread+" valmis.  Hetkel kokku "+Math.round(total)+"€");
                                System.out.println("Lisandid: "+ExtraList);
                                break;
                            }
                        }
                }else if(WhatBurg==2){ // BURGER 2 Old Fashioned Cheeseburger
                    price =12;
                    bread = "valge saiaga";
                    meat = "loomalihaga ";
                    name ="Old Fashioned Cheeseburger ";
                    System.out.println("Valige lisandid:\n [1] peekon 0.2€\n [2] kurk 0.3€\n [3] sibul 0.2€\n [4] peekoni kaste 0.1€\n [0] Ei soovi lisandeid");
                    ArrayList<String> ExtraList = new ArrayList<String>();
                    while (true){

                        int Extra = What.nextInt();
                        if (Extra==1){ // LISA 1 juust
                            if (ExtraList.contains("peekon")){
                                System.out.println("Juba lisatud");
                            }else {
                                ExtraList.add("peekon");
                                price +=0.2;
                                System.out.println("Lisati peekon. Hetkel kokku "+price);
                            }
                        }else if (Extra==2){ // LISA 2 salat
                            if (ExtraList.contains("kurk ")){
                                System.out.println("Juba lisatud");
                            }else {
                                ExtraList.add("kurk ");
                                price +=0.3;
                                System.out.println("Lisati kurk . Hetkel kokku "+price);
                            }
                        }else if (Extra==3){ // LISA 3 tomat
                            if (ExtraList.contains("sibul")){
                                System.out.println("Juba lisatud");
                            }else {
                                ExtraList.add("sibul");
                                price +=0.2;
                                System.out.println("Lisati sibul. Hetkel kokku "+price);
                            }
                        }else if (Extra==4){ // LISA 4 majonees
                            if (ExtraList.contains("peekoni kaste")){
                                System.out.println("Juba lisatud");
                            }else {
                                ExtraList.add("peekoni kaste");
                                price +=0.1;
                                System.out.println("Lisati peekoni kaste. Hetkel kokku "+price);
                            }

                        }else if (Extra==0){ // 2 BURGER VALMIS
                            BurgerList.add(name +price+"€");
                            total = total+price;
                            System.out.println("Burger "+meat+bread+" valmis. Hetkel kokku "+Math.round(total)+"€");
                            System.out.println("Lisandid: "+ExtraList);
                            break;
                        }
                    }
                }else if(WhatBurg==3){ // BURGER 3 New York Burger
                    price =8;
                    meat = "sealiha ";
                    name ="New York Burger ";

                    System.out.println("Valige lisandid:\n [1] ananass 0.2€\n [2] kurk 0.3€\n [3] sibul 0.2€\n [4] tomat 0.2€\n [0] Ei soovi lisandeid");
                    ArrayList<String> ExtraList = new ArrayList<String>();
                    while (true){
                        int Extra = What.nextInt();
                        if (Extra==1){ // LISA 1 juust
                            if (ExtraList.contains("ananass")){
                                System.out.println("Juba lisatud");
                            }else {
                                ExtraList.add("ananass");
                                price +=0.2;
                                System.out.println("Lisati ananass. Hetkel kokku "+price);
                            }
                        }else if (Extra==2){ // LISA 2 salat
                            if (ExtraList.contains("kurk ")){
                                System.out.println("Juba lisatud");
                            }else {
                                ExtraList.add("kurk");
                                price +=0.3;
                                System.out.println("Lisati kurk . Hetkel kokku "+price);
                            }
                        }else if (Extra==3){ // LISA 3 tomat
                            if (ExtraList.contains("sibul")){
                                System.out.println("Juba lisatud");
                            }else {
                                ExtraList.add("sibul");
                                price +=0.2;
                                System.out.println("Lisati sibul. Hetkel kokku "+price);
                            }
                        }else if (Extra==4){ // LISA 4 majonees
                            if (ExtraList.contains("tomat")){
                                System.out.println("Juba lisatud");
                            }else {
                                ExtraList.add("tomat");
                                price +=0.2;
                                System.out.println("Lisati tomat. Hetkel kokku "+price);
                            }

                        }else if (Extra==0){ // KOLMAS BURGER VALMIS
                            BurgerList.add(name +price+"€");
                            total = total+price;
                            System.out.println("Burger "+meat+bread+" valmis.. Hetkel kokku "+Math.round(total)+"€");
                            System.out.println("Lisandid: "+ExtraList);
                            break;
                        }
                    }
                }else if(WhatBurg==0) { // ARVE ESITAMINE
                    System.out.println("Tellimus: "+BurgerList+" \n Teie arve on " + Math.round(total)+"€");
                    break;
                }else { //VALE VÄLJUND
                    System.out.println("Burgeri valimiseks sisestage number 1-3.");
                }
        }
    }
}
