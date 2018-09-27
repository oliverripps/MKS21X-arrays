public class ArrayDemo{
  public static void printArray(int[] ary){
    String str="{";
    for(int i=0; i<ary.length; i++){
      str+=ary[i];
      if (i<ary.length-1){
        str+=",";
      }
    }
    str+="}";
    System.out.println(str);
  }
  public static void printArray(int[][] ary){
    String str="{";
    for(int i=0; i<ary.length; i++){
      str+="{";
      for(int r=0; r<ary[i].length; r++){
        str+=ary[i][r];
        if (r<ary[i].length-1){
          str+=",";
        }
      }
    str+="},\n";
  }
    str+="}";
    System.out.println(str);
  }

  public static int countZeros2D(int[][] nums){
    int c=0;
    for(int i=0; i<nums.length;i++){
      for(int p=0; p<nums[i].length;p++){
        if (nums[i][p]==0){
          c++;
        }
      }
    }
    return c;

}

  public static void fill2D(int[][] vals){
    int[][] nums2= new int[vals.length][vals[0].length];
    for(int i=0; i<vals.length;i++){
      for(int p=0; p<vals[i].length;p++){
        if (i==p){
          nums2[i][p]=3;}
        else {nums2[i][p]=1;}
        }
      }
    printArray(nums2);
}

  public static int[][] fill2DCopy(int[][] vals){
    int[][] nums2= new int[vals.length][vals[0].length];
    for(int i=0; i<vals.length;i++){
      for(int p=0; p<vals[i].length;p++){
        if (vals[i][p]< 0){
          nums2[i][p]=3;}
        else {nums2[i][p]=1;}
        }
      }
    return nums2;
}





  public static void main(String[] args){
    int[] nums = {
    100, 200, 300,
    400, 500, 600,
    700, 800, 900, 1000};
    printArray(nums);

    int[][] nums2 = {
  		{-4,0,-1,0,-5},
  		{1,-5,0,0,3},
  		{1,0,0,-7,-4},
  		};
    printArray(nums2);

    System.out.println(countZeros2D(nums2));
    fill2D(nums2);
    printArray(fill2DCopy(nums2));
  }


}
