using System;
using System.Collections.Generic;

class Result
{
    /*
     * Complete the 'closestNumbers' function below.
     *
     * The function accepts INTEGER_ARRAY numbers as parameter.
     */

    public static void closestNumbers(List<int> numbers)
    {
        // Min-Heap to store pairs with their differences
        SortedSet<Tuple<int, int, int>> minHeap = new SortedSet<Tuple<int, int, int>>();

        // Calculate differences and insert into the min-heap
        for (int i = 0; i < numbers.Count; i++)
        {
            for (int j = i + 1; j < numbers.Count; j++)
            {
                int diff = Math.Abs(numbers[i] - numbers[j]);
                minHeap.Add(Tuple.Create(diff, Math.Min(numbers[i], numbers[j]), Math.Max(numbers[i], numbers[j])));
            }
        }

        // Retrieve pairs with the smallest difference
        int minDiff = minHeap.Min.Item1;

        foreach (var item in minHeap)
        {
            if (item.Item1 == minDiff)
            {
                Console.WriteLine($"{item.Item2} {item.Item3}");
            }
        }
    }
}

class Solution
{
    public static void Main(string[] args)
    {
        int numbersCount = Convert.ToInt32(Console.ReadLine().Trim());

        List<int> numbers = new List<int>();

        for (int i = 0; i < numbersCount; i++)
        {
            int numbersItem = Convert.ToInt32(Console.ReadLine().Trim());
            numbers.Add(numbersItem);
        }

        Result.closestNumbers(numbers);
    }
}
