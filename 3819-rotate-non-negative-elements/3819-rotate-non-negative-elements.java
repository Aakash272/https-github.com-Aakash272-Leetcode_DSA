class Solution {
        public void revers(List<Integer> ap,int l,int r){
        while(l<r){
            int temp=ap.get(l);
           ap.set(l,ap.get(r));
           ap.set(r,temp);
            l++;
            r--;
        }
        }
    public int[] rotateElements(int[] nums, int k) {
       int n=nums.length;
    if (n == 0) return nums;
       List<Integer> ap=new ArrayList<>();
       for(int i=0;i<n;i++){
        if(nums[i]>=0){
            ap.add(nums[i]);
        }
       }

int size=ap.size();
if (size <= 1) return nums;
k=k%size;
revers(ap,0,k-1);
revers(ap,k,size-1);
revers(ap,0,size-1);
int result[]=new int[n];
int j=0;
for(int i=0;i<n;i++){
    if(nums[i]>=0){
        result[i]=ap.get(j);
        j++;
    }
    else{
        result[i]=nums[i];
    }
}
return result;

    }
}