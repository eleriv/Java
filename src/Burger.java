import java.util.Scanner;
public class Burger {
    private double price;
    private String meat;
    private String bread = "teraleib";
    public String name;

    public void Burgers(){


        Scanner What = new Scanner(System.in);  // Create a Scanner object
        System.out.println("1 - Chicken burger - kanalihaga, valge saiaga.  Lisandite valik koosneb juustust, salatist, tomatist, maioneesist.\n" +
                "2 - Old Fashioned Cheeseburger - loomalihaga, valge saiaga.  Lisandite valik koosneb peekonist, kurgist, sibulast ja pekooni kastest.\n" +
                "3 - New York Burger - sealihaga, teraleivaga. Lisandite valik koosneb ananassist, tomatist, kurgist ja sibulast. \n"+
                "Millist burgerit te soovite?");

        String WhatBurg = What.nextLine();  // Read user input
            if (WhatBurg=="1"){
                price =+10;
                bread = "valge sai";
                meat = "kanaliha";
                }else if(WhatBurg=="2"){
                    price =+12;
                    bread = "valgeai";
                    meat = "loomalihaga";
                }else if(WhatBurg=="3"){
                    price =+10;
                    bread = "valgei";
                    meat = "sealihaga";
                System.out.println(meat);
            }else {
                System.out.println("sadsd");
            }
        System.out.print(WhatBurg);
    }
}
