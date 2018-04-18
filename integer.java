  public int n,k(int[] nums) {
  int n= 0;
  int k = 0;

  for (int i=0;i<nums.length;i++){
    if(nums[i] == n){
    n= k;
    break;
    }
    else{
    n = nums.length;
    }
  }
  for(int i=0;i<d;i++){
   k = k + nums[i];
  }
  return k;
}
