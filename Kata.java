class Solution {
    public static String whoLikesIt(String... names) {
        
      //go through String Array and given the conditions return String for each amount of indexes
      
      //if condition for 0 indexes or empty array
      //if condition for 1 to 3 index amounts, meaning 1, 2 or three names
      //if condition for 4 or more names check amount of indexes after index 2 and return the integer plus a String  
      //return the result after condition plus the text
      
      
      int namesLength = names.length;
       System.out.println("\nthis is the length before loop: " + namesLength);
      
      String likes = "";
      int restOfLikes = 0;
      
      //condition for more than three names: String Array length minus the 2 indexes returned
      if(names.length > 3){
        
        restOfLikes = namesLength - 2;
      }
      
      //condition for 0 indexes or empty String Array
        if(namesLength < 1) {
          
          likes = "no one likes this"; System.out.println("this is likes 0: " + likes);
        }
      
  
      
      for(int i = 0; i < names.length; i++){
        
  
        String eachName = names[i];
        
        System.out.println("this is eachName: " + eachName);
         
        
          //condition for more 4 or more indexes,  meaning 4 names or more
          if(namesLength >= 4){
        
            likes = names[0] + "," + " " + names[1] + " " + "and" + " " + restOfLikes + " " + "others like this"; System.out.println("this is likes 4 or more: " + likes);
            break;
          }
        
        switch(namesLength){
          
            
            case 1: likes = names[0] + " " + "likes this"; System.out.println("this is likes 1: " + likes);
            break;
            
            case 2: likes = names[0] + " " + "and" + " " + names[1] + " " + "like this"; System.out.println("this is likes 2: " + likes);
            break;
            
            case 3: likes = names[0] + "," + " " + names[1] + " " + "and" + " " + names[2] + " " + "like this"; System.out.println("this is likes 3: " + likes);
            break;
            
            //case 4: likes = names[0] + "," + " " + names[1] + " " + "and" + " " + restOfLikes + " " + "others like this"; System.out.println("this is likes 4 or more: " + likes);
            //break;
            
            default : likes = "Please enter a String Array";  System.out.println("this is error in input: " + likes);
        }//end switch
          
         
        
      }//end for
      
      
        return likes;
		
    }//end of static method
}