class JavaApplication1 {
	public static void main(String[] args) {
            
        int fib = 0;
        int n = 0;
        int arr[] = new int[20];
        
     while (n<20) {
         if (n<3) { 
              System.out.print(arr[fib] + " ");
              arr[n] = fib+1;  
         }
         else {
             arr[n]=arr[n-1]+arr[n-2];
             System.out.print(arr[n] + " ");
         }
         n++;
         }
     }
}