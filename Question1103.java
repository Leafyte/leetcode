public class Question1103 {

    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];

        int give = 1;
        int index = 0;

        while (candies > 0) {
            int current = Math.min(candies, give);

            result[index] += current;
            candies -= current;

            give++;
            index = (index + 1) % num_people;
        }

        return result;
    }

    public static void main(String[] args) {
        Question1103 solution = new Question1103();

        int candies = 7;
        int num_people = 4;

        int[] result = solution.distributeCandies(candies, num_people);

        System.out.println("Distribution:");

        for (int candy : result) {
            System.out.print(candy + " ");
        }
    }
}
