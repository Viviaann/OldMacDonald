class Chick implements Animal 
{     
     private String mySound; 
     private String myType;     
     public Chick(String type, String sound)     {         
         myType = type;         
         mySound = sound;     
     }     
      public Chick(String type, String sound, String sound2)     {         
         myType = type;         
         if(Math.random()*1>0.5)
         	mySound=sound;
         else 
         	mySound=sound2;

     }

     // public setType()
     // {
     // 	 myType=type;
     // } 
     // public setSound()
     // {
     // 	mySound=sound;
     // }
     public String getType()
     {
return myType;
     }  
     public String getSound()
     {
return mySound;
     } 

}
