class Solution {
    public boolean isStrong(int x) {

        int save = x;
        int n = 0;

        while (x != 0) {

            int r = x % 10;
            x = x / 10;

            int fact = 1;

            for (int i = 1; i <= r; i++) {
                fact = fact * i;
            }

            n = n + fact;
        }

        return save == n;
    }
}