package com.subrat.patterns;

/*
 * * * * *  r = 5 c = 5/ n = 5
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 
 
 *         r=5 c=5
 * *
 * * *
 * * * *
 * * * * *
 
 * * * * * 
   * * * *
     * * *
       * *
         *
       
         *
       * *
     * * *    
   * * * *
 * * * * *
 
 * * * * *
 * * * *
 * * *
 * * 
 * 
 
          *
        * * *
      * * * * *
    * * * * * * *
  * * * * * * * * *
  nr = 5, nc = nr*2-1
  x = nr, y=nr
  
  * * * * * * * * *
    * * * * * * *
      * * * * *
        * * *
          *
  nr = 5, nc = nr*2-1;
  x = 1, y = nc
  
  *
  * * 
  * * *
  * * * *
  * * * * *
  * * * *
  * * *
  * *
  * 
  N = 5
  nr = N*2-1, nc = N
  x = 1
  
          *
        * * *
      * * * * *
    * * * * * * *
  * * * * * * * * *
    * * * * * * *
      * * * * *
        * * *
          *
    nr = 9,nc = 9
    x = nr/2-1, y = nr/2-1;
    
    * * * * * * * * *
      * * * * * * *
        * * * * *
          * * *
            *
          * * *
        * * * * *
      * * * * * * *
    * * * * * * * * *
*/

public class Pattern {
public static void main(String[] args) {
	/*
	int n = 5;
	for(int i = 1;i<=n;i++) {
		for(int j = 1;j<=n;j++) {
			System.out.printf("%2c",'*');
		}
		IO.println();
	}
	*/
	/*
	
	int n = 5;
	for(int i = 1;i<=n;i++) {
		for(int j = 1;j<=n;j++) {
			if(i>=j) {
				System.out.printf("%2c",'*');
			}
		}
			IO.println();		
	}
	*/

	int n = 5;
	for(int i = 1;i<=n;i++) {
		for(int j = 1;j<=n;j++) {
			if(i<=j) {
				System.out.printf("%2c",'*');
			}else {
				System.out.printf("%2c",' ');
				
			}
		}
			IO.println();
		
	}

	/*
	int n = 5;
	for(int i = 1;i<=n;i++) {
		for(int j = 1;j<=n;j++) {
			if(i+j>=n+1) {
				System.out.printf("%2c",'*');
			}else {
				System.out.printf("%2c",' ');
				
			}
		}
			IO.println();
		
	}
	*/
	/*
	int n = 5;
	for(int i = 1;i<=n;i++) {
		for(int j = 1;j<=n;j++) {
			if(i+j<=n+1) {
				System.out.printf("%2c",'*');
			}
		}
			IO.println();
		
	}
	*/
	/*
	int nr = 5;
	int nc = nr*2-1;
	int x = nr, y= nr;
	for(int i = 1;i<=nr;i++) {
		for(int j = 1;j<=nc;j++) {
			  if(j<x || j>y) {
				  System.out.printf("%2c",' ');
			  }else {
				  System.out.printf("%2c",'*');
			  }
		}
		x--;y++;
			IO.println();
		
	}
	
	
	int nr = 5;
	int nc = nr*2-1;
	int x = 1, y= nc;
	for(int i = 1;i<=nr;i++) {
		for(int j = 1;j<=nc;j++) {
			  if(j<x || j>y) {
				  System.out.printf("%2c",' ');
			  }else {
				  System.out.printf("%2c",'*');
			  }
		}
		x++;y--;
			IO.println();
		
	}
	
	int n = 5;
	int nr = n*2-1;
	int nc = n;
	int x = 1;
	for(int i = 1;i<=nr;i++) {
		for(int j = 1;j<=nc;j++) {
			 if(j<=x) {
				  System.out.printf("%2c",'*');
			  }
		}
		   if(i<n) {
			   x++;
		   }else {
			   x--;
		   }
			IO.println();
		
	}
	
	int n = 5;
	int nr = n*2-1;
	int nc = n*2-1;
	int x = n, y=n;
	for(int i = 1;i<=nr;i++) {
		for(int j = 1;j<=nc;j++) {
			  if(j<x || j>y) {
				  System.out.printf("%2c",' ');
			  }else {
				  System.out.printf("%2c",'*');
			  }
		}
		   if(i<n) {
			   x--;
			   y++;
		   }else {
			   x++;
			   y--;
		   }
			IO.println();
		
	}
	
	
	int n = 5;
	int nr = n*2-1;
	int nc = n*2-1;
	int x = n, y=n;
	for(int i = 1;i<=nr;i++) {
		for(int j = 1;j<=nc;j++) {
			  if(j<x || j>y) {
				  System.out.printf("%2c",' ');
			  }else {
				  if(j==x || j==y)
				     System.out.printf("%2c",'*');
				  else 
					 System.out.printf("%2c",' ');
			  }
		}
		   if(i<n) {
			   x--;
			   y++;
		   }else {
			   x++;
			   y--;
		   }
			IO.println();
		
	}
	
	int n = 5;
	int nr = n*2-1;
	int nc = n*2-1;
	int x = 1, y=nc;
	for(int i = 1;i<=nr;i++) {
		for(int j = 1;j<=nc;j++) {
			  if(j<x || j>y) {
				  System.out.printf("%2c",' ');
			  }else {
				  System.out.printf("%2c",'*');
			  }
		}
		   if(i<n) {
			   x++;
			   y--;
		   }else {
			   x--;
			   y++;
		   }
			IO.println();
		
	}
	/*
	int n = 5;
	int nr = n*2-1;
	int nc = n*2-1;
	int x = 1, y=nc;
	for(int i = 1;i<=nr;i++) {
		for(int j = 1;j<=nc;j++) {
			  if(j>x && j<y) {
				  System.out.printf("%2c",' ');
			  }else {
				  System.out.printf("%2c",'*');
			  }
		}
		   if(i<n) {
			   x++;
			   y--;
		   }else {
			   x--;
			   y++;
		   }
			IO.println();
		
	}
	 */
	
	
	
}
}