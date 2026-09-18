class Solution {
    public boolean isArmstrong(int x) {

        int save = x;
        int count = 0;
        int n = 0;

      
        int temp = x;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

      
        while (x != 0) {

            int r = x % 10;
            x = x / 10;

            int power = 1;

            for (int i = 1; i <= count; i++) {
                power = power * r;
            }

            n = n + power;
        }

        return save == n;
    }
}