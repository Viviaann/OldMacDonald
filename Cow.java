class Cow implements Animal 
{     
     public String myType;     
     public String mySound;      
     public Cow(String type, String sound)     {         
         myType = type;         
         mySound = sound;     
     }     
     public Cow()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
     // public void setSound(){mySound=sound;}
     // public void setType(){myType=type;}
}
