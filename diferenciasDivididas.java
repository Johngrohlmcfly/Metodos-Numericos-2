//Program created by John McFly <johnhndzr@gmail.com>
import java.util.Scanner;
import java.util.Arrays;

public class diferenciasDivididas{
	float xK, xZero;
	int valuesQty;
	float[] x;
	float[] fx;
	float[][] table;

	public size(int a){
		//This is a constructor to set the arrays size, this one may receive valuesQty as a parameter
		table = new float[a][a];
		x = new float[a];
		fx = new float[a];
	}

	public int makeTable(float[] a, float[] b){
		//This metod should populates the array with the divided differences
		//array a[] contains values for X & array b[] contains values for F(x)
		int n = a.length, i, j, position;
		float[][] table = new float[a.length][a.length];
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
      	return 0;	
	}

	public int positionToInterpolate(float a, float[] b){
		//This metod should deliver the position where the element has to be interpolated
		int position = 0, i, n = b.length;
		for (i = 0 ; i < n ; i++ ) {
			if ((a >= b[i])) && (a >= b[i+1]) {
				position = i;
			}
		}
		return position;
	}
	//This metod should makes the interpolation of Xk trough the table
	public int forwardInterpolation(int xZero, float[] table, float xK){
		int i = 0, j = 0;
		float currentValue = 0, totalValue;
		for (i ; i < n ; i++) {
			for (j=;j ;j+) {
				
			}
		}
	}
}