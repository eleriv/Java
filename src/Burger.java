import java.util.Scanner;
import java.util.ArrayList;
public class Burger {
    //Encapsulation
    private double price;
    private String meat;
    private String bread = "teraleivaga";
    public String name;
    public String lisa1;
    public String lisa2;
    public String lisa3;
    public String lisa4;
    private double total = 0;

    public void Burgers(){

        ArrayList<String> BurgerList = new ArrayList<String>();
        Menu myObj = new Menu();
        myObj.setMenuList("\n[1] - Chicken burger - kanalihaga, valge saiaga.  Lisandite valik koosneb juustust, salatist, tomatist, maioneesist. 10 €\n" +
                "[2] - Old Fashioned Cheeseburger - loomalihaga, valge saiaga.  Lisandite valik koosneb peekonist, kurgist, sibulast ja pekooni kastest.12 €\n" +
                "[3] - New York Burger - sealihaga, teraleivaga. Lisandite valik koosneb ananassist, tomatist, kurgist ja sibulast. 8 €\n"+
                "[0] - Ei soovi burgerit \n"+
                "Sisestage nr 0-4 vastavalt soovile");


            while (true){
                System.out.println(myObj.getMenuList()); //Encapsulation
                Scanner What = new Scanner(System.in);
                int WhatBurg = What.nextInt();
                if (WhatBurg==1){
                    price=10;
                    bread = "valge saiaga";
                    meat = "kanaliha ";
                    name ="Chicken burger";
                    lisa1 = "juust";
                    lisa2 = "salat";
                    lisa3 = "tomat";
                    lisa4 = "majonees";

                } else if(WhatBurg==2){
                    price =12;
                    bread = "valge saiaga";
                    meat = "loomalihaga ";
                    name ="Old Fashioned Cheeseburger ";
                    lisa1 = "peekon";
                    lisa2 = "kurk";
                    lisa3 = "sibul";
                    lisa4 = "peekoni kaste";
                } else if(WhatBurg==3){
                        price =8;
                        meat = "sealiha ";
                        name ="New York Burger ";
                        lisa1 = "ananass";
                        lisa2 = "kurk";
                        lisa3 = "sibul";
                        lisa4 = "tomat";
                } else if(WhatBurg==0) { // ARVE ESITAMINE
                    System.out.println("Tellimus: "+BurgerList+" \n Teie arve on " + Math.round(total)+"€");
                    break;
                }else { //VALE VÄLJUND
                    System.out.println("Burgeri valimiseks sisestage number 1-3.");
                    continue;
                }



        ArrayList<String> ExtraList = new ArrayList<String>();


        while (true){
            System.out.println("Valige lisandid:\n [1] " + lisa1 + " 0.2€\n [2] " + lisa2 + " 0.2€\n [3] " + lisa3 + " 0.2€\n [4] " + lisa4+ " 0.2€\n [0] Ei soovi lisandeid");
            Scanner Extra = new Scanner(System.in);
            int ChooseExtra = Extra.nextInt();
            if (ChooseExtra==1){
                price += .20;
                ExtraList.add(lisa1);
                System.out.println("Lisati " + lisa1 + ". Hetkel kokku " + price);
            }else if(ChooseExtra==2){
                price += .20;
                ExtraList.add(lisa1);
                System.out.println("Lisati " + lisa1 + ". Hetkel kokku "+ price);
            }else if (ChooseExtra==3){
                price += .20;
                ExtraList.add(lisa1);
                System.out.println("Lisati " + lisa1 + ". Hetkel kokku "+ price);
            }else if(ChooseExtra==4){
                price += .20;
                ExtraList.add(lisa1);
                System.out.println("Lisati " + lisa1 + ". Hetkel kokku " + price);
            }else if (ChooseExtra==0){
                BurgerList.add(name + price + "€");
                ExtraList.add(lisa1);
                total = total+price;
                System.out.println("Burger "+meat+bread+" valmis.  Hetkel kokku " + Math.round(total) + "€");
                break;
            }
        }}
    }

    }
