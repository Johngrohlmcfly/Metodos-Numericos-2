//Program created by John McFly <johnhndzr@gmail.com>
import java.util.Scanner;
import java.util.Arrays;

public class diferenciasDivididas{
	float xK, xZero;
	int valuesQty, positionOfXZero;
	float[] x;
	float[] fx;
	float[][] table;
	float[] differences;

	public size(int a){
		//This is a constructor to set the arrays size, this one may 
		//receive valuesQty as a parameter
		table = new float[a][a];
		x = new float[a];
		fx = new float[a];
		differences = new float[a];
	}

	public int makeTable(float[] a, float[] b){
		//This metod should populates the array with the divided differences
		//array a[] contains values for X & array b[] contains values for F(x)
		int n = a.length, i, j, position;
		float[][] table = new float[a.length][a.length];
		float[][] tableAux = new float[a.length][a.length];
		//The loop is going to populate the table array with the values provided for F(x)
		for (i = 0; i < n; i++ ) {
			table[i][0] = b[i];			
		}
		//This loop should make the differences
       for (i = 0; i < n-1; i++){
         	position = 0;
   		   	for(j = i+1; j < n; j++){
           		table[j][i+1] = (table[j][i] - table[j-1][i]) / (a[j]-a[position]);
    	  		position++;
   		   	}
      	}
      	//Making the transpose of the matrix
      	for (i = 0 ; i < n ;i++) {
      		for (j = 0; j < n ;j++) {
      			tableAux[j][i] = table[i][j];
      		}
      	}
      	for (i = 0 ; i < n ;i++) {
      		for (j = 0; j < n ;j++) {
      			table[j][i] = tableAux[j][i];
      		}
      	}
      	return 0;	
	}

	public int positionToInterpolate(float a, float[] b){
		//This metod should deliver the position where the element has to be 
		//interpolated, may receive the value to interpolate & the x[] array
		int position = 0, i, n = b.length;
		for (i = 0 ; i < n ; i++ ) {
			if ((a >= b[i])) && (a >= b[i+1]) {
				position = i;
			}
		}
		return position;
	}
/*	public int forwardInterpolation(float xZero,  float xK,, float[] table,int positionOfXZero){
		//This metod should makes the interpolation of Xk(value to interpolate) through the table may receive 
		//the Xzero, Xk, the array of the differences and the position of Xzero
		int i = (positionOfXZero+1), j = 0, n = table.length;
		float currentValue = 0, totalValue = 0;
      	//This part populates the differences array to use it in the interpolation
      	for (i = 0; i < n ;i++) {
      		
      	}
		currentValue = table[positionOfXZero][0];
		for (i ; i < n ; i++) {

			for (j=;j ;j++) {
				
			}
		}
	}*/
}