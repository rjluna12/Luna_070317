package luna_070317;

class FlyingSuperHero extends SuperHero {
   /**This method will display power
     * @param
     *This method does not have a parameter
     * @return 
     * This method does not have return any value
     * */
    @Override
    void displayPower(){
        System.out.println("Fly...");
    }
    void setSP(String superPowers[]){
          for (int i = 0; i < superPowers.length; i++) 
        super.setSuperPowers(superPowers);
         
    }
  
    
}

 
