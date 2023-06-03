import java.util.*;
import java.util.Locale.IsoCountryCode;
import javax.sound.midi.Soundbank;
public class ugv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        //input dimentuons
        System.out.println("input dimentions of maze");
        int rowsinput = sc.nextInt() ; int columnsinput = sc.nextInt();
        int rows = rowsinput + 2     ; int columns = columnsinput + 2 ;
        
        int arey[][] = new int[rows][columns];
        
        // building border
        for(int i=0 ; i < columns ; i++) {arey[0][i] = 1; }                 for(int i=0 ; i < rows ; i++) {arey[i][0] = 1; }
        for(int i=0 ; i < columns ; i++) {arey[rows - 1][i] = 1; }          for(int i=0 ; i < rows ; i++) {arey[i][columns - 1] = 1; }

        // input maze
        System.out.println("input maze");
        for(int i=1 ; i< rows -1  ; i++){
            for(int j=1; j<columns - 1 ; j++){
                arey[i][j] = sc.nextInt();
            }
        } 
        //input 0 for free space       1 for obstacle         2 for already visited blocks     
        
        int r = 1 ; int c = 1; 
        for(int i = 0 ; i < 36 ; i++) {
          
          if(r==rows - 2 & c == columns - 2){System.out.println("reached");return;}
          if(r==1 & c == 1 & arey[2][1] == 1 & arey[1][2] == 1){System.out.println("no solution");return;}

//.............................................................................................

          if(arey[r+1][c] == 0 )
          { arey[r][c] = 2; r++ ; System.out.println("move to " + r + " , " + c );}

          else if(arey[r][c+1] == 0 )
          {  arey[r][c] = 2;  c++ ; System.out.println("move to " + r + " , " + c );}
          
          else  if (arey[r][c-1] == 0  )
          {  arey[r][c] = 2;  c-- ; System.out.println("move to " + r + " , " + c ); }

          else if(arey[r-1][c] == 0 )
          {  arey[r][c] = 2;  r-- ; System.out.println("move to " + r + " , " + c );}
          
//..............................................................................................
          else if(arey[r+1][c] == 2 )
          { arey[r][c] = 1; r++ ; System.out.println("return to " + r + " , " + c );}

          else if(arey[r][c+1] == 2 )
          {  arey[r][c] = 1;  c++ ; System.out.println("return to " + r + " , " + c );}

          else  if (arey[r][c-1] == 2  )
          {  arey[r][c] = 1;  c-- ; System.out.println("return to " + r + " , " + c ); }

          else if(arey[r-1][c] == 2 )
          {  arey[r][c] = 1;  r-- ; System.out.println("return to " + r + " , " + c );}
//..............................................................................................
    }
}
}