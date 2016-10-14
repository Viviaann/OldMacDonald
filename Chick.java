class Chick implements Animal 
{     
     private String mySound; 
     private String myType;     
     public Chick(String type, String sound)     {         
         myType = type;         
         mySound = sound;     
     }     
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";     
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
