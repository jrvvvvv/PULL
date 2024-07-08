using System;
using System.Collections.Generic;

class Result
{
    /*
     * Complete the 'getSpamEmails' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY subjects
     *  2. STRING_ARRAY spam_words
     */

    public static List<string> getSpamEmails(List<string> subjects, List<string> spam_words)
    {
        // Convert spam words to lowercase
        HashSet<string> spamWordsSet = new HashSet<string>(spam_words.Select(word => word.ToLower()));

        List<string> spamSubjects = new List<string>();

        // Check each subject for spam words
        foreach (var subject in subjects)
        {
            // Convert the subject to lowercase
            string lowerSubject = subject.ToLower();

            // Check if the subject contains any spam word
            if (spamWordsSet.Any(spamWord => lowerSubject.Contains(spamWord)))
            {
                spamSubjects.Add(subject);
            }
        }

        return spamSubjects;
    }
}

class Solution
{
    public static void Main(string[] args)
    {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        int subjectsCount = Convert.ToInt32(Console.ReadLine().Trim());

        List<string> subjects = new List<string>();

        for (int i = 0; i < subjectsCount; i++)
        {
            string subjectsItem = Console.ReadLine();
            subjects.Add(subjectsItem);
        }

        int spam_wordsCount = Convert.ToInt32(Console.ReadLine().Trim());

        List<string> spam_words = new List<string>();

        for (int i = 0; i < spam_wordsCount; i++)
        {
            string spam_wordsItem = Console.ReadLine();
            spam_words.Add(spam_wordsItem);
        }

        List<string> result = Result.getSpamEmails(subjects, spam_words);

        textWriter.WriteLine(String.Join("\n", result));

        textWriter.Flush();
        textWriter.Close();
    }
}
