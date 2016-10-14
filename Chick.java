class Chick implements Animal {     
     private String myType;     
     private String[] mySound = new String[2];      
     public Chick(String type, String sound)     {         
         myType = type;         
         mySound[0] = sound; 
         mySound[1] = sound;    
     }     
     public Chick(String type, String sound, String sound2)     {         
         myType = "chick";         
         mySound[0] = sound; 
         mySound[1] = sound2;  

     }      
     public Chick(){
        myType = "unknown";
        mySound[0] = "unknown";
        mySound[1] = "unknown";
     }
    public String getSound(){
          String cheepOrCluck;
          int random = (int)(Math.random()*2);
          cheepOrCluck = mySound[random];
          return cheepOrCluck;
     }      
     public String getType(){return myType;} 
}
