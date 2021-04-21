package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.bubble_sort;

import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.bubble_sort.service.BubbleSort;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Scanner;

@SpringBootApplication
public class BubbleSortApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Ingrese la cantidad de nombres que desea ordenar: ");
		int n=sc.nextInt();
		String[] sarray=new String[n];

		for(int i=0;i<n;i++){
			System.out.print("Ingrese el nombre "+(i+1)+": ");
			sarray[i]=sc.next();
		}
		System.out.print("Los nombres ordenados son: ");

		BubbleSort ob = new BubbleSort();
		ob.bubbleSort1(sarray);
	}

}
