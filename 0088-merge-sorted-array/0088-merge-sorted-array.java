class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        
  for (int index = k; index >= 0; index--) {
            if (j < 0) {
                break; // No more elements in nums2
            }
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[index] = nums1[i--];
            } else {
                nums1[index] = nums2[j--];
            }
        }
        
         
        
    }
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int nums1[]=new int[m];
        for(int i=0;i<nums1.length;i++){
            nums1[i]=scan.nextInt();
        }

        int n=scan.nextInt();
        int nums2[]=new int[n];
        for(int j=0;j<nums2.length;j++){
            nums2[j]=scan.nextInt();
        }
      merge(nums1,m,nums2,n);

    }
}