package org.chengcai.day05;

import java.util.Arrays;

/**
 * 
 * 冒泡排序
 *
 */

public class ArraysSort04 {

	public static void main(String[] args) {
              
		int[] arr ={5,9,7,3,6,1};
		//{5,9,7,3,6,1};{5,7,9,3,6,1};{5,7,3,9,6,1};{5,7,3,6,9,1};{5,7,3,6,1,9};
		//{5,7,3,6,1,9};{5,3,7,6,1,9};{5,3,6,7,1,9};{5,3,6,1,7,9};{5,3,6,1,7,9};
		//{3,5,6,1,7,9};{3,5,6,1,7,9};{3,5,1,6,7,9};{3,5,1,6,7,9};{3,5,1,6,7,9};
		//{3,5,1,6,7,9};{3,1,5,6,7,9};{3,1,5,6,7,9};{3,1,5,6,7,9};{3,1,5,6,7,9};
		//{1,3,5,6,7,9};{1,3,5,6,7,9};{1,3,5,6,7,9};{1,3,5,6,7,9};{1,3,5,6,7,9};
		
		 //从小到大的排序  [1, 3, 5, 6, 7, 9]

		
		for(int i=0;i<arr.length-1;i++){
		for(int j=0;j<arr.length-1;j++){
			if(arr[j]>arr[j+1]){
				int a=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=a;
			}
		}
		}
        System.out.println(Arrays.toString(arr));
        
        
		
        //从大到小排序
    	for(int i=0;i<arr.length-1;i++){
    		for(int j=0;j<arr.length-1;j++){
    			if(arr[j]<arr[j+1]){
    				int a=arr[j];
    				arr[j]=arr[j+1];
    				arr[j+1]=a;
    			}
    		}
    		}
            System.out.println(Arrays.toString(arr));
           
        //冒泡排序API
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
        
	}
   
	
	
}
