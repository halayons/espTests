package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
    	int count = 1;
		int[][] spiral = new int[rows][columns];
		int taman = rows * columns;
		int tamac = columns;
		int tamar = rows;
		int rowa = 0;
		int cola = 0;
		while (count <= taman) {

			for (int j = 0; j < tamac; j++) {
				spiral[rowa][cola] = count;
				count++;
				cola++;
			}
			rowa++;
			cola--;
			tamar--;

			if (count > taman)
				break;

			for (int j = 0; j < tamar; j++) {
				spiral[rowa][cola] = count;
				count++;
				rowa++;
			}
			cola--;
			tamac--;
			rowa--;
			
			if (count > taman)
				break;
			
			for (int j = tamac; j > 0; j--) {
				spiral[rowa][cola] = count;
				count++;
				cola--;
			}
			cola++;
			rowa--;
			tamar--;

			
			if (count > taman)
				break;
			for (int j = tamar; j > 0; j--) {
				spiral[rowa][cola] = count;
				count++;
				rowa--;
			}
			
			tamac--;
			rowa++;
			cola++;
			
		}
        return spiral;
    }
}
