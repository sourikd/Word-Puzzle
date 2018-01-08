import java.util.*;
import java.io.*;
import java.nio.*;
import java.lang.*;


public class WordPuzzle      
{
   private char[][] G;
   int p,q;
   public static char grid[][];
   private static MyHashTable <String> h= new MyHashTable <String>();

   public void Grid(int n, int m) //creates a grid of size entered by user
   {
         
         p=n;
         q=m;
         int i,j;
         grid = new char[n][m];
         String letters= "abcdefghijklmnopqrstuvwxyz";
         Random r= new Random ();
         for (i=0; i<n ; i++)
         {
            for (j=0; j<m;j++)
            {
               grid[i][j]= letters.charAt(r.nextInt(letters.length()));
               
            }
         }
         for (i=0; i<n ; i++)
         {
            for (j=0; j<m;j++)
            {
               
               System.out.print(grid[i][j]+"  " );
               if (j==m-1)
               {
                  System.out.println("\n");
               }
               
             }
          }
   }
   public void  wordsearch1 () //algorithm to find words when no prefix in hashtable
   {
         
         
         int word_count=0;
         System.out.println("wordsearch1... ");
         String str="";
         for (int i=0; i<p; i++)
         {
            for (int j=0; j<q; j++)
            {
               /*if (char x == getAt(i,j))  
               {
                      if (h.contains (x))
                      {
                           System.out.println (x + "(" + i + + " , " + j + ")" + "\n");
                      }
                }*/
                
                int r= i;
                int s= j;
                int count=0;
                
                while (i>=0)
                {
                     
                     str = str+ grid[i][j];
                     
                     //System.out.println(i);

                     //System.out.println(str);
                     //System.out.println(h.contains (str));
                     if (h.contains (str))
                      {
                         if (count==0)
                        {
                            System.out.println (str + "  " + "(" + r + " , " + s + ")" + " on point " + "\n");
                            word_count=word_count+1;
                            

                        }
                        else
                        {

                           System.out.println (str + "  " + "(" + r + " , " + s + ")" + " upwards " + "\n");
                           word_count=word_count+1;
                        }
                      }
                      i--;
                      count++;
                 }
                 i=r;
                 j=s;
                 str="";
                 count=0;
                 
                 while (i<p)
                 {
                      
                     str = str+ grid[i][j];
                     if (h.contains (str))
                      {
                       if (count==0)
                       {
                           ;
                       }
                       else
                       {
                           System.out.println (str + "  " + "(" + r +  " , " + s + ")" + " downwards " + "\n");
                           word_count=word_count+1;
                       }
                      }
                      i++;
                      count++;
                      
                  }
                  i=r;
                  j=s;
                  str="";
                  count=0;
                  while (j>=0)
                  {
                     str = str+ grid[i][j];
                     if (h.contains (str))
                      {
                           if (count==0)
                       {
                           ;
                       }
                       else
                       {
                           System.out.println (str + "  " + "(" + r + " , " + s + ")" + " left " +  "\n");
                           word_count=word_count+1;
                       }
                      }
                      j--;
                      count++;
                      
                  }
                  i=r;
                  j=s;
                  str="";
                  count=0;
                  
                  while (j<q)
                  {
                     
                      
                      str = str+ grid[i][j];
                      if (h.contains (str))
                      {
                       if (count==0)
                       {
                           ;
                       }
                       else
                       {
                        System.out.println (str + "  " + "(" + r +  " , " + s + ")" + " right " +  "\n");
                        word_count=word_count+1;
                       }
                      }
                      j++;
                      count++;
                      
                  }
                  i=r;
                  j=s;
                  str="";
                  count=0;
                  while (i>=0 && j>=0)
                  {
                     str = str+ grid[i][j];
                     if (h.contains (str))
                      {
                        if (count==0)
                       {
                           ;
                       }
                       else
                       {
                           System.out.println (str + "  " + "(" + r +  " , " + s + ")" + " NW (diagonal) " +  "\n");
                           word_count=word_count+1;
                       }  
                      }                    
                      i--;
                      j--;
                      count++;
                      
                   }
                  i=r;
                  j=s;
                  str="";
                  count=0;
                  while (j>=0 && i<p)
                  {
                     str = str+ grid[i][j];
                     if (h.contains (str))
                      {
                       if (count==0)
                       {
                           ;
                       }
                       else
                       {
                           System.out.println (str + "  " + "(" + r +  " , " + s + ")" + " SW(diagonal) " +  "\n");
                           word_count=word_count+1;
                       }
                      }
                      i++;
                      j--;
                      count++;
                      
                   }
                  i=r;
                  j=s;
                  str="";
                  count=0;
                   
                   while (i>=0 && j<q)
                   {
                     str = str+ grid[i][j];
                     if (h.contains (str))
                      {
                       if (count==0)
                       {
                           ;
                       }
                       else
                        {
                            System.out.println (str + "  " + "(" + r +  " , " + s + ")" + " NE(diagonal) " +  "\n");
                            word_count=word_count+1;
                        }
                      }
                      i--;
                      j++;
                      count++;
                    }
                  i=r;
                  j=s;
                  str="";
                  count=0;
                  while (i<p && j<q)
                  {
                     str = str+ grid[i][j];
                     if (h.contains (str))
                      {
                       if (count==0)
                       {
                           ;
                       }
                       else
                       {
                           System.out.println (str + "  " + "(" + r + " , " + s + ")" + " SE(diagonal) " +  "\n");
                           word_count=word_count+1;
                       }
                      }
                      i++;
                      j++;
                      count++;
                  }
                  i=r;
                  j=s;
                  str="";
                  count=0;

            }
           }
           System.out.println(" Number of words for algo without enhancement is: " +  word_count);

   }
                        

   
   public void  wordsearch ()//algorithm to find word when prefixes are stored in hash table.
   {
         
         
         System.out.println("wordsearch2... ");
         String str="";
         int word_count=0;
         for (int i=0; i<p; i++)
         {
            for (int j=0; j<q; j++)
            {
               /*if (char x == getAt(i,j))  
               {
                      if (h.contains (x))
                      {
                           System.out.println (x + "(" + i + + " , " + j + ")" + "\n");
                      }
                }*/
                
                int r= i;
                int s= j;
                
                str = str+ grid[i][j];
                int c=0;
                
                while ( i>=0 && h.contains(str) )//upward direction, Similarly, other 7 directions
                {
                     
                     if (  h.isWord(str)  )
                     {
                        if (c==0)
                        {
                            System.out.println (str + "  " + "(" + r + " , " + s + ")" + " on point " + "\n");
                            word_count=word_count+1;
                            

                        }
                        else   
                        {
                           System.out.println (str + "  " + "(" + r + " , " + s + ")" + " upwards " + "\n");
                           word_count=word_count+1;
                           
                        }
                     }
                     i--;
                     c++;
                     if (i>=0)
                     str = str + grid[i][j];
                 }
                   
                 
                 i=r;
                 j=s;
                 str="";
                 str = str+ grid[i][j];
                 c=0;
                 
                 while (i<p && h.contains(str))
                 {
                      
                     if (  h.isWord(str)  )
                     {
                       if (c==0)
                       {
                           ;
                       }
                       else
                       {
                            System.out.println (str + "  " + "(" + r + " , " + s + ")" + " downwards " + "\n");
                            word_count=word_count+1;
                       }
                     }
                     c++;
                     i++;
                     if (i<p)
                     str = str + grid[i][j];
                      
                  }
                  i=r;
                  j=s;
                  str="";
                  str = str+ grid[i][j];
                  c=0;
                  
                  while (j>=0 && h.contains(str))
                  {
                     if (  h.isWord(str)  )
                     {
                       if (c==0)
                       {
                           ;
                       }
                       else
                       {
                           System.out.println (str + "  " + "(" + r + " , " + s + ")" + " left " + "\n");
                           word_count=word_count+1;
                       }
                     }
                     c++;
                     j--;
                     if (j>=0)
                     {
                        str = str + grid[i][j];
                     }
                
                  }
                  
                  i=r;
                  j=s;
                  str="";
                   str = str+ grid[i][j];
                   c=0;

                  while (j<q  && h.contains(str))
                  {
                     
                      
                     if (  h.isWord(str)  )
                     {
                       if (c==0)
                       {
                           ;
                       }
                       else
                       {
                           System.out.println (str + "  " + "(" + r + " , " + s + ")" + "right " + "\n");
                           word_count=word_count+1;
                       }
                     }
                     j++;
                     c++;
                     if (j<q)
                     str = str + grid[i][j];
                      
                  }
                  i=r;
                  j=s;
                  str="";
                   str = str+ grid[i][j];
                   c=0;


                  while (i>=0 && j>=0 && h.contains(str))
                  {
                      if (  h.isWord(str)  )
                     {
                       if (c==0)
                       {
                           ;
                       }
                       else
                       {
                           System.out.println (str + "  " + "(" + r + " , " + s + ")" + "NW(diagonal) " + "\n");
                           word_count=word_count+1;
                       }
                     }
                     i--;
                     j--;
                     c++;
                     if (i>=0 && j>=0)
                     {
                        str = str + grid[i][j];
                     }
                   }
                  i=r;
                  j=s;
                  str="";
                  str = str+ grid[i][j];
                  c=0;

                  while (j>=0 && i<p && h.contains(str))
                  {
                     if (  h.isWord(str)  )
                     {
                        if (c==0)
                       {
                           ;
                       }
                       else 
                       {
                           System.out.println (str + "  " + "(" + r + " , " + s + ")" + "SW(diagonal) " + "\n");
                           word_count=word_count+1;
                       }
                     }
                     i++;
                     j--;
                     c++;
                     if (j>=0 && i<p)
                     str = str + grid[i][j];                      
                   }
                  i=r;
                  j=s;
                  str="";
                   str = str+ grid[i][j];
                   c=0;
                   while (i>=0 && j<q && h.contains(str))
                   {
                      if (  h.isWord(str)  )
                     {
                        if (c==0)
                       {
                           ;
                       }
                       else
                       {
                           System.out.println (str + "  " + "(" + r + " , " + s + ")" + "NE(diagonal) " + "\n");
                           word_count=word_count+1;
                       }
                     }
                     i--;
                     j++;
                     c++;
                     if (i>=0 && j<q)
                     {
                        str = str + grid[i][j];
                     }                   
                   }
                  i=r;
                  j=s;
                  str="";
                  str = str + grid[i][j];
                  c=0;
                  
                  while (i<p && j<q && h.contains(str))
                  {
                      if (  h.isWord(str)  )
                     {
                        if (c==0)
                       {
                           ;
                       }
                       else 
                       {
                            System.out.println (str + "  " + "(" + r + " , " + s + ")" + "SEdiagonal) " + "\n");
                            word_count=word_count+1;
                        }
                     }
                     i++;
                     j++;
                     c++;
                     if (i<p && j<q)
                     str = str + grid[i][j];                   
                     
                   }
                  i=r;
                  j=s;
                  str="";
                  c=0;

            }
           }
           System.out.println(" Number of words for algo with enhancement is: " +  word_count);
   }
                        
      
  public static void main(String[] args)throws FileNotFoundException, IOException 
   {
      Scanner in = new Scanner (System.in);
      System.out.println(" Enter dimensions of the grid(First enter number of rows, then columns): \n");
      int n= in.nextInt();
      int m= in.nextInt();
      in.close();
      
      WordPuzzle g= new WordPuzzle();
      g.Grid(n,m);
      
      
      FileReader file= new FileReader("D:/project3/dictionary.txt");//please put path to dictionary.txt here
      BufferedReader rd= new BufferedReader(file);
      String s;
      int i=0;
      
     
      while ((s = rd.readLine())!= null )
      
        {
            h.insert(s,true);//no prefixes in this case , only words are entered so every flag will be true in this case
            i++;
        }
        long startTime = System.nanoTime( ); //time for algorithm without enhancement
        g.wordsearch1();//algorithm to search words without prefix stroring in hash table
        long endTime = System.nanoTime( );
        System.out.println( "Elapsed time for algorithm without enhancement(in nano sec): " + (endTime - startTime) + "  in ms: " + (float)(endTime-startTime)/1000000 );
        
      h.makeEmpty();
       
      FileReader f= new FileReader("D:/project3/dictionary.txt");//please put path to dictionary.txt here
      BufferedReader r= new BufferedReader(f);
      String s2;
        
        while ((s2 = r.readLine())!= null )
      
        {   
            String st="";
            for (int k = 0; k < s2.length(); k++)
            {
               st= st + String.valueOf(s2.charAt(k));//taking out each prefix
               
               if (st.equals(s2))
               {
                  h.insert(st, true);//true if it is a word in dictionary
                  
               }
               else
               {
                  
                  h.insert(st, false);//false if it is a prefix
                  
               }
             }   
                     
            
            
        }

        
        long start = System.nanoTime( );//time for algorithm with enhancement

        g.wordsearch();//algorithm to search words with prefix storing in hashtable; 
        long end = System.nanoTime( );
        System.out.println( "Elapsed time for algorithm with enhancement (in nano sec): " + (end- start) + "  in ms: " + (float)(end-start)/1000000 );
 
        

    }
    
}
      
      
   
   
   
   

