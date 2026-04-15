class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        List<Double> ap=new ArrayList<>();
        int result[]=new int[2];
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int a=arr[i];
            for(int j=i+1;j<n;j++){
             int b=arr[j];
             double res=(double)a/b;
             ap.add(res);
            }
           
        }
    Collections.sort(ap);
    double ans=ap.get(k-1);
    System.out.println(ans);
          for(int i=0;i<n-1;i++){
            int a=arr[i];
            for(int j=i+1;j<n;j++){
             int b=arr[j];
             double res=(double)a/b;
         if(res==ans){
            result[0]=a;
            result[1]=b;
         }
            }
        }
        return result;
    }
}