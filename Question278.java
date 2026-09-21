public class Question278 extends VersionControl {

    private int badVersion;

    public Question278(int badVersion) {
        this.badVersion = badVersion;
    }

    public boolean isBadVersion(int version) {
        return version >= badVersion;
    }

    public int firstBadVersion(int n) {

        int left = 1;
        int right = n;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                // mid is bad, so first bad is at mid or before it
                right = mid;
            } else {
                // mid is good, so first bad is after mid
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {

        int n = 5;
        int badVersion = 4;

        Question278 obj = new Question278(badVersion);

        int result = obj.firstBadVersion(n);

        System.out.println("First Bad Version = " + result);
    }
}

class VersionControl {

    // Base class for compatibility with the LeetCode structure
}
