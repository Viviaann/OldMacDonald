class Pig implements Animal 
{     
     public String mySound;
     public String myType; 

     public Pig(String type, String sound)     {         
         myType = type;         
         mySound = sound;     
     }     
     public Pig()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }    
     // public void setType()
     // {myType=type;
     	
     // } 
     // public void setSound()
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
