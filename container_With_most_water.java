class container_With_most_water
{
    public static int maxArea(int[] height) 
    {
        int maxWater = 0;
        int lp=0;
        int rp=height.length-1;
        while(lp < rp)
        {
            maxWater = Math.max(maxWater, Math.min(height[lp], height[rp]) * rp-lp);
            if(height[lp] > height[rp])
            {
                rp--;
            } else {
              lp++;
            }
        }    
        return maxWater;
    }

    
    
    public static void main(String[] args) 
    {
        int a[] = { 5,4,3,2,1 };
    }
}
