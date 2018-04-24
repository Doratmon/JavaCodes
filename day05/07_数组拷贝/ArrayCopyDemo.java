public class ArrayCopyDemo
{
    /*
    一般的数组拷贝
     */
    static void arryCopy(int[] src, int srcPos, int[] dest, int destPos, int len)
    {
        for(int i = srcPos,j = destPos; i < srcPos + len; i ++,j ++)
        {

                dest[j]=src[i];
        }

    }
    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {0,0,0,0,0,0,0};
        arryCopy(arr1,3,arr2,4,3);
        for(int i = 0; i < 7; i ++)
           System.out.print(arr2[i]);

        System.out.println();

        System.out.println("------------------");

        int[] arr3 = {1,2,3,4,5,6,7};
        int[] arr4 = {0,0,0,0,0,0,0};
        
        /*
        System.arraycopy拷贝数组，
        arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
         */
        System.arraycopy(arr3,2,arr4,5,2);//System类中所带有的拷贝方法arraycopy
        for(int i = 0; i < 7; i ++)
            System.out.print(arr4[i]);


    }
}
