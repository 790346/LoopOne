public class LoopOne
{
    private int[] nums = new int[10];
    public LoopOne()
    {
       
    }
    public int[] loadArray()
    {
       for(int i = 0; i < nums.length; i++)
       {
            nums[i] = (i + 1) * 5;
       }
       return nums;
    }
    public void printArray()
    {
        for(int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }
    }
}
