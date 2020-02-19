import java.io.*; 
  
class uni 
{ 
   
    static int countPaths(int n, int m) 
    { 
        
        if (n == 0 || m == 0) 
            return 1; 
      
        
        return (countPaths(n - 1, m) + countPaths(n, m - 1)); 
    } 
      
    
    public static void main (String[] args) 
    { 
        int n = 3, m = 2; 
        System.out.println (" Number of Paths "
                            + countPaths(n, m)); 
          
    } 
} 
