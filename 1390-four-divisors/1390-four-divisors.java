class Solution {

    public int sum(List<Integer> ap){
        int sum = 0;
        for(int i = 0; i < ap.size(); i++){
            sum += ap.get(i);
        }
        return sum;
    }

    public int sumFourDivisors(int[] nums) {
        int result = 0;

        for(int j = 0; j < nums.length; j++){
            int x = nums[j];
            int count = 0;
            List<Integer> ap = new ArrayList<>();

            for(int i = 1; i * i <= x; i++){
                if(x % i == 0){
                    int d1 = i;
                    int d2 = x / i;

                    ap.add(d1);
                    count++;

                    if(d1 != d2){
                        ap.add(d2);
                        count++;
                    }

                    if(count > 4) break;
                }
            }

            if(count == 4){
                result += sum(ap);
            }
        }
        return result;
    }
}
