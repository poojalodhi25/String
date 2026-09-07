// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int [] arr={-12,23,-45,67,78,90,12};
        int n=arr.length;
        int mx=Integer.MIN_VALUE;
       // int mx=arr[0];
        for(int i=0; i<n; i++){
            mx=Math.max(mx,arr[i]);
            //if(arr[i]>mx)
          //mx=  arr[i];

        }
        System.out.println(mx);
    }
}