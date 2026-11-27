class Solution {
    public int maxArea(int[] height) {
        int suraj = 0;
        int sunakshi = height.length - 1;
        int pari = 0;
        while(suraj < sunakshi){
            int khushi = Math.min(height[suraj], height[sunakshi]);
            int nandini = sunakshi - suraj;
            int area = khushi * nandini;
            pari = Math.max(pari, area);
            if(height[suraj] < height[sunakshi]) {
                suraj++;
            }
            else {
                sunakshi--;
            }
        }
        return pari;
    }
}