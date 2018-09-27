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
      for(int r=0; r<ary.length; r++){
        str+=ary[i][r];
        if (r<ary[i].length-2){
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



  public static void main(String[] args){
    int[] nums = {
    100, 200, 300,
    400, 500, 600,
    700, 800, 900, 1000};
    printArray(nums);

    int[][] nums2 = {
  		{1,0,0,0},
  		{1,0,0,0},
  		{1,0,0,0},
  		};
    printArray(nums2);

    System.out.println(countZeros2D(nums2));
    }


}
