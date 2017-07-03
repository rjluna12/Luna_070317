
package luna_070317;


public class AbstractDemo {
 public static void main(String[]args){   
    FlyingSuperHero fsh = new FlyingSuperHero();
    fsh.displayPower();
    fsh.printSuperPowers();
    fsh.setSuperPowers("New power",2);
    Spiderman damang = new Spiderman();
    damang.displayPower();
}
}
